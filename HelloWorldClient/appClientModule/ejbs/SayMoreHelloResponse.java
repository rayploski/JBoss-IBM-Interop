
package ejbs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sayMoreHelloReturn" type="{http://ejbs}HelloWorldTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sayMoreHelloReturn"
})
@XmlRootElement(name = "sayMoreHelloResponse")
public class SayMoreHelloResponse {

    @XmlElement(required = true, nillable = true)
    protected HelloWorldTO sayMoreHelloReturn;

    /**
     * Gets the value of the sayMoreHelloReturn property.
     * 
     * @return
     *     possible object is
     *     {@link HelloWorldTO }
     *     
     */
    public HelloWorldTO getSayMoreHelloReturn() {
        return sayMoreHelloReturn;
    }

    /**
     * Sets the value of the sayMoreHelloReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link HelloWorldTO }
     *     
     */
    public void setSayMoreHelloReturn(HelloWorldTO value) {
        this.sayMoreHelloReturn = value;
    }

}
