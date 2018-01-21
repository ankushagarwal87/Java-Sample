import pack1.*;
import java.util.*;
import javax.naming.*;
import java.rmi.*;
import javax.rmi.*;


public class DemoClient2
{
public static void main(String asd[])throws Exception
{
try
{
Properties p=new Properties();
p.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
p.put(Context.PROVIDER_URL,"t3://localhost:7001");
InitialContext ctx=new InitialContext(p);
pack1.DemoHome home=(pack1.DemoHome)ctx.lookup("DemoHome55");
pack1.Demo r[]=new pack1.Demo[16];
//Object home=ctx.lookup("DemoHome50");
//pack1.DemoHome h=(pack1.DemoHome)PortableRemoteObject.narrow(home,pack1.DemoHome.class);
for(int i=0;i<r.length;i++)
{
r[i]=home.create(100,200);
System.out.println(r[i].add());
try
{
Thread.sleep(2000);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}








