
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
 *         &lt;element name="Login" type="{http://tempuri.org/}arrLogin" minOccurs="0"/&gt;
 *         &lt;element name="strOLTName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strSNONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strFrame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strSlot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strONTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strModeInvoke" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LngUserId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="strIpInvoke" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blnGuiNew" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="STRDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "login",
    "strOLTName",
    "customerId",
    "strName",
    "strSNONT",
    "strFrame",
    "strSlot",
    "strPort",
    "strONTID",
    "strModeInvoke",
    "lngUserId",
    "strIpInvoke",
    "blnGuiNew",
    "strdn"
})
@XmlRootElement(name = "CreateDN")
public class CreateDN {

    @XmlElement(name = "Login")
    protected ArrLogin login;
    protected String strOLTName;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    protected String strName;
    protected String strSNONT;
    protected String strFrame;
    protected String strSlot;
    protected String strPort;
    protected String strONTID;
    protected String strModeInvoke;
    @XmlElement(name = "LngUserId")
    protected long lngUserId;
    protected String strIpInvoke;
    protected boolean blnGuiNew;
    @XmlElement(name = "STRDN")
    protected String strdn;

    /**
     * Obtiene el valor de la propiedad login.
     * 
     * @return
     *     possible object is
     *     {@link ArrLogin }
     *     
     */
    public ArrLogin getLogin() {
        return login;
    }

    /**
     * Define el valor de la propiedad login.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrLogin }
     *     
     */
    public void setLogin(ArrLogin value) {
        this.login = value;
    }

    /**
     * Obtiene el valor de la propiedad strOLTName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrOLTName() {
        return strOLTName;
    }

    /**
     * Define el valor de la propiedad strOLTName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrOLTName(String value) {
        this.strOLTName = value;
    }

    /**
     * Obtiene el valor de la propiedad customerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Define el valor de la propiedad customerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Obtiene el valor de la propiedad strName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrName() {
        return strName;
    }

    /**
     * Define el valor de la propiedad strName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrName(String value) {
        this.strName = value;
    }

    /**
     * Obtiene el valor de la propiedad strSNONT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSNONT() {
        return strSNONT;
    }

    /**
     * Define el valor de la propiedad strSNONT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSNONT(String value) {
        this.strSNONT = value;
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
     * Obtiene el valor de la propiedad blnGuiNew.
     * 
     */
    public boolean isBlnGuiNew() {
        return blnGuiNew;
    }

    /**
     * Define el valor de la propiedad blnGuiNew.
     * 
     */
    public void setBlnGuiNew(boolean value) {
        this.blnGuiNew = value;
    }

    /**
     * Obtiene el valor de la propiedad strdn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRDN() {
        return strdn;
    }

    /**
     * Define el valor de la propiedad strdn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRDN(String value) {
        this.strdn = value;
    }

}
