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
 *         &lt;element name="NumberOfBrakes" type="{http://taf-jsg.info/schemes}Numeric2-2"/>
 *         &lt;element name="BrakeSystem" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://taf-jsg.info/schemes}AirBrakeType"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}BrakingPowerVariationDevice"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}AirBrakedMass"/>
 *         &lt;element name="LoadChangeDevice" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ChangeOverWeight" type="{http://taf-jsg.info/schemes}Numeric3-3"/>
 *                   &lt;element name="AirBrakedMassLoaded" type="{http://taf-jsg.info/schemes}Numeric3-3"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://taf-jsg.info/schemes}BrakeSpecialCharacteristics"/>
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
    "numberOfBrakes",
    "brakeSystem",
    "airBrakeType",
    "brakingPowerVariationDevice",
    "airBrakedMass",
    "loadChangeDevice",
    "brakeSpecialCharacteristics"
})
@XmlRootElement(name = "AirBrake")
public class AirBrake {

    @XmlElement(name = "NumberOfBrakes")
    protected int numberOfBrakes;
    @XmlElement(name = "BrakeSystem")
    protected String brakeSystem;
    @XmlElement(name = "AirBrakeType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String airBrakeType;
    @XmlElement(name = "BrakingPowerVariationDevice", required = true)
    protected BigInteger brakingPowerVariationDevice;
    @XmlElement(name = "AirBrakedMass")
    protected int airBrakedMass;
    @XmlElement(name = "LoadChangeDevice")
    protected AirBrake.LoadChangeDevice loadChangeDevice;
    @XmlElement(name = "BrakeSpecialCharacteristics", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String brakeSpecialCharacteristics;

    /**
     * Gets the value of the numberOfBrakes property.
     * 
     */
    public int getNumberOfBrakes() {
        return numberOfBrakes;
    }

    /**
     * Sets the value of the numberOfBrakes property.
     * 
     */
    public void setNumberOfBrakes(int value) {
        this.numberOfBrakes = value;
    }

    /**
     * Gets the value of the brakeSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrakeSystem() {
        return brakeSystem;
    }

    /**
     * Sets the value of the brakeSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrakeSystem(String value) {
        this.brakeSystem = value;
    }

    /**
     * Gets the value of the airBrakeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirBrakeType() {
        return airBrakeType;
    }

    /**
     * Sets the value of the airBrakeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirBrakeType(String value) {
        this.airBrakeType = value;
    }

    /**
     * Gets the value of the brakingPowerVariationDevice property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBrakingPowerVariationDevice() {
        return brakingPowerVariationDevice;
    }

    /**
     * Sets the value of the brakingPowerVariationDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBrakingPowerVariationDevice(BigInteger value) {
        this.brakingPowerVariationDevice = value;
    }

    /**
     *  General braked weight for wagon without any variation device or braked weight in position "empty" for wagons with a variation device or maximum brake weight for wagons with a linear aoto continouus brake weight device "0" for wagons without brake system (in tonns)
     * 
     */
    public int getAirBrakedMass() {
        return airBrakedMass;
    }

    /**
     * Sets the value of the airBrakedMass property.
     * 
     */
    public void setAirBrakedMass(int value) {
        this.airBrakedMass = value;
    }

    /**
     * Gets the value of the loadChangeDevice property.
     * 
     * @return
     *     possible object is
     *     {@link AirBrake.LoadChangeDevice }
     *     
     */
    public AirBrake.LoadChangeDevice getLoadChangeDevice() {
        return loadChangeDevice;
    }

    /**
     * Sets the value of the loadChangeDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirBrake.LoadChangeDevice }
     *     
     */
    public void setLoadChangeDevice(AirBrake.LoadChangeDevice value) {
        this.loadChangeDevice = value;
    }

    /**
     * Gets the value of the brakeSpecialCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrakeSpecialCharacteristics() {
        return brakeSpecialCharacteristics;
    }

    /**
     * Sets the value of the brakeSpecialCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrakeSpecialCharacteristics(String value) {
        this.brakeSpecialCharacteristics = value;
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
     *         &lt;element name="ChangeOverWeight" type="{http://taf-jsg.info/schemes}Numeric3-3"/>
     *         &lt;element name="AirBrakedMassLoaded" type="{http://taf-jsg.info/schemes}Numeric3-3"/>
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
        "changeOverWeight",
        "airBrakedMassLoaded"
    })
    public static class LoadChangeDevice {

        @XmlElement(name = "ChangeOverWeight")
        protected int changeOverWeight;
        @XmlElement(name = "AirBrakedMassLoaded")
        protected int airBrakedMassLoaded;

        /**
         * Gets the value of the changeOverWeight property.
         * 
         */
        public int getChangeOverWeight() {
            return changeOverWeight;
        }

        /**
         * Sets the value of the changeOverWeight property.
         * 
         */
        public void setChangeOverWeight(int value) {
            this.changeOverWeight = value;
        }

        /**
         * Gets the value of the airBrakedMassLoaded property.
         * 
         */
        public int getAirBrakedMassLoaded() {
            return airBrakedMassLoaded;
        }

        /**
         * Sets the value of the airBrakedMassLoaded property.
         * 
         */
        public void setAirBrakedMassLoaded(int value) {
            this.airBrakedMassLoaded = value;
        }

    }

}
