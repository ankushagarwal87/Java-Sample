import java.util.*;
import javax.jms.*;
import javax.naming.*;
import java.io.*;

public class Treceiver
{
public static void main(String asd[])throws IOException
{
String factory_name="weblogic.jms.ConnectionFactory";
try
{
Properties h= new Properties();
h.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
h.put(Context.PROVIDER_URL,"t3://localhost:7001");
InitialContext ctx=new InitialContext(h);
TopicConnectionFactory cf=(TopicConnectionFactory)ctx.lookup("weblogic.jms.ConnectionFactory");
TopicConnection tc=cf.createTopicConnection();
tc.start();
TopicSession session=tc.createTopicSession(false,Session.AUTO_ACKNOWLEDGE);
Topic t=(Topic)ctx.lookup("MyTopic2");
TopicSubscriber sub=session.createSubscriber(t);
sub.setMessageListener(new MyMessageListener());
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