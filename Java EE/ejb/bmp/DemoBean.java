package student;
import javax.ejb.*;
import java.rmi.*;
import java.io.Serializable;
import java.util.*;
import java.sql.*;
import javax.transaction.UserTransaction;
import javax.naming.*;
import javax.sql.DataSource;

public class DemoBean implements EntityBean
{
private EntityContext ctx;
Connection con;
String id,name;

public Connection getConnection()
{
DataSource ds=null;
try
{
InitialContext ctx=new InitialContext();
ds=(DataSource)ctx.lookup("ankush");
con=ds.getConnection();
}
catch(Exception e)
{}
return con;
}


public void setId(String id)
{
this.id=id;
}
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}
public String getId()
{
return id;
}

public String ejbCreate(String id,String name)throws CreateException,RemoteException
{
try
{
this.name=name;
PreparedStatement ps=getConnection().prepareStatement("insert into student values(?,?)");
ps.setString(1,id);
ps.setString(2,name);
ps.executeUpdate();
}
catch(Exception e)
{}
return id;
}

public void ejbPostCreate(String id,String name)
{
System.out.println("find");
try
{
PreparedStatement ps=getConnection().prepareStatement("select * from student where id=?");
ps.setString(1,id);
ResultSet result=ps.executeQuery();
while(result.next())
{
this.id=result.getString(1);
this.name=result.getString(2);
}
}
catch(SQLException e)
{}
System.out.println("find");
//return id;
}

public void setEntityContext(EntityContext ctx)
{
this.ctx=ctx;
}
public void unsetEntityContext()
{
this.ctx=null;
}

public void ejbActivate(){}
public void ejbPassivate(){}

public void ejbLoad()
{
try
{
System.out.println("load");
id=(String)ctx.getPrimaryKey();
System.out.println("primary key:"+id);
con=getConnection();
PreparedStatement ps=getConnection().prepareStatement("select * from student where id=?");
ps.setString(1,id);
ResultSet result=ps.executeQuery();
while(result.next())
{
this.id=result.getString(1);
this.name=result.getString(2);
}
}
catch(Exception e)
{
System.out.println(e);
}
}

public void ejbStore()
{
try
{
System.out.println("store");
id=(String)ctx.getPrimaryKey();
System.out.println("primary key:"+id);
con=getConnection();
PreparedStatement ps=getConnection().prepareStatement("update student set name=? where id=?");
ps.setString(1,this.name);
ps.setString(2,this.id);
ps.executeUpdate();
}
catch(Exception e)
{
System.out.println(e);
}
}

public void ejbRemove()throws RemoteException
{
System.out.println("delete");
try
{
id=(String)ctx.getPrimaryKey();
System.out.println(id);
PreparedStatement ps=getConnection().prepareStatement("delete from student where id=?");
ps.setString(1,id);
ps.executeUpdate();
}
catch(SQLException e)
{
System.out.println("record not exist");
}
System.out.println("delete");
}

public String ejbFindByPrimaryKey(String pk)
    throws ObjectNotFoundException
  {
    //log("ejbFindByPrimaryKey (" + pk + ")");

    Connection con = null;
    PreparedStatement ps = null;

    try {
      con = getConnection();
      ps  = con.prepareStatement("select name from student where id = ?");
      ps.setString(1, pk);
      ps.executeQuery();
      ResultSet rs = ps.getResultSet();
      while(rs.next())
	  {
	  System.out.println(rs.getString(1));
	  }
    } 
	catch (SQLException sqe)
	{}
    
    return pk;
  }



}