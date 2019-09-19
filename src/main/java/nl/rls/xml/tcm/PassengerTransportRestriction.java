//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.02 at 11:36:00 AM CEST 
//


package nl.rls.xml.tcm;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://taf-jsg.info/schemes}TransportRestrictionCode"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TransportRestrictionValue"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}FreeTextField"/>
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
    "transportRestrictionCode",
    "transportRestrictionValue",
    "freeTextField"
})
@XmlRootElement(name = "PassengerTransportRestriction")
public class PassengerTransportRestriction {

    @XmlElement(name = "TransportRestrictionCode", required = true)
    protected BigInteger transportRestrictionCode;
    @XmlElement(name = "TransportRestrictionValue", required = true)
    protected String transportRestrictionValue;
    @XmlElement(name = "FreeTextField", required = true)
    protected String freeTextField;

    /**
     * Gets the value of the transportRestrictionCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransportRestrictionCode() {
        return transportRestrictionCode;
    }

    /**
     * Sets the value of the transportRestrictionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransportRestrictionCode(BigInteger value) {
        this.transportRestrictionCode = value;
    }

    /**
     * Gets the value of the transportRestrictionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportRestrictionValue() {
        return transportRestrictionValue;
    }

    /**
     * Sets the value of the transportRestrictionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportRestrictionValue(String value) {
        this.transportRestrictionValue = value;
    }

    /**
     * Gets the value of the freeTextField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeTextField() {
        return freeTextField;
    }

    /**
     * Sets the value of the freeTextField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeTextField(String value) {
        this.freeTextField = value;
    }

}
