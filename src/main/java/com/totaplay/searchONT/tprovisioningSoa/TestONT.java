
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="strOLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strFrame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strSlot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strONTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strserialnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LngUserId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="strIpInvoke" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strModeInvoke" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "strOLT",
    "strFrame",
    "strSlot",
    "strPort",
    "strONTID",
    "strserialnumber",
    "idCustomer",
    "lngUserId",
    "strIpInvoke",
    "strModeInvoke"
})
@XmlRootElement(name = "TestONT")
public class TestONT {

    protected String strOLT;
    protected String strFrame;
    protected String strSlot;
    protected String strPort;
    protected String strONTID;
    protected String strserialnumber;
    protected String idCustomer;
    @XmlElement(name = "LngUserId")
    protected long lngUserId;
    protected String strIpInvoke;
    protected String strModeInvoke;

    /**
     * Obtiene el valor de la propiedad strOLT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrOLT() {
        return strOLT;
    }

    /**
     * Define el valor de la propiedad strOLT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrOLT(String value) {
        this.strOLT = value;
    }

    /**
     * Obtiene el valor de la propiedad strFrame.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrFrame() {
        return strFrame;
    }

    /**
     * Define el valor de la propiedad strFrame.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrFrame(String value) {
        this.strFrame = value;
    }

    /**
     * Obtiene el valor de la propiedad strSlot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSlot() {
        return strSlot;
    }

    /**
     * Define el valor de la propiedad strSlot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSlot(String value) {
        this.strSlot = value;
    }

    /**
     * Obtiene el valor de la propiedad strPort.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrPort() {
        return strPort;
    }

    /**
     * Define el valor de la propiedad strPort.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrPort(String value) {
        this.strPort = value;
    }

    /**
     * Obtiene el valor de la propiedad strONTID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrONTID() {
        return strONTID;
    }

    /**
     * Define el valor de la propiedad strONTID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrONTID(String value) {
        this.strONTID = value;
    }

    /**
     * Obtiene el valor de la propiedad strserialnumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrserialnumber() {
        return strserialnumber;
    }

    /**
     * Define el valor de la propiedad strserialnumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrserialnumber(String value) {
        this.strserialnumber = value;
    }

    /**
     * Obtiene el valor de la propiedad idCustomer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCustomer() {
        return idCustomer;
    }

    /**
     * Define el valor de la propiedad idCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCustomer(String value) {
        this.idCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad lngUserId.
     * 
     */
    public long getLngUserId() {
        return lngUserId;
    }

    /**
     * Define el valor de la propiedad lngUserId.
     * 
     */
    public void setLngUserId(long value) {
        this.lngUserId = value;
    }

    /**
     * Obtiene el valor de la propiedad strIpInvoke.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrIpInvoke() {
        return strIpInvoke;
    }

    /**
     * Define el valor de la propiedad strIpInvoke.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrIpInvoke(String value) {
        this.strIpInvoke = value;
    }

    /**
     * Obtiene el valor de la propiedad strModeInvoke.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrModeInvoke() {
        return strModeInvoke;
    }

    /**
     * Define el valor de la propiedad strModeInvoke.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrModeInvoke(String value) {
        this.strModeInvoke = value;
    }

}
