import javax.naming.*;
import javax.sql.*;
import java.util.*;
import java.sql.*;
//import oracle.jdbc.pool.OracleDataSource;


class pool
{
public static void main(String asd[])
{
try
{
Properties p=new Properties();
p.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
p.put(Context.PROVIDER_URL,"t3://localhost:7001");
InitialContext ctx=new InitialContext(p);
System.out.println("hello");
DataSource ds=(DataSource)ctx.lookup("ankush");
System.out.println("hello");
Connection con=ds.getConnection();
System.out.println("hello");
Statement s=con.createStatement();
ResultSet res=s.executeQuery("select * from emp");
while(res.next())
{
System.out.println("welcome");
System.out.println("id "+res.getString(1));
System.out.println("name "+res.getString(2));
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}