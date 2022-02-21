
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
 *         &lt;element name="strSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strModeInvoke" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LngUserId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="strIpInvoke" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="strMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strIdCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strToPay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "strSerialNumber",
    "strModeInvoke",
    "lngUserId",
    "strIpInvoke",
    "intType",
    "strMessage",
    "strIdCustomer",
    "strFullName",
    "strToPay",
    "strEmail"
})
@XmlRootElement(name = "OTNRoutingHSI")
public class OTNRoutingHSI {

    @XmlElement(name = "Login")
    protected ArrLogin login;
    protected String strSerialNumber;
    protected String strModeInvoke;
    @XmlElement(name = "LngUserId")
    protected long lngUserId;
    protected String strIpInvoke;
    protected int intType;
    protected String strMessage;
    protected String strIdCustomer;
    protected String strFullName;
    protected String strToPay;
    protected String strEmail;

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
     * Obtiene el valor de la propiedad strSerialNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSerialNumber() {
        return strSerialNumber;
    }

    /**
     * Define el valor de la propiedad strSerialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSerialNumber(String value) {
        this.strSerialNumber = value;
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
     * Obtiene el valor de la propiedad intType.
     * 
     */
    public int getIntType() {
        return intType;
    }

    /**
     * Define el valor de la propiedad intType.
     * 
     */
    public void setIntType(int value) {
        this.intType = value;
    }

    /**
     * Obtiene el valor de la propiedad strMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrMessage() {
        return strMessage;
    }

    /**
     * Define el valor de la propiedad strMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrMessage(String value) {
        this.strMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad strIdCustomer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrIdCustomer() {
        return strIdCustomer;
    }

    /**
     * Define el valor de la propiedad strIdCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrIdCustomer(String value) {
        this.strIdCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad strFullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrFullName() {
        return strFullName;
    }

    /**
     * Define el valor de la propiedad strFullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrFullName(String value) {
        this.strFullName = value;
    }

    /**
     * Obtiene el valor de la propiedad strToPay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrToPay() {
        return strToPay;
    }

    /**
     * Define el valor de la propiedad strToPay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrToPay(String value) {
        this.strToPay = value;
    }

    /**
     * Obtiene el valor de la propiedad strEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrEmail() {
        return strEmail;
    }

    /**
     * Define el valor de la propiedad strEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrEmail(String value) {
        this.strEmail = value;
    }

}
