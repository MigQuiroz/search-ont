
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
 *         &lt;element name="ArrBrm" type="{http://tempuri.org/}arrBrm" minOccurs="0"/&gt;
 *         &lt;element name="Login" type="{http://tempuri.org/}arrLogin" minOccurs="0"/&gt;
 *         &lt;element name="arrActivation" type="{http://tempuri.org/}arrActivation" minOccurs="0"/&gt;
 *         &lt;element name="idPackage" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="idCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddInHSFI" type="{http://tempuri.org/}arrAddOnHSFI" minOccurs="0"/&gt;
 *         &lt;element name="arrAddInVoIP" type="{http://tempuri.org/}ArrayOfArrAddOnVoIP" minOccurs="0"/&gt;
 *         &lt;element name="AddInIPTV" type="{http://tempuri.org/}ArrayOfArrAddOnIPTV" minOccurs="0"/&gt;
 *         &lt;element name="ArrAddon" type="{http://tempuri.org/}ArrAddons" minOccurs="0"/&gt;
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
    "arrBrm",
    "login",
    "arrActivation",
    "idPackage",
    "idCustomer",
    "customerAlias",
    "addInHSFI",
    "arrAddInVoIP",
    "addInIPTV",
    "arrAddon",
    "arrIPStatic",
    "arrIPDynamic",
    "latitude",
    "longitude",
    "mail",
    "zipCode"
})
@XmlRootElement(name = "PackageActivationFusion")
public class PackageActivationFusion {

    @XmlElement(name = "ArrBrm")
    protected ArrBrm arrBrm;
    @XmlElement(name = "Login")
    protected ArrLogin login;
    protected ArrActivation arrActivation;
    protected long idPackage;
    protected String idCustomer;
    @XmlElement(name = "CustomerAlias")
    protected String customerAlias;
    @XmlElement(name = "AddInHSFI")
    protected ArrAddOnHSFI addInHSFI;
    protected ArrayOfArrAddOnVoIP arrAddInVoIP;
    @XmlElement(name = "AddInIPTV")
    protected ArrayOfArrAddOnIPTV addInIPTV;
    @XmlElement(name = "ArrAddon")
    protected ArrAddons arrAddon;
    @XmlElement(name = "ArrIPStatic")
    protected ArrIPStatic arrIPStatic;
    @XmlElement(name = "ArrIPDynamic")
    protected ArrIPDynamic arrIPDynamic;
    protected String latitude;
    protected String longitude;
    protected String mail;
    protected String zipCode;

    /**
     * Obtiene el valor de la propiedad arrBrm.
     * 
     * @return
     *     possible object is
     *     {@link ArrBrm }
     *     
     */
    public ArrBrm getArrBrm() {
        return arrBrm;
    }

    /**
     * Define el valor de la propiedad arrBrm.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrBrm }
     *     
     */
    public void setArrBrm(ArrBrm value) {
        this.arrBrm = value;
    }

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
     * Obtiene el valor de la propiedad arrActivation.
     * 
     * @return
     *     possible object is
     *     {@link ArrActivation }
     *     
     */
    public ArrActivation getArrActivation() {
        return arrActivation;
    }

    /**
     * Define el valor de la propiedad arrActivation.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrActivation }
     *     
     */
    public void setArrActivation(ArrActivation value) {
        this.arrActivation = value;
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
     * Obtiene el valor de la propiedad addInHSFI.
     * 
     * @return
     *     possible object is
     *     {@link ArrAddOnHSFI }
     *     
     */
    public ArrAddOnHSFI getAddInHSFI() {
        return addInHSFI;
    }

    /**
     * Define el valor de la propiedad addInHSFI.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrAddOnHSFI }
     *     
     */
    public void setAddInHSFI(ArrAddOnHSFI value) {
        this.addInHSFI = value;
    }

    /**
     * Obtiene el valor de la propiedad arrAddInVoIP.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrAddOnVoIP }
     *     
     */
    public ArrayOfArrAddOnVoIP getArrAddInVoIP() {
        return arrAddInVoIP;
    }

    /**
     * Define el valor de la propiedad arrAddInVoIP.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrAddOnVoIP }
     *     
     */
    public void setArrAddInVoIP(ArrayOfArrAddOnVoIP value) {
        this.arrAddInVoIP = value;
    }

    /**
     * Obtiene el valor de la propiedad addInIPTV.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrAddOnIPTV }
     *     
     */
    public ArrayOfArrAddOnIPTV getAddInIPTV() {
        return addInIPTV;
    }

    /**
     * Define el valor de la propiedad addInIPTV.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrAddOnIPTV }
     *     
     */
    public void setAddInIPTV(ArrayOfArrAddOnIPTV value) {
        this.addInIPTV = value;
    }

    /**
     * Obtiene el valor de la propiedad arrAddon.
     * 
     * @return
     *     possible object is
     *     {@link ArrAddons }
     *     
     */
    public ArrAddons getArrAddon() {
        return arrAddon;
    }

    /**
     * Define el valor de la propiedad arrAddon.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrAddons }
     *     
     */
    public void setArrAddon(ArrAddons value) {
        this.arrAddon = value;
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
