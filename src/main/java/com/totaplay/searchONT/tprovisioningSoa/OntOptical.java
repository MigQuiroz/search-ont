
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OntOptical complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OntOptical"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Frame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Slot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OntId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpticsRxPower" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpticsTxPower" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpticsTxBiascurr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpticsTxTempature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpticsTxVol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OntRanging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpticsRxPowerOLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OntOptical", propOrder = {
    "olt",
    "frame",
    "slot",
    "port",
    "ontId",
    "opticsRxPower",
    "opticsTxPower",
    "opticsTxBiascurr",
    "opticsTxTempature",
    "opticsTxVol",
    "ontRanging",
    "opticsRxPowerOLT"
})
public class OntOptical {

    @XmlElement(name = "OLT")
    protected String olt;
    @XmlElement(name = "Frame")
    protected String frame;
    @XmlElement(name = "Slot")
    protected String slot;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "OntId")
    protected String ontId;
    @XmlElement(name = "OpticsRxPower")
    protected String opticsRxPower;
    @XmlElement(name = "OpticsTxPower")
    protected String opticsTxPower;
    @XmlElement(name = "OpticsTxBiascurr")
    protected String opticsTxBiascurr;
    @XmlElement(name = "OpticsTxTempature")
    protected String opticsTxTempature;
    @XmlElement(name = "OpticsTxVol")
    protected String opticsTxVol;
    @XmlElement(name = "OntRanging")
    protected String ontRanging;
    @XmlElement(name = "OpticsRxPowerOLT")
    protected String opticsRxPowerOLT;

    /**
     * Obtiene el valor de la propiedad olt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLT() {
        return olt;
    }

    /**
     * Define el valor de la propiedad olt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLT(String value) {
        this.olt = value;
    }

    /**
     * Obtiene el valor de la propiedad frame.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrame() {
        return frame;
    }

    /**
     * Define el valor de la propiedad frame.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrame(String value) {
        this.frame = value;
    }

    /**
     * Obtiene el valor de la propiedad slot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlot() {
        return slot;
    }

    /**
     * Define el valor de la propiedad slot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlot(String value) {
        this.slot = value;
    }

    /**
     * Obtiene el valor de la propiedad port.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Define el valor de la propiedad port.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Obtiene el valor de la propiedad ontId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOntId() {
        return ontId;
    }

    /**
     * Define el valor de la propiedad ontId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOntId(String value) {
        this.ontId = value;
    }

    /**
     * Obtiene el valor de la propiedad opticsRxPower.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticsRxPower() {
        return opticsRxPower;
    }

    /**
     * Define el valor de la propiedad opticsRxPower.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticsRxPower(String value) {
        this.opticsRxPower = value;
    }

    /**
     * Obtiene el valor de la propiedad opticsTxPower.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticsTxPower() {
        return opticsTxPower;
    }

    /**
     * Define el valor de la propiedad opticsTxPower.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticsTxPower(String value) {
        this.opticsTxPower = value;
    }

    /**
     * Obtiene el valor de la propiedad opticsTxBiascurr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticsTxBiascurr() {
        return opticsTxBiascurr;
    }

    /**
     * Define el valor de la propiedad opticsTxBiascurr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticsTxBiascurr(String value) {
        this.opticsTxBiascurr = value;
    }

    /**
     * Obtiene el valor de la propiedad opticsTxTempature.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticsTxTempature() {
        return opticsTxTempature;
    }

    /**
     * Define el valor de la propiedad opticsTxTempature.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticsTxTempature(String value) {
        this.opticsTxTempature = value;
    }

    /**
     * Obtiene el valor de la propiedad opticsTxVol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticsTxVol() {
        return opticsTxVol;
    }

    /**
     * Define el valor de la propiedad opticsTxVol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticsTxVol(String value) {
        this.opticsTxVol = value;
    }

    /**
     * Obtiene el valor de la propiedad ontRanging.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOntRanging() {
        return ontRanging;
    }

    /**
     * Define el valor de la propiedad ontRanging.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOntRanging(String value) {
        this.ontRanging = value;
    }

    /**
     * Obtiene el valor de la propiedad opticsRxPowerOLT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticsRxPowerOLT() {
        return opticsRxPowerOLT;
    }

    /**
     * Define el valor de la propiedad opticsRxPowerOLT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticsRxPowerOLT(String value) {
        this.opticsRxPowerOLT = value;
    }

}
