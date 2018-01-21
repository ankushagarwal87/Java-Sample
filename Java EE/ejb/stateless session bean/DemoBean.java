package pack;
import javax.ejb.*;
import java.rmi.*;
import javax.naming.NamingException.*;

public class DemoBean implements SessionBean
{
public void setSessionContext(SessionContext etx)
{
}
public void ejbCreate()throws CreateException,RemoteException
{
//try
//{
System.out.println("EJBCREATED");
//}
//catch (NamingException ne) {
//      throw new CreateException("Failed to find environment value "+ne);}
}
public void ejbActivate()
{}
public void ejbPassivate()
{}
public void ejbRemove()
{}
public int add(int a,int b)throws RemoteException
{
return (a+b);
}
}