
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ModelGetONT complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ModelGetONT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FRAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SLOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PORT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ETIQUETA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MODEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IPOLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strMODEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strIpONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDOLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelGetONT", propOrder = {
    "sn",
    "olt",
    "frame",
    "slot",
    "port",
    "ontid",
    "etiqueta",
    "model",
    "ipolt",
    "strMODEL",
    "strIpONT",
    "idolt"
})
public class ModelGetONT {

    @XmlElement(name = "SN")
    protected String sn;
    @XmlElement(name = "OLT")
    protected String olt;
    @XmlElement(name = "FRAME")
    protected String frame;
    @XmlElement(name = "SLOT")
    protected String slot;
    @XmlElement(name = "PORT")
    protected String port;
    @XmlElement(name = "ONT_ID")
    protected String ontid;
    @XmlElement(name = "ETIQUETA")
    protected String etiqueta;
    @XmlElement(name = "MODEL")
    protected String model;
    @XmlElement(name = "IPOLT")
    protected String ipolt;
    protected String strMODEL;
    protected String strIpONT;
    @XmlElement(name = "IDOLT")
    protected String idolt;

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
     * Obtiene el valor de la propiedad etiqueta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETIQUETA() {
        return etiqueta;
    }

    /**
     * Define el valor de la propiedad etiqueta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETIQUETA(String value) {
        this.etiqueta = value;
    }

    /**
     * Obtiene el valor de la propiedad model.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODEL() {
        return model;
    }

    /**
     * Define el valor de la propiedad model.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODEL(String value) {
        this.model = value;
    }

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
     * Obtiene el valor de la propiedad strMODEL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrMODEL() {
        return strMODEL;
    }

    /**
     * Define el valor de la propiedad strMODEL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrMODEL(String value) {
        this.strMODEL = value;
    }

    /**
     * Obtiene el valor de la propiedad strIpONT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrIpONT() {
        return strIpONT;
    }

    /**
     * Define el valor de la propiedad strIpONT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrIpONT(String value) {
        this.strIpONT = value;
    }

    /**
     * Obtiene el valor de la propiedad idolt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDOLT() {
        return idolt;
    }

    /**
     * Define el valor de la propiedad idolt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDOLT(String value) {
        this.idolt = value;
    }

}
