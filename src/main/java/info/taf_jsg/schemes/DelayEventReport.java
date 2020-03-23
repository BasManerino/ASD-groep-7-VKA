//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.22 at 09:30:01 PM CEST 
//


package info.taf_jsg.schemes;

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
 *         &lt;element ref="{http://taf-jsg.info/schemes}DelayLocation"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TrainLocationStatus"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}DelayCauseTime"/>
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
    "delayLocation",
    "trainLocationStatus",
    "delayCauseTime"
})
@XmlRootElement(name = "DelayEventReport")
public class DelayEventReport {

    @XmlElement(name = "DelayLocation", required = true)
    protected LocationIdent delayLocation;
    @XmlElement(name = "TrainLocationStatus", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String trainLocationStatus;
    @XmlElement(name = "DelayCauseTime", required = true)
    protected DelayCauseTime delayCauseTime;

    /**
     * Gets the value of the delayLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationIdent }
     *     
     */
    public LocationIdent getDelayLocation() {
        return delayLocation;
    }

    /**
     * Sets the value of the delayLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdent }
     *     
     */
    public void setDelayLocation(LocationIdent value) {
        this.delayLocation = value;
    }

    /**
     * Gets the value of the trainLocationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainLocationStatus() {
        return trainLocationStatus;
    }

    /**
     * Sets the value of the trainLocationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainLocationStatus(String value) {
        this.trainLocationStatus = value;
    }

    /**
     * Gets the value of the delayCauseTime property.
     * 
     * @return
     *     possible object is
     *     {@link DelayCauseTime }
     *     
     */
    public DelayCauseTime getDelayCauseTime() {
        return delayCauseTime;
    }

    /**
     * Sets the value of the delayCauseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayCauseTime }
     *     
     */
    public void setDelayCauseTime(DelayCauseTime value) {
        this.delayCauseTime = value;
    }

}