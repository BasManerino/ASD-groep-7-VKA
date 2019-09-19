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
 *         &lt;element name="TypeCode1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;whiteSpace value="replace"/>
 *               &lt;maxLength value="1"/>
 *               &lt;pattern value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TypeCode2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;whiteSpace value="replace"/>
 *               &lt;maxLength value="1"/>
 *               &lt;pattern value="0-9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountryCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="2"/>
 *               &lt;whiteSpace value="replace"/>
 *               &lt;maxLength value="2"/>
 *               &lt;pattern value="0-9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SeriesNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;whiteSpace value="replace"/>
 *               &lt;maxLength value="4"/>
 *               &lt;pattern value="0-9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SerialNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;whiteSpace value="replace"/>
 *               &lt;maxLength value="3"/>
 *               &lt;pattern value="0-9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ControlDigit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;whiteSpace value="replace"/>
 *               &lt;maxLength value="1"/>
 *               &lt;pattern value="0-9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "typeCode1",
    "typeCode2",
    "countryCode",
    "seriesNumber",
    "serialNumber",
    "controlDigit"
})
@XmlRootElement(name = "LocoTypeNumber")
public class LocoTypeNumber {

    @XmlElement(name = "TypeCode1", required = true)
    protected String typeCode1;
    @XmlElement(name = "TypeCode2", required = true)
    protected String typeCode2;
    @XmlElement(name = "CountryCode", required = true)
    protected String countryCode;
    @XmlElement(name = "SeriesNumber", required = true)
    protected String seriesNumber;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "ControlDigit")
    protected String controlDigit;

    /**
     * Gets the value of the typeCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode1() {
        return typeCode1;
    }

    /**
     * Sets the value of the typeCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode1(String value) {
        this.typeCode1 = value;
    }

    /**
     * Gets the value of the typeCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode2() {
        return typeCode2;
    }

    /**
     * Sets the value of the typeCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode2(String value) {
        this.typeCode2 = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the seriesNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesNumber() {
        return seriesNumber;
    }

    /**
     * Sets the value of the seriesNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesNumber(String value) {
        this.seriesNumber = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the controlDigit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlDigit() {
        return controlDigit;
    }

    /**
     * Sets the value of the controlDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlDigit(String value) {
        this.controlDigit = value;
    }

}
