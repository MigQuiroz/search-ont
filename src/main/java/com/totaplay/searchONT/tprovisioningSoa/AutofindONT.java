
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AutofindONT complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AutofindONT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OLT_IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OLT_ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Slot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Frame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumberONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdModel" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="OntId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PON_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutofindONT", propOrder = {
    "olt",
    "oltip",
    "oltid",
    "port",
    "slot",
    "frame",
    "serialNumberONT",
    "idModel",
    "ontId",
    "strVersion",
    "strModel",
    "ponid"
})
public class AutofindONT {

    @XmlElement(name = "OLT")
    protected String olt;
    @XmlElement(name = "OLT_IP")
    protected String oltip;
    @XmlElement(name = "OLT_ID")
    protected int oltid;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "Slot")
    protected String slot;
    @XmlElement(name = "Frame")
    protected String frame;
    @XmlElement(name = "SerialNumberONT")
    protected String serialNumberONT;
    @XmlElement(name = "IdModel")
    protected long idModel;
    @XmlElement(name = "OntId")
    protected String ontId;
    protected String strVersion;
    protected String strModel;
    @XmlElement(name = "PON_ID")
    protected String ponid;

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
     * Obtiene el valor de la propiedad oltip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLTIP() {
        return oltip;
    }

    /**
     * Define el valor de la propiedad oltip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLTIP(String value) {
        this.oltip = value;
    }

    /**
     * Obtiene el valor de la propiedad oltid.
     * 
     */
    public int getOLTID() {
        return oltid;
    }

    /**
     * Define el valor de la propiedad oltid.
     * 
     */
    public void setOLTID(int value) {
        this.oltid = value;
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
     * Obtiene el valor de la propiedad serialNumberONT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumberONT() {
        return serialNumberONT;
    }

    /**
     * Define el valor de la propiedad serialNumberONT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumberONT(String value) {
        this.serialNumberONT = value;
    }

    /**
     * Obtiene el valor de la propiedad idModel.
     * 
     */
    public long getIdModel() {
        return idModel;
    }

    /**
     * Define el valor de la propiedad idModel.
     * 
     */
    public void setIdModel(long value) {
        this.idModel = value;
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
     * Obtiene el valor de la propiedad strVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVersion() {
        return strVersion;
    }

    /**
     * Define el valor de la propiedad strVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVersion(String value) {
        this.strVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad strModel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrModel() {
        return strModel;
    }

    /**
     * Define el valor de la propiedad strModel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrModel(String value) {
        this.strModel = value;
    }

    /**
     * Obtiene el valor de la propiedad ponid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPONID() {
        return ponid;
    }

    /**
     * Define el valor de la propiedad ponid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPONID(String value) {
        this.ponid = value;
    }

}
