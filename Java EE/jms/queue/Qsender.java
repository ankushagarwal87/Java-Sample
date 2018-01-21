import java.util.*;
import javax.jms.*;
import javax.naming.*;
import java.io.*;

public class Qsender
{
public static void main(String asd[])throws IOException
{
String factory_name="weblogic.jms.ConnectionFactory";
try
{
Properties h= new Properties();
h.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
h.put(Context.PROVIDER_URL,"t3://localhost:7001");
Context ctx=new InitialContext(h);
QueueConnectionFactory cf=(QueueConnectionFactory)ctx.lookup("weblogic.jms.ConnectionFactory");
QueueConnection tc=cf.createQueueConnection();
tc.start();
QueueSession session=tc.createQueueSession(false,Session.AUTO_ACKNOWLEDGE);
javax.jms.Queue newQueue=(javax.jms.Queue)ctx.lookup("MyQueue2");
QueueSender sender=session.createSender(newQueue);
TextMessage tm=session.createTextMessage();
tm.setText("QueueMessage");
sender.send(tm);
}
catch(Exception e)
{
e.printStackTrace();
}
}
} 