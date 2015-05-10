package PubSub;

import javax.jms.JMSException;
import java.io.Serializable;

/**
 * Created by Julius Myszkowski on 9/05/2015.
 * Subject: ${subjectCode} - ${subjectTitle}
 * University of Newcastle
 * Student Number: c3155112
 * email: c3155112@uon.edu.au, julius.skye@gmail.com
 */
public class LoginEventBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private int eventID;
    private String username;
    private String password;
    private String timestamp;
    private String result;
    private int numberOfParams;

    public LoginEventBean(){}

    public void setUsername(String user) throws JMSException {
        this.username = user;
        numberOfParams++;
    }

    public void setPassword(String pwd) throws JMSException {
        this.password = pwd;
        numberOfParams++;

    }

    public void setTimestamp(String time) throws JMSException {
        this.timestamp = time;
        numberOfParams++;

    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getUsername() throws JMSException {
        return this.username;
    }

    public String getPassword() throws JMSException {
        return this.password;
    }

    public String getTimestamp() throws JMSException {
        return this.timestamp;
    }

    public int getNumberOfParams() {
        return numberOfParams;
    }

    public String getResult() {
        return result;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String toString() {
        String newline = "\n";
        String logevString = null;
        try {
            logevString =
                    "User: " + getUsername() + newline +
                            "Password used: " + getPassword() + newline +
                            "Time of event: " + getTimestamp() +newline+
                            "Login event Result: " + getResult();
        } catch (JMSException e) {
            e.printStackTrace();
        }

        return logevString;
    }
}