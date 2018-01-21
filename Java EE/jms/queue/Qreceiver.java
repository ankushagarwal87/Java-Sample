import java.util.*;
import javax.jms.*;
import javax.naming.*;
import java.io.*;

public class Qreceiver
{
public static void main(String asd[])throws IOException
{
String factory_name="weblogic.jms.ConnectionFactory";
try
{
Properties h2= new Properties();
h2.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
h2.put(Context.PROVIDER_URL,"t3://localhost:7001");
Context ctx=new InitialContext(h2);
QueueConnectionFactory cf=(QueueConnectionFactory)ctx.lookup("weblogic.jms.ConnectionFactory");
QueueConnection tc=cf.createQueueConnection();
tc.start();
QueueSession session=tc.createQueueSession(false,Session.AUTO_ACKNOWLEDGE);
javax.jms.Queue newQueue2=(javax.jms.Queue)ctx.lookup("MyQueue2");
QueueReceiver receiver=session.createReceiver(newQueue2);
receiver.setMessageListener(new MyMessageListener());
while(true)
{
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println("1"+e);
}
}
} 

class MyMessageListener implements MessageListener
{
public void onMessage(Message msg)
{
try
{
if(msg instanceof TextMessage)
{
TextMessage txt=(TextMessage)msg;
String str=txt.getText();
System.out.println(str);
}
else
System.out.println("message wrong");
}
catch(JMSException e)
{}
}
}