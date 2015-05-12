package PubSub; /**
 * Created by Julius Myszkowski on 8/05/2015.
 * Subject: ${subjectCode} - ${subjectTitle}
 * University of Newcastle
 * Student Number: c3155112
 * email: c3155112@uon.edu.au, julius.skye@gmail.com
 */

import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

public class Publisher
{
    private static int publishCounter = 0;

//    @Resource(mappedName="jms/ConnectionFactory")
    private TopicConnectionFactory tfactory;

//    @Resource(mappedName="jms/Topic")
    private Topic topic;


    public Publisher(String[] content){
        connectAndSend(content);
    }

    public void connectAndSend(String[] content)
    {
        try
        {
            Properties props = new Properties();
            props.put(Context.PROVIDER_URL,"iiop://127.0.0.1:3700");

            Context context = new InitialContext(props);
            tfactory = (TopicConnectionFactory) context.lookup("jms/myConnectionFactory");

            TopicConnection tconnection = tfactory.createTopicConnection();
            TopicSession tsession = tconnection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);

            // get topic from server
            topic = (Topic)context.lookup("jms/seng4400ass2PS");

            TopicPublisher publisher = tsession.createPublisher(topic);

            TextMessage message = tsession.createTextMessage();
            message.setText(content[0]);
            publisher.publish(message);
            System.out.println("Client logged in as: " + content[0] + "with password" + content[1]);

            context.close();
            tconnection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
