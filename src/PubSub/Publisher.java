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
    private static int messageCounter = 0;

//    @Resource(mappedName="jms/ConnectionFactory")
    private TopicConnectionFactory tfactory;

//    @Resource(mappedName="jms/Topic")
    private Topic topic;
    private TopicPublisher tpublisher;
    private TopicConnection tconnection;
    private TopicSession tsession;
    private Context context;


    public Publisher(){

        init();
    }

    public void init(){
        try {

            Properties props = new Properties();
            props.put(Context.PROVIDER_URL, "iiop://127.0.0.1:3700");

            context = new InitialContext(props);
            tfactory = (TopicConnectionFactory) context.lookup("jms/myConnectionFactory");
            tconnection = tfactory.createTopicConnection();
            tsession = tconnection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);

            // get topic from server
            topic = (Topic) context.lookup("jms/seng4400ass2PS");
            tpublisher = tsession.createPublisher(topic);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    // send msg once
    public void sendMessage(String content) {
        try {

            TextMessage message = tsession.createTextMessage();
            message.setText(content);
            tpublisher.publish(message);
//          System.out.println("Client logged in as: " + content[0] + "with password" + content[1]);
            System.out.println("Login Event: " + content);
            context.close();
            tconnection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // send same msg multiple times (for testing)
    public void sendMessage(String content, int copies)
    {
       try{

           for(int i=0; i < copies; i++){
               TextMessage message = tsession.createTextMessage();
               message.setText(content);
               tpublisher.publish(message);
//          System.out.println("Client logged in as: " + content[0] + "with password" + content[1]);
               System.out.println("Login Event: " + content);
           }

           context.close();
           tconnection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
