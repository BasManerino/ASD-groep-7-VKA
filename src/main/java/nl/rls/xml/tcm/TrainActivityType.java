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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrainActivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainActivityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TrainActivityType"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}AssociatedAttachedTrainID" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}AssociatedAttachedOTN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainActivityType", propOrder = {
    "trainActivityType",
    "associatedAttachedTrainID",
    "associatedAttachedOTN"
})
public class TrainActivityType {

    @XmlElement(name = "TrainActivityType", required = true)
    protected String trainActivityType;
    @XmlElement(name = "AssociatedAttachedTrainID")
    protected CompositIdentifierPlannedType associatedAttachedTrainID;
    @XmlElement(name = "AssociatedAttachedOTN")
    protected String associatedAttachedOTN;

    /**
     * Gets the value of the trainActivityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainActivityType() {
        return trainActivityType;
    }

    /**
     * Sets the value of the trainActivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainActivityType(String value) {
        this.trainActivityType = value;
    }

    /**
     * Gets the value of the associatedAttachedTrainID property.
     * 
     * @return
     *     possible object is
     *     {@link CompositIdentifierPlannedType }
     *     
     */
    public CompositIdentifierPlannedType getAssociatedAttachedTrainID() {
        return associatedAttachedTrainID;
    }

    /**
     * Sets the value of the associatedAttachedTrainID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositIdentifierPlannedType }
     *     
     */
    public void setAssociatedAttachedTrainID(CompositIdentifierPlannedType value) {
        this.associatedAttachedTrainID = value;
    }

    /**
     * Gets the value of the associatedAttachedOTN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedAttachedOTN() {
        return associatedAttachedOTN;
    }

    /**
     * Sets the value of the associatedAttachedOTN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedAttachedOTN(String value) {
        this.associatedAttachedOTN = value;
    }

}
