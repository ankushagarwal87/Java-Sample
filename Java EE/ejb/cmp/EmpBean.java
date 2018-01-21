package employee;
import javax.ejb.*;
import java.rmi.*;

abstract public class EmpBean implements EntityBean
{
EntityContext ctx;

public EmpBean() {};

abstract public void setEid(String Eid);
abstract public void setEname(String Ename);
abstract public String getEname();
abstract public String getEid();

public String ejbCreate(String Eid,String Ename)throws CreateException,RemoteException
{
setEid(Eid);
setEname(Ename);
return null;
}

public void ejbPostCreate(String Eid,String Ename){}
public void setEntityContext(EntityContext ctx)
{
this.ctx=ctx;
}



public void unsetEntityContext()
{
this.ctx=null;
}

public void ejbActivate(){}
public void ejbLoad(){}
public void ejbStore(){}
public void ejbPassivate(){}
public void ejbRemove(){}
}