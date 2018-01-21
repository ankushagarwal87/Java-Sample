import java.util.*;
import javax.naming.*;
import javax.rmi.*;
import employee.*;

public class EmpClient
{
public static void main(String asd[])
{
try
{
Properties p=new Properties();
p.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
p.put(Context.PROVIDER_URL,"t3://localhost:7001");
InitialContext ctx=new InitialContext(p);
EmpHome home=(EmpHome)ctx.lookup("EmpHome21");
Emp rstub=home.create("1","vineet");
Emp rstub2=home.findByPrimaryKey("2");
System.out.println(rstub.getEname());
rstub.setEname("sanjay");
System.out.println(rstub2.getEname());
//rstub.remove();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
