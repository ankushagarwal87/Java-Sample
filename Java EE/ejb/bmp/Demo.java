package student;
import javax.ejb.*;
import java.rmi.*;

public interface Demo extends EJBObject
{
public String getName()throws RemoteException;
public String getId()throws RemoteException;
public void setName(String s)throws RemoteException;
public void setId(String s)throws RemoteException;
}