import java.util.*;
import javax.jms.*;
import javax.naming.*;
import java.io.*;

public class Tsender
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
TopicPublisher publisher=session.createPublisher(t);
TextMessage tm=session.createTextMessage();
tm.setText("TopicMessage");
publisher.publish(tm);
System.out.println("message sent");
session.close();
tc.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
} 