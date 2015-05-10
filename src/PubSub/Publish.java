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

public class Publish
{
    private static int publishCounter = 0;

    public Publish(String[] content){
        connectAndSend(content);
    }

    public void connectAndSend(String[] content)
    {
        try
        {
            Properties props = new Properties();
            props.put(Context.PROVIDER_URL,"iiop://127.0.0.1:3700");

            Context context = new InitialContext(props);
            TopicConnectionFactory tfactory = (TopicConnectionFactory) context.lookup("jms/myConnectionFactory");

            TopicConnection tconnection = tfactory.createTopicConnection();
            TopicSession tsession = tconnection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
            TopicPublisher publisher = tsession.createPublisher((Topic)context.lookup("jms/seng4400ass2PS"));

            publishCounter++;
            Object objectToPublish = LoginEventFactory.createLoginEvent(publishCounter, content);
            ObjectMessage objectMsg = tsession.createObjectMessage();
            objectMsg.setObject((java.io.Serializable) objectToPublish);

//            TextMessage message = tsession.createTextMessage();
//            message.setText(loginEvent[0]);

            publisher.publish(objectMsg);
            System.out.println("ObjectMessage sent: "
                    + objectToPublish.toString());

            context.close();
            tconnection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
