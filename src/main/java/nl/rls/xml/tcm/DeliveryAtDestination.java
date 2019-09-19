//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.02 at 11:36:00 AM CEST 
//


package nl.rls.xml.tcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://taf-jsg.info/schemes}Destination"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}DeliveryTimeAtDestination"/>
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
    "destination",
    "deliveryTimeAtDestination"
})
@XmlRootElement(name = "DeliveryAtDestination")
public class DeliveryAtDestination {

    @XmlElement(name = "Destination", required = true)
    protected LocationIdent destination;
    @XmlElement(name = "DeliveryTimeAtDestination", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryTimeAtDestination;

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link LocationIdent }
     *     
     */
    public LocationIdent getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdent }
     *     
     */
    public void setDestination(LocationIdent value) {
        this.destination = value;
    }

    /**
     * Gets the value of the deliveryTimeAtDestination property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryTimeAtDestination() {
        return deliveryTimeAtDestination;
    }

    /**
     * Sets the value of the deliveryTimeAtDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryTimeAtDestination(XMLGregorianCalendar value) {
        this.deliveryTimeAtDestination = value;
    }

}
