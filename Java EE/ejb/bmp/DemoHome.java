package student;
import javax.ejb.*;
import java.rmi.*;

public interface DemoHome extends EJBHome
{
public Demo create(String Eid,String Ename)throws CreateException,RemoteException;
public Demo findByPrimaryKey(String Eid)throws FinderException,RemoteException;

}