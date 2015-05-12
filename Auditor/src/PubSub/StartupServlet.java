package PubSub;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Julius Myszkowski on 6/05/2015.
 * Subject: ${subjectCode} - ${subjectTitle}
 * University of Newcastle
 * Student Number: c3155112
 * email: c3155112@uon.edu.au, julius.skye@gmail.com
 */

/*
    StartupServlet
        creates and initialises a Subscriber.
        Stores objectMessage's received by the subscriber in a bean.
        Stores a LoginEventsListBean of these objects in an list/array.
    when the subscriber receives messages from the JMS queue they are
    stored in the object bean.
*/

public class StartupServlet extends HttpServlet {

//    protected String myParam = null;
    private static Subscriber subscriber;


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



        String url = request.getContextPath() + "/index.jsp";
        System.out.println(url);
        response.sendRedirect(url);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);


    }


    public void init(ServletConfig servletConfig) throws ServletException {

        System.out.println("initialising subscriber.");
        subscriber = new Subscriber();
        subscriber.go();
        System.out.println("subscriber initialised and listening for events.");
    }

    // for non-http requests
//    public void service(ServletRequest request, ServletResponse response)
//            throws ServletException, IOException {
//
//    }

}

