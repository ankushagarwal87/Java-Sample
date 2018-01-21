package pack1;
import javax.ejb.*;
import java.rmi.*;
import javax.naming.NamingException.*;

public class DemoBean implements SessionBean
{
int a,b;
public void setSessionContext(SessionContext etx)
{
}
public void ejbCreate(int a,int b)throws CreateException,RemoteException
{
this.a=a;
this.b=b;
System.out.println("EJBCREATED");
//}
//catch (NamingException ne) {
//      throw new CreateException("Failed to find environment value "+ne);}
}
public void ejbActivate()
{
System.out.println("EJBACTIVATE");
}
public void ejbPassivate()
{
System.out.println("EJBPASSIVATE");
}
public void ejbRemove()
{
System.out.println("EJBREMOVE");
}
public int add()throws RemoteException
{
return (a+b);
}
}