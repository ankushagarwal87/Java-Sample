import java.util.*;
import javax.naming.*;
import javax.rmi.*;
import student.*;

public class BMPClient
{
public static void main(String asd[])
{
try
{
Properties p=new Properties();
p.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
p.put(Context.PROVIDER_URL,"t3://localhost:7001");
InitialContext ctx=new InitialContext(p);
DemoHome home=(DemoHome)ctx.lookup("bmp");
Demo rstub=home.create("21","honey");
Demo rstub2=home.findByPrimaryKey("14");
System.out.println(rstub.getName());
rstub.setName("sonu");
System.out.println(rstub2.getName());
//rstub.remove();

}
catch(Exception e)
{
System.out.println(e);
}
}
}
