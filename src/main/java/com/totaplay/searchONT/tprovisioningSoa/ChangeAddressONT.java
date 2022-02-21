
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
 *         &lt;element name="arrNewAddressONT" type="{http://tempuri.org/}arrParamOptional" minOccurs="0"/&gt;
 *         &lt;element name="idPackage" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValuesHSI" type="{http://tempuri.org/}arrAddOnHSFI" minOccurs="0"/&gt;
 *         &lt;element name="ValuesVoIP" type="{http://tempuri.org/}ArrayOfArrAddOnVoIP" minOccurs="0"/&gt;
 *         &lt;element name="intCountIPTV" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ArrIPStatic" type="{http://tempuri.org/}arrIPStatic" minOccurs="0"/&gt;
 *         &lt;element name="ArrIPDynamic" type="{http://tempuri.org/}arrIPDynamic" minOccurs="0"/&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "arrNewAddressONT",
    "idPackage",
    "customerId",
    "customerAlias",
    "valuesHSI",
    "valuesVoIP",
    "intCountIPTV",
    "arrIPStatic",
    "arrIPDynamic",
    "latitude",
    "longitude",
    "mail",
    "zipCode"
})
@XmlRootElement(name = "ChangeAddressONT")
public class ChangeAddressONT {

    @XmlElement(name = "Login")
    protected ArrLogin login;
    protected ArrParamOptional arrNewAddressONT;
    protected long idPackage;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "CustomerAlias")
    protected String customerAlias;
    @XmlElement(name = "ValuesHSI")
    protected ArrAddOnHSFI valuesHSI;
    @XmlElement(name = "ValuesVoIP")
    protected ArrayOfArrAddOnVoIP valuesVoIP;
    protected int intCountIPTV;
    @XmlElement(name = "ArrIPStatic")
    protected ArrIPStatic arrIPStatic;
    @XmlElement(name = "ArrIPDynamic")
    protected ArrIPDynamic arrIPDynamic;
    protected String latitude;
    protected String longitude;
    protected String mail;
    protected String zipCode;

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
     * Obtiene el valor de la propiedad arrNewAddressONT.
     * 
     * @return
     *     possible object is
     *     {@link ArrParamOptional }
     *     
     */
    public ArrParamOptional getArrNewAddressONT() {
        return arrNewAddressONT;
    }

    /**
     * Define el valor de la propiedad arrNewAddressONT.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrParamOptional }
     *     
     */
    public void setArrNewAddressONT(ArrParamOptional value) {
        this.arrNewAddressONT = value;
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
     * Obtiene el valor de la propiedad customerAlias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAlias() {
        return customerAlias;
    }

    /**
     * Define el valor de la propiedad customerAlias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAlias(String value) {
        this.customerAlias = value;
    }

    /**
     * Obtiene el valor de la propiedad valuesHSI.
     * 
     * @return
     *     possible object is
     *     {@link ArrAddOnHSFI }
     *     
     */
    public ArrAddOnHSFI getValuesHSI() {
        return valuesHSI;
    }

    /**
     * Define el valor de la propiedad valuesHSI.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrAddOnHSFI }
     *     
     */
    public void setValuesHSI(ArrAddOnHSFI value) {
        this.valuesHSI = value;
    }

    /**
     * Obtiene el valor de la propiedad valuesVoIP.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrAddOnVoIP }
     *     
     */
    public ArrayOfArrAddOnVoIP getValuesVoIP() {
        return valuesVoIP;
    }

    /**
     * Define el valor de la propiedad valuesVoIP.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrAddOnVoIP }
     *     
     */
    public void setValuesVoIP(ArrayOfArrAddOnVoIP value) {
        this.valuesVoIP = value;
    }

    /**
     * Obtiene el valor de la propiedad intCountIPTV.
     * 
     */
    public int getIntCountIPTV() {
        return intCountIPTV;
    }

    /**
     * Define el valor de la propiedad intCountIPTV.
     * 
     */
    public void setIntCountIPTV(int value) {
        this.intCountIPTV = value;
    }

    /**
     * Obtiene el valor de la propiedad arrIPStatic.
     * 
     * @return
     *     possible object is
     *     {@link ArrIPStatic }
     *     
     */
    public ArrIPStatic getArrIPStatic() {
        return arrIPStatic;
    }

    /**
     * Define el valor de la propiedad arrIPStatic.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrIPStatic }
     *     
     */
    public void setArrIPStatic(ArrIPStatic value) {
        this.arrIPStatic = value;
    }

    /**
     * Obtiene el valor de la propiedad arrIPDynamic.
     * 
     * @return
     *     possible object is
     *     {@link ArrIPDynamic }
     *     
     */
    public ArrIPDynamic getArrIPDynamic() {
        return arrIPDynamic;
    }

    /**
     * Define el valor de la propiedad arrIPDynamic.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrIPDynamic }
     *     
     */
    public void setArrIPDynamic(ArrIPDynamic value) {
        this.arrIPDynamic = value;
    }

    /**
     * Obtiene el valor de la propiedad latitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Define el valor de la propiedad latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Obtiene el valor de la propiedad longitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Define el valor de la propiedad longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Obtiene el valor de la propiedad mail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMail() {
        return mail;
    }

    /**
     * Define el valor de la propiedad mail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMail(String value) {
        this.mail = value;
    }

    /**
     * Obtiene el valor de la propiedad zipCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Define el valor de la propiedad zipCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

}
