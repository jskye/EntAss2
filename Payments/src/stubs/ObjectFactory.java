
package stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stubs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MakeCCPayment_QNAME = new QName("http://PaymentWebService/", "makeCCPayment");
    private final static QName _GetPaymentsListResponse_QNAME = new QName("http://PaymentWebService/", "getPaymentsListResponse");
    private final static QName _MakeCCPaymentResponse_QNAME = new QName("http://PaymentWebService/", "makeCCPaymentResponse");
    private final static QName _GetPaymentsList_QNAME = new QName("http://PaymentWebService/", "getPaymentsList");
    private final static QName _MakePPPayment_QNAME = new QName("http://PaymentWebService/", "makePPPayment");
    private final static QName _MakePPPaymentResponse_QNAME = new QName("http://PaymentWebService/", "makePPPaymentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stubs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MakePPPaymentResponse }
     * 
     */
    public MakePPPaymentResponse createMakePPPaymentResponse() {
        return new MakePPPaymentResponse();
    }

    /**
     * Create an instance of {@link MakePPPayment }
     * 
     */
    public MakePPPayment createMakePPPayment() {
        return new MakePPPayment();
    }

    /**
     * Create an instance of {@link GetPaymentsListResponse }
     * 
     */
    public GetPaymentsListResponse createGetPaymentsListResponse() {
        return new GetPaymentsListResponse();
    }

    /**
     * Create an instance of {@link GetPaymentsList }
     * 
     */
    public GetPaymentsList createGetPaymentsList() {
        return new GetPaymentsList();
    }

    /**
     * Create an instance of {@link MakeCCPaymentResponse }
     * 
     */
    public MakeCCPaymentResponse createMakeCCPaymentResponse() {
        return new MakeCCPaymentResponse();
    }

    /**
     * Create an instance of {@link MakeCCPayment }
     * 
     */
    public MakeCCPayment createMakeCCPayment() {
        return new MakeCCPayment();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeCCPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PaymentWebService/", name = "makeCCPayment")
    public JAXBElement<MakeCCPayment> createMakeCCPayment(MakeCCPayment value) {
        return new JAXBElement<MakeCCPayment>(_MakeCCPayment_QNAME, MakeCCPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaymentsListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PaymentWebService/", name = "getPaymentsListResponse")
    public JAXBElement<GetPaymentsListResponse> createGetPaymentsListResponse(GetPaymentsListResponse value) {
        return new JAXBElement<GetPaymentsListResponse>(_GetPaymentsListResponse_QNAME, GetPaymentsListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeCCPaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PaymentWebService/", name = "makeCCPaymentResponse")
    public JAXBElement<MakeCCPaymentResponse> createMakeCCPaymentResponse(MakeCCPaymentResponse value) {
        return new JAXBElement<MakeCCPaymentResponse>(_MakeCCPaymentResponse_QNAME, MakeCCPaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaymentsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PaymentWebService/", name = "getPaymentsList")
    public JAXBElement<GetPaymentsList> createGetPaymentsList(GetPaymentsList value) {
        return new JAXBElement<GetPaymentsList>(_GetPaymentsList_QNAME, GetPaymentsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakePPPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PaymentWebService/", name = "makePPPayment")
    public JAXBElement<MakePPPayment> createMakePPPayment(MakePPPayment value) {
        return new JAXBElement<MakePPPayment>(_MakePPPayment_QNAME, MakePPPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakePPPaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PaymentWebService/", name = "makePPPaymentResponse")
    public JAXBElement<MakePPPaymentResponse> createMakePPPaymentResponse(MakePPPaymentResponse value) {
        return new JAXBElement<MakePPPaymentResponse>(_MakePPPaymentResponse_QNAME, MakePPPaymentResponse.class, null, value);
    }

}
