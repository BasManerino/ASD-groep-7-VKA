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
 *       &lt;choice>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TransportOperationalIdentifiers"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}PlannedTransportIdentifiers"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transportOperationalIdentifiers",
    "plannedTransportIdentifiers"
})
@XmlRootElement(name = "AssociatedTrain")
public class AssociatedTrain {

    @XmlElement(name = "TransportOperationalIdentifiers")
    protected TransportOperationalIdentifiers transportOperationalIdentifiers;
    @XmlElement(name = "PlannedTransportIdentifiers")
    protected CompositIdentifierPlannedType plannedTransportIdentifiers;

    /**
     * Gets the value of the transportOperationalIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link TransportOperationalIdentifiers }
     *     
     */
    public TransportOperationalIdentifiers getTransportOperationalIdentifiers() {
        return transportOperationalIdentifiers;
    }

    /**
     * Sets the value of the transportOperationalIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportOperationalIdentifiers }
     *     
     */
    public void setTransportOperationalIdentifiers(TransportOperationalIdentifiers value) {
        this.transportOperationalIdentifiers = value;
    }

    /**
     * Gets the value of the plannedTransportIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link CompositIdentifierPlannedType }
     *     
     */
    public CompositIdentifierPlannedType getPlannedTransportIdentifiers() {
        return plannedTransportIdentifiers;
    }

    /**
     * Sets the value of the plannedTransportIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositIdentifierPlannedType }
     *     
     */
    public void setPlannedTransportIdentifiers(CompositIdentifierPlannedType value) {
        this.plannedTransportIdentifiers = value;
    }

}
