
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FilterOLTS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FilterOLTS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IPOLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NAMEOLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FRAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SLOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PORT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VLAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IPONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blnrestore" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterOLTS", propOrder = {
    "ipolt",
    "nameolt",
    "frame",
    "slot",
    "port",
    "sn",
    "dn",
    "vlan",
    "ontid",
    "idstatus",
    "ipont",
    "blnrestore"
})
public class FilterOLTS {

    @XmlElement(name = "IPOLT")
    protected String ipolt;
    @XmlElement(name = "NAMEOLT")
    protected String nameolt;
    @XmlElement(name = "FRAME")
    protected String frame;
    @XmlElement(name = "SLOT")
    protected String slot;
    @XmlElement(name = "PORT")
    protected String port;
    @XmlElement(name = "SN")
    protected String sn;
    @XmlElement(name = "DN")
    protected String dn;
    @XmlElement(name = "VLAN")
    protected String vlan;
    @XmlElement(name = "ONTID")
    protected String ontid;
    @XmlElement(name = "IDSTATUS")
    protected String idstatus;
    @XmlElement(name = "IPONT")
    protected String ipont;
    protected boolean blnrestore;

    /**
     * Obtiene el valor de la propiedad ipolt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPOLT() {
        return ipolt;
    }

    /**
     * Define el valor de la propiedad ipolt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPOLT(String value) {
        this.ipolt = value;
    }

    /**
     * Obtiene el valor de la propiedad nameolt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAMEOLT() {
        return nameolt;
    }

    /**
     * Define el valor de la propiedad nameolt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAMEOLT(String value) {
        this.nameolt = value;
    }

    /**
     * Obtiene el valor de la propiedad frame.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRAME() {
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
    public void setFRAME(String value) {
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
    public String getSLOT() {
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
    public void setSLOT(String value) {
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
    public String getPORT() {
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
    public void setPORT(String value) {
        this.port = value;
    }

    /**
     * Obtiene el valor de la propiedad sn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSN() {
        return sn;
    }

    /**
     * Define el valor de la propiedad sn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSN(String value) {
        this.sn = value;
    }

    /**
     * Obtiene el valor de la propiedad dn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDN() {
        return dn;
    }

    /**
     * Define el valor de la propiedad dn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDN(String value) {
        this.dn = value;
    }

    /**
     * Obtiene el valor de la propiedad vlan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVLAN() {
        return vlan;
    }

    /**
     * Define el valor de la propiedad vlan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVLAN(String value) {
        this.vlan = value;
    }

    /**
     * Obtiene el valor de la propiedad ontid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONTID() {
        return ontid;
    }

    /**
     * Define el valor de la propiedad ontid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONTID(String value) {
        this.ontid = value;
    }

    /**
     * Obtiene el valor de la propiedad idstatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDSTATUS() {
        return idstatus;
    }

    /**
     * Define el valor de la propiedad idstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDSTATUS(String value) {
        this.idstatus = value;
    }

    /**
     * Obtiene el valor de la propiedad ipont.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPONT() {
        return ipont;
    }

    /**
     * Define el valor de la propiedad ipont.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPONT(String value) {
        this.ipont = value;
    }

    /**
     * Obtiene el valor de la propiedad blnrestore.
     * 
     */
    public boolean isBlnrestore() {
        return blnrestore;
    }

    /**
     * Define el valor de la propiedad blnrestore.
     * 
     */
    public void setBlnrestore(boolean value) {
        this.blnrestore = value;
    }

}
