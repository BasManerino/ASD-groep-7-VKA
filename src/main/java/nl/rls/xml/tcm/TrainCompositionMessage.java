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
 *         &lt;element ref="{http://taf-jsg.info/schemes}MessageHeader"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}MessageStatus"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TransportOperationalIdentifiers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}OperationalTrainNumberIdentifier"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}OperationalTrainNumber"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}ReferenceOTN" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TransferPoint" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TransfereeIM" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TrainCompositionJourneySection" maxOccurs="99"/>
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
    "messageHeader",
    "messageStatus",
    "transportOperationalIdentifiers",
    "operationalTrainNumberIdentifier",
    "operationalTrainNumber",
    "referenceOTN",
    "transferPoint",
    "transfereeIM",
    "trainCompositionJourneySection"
})

@XmlRootElement(name = "TrainCompositionMessage")
public class TrainCompositionMessage {

	
    @XmlElement(name = "MessageHeader", required = true)
    protected MessageHeader messageHeader;
    @XmlElement(name = "MessageStatus", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String messageStatus;
    @XmlElement(name = "TransportOperationalIdentifiers")
    protected List<TransportOperationalIdentifiers> transportOperationalIdentifiers;
    @XmlElement(name = "OperationalTrainNumberIdentifier", required = true)
    protected OperationalTrainNumberIdentifier operationalTrainNumberIdentifier;
    @XmlElement(name = "OperationalTrainNumber", required = true)
    protected String operationalTrainNumber;
    @XmlElement(name = "ReferenceOTN")
    protected ReferenceOTN referenceOTN;
    @XmlElement(name = "TransferPoint")
    protected LocationIdent transferPoint;
    @XmlElement(name = "TransfereeIM")
    protected Integer transfereeIM;
    @XmlElement(name = "TrainCompositionJourneySection", required = true)
    protected List<TrainCompositionJourneySection> trainCompositionJourneySection;

    /**
     * Gets the value of the messageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader }
     *     
     */
    public MessageHeader getMessageHeader() {
        return messageHeader;
    }

    /**
     * Sets the value of the messageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader }
     *     
     */
    public void setMessageHeader(MessageHeader value) {
        this.messageHeader = value;
    }

    /**
     * Gets the value of the messageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageStatus() {
        return messageStatus;
    }

    /**
     * Sets the value of the messageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageStatus(String value) {
        this.messageStatus = value;
    }

    /**
     * Gets the value of the transportOperationalIdentifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportOperationalIdentifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportOperationalIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportOperationalIdentifiers }
     * 
     * 
     */
    public List<TransportOperationalIdentifiers> getTransportOperationalIdentifiers() {
        if (transportOperationalIdentifiers == null) {
            transportOperationalIdentifiers = new ArrayList<TransportOperationalIdentifiers>();
        }
        return this.transportOperationalIdentifiers;
    }

    /**
     * Gets the value of the operationalTrainNumberIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalTrainNumberIdentifier }
     *     
     */
    public OperationalTrainNumberIdentifier getOperationalTrainNumberIdentifier() {
        return operationalTrainNumberIdentifier;
    }

    /**
     * Sets the value of the operationalTrainNumberIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalTrainNumberIdentifier }
     *     
     */
    public void setOperationalTrainNumberIdentifier(OperationalTrainNumberIdentifier value) {
        this.operationalTrainNumberIdentifier = value;
    }

    /**
     * Gets the value of the operationalTrainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationalTrainNumber() {
        return operationalTrainNumber;
    }

    /**
     * Sets the value of the operationalTrainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationalTrainNumber(String value) {
        this.operationalTrainNumber = value;
    }

    /**
     * Gets the value of the referenceOTN property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceOTN }
     *     
     */
    public ReferenceOTN getReferenceOTN() {
        return referenceOTN;
    }

    /**
     * Sets the value of the referenceOTN property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceOTN }
     *     
     */
    public void setReferenceOTN(ReferenceOTN value) {
        this.referenceOTN = value;
    }

    /**
     * Gets the value of the transferPoint property.
     * 
     * @return
     *     possible object is
     *     {@link LocationIdent }
     *     
     */
    public LocationIdent getTransferPoint() {
        return transferPoint;
    }

    /**
     * Sets the value of the transferPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdent }
     *     
     */
    public void setTransferPoint(LocationIdent value) {
        this.transferPoint = value;
    }

    /**
     * Gets the value of the transfereeIM property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransfereeIM() {
        return transfereeIM;
    }

    /**
     * Sets the value of the transfereeIM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransfereeIM(Integer value) {
        this.transfereeIM = value;
    }

    /**
     * Gets the value of the trainCompositionJourneySection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trainCompositionJourneySection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrainCompositionJourneySection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrainCompositionJourneySection }
     * 
     * 
     */
    public List<TrainCompositionJourneySection> getTrainCompositionJourneySection() {
        if (trainCompositionJourneySection == null) {
            trainCompositionJourneySection = new ArrayList<TrainCompositionJourneySection>();
        }
        return this.trainCompositionJourneySection;
    }

}
