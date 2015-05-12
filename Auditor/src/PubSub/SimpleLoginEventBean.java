package PubSub;

import java.io.Serializable;

/**
 * Created by Julius Myszkowski on 12/05/2015.
 * Subject: ${subjectCode} - ${subjectTitle}
 * University of Newcastle
 * Student Number: c3155112
 * email: c3155112@uon.edu.au, julius.skye@gmail.com
 */
public class SimpleLoginEventBean implements Serializable {


    private String loginSuccess;
//    private String toString;

    public SimpleLoginEventBean(){}

    public String getLoginSuccess() {
        return loginSuccess;
    }

    public void setLoginSuccess(String loginSuccess) {
        this.loginSuccess = loginSuccess;
    }

//    public String getToString(){
//        return getLoginSuccess();
//    }

}
