package employee;
import javax.ejb.*;
import java.rmi.*;

public interface EmpHome extends EJBHome
{
public Emp create(String Eid,String Ename)throws CreateException,RemoteException;
public Emp findByPrimaryKey(String Eid)throws FinderException,RemoteException;

}