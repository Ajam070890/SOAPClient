
package ac.cr.fidelitas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USD_CRC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USD_CRC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dolares" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USD_CRC", propOrder = {
    "dolares"
})
public class USDCRC {

    protected Double dolares;

    /**
     * Gets the value of the dolares property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDolares() {
        return dolares;
    }

    /**
     * Sets the value of the dolares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDolares(Double value) {
        this.dolares = value;
    }

}
