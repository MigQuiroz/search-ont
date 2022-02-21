
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para arrParamOptional complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="arrParamOptional"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IPOlt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Slot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Frame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumberONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdModel" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="IdPackage" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="intgHsi" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="intVoip" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="intIptv" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="intHsiD" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="intHsiU" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OntId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrParamOptional", propOrder = {
    "olt",
    "ipOlt",
    "port",
    "slot",
    "frame",
    "serialNumberONT",
    "idModel",
    "idPackage",
    "intgHsi",
    "intVoip",
    "intIptv",
    "intHsiD",
    "intHsiU",
    "alias",
    "ontId"
})
public class ArrParamOptional {

    @XmlElement(name = "OLT")
    protected String olt;
    @XmlElement(name = "IPOlt")
    protected String ipOlt;
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
    @XmlElement(name = "IdPackage")
    protected long idPackage;
    protected int intgHsi;
    protected int intVoip;
    protected int intIptv;
    protected int intHsiD;
    protected int intHsiU;
    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "OntId")
    protected String ontId;

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
     * Obtiene el valor de la propiedad ipOlt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPOlt() {
        return ipOlt;
    }

    /**
     * Define el valor de la propiedad ipOlt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPOlt(String value) {
        this.ipOlt = value;
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
     * Obtiene el valor de la propiedad idPackage.
     * 
     */
    public long getIdPackage() {
        return idPackage;
    }

    /**
     * Define el valor de la propiedad idPackage.
     * 
     */
    public void setIdPackage(long value) {
        this.idPackage = value;
    }

    /**
     * Obtiene el valor de la propiedad intgHsi.
     * 
     */
    public int getIntgHsi() {
        return intgHsi;
    }

    /**
     * Define el valor de la propiedad intgHsi.
     * 
     */
    public void setIntgHsi(int value) {
        this.intgHsi = value;
    }

    /**
     * Obtiene el valor de la propiedad intVoip.
     * 
     */
    public int getIntVoip() {
        return intVoip;
    }

    /**
     * Define el valor de la propiedad intVoip.
     * 
     */
    public void setIntVoip(int value) {
        this.intVoip = value;
    }

    /**
     * Obtiene el valor de la propiedad intIptv.
     * 
     */
    public int getIntIptv() {
        return intIptv;
    }

    /**
     * Define el valor de la propiedad intIptv.
     * 
     */
    public void setIntIptv(int value) {
        this.intIptv = value;
    }

    /**
     * Obtiene el valor de la propiedad intHsiD.
     * 
     */
    public int getIntHsiD() {
        return intHsiD;
    }

    /**
     * Define el valor de la propiedad intHsiD.
     * 
     */
    public void setIntHsiD(int value) {
        this.intHsiD = value;
    }

    /**
     * Obtiene el valor de la propiedad intHsiU.
     * 
     */
    public int getIntHsiU() {
        return intHsiU;
    }

    /**
     * Define el valor de la propiedad intHsiU.
     * 
     */
    public void setIntHsiU(int value) {
        this.intHsiU = value;
    }

    /**
     * Obtiene el valor de la propiedad alias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Define el valor de la propiedad alias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
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

}
