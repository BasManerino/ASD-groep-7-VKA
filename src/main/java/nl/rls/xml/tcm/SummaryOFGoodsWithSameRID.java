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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://taf-jsg.info/schemes}UN_Number" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}PackingGroup" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}DangerousGoodsWeight" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}DangerousGoodsVolume" minOccurs="0"/>
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
    "unNumber",
    "packingGroup",
    "dangerousGoodsWeight",
    "dangerousGoodsVolume"
})
@XmlRootElement(name = "SummaryOFGoodsWithSameRID")
public class SummaryOFGoodsWithSameRID {

    @XmlElement(name = "UN_Number")
    protected String unNumber;
    @XmlElement(name = "PackingGroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String packingGroup;
    @XmlElement(name = "DangerousGoodsWeight")
    protected Integer dangerousGoodsWeight;
    @XmlElement(name = "DangerousGoodsVolume")
    protected Float dangerousGoodsVolume;

    /**
     * Gets the value of the unNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNNumber() {
        return unNumber;
    }

    /**
     * Sets the value of the unNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNNumber(String value) {
        this.unNumber = value;
    }

    /**
     * Gets the value of the packingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackingGroup() {
        return packingGroup;
    }

    /**
     * Sets the value of the packingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackingGroup(String value) {
        this.packingGroup = value;
    }

    /**
     * The weight of the dangerous goods in Kilograms
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDangerousGoodsWeight() {
        return dangerousGoodsWeight;
    }

    /**
     * Sets the value of the dangerousGoodsWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDangerousGoodsWeight(Integer value) {
        this.dangerousGoodsWeight = value;
    }

    /**
     * Gets the value of the dangerousGoodsVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDangerousGoodsVolume() {
        return dangerousGoodsVolume;
    }

    /**
     * Sets the value of the dangerousGoodsVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDangerousGoodsVolume(Float value) {
        this.dangerousGoodsVolume = value;
    }

}
