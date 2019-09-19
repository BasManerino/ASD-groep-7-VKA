//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.02 at 11:36:00 AM CEST 
//


package nl.rls.xml.tcm;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="RouteSection" maxOccurs="30">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SequenceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;sequence>
 *                     &lt;element name="RouteCode">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;length value="5"/>
 *                           &lt;pattern value="\d*[1-9]\d*0"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="RouteText" minOccurs="0">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;minLength value="1"/>
 *                           &lt;maxLength value="80"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
    "routeSection"
})
@XmlRootElement(name = "Routing")
public class Routing {

    @XmlElement(name = "RouteSection", required = true)
    protected List<Routing.RouteSection> routeSection;

    /**
     * Gets the value of the routeSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Routing.RouteSection }
     * 
     * 
     */
    public List<Routing.RouteSection> getRouteSection() {
        if (routeSection == null) {
            routeSection = new ArrayList<Routing.RouteSection>();
        }
        return this.routeSection;
    }


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
     *         &lt;element name="SequenceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;sequence>
     *           &lt;element name="RouteCode">
     *             &lt;simpleType>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                 &lt;length value="5"/>
     *                 &lt;pattern value="\d*[1-9]\d*0"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *           &lt;element name="RouteText" minOccurs="0">
     *             &lt;simpleType>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                 &lt;minLength value="1"/>
     *                 &lt;maxLength value="80"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *         &lt;/sequence>
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
        "sequenceID",
        "routeCode",
        "routeText"
    })
    public static class RouteSection {

        @XmlElement(name = "SequenceID")
        protected int sequenceID;
        @XmlElement(name = "RouteCode", required = true)
        protected String routeCode;
        @XmlElement(name = "RouteText")
        protected String routeText;

        /**
         * Gets the value of the sequenceID property.
         * 
         */
        public int getSequenceID() {
            return sequenceID;
        }

        /**
         * Sets the value of the sequenceID property.
         * 
         */
        public void setSequenceID(int value) {
            this.sequenceID = value;
        }

        /**
         * Gets the value of the routeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRouteCode() {
            return routeCode;
        }

        /**
         * Sets the value of the routeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRouteCode(String value) {
            this.routeCode = value;
        }

        /**
         * Gets the value of the routeText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRouteText() {
            return routeText;
        }

        /**
         * Sets the value of the routeText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRouteText(String value) {
            this.routeText = value;
        }

    }

}
