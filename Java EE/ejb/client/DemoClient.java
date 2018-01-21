import pack.*;
import java.util.*;
import javax.naming.*;
import java.rmi.*;
import javax.rmi.*;


public class DemoClient
{
public static void main(String asd[])throws Exception
{
try
{
Properties p=new Properties();
p.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
p.put(Context.PROVIDER_URL,"t3://localhost:7001");
InitialContext ctx=new InitialContext(p);
pack.DemoHome home=(pack.DemoHome)ctx.lookup("DemoHome20");
//Object home=ctx.lookup("DemoHome20");
pack.DemoHome h=(pack.DemoHome)PortableRemoteObject.narrow(home,pack.DemoHome.class);
pack.Demo rstub=h.create();
System.out.println(rstub.add(100,200));
}
catch(Exception e)
{
System.out.println(e);
}
}
}








