<!--

/**
 * Created by Julius Myszkowski on 14/05/2015.
 * Subject: SENG4400 - Enterprise Architecture
 * University of Newcastle
 * Student Number: c3155112
 * email: c3155112@uon.edu.au, julius.skye@gmail.com
 */
-->
<%@ page import="example.PaymentsClient" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>
</title>
  </head>
  <body>
  <H1>Payments</H1>
    <%
        String paypalID = request.getParameter("paypal");
        String creditCardNumberStr = request.getParameter("creditcard");
        double amount = 200.00;

        PaymentsClient pc = new PaymentsClient();

        // user entered a paypal ID
        // TODO: check for correct format
        if(paypalID != null && !paypalID.equals("")){
            // call paypal web payment method from payment web service

                pc.makePPPayment(paypalID, amount);


        }
        // user entered a credit card number
        // TODO: check for integer, correct digit numbers.etc
        else if(creditCardNumberStr != null && !creditCardNumberStr.equals("")){

            // call credit card payment web method from payment web service
            int creditCardNumber = Integer.parseInt(creditCardNumberStr);
            pc.makeCCPayment(creditCardNumber, amount);

        }
        // user entered both cc number and paypal id.
        else if(paypalID != null && !paypalID.equals("") &&
        creditCardNumberStr != null && !creditCardNumberStr.equals("") ){

            out.println("cant pay with both credit card and paypal.."+"<br>"+
                    "please choose only one method"+"<br>"
                            +"<a href=\"payments.jsp\">Back to Payments?</a>");


        }
        else{
            out.println("something went wrong.."+"<br>" +"<a href=\"payments.jsp\">Back to Payments?</a>");
        }



    %>
  </body>
</html>
