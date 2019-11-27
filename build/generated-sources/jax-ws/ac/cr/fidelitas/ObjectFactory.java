
package ac.cr.fidelitas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ac.cr.fidelitas package. 
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

    private final static QName _Hello_QNAME = new QName("http://fideltas.cr.ac/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://fideltas.cr.ac/", "helloResponse");
    private final static QName _USDCRC_QNAME = new QName("http://fideltas.cr.ac/", "USD_CRC");
    private final static QName _USDCRCResponse_QNAME = new QName("http://fideltas.cr.ac/", "USD_CRCResponse");
    private final static QName _CRCUSD_QNAME = new QName("http://fideltas.cr.ac/", "CRC_USD");
    private final static QName _CRCUSDResponse_QNAME = new QName("http://fideltas.cr.ac/", "CRC_USDResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ac.cr.fidelitas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CRCUSD }
     * 
     */
    public CRCUSD createCRCUSD() {
        return new CRCUSD();
    }

    /**
     * Create an instance of {@link CRCUSDResponse }
     * 
     */
    public CRCUSDResponse createCRCUSDResponse() {
        return new CRCUSDResponse();
    }

    /**
     * Create an instance of {@link USDCRCResponse }
     * 
     */
    public USDCRCResponse createUSDCRCResponse() {
        return new USDCRCResponse();
    }

    /**
     * Create an instance of {@link USDCRC }
     * 
     */
    public USDCRC createUSDCRC() {
        return new USDCRC();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fideltas.cr.ac/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fideltas.cr.ac/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USDCRC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fideltas.cr.ac/", name = "USD_CRC")
    public JAXBElement<USDCRC> createUSDCRC(USDCRC value) {
        return new JAXBElement<USDCRC>(_USDCRC_QNAME, USDCRC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USDCRCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fideltas.cr.ac/", name = "USD_CRCResponse")
    public JAXBElement<USDCRCResponse> createUSDCRCResponse(USDCRCResponse value) {
        return new JAXBElement<USDCRCResponse>(_USDCRCResponse_QNAME, USDCRCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRCUSD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fideltas.cr.ac/", name = "CRC_USD")
    public JAXBElement<CRCUSD> createCRCUSD(CRCUSD value) {
        return new JAXBElement<CRCUSD>(_CRCUSD_QNAME, CRCUSD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRCUSDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fideltas.cr.ac/", name = "CRC_USDResponse")
    public JAXBElement<CRCUSDResponse> createCRCUSDResponse(CRCUSDResponse value) {
        return new JAXBElement<CRCUSDResponse>(_CRCUSDResponse_QNAME, CRCUSDResponse.class, null, value);
    }

}
