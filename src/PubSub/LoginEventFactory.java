package PubSub;

import javax.jms.JMSException;

/**
 * Created by Julius Myszkowski on 9/05/2015.
 * Subject: ${subjectCode} - ${subjectTitle}
 * University of Newcastle
 * Student Number: c3155112
 * email: c3155112@uon.edu.au, julius.skye@gmail.com
 */
public class LoginEventFactory{


    public static Object createLoginEvent(int id, String[] content) throws JMSException {

        LoginEventBean logev = new LoginEventBean();
        logev.setEventID(id);

        //specific object (business) logic. move to LoginEvent class
        logev.setUsername(content[0]);
        logev.setPassword(content[1]);
        logev.setTimestamp(content[2]);
        logev.setResult(content[3]);

        return logev;
    }
}
