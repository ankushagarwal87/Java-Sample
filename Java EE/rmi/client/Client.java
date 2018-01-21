import my.*;
import java.rmi.*;
import java.rmi.server.*;

public class Client
{
public static void main(String asd[])
{
try
{
my.MyRemote m=(my.MyRemote)Naming.lookup("rmi://localhost:1099/ankush");
System.out.println(m.add(20,89));
}
catch(Exception e)
{
System.out.println(e);
}
}
}