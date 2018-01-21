package employee;
import javax.ejb.*;
import java.rmi.*;

public interface Emp extends EJBObject
{
public String getEname()throws RemoteException;
public void setEname(String s)throws RemoteException;
}