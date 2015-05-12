package PubSub;

import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by Julius Myszkowski on 12/05/2015.
 * Subject: ${subjectCode} - ${subjectTitle}
 * University of Newcastle
 * Student Number: c3155112
 * email: c3155112@uon.edu.au, julius.skye@gmail.com
 */


public class LoginEventListBean implements Serializable {

    private static ArrayBlockingQueue<SimpleLoginEventBean> loginEventList = new ArrayBlockingQueue<SimpleLoginEventBean>(50, true);

    // empty constructor
    public LoginEventListBean(){}

    public ArrayBlockingQueue<SimpleLoginEventBean> getLoginEventList() {
        return loginEventList;
    }

    public void setLoginEventList(ArrayBlockingQueue<SimpleLoginEventBean> loginEventList) {
        this.loginEventList = loginEventList;
    }

    // retrieves a string of the list
    public String toString() {
        if (loginEventList.isEmpty()){
            System.out.println("printing empty list");
            return "nothing in list";
        }
        else {
            System.out.println("printing event list");
            System.out.println(loginEventList.peek().toString());


            StringBuilder sb = new StringBuilder();
            sb.append("<br>");

            // iterate over list and return elements as strings
//            for(SimpleLoginEventBean seb : loginEventList){
//                listString.concat(seb.toString());
//                listString.concat("<br>");
//            }

            for(Iterator<SimpleLoginEventBean> i = loginEventList.iterator(); i.hasNext(); ) {
                SimpleLoginEventBean seb = i.next();
//                System.out.println(seb.getLoginSuccess());
                sb.append(seb.getLoginSuccess());
                sb.append("<br>");


            }

            return sb.toString();
        }
    }

//    public void init(){
//
//    }

    public void add(SimpleLoginEventBean t){
        if(loginEventList.size() == 50){
            loginEventList.poll();
            System.out.println("list is full, removed old bean");
            loginEventList.add(t);
            System.out.println("list is full, added new bean");

        }
        else {
            loginEventList.add(t);
            System.out.println("list has room, added new bean");

        }

    }


}
