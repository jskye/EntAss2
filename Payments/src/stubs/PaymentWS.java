
package stubs;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PaymentWS", targetNamespace = "http://PaymentWebService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PaymentWS {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "makePPPayment", targetNamespace = "http://PaymentWebService/", className = "stubs.MakePPPayment")
    @ResponseWrapper(localName = "makePPPaymentResponse", targetNamespace = "http://PaymentWebService/", className = "stubs.MakePPPaymentResponse")
    @Action(input = "http://PaymentWebService/PaymentWS/makePPPaymentRequest", output = "http://PaymentWebService/PaymentWS/makePPPaymentResponse")
    public String makePPPayment(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "makeCCPayment", targetNamespace = "http://PaymentWebService/", className = "stubs.MakeCCPayment")
    @ResponseWrapper(localName = "makeCCPaymentResponse", targetNamespace = "http://PaymentWebService/", className = "stubs.MakeCCPaymentResponse")
    @Action(input = "http://PaymentWebService/PaymentWS/makeCCPaymentRequest", output = "http://PaymentWebService/PaymentWS/makeCCPaymentResponse")
    public String makeCCPayment(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<stubs.Payment>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPaymentsList", targetNamespace = "http://PaymentWebService/", className = "stubs.GetPaymentsList")
    @ResponseWrapper(localName = "getPaymentsListResponse", targetNamespace = "http://PaymentWebService/", className = "stubs.GetPaymentsListResponse")
    @Action(input = "http://PaymentWebService/PaymentWS/getPaymentsListRequest", output = "http://PaymentWebService/PaymentWS/getPaymentsListResponse")
    public List<Payment> getPaymentsList(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
