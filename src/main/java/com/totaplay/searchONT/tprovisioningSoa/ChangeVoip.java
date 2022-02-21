
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
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strNewDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strOldDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blnMaster" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "customerId",
    "strSerialNumber",
    "strNewDN",
    "strOldDN",
    "blnMaster"
})
@XmlRootElement(name = "ChangeVoip")
public class ChangeVoip {

    @XmlElement(name = "Login")
    protected ArrLogin login;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    protected String strSerialNumber;
    protected String strNewDN;
    protected String strOldDN;
    protected boolean blnMaster;

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
     * Obtiene el valor de la propiedad strNewDN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrNewDN() {
        return strNewDN;
    }

    /**
     * Define el valor de la propiedad strNewDN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrNewDN(String value) {
        this.strNewDN = value;
    }

    /**
     * Obtiene el valor de la propiedad strOldDN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrOldDN() {
        return strOldDN;
    }

    /**
     * Define el valor de la propiedad strOldDN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrOldDN(String value) {
        this.strOldDN = value;
    }

    /**
     * Obtiene el valor de la propiedad blnMaster.
     * 
     */
    public boolean isBlnMaster() {
        return blnMaster;
    }

    /**
     * Define el valor de la propiedad blnMaster.
     * 
     */
    public void setBlnMaster(boolean value) {
        this.blnMaster = value;
    }

}
