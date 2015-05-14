package example; /**
 * Created by Julius Myszkowski on 14/05/2015.
 * Subject: ${subjectCode} - ${subjectTitle}
 * University of Newcastle
 * Student Number: c3155112
 * email: c3155112@uon.edu.au, julius.skye@gmail.com
 */

import stubs.Payment;
import stubs.PaymentWS;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Julius Myszkowski on 14/05/2015.
 * Subject: ${subjectCode} - ${subjectTitle}
 * University of Newcastle
 * Student Number: c3155112
 * email: c3155112@uon.edu.au, julius.skye@gmail.com
 */
public class PaymentsClient {

    private PaymentWS paymentWS;

    public PaymentsClient(){

        // Get the service // getPort()?
        paymentWS = new stubs.PaymentWS_Service().getPaymentWS();

    }

    public void makePPPayment(String ppid, double amount){

        ppid= "payID";
        amount = 100.00;
        paymentWS.makePPPayment(ppid, amount);

        // Response String
        String resp = null;
    }

    public void makeCCPayment(int ccNum, double amount){

        ccNum= 123456789;
        amount = 100.00;
        paymentWS.makeCCPayment(ccNum, amount);

//        // Response String
//        String resp = null;
    }

    public String getPaymentsList() {
        ArrayList<Payment> paymentList = (ArrayList<Payment>) paymentWS.getPaymentsList(10);

        StringBuilder sb = new StringBuilder();

        for(Iterator<Payment> i = paymentList.iterator(); i.hasNext(); ) {
            Payment payment = i.next();

            sb.append(payment.getClass());
            sb.append(payment.getPaymentAmount());

            // TODO: make payment interface require receipt method
            //sb.append(payment.getReceipt());
            sb.append("<br>");
        }

        return sb.toString();
    }


}
