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
 *         &lt;element ref="{http://taf-jsg.info/schemes}LocationSubsidiaryCode"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}AllocationCompany"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}LocationSubsidiaryName" minOccurs="0"/>
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
    "locationSubsidiaryCode",
    "allocationCompany",
    "locationSubsidiaryName"
})
@XmlRootElement(name = "LocationSubsidiaryIdentification")
public class LocationSubsidiaryIdentification {

    @XmlElement(name = "LocationSubsidiaryCode", required = true)
    protected LocationSubsidiaryCode locationSubsidiaryCode;
    @XmlElement(name = "AllocationCompany")
    protected int allocationCompany;
    @XmlElement(name = "LocationSubsidiaryName")
    protected String locationSubsidiaryName;

    /**
     * Gets the value of the locationSubsidiaryCode property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSubsidiaryCode }
     *     
     */
    public LocationSubsidiaryCode getLocationSubsidiaryCode() {
        return locationSubsidiaryCode;
    }

    /**
     * Sets the value of the locationSubsidiaryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSubsidiaryCode }
     *     
     */
    public void setLocationSubsidiaryCode(LocationSubsidiaryCode value) {
        this.locationSubsidiaryCode = value;
    }

    /**
     * Gets the value of the allocationCompany property.
     * 
     */
    public int getAllocationCompany() {
        return allocationCompany;
    }

    /**
     * Sets the value of the allocationCompany property.
     * 
     */
    public void setAllocationCompany(int value) {
        this.allocationCompany = value;
    }

    /**
     * Gets the value of the locationSubsidiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationSubsidiaryName() {
        return locationSubsidiaryName;
    }

    /**
     * Sets the value of the locationSubsidiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationSubsidiaryName(String value) {
        this.locationSubsidiaryName = value;
    }

}
