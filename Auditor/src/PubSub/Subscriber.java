package PubSub;

/**
 * Created by Julius Myszkowski on 11/05/2015.
 * Subject: ${subjectCode} - ${subjectTitle}
 * University of Newcastle
 * Student Number: c3155112
 * email: c3155112@uon.edu.au, julius.skye@gmail.com
 */
import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

public class Subscriber implements MessageListener
{

    LoginEventListBean leb;

    public void go()
    {
        try
        {
            leb = new LoginEventListBean();
            Properties props = new Properties();
            props.put(Context.PROVIDER_URL,"iiop://127.0.0.1:3700");

            Context context = new InitialContext(props);
            TopicConnectionFactory tfactory = (TopicConnectionFactory) context.lookup("jms/myConnectionFactory");

            TopicConnection tconnection = tfactory.createTopicConnection();
            TopicSession tsession = tconnection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
            TopicSubscriber subscriber = tsession.createSubscriber((Topic)context.lookup("jms/seng4400ass2PS"));

            subscriber.setMessageListener(this);

            tconnection.start();

//            while (true) {}
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void onMessage(Message message)
    {
        if(message instanceof TextMessage)
        {
            try
            {
                System.out.println( "Auditor received message: " + ((TextMessage)message).getText());
                SimpleLoginEventBean seb = new SimpleLoginEventBean();
                String textSent = ((TextMessage)message).getText();
                seb.setLoginSuccess(textSent);
                leb.add(seb);

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
