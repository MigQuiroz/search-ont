
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
 *         &lt;element name="arrActivation" type="{http://tempuri.org/}arrActivation" minOccurs="0"/&gt;
 *         &lt;element name="idPackage" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="idCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arrAddOnVoIP" type="{http://tempuri.org/}ArrayOfArrAddOnVoIP" minOccurs="0"/&gt;
 *         &lt;element name="ArrAddon" type="{http://tempuri.org/}ArrAddons" minOccurs="0"/&gt;
 *         &lt;element name="blnGaoke" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="blnPreactivation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="arrAddOnIptv" type="{http://tempuri.org/}ArrayOfArrAddOnIPTV" minOccurs="0"/&gt;
 *         &lt;element name="ArrIPStatic" type="{http://tempuri.org/}arrIPStatic" minOccurs="0"/&gt;
 *         &lt;element name="AddInHSFI" type="{http://tempuri.org/}arrAddOnHSFI" minOccurs="0"/&gt;
 *         &lt;element name="lngIDaddIP" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intcounttroncal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="strparamtrunt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strparamIPs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strparamIPsDynamic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intCountCCTV" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "arrActivation",
    "idPackage",
    "idCustomer",
    "customerName",
    "arrAddOnVoIP",
    "arrAddon",
    "blnGaoke",
    "blnPreactivation",
    "arrAddOnIptv",
    "arrIPStatic",
    "addInHSFI",
    "lngIDaddIP",
    "latitude",
    "longitude",
    "mail",
    "zipCode",
    "intcounttroncal",
    "strparamtrunt",
    "strparamIPs",
    "strparamIPsDynamic",
    "intCountCCTV"
})
@XmlRootElement(name = "PackageActivationEnlace")
public class PackageActivationEnlace {

    protected ArrActivation arrActivation;
    protected long idPackage;
    protected String idCustomer;
    @XmlElement(name = "CustomerName")
    protected String customerName;
    protected ArrayOfArrAddOnVoIP arrAddOnVoIP;
    @XmlElement(name = "ArrAddon")
    protected ArrAddons arrAddon;
    protected boolean blnGaoke;
    protected boolean blnPreactivation;
    protected ArrayOfArrAddOnIPTV arrAddOnIptv;
    @XmlElement(name = "ArrIPStatic")
    protected ArrIPStatic arrIPStatic;
    @XmlElement(name = "AddInHSFI")
    protected ArrAddOnHSFI addInHSFI;
    protected long lngIDaddIP;
    protected String latitude;
    protected String longitude;
    protected String mail;
    protected String zipCode;
    protected int intcounttroncal;
    protected String strparamtrunt;
    protected String strparamIPs;
    protected String strparamIPsDynamic;
    protected int intCountCCTV;

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
     * Obtiene el valor de la propiedad customerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Define el valor de la propiedad customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Obtiene el valor de la propiedad arrAddOnVoIP.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrAddOnVoIP }
     *     
     */
    public ArrayOfArrAddOnVoIP getArrAddOnVoIP() {
        return arrAddOnVoIP;
    }

    /**
     * Define el valor de la propiedad arrAddOnVoIP.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrAddOnVoIP }
     *     
     */
    public void setArrAddOnVoIP(ArrayOfArrAddOnVoIP value) {
        this.arrAddOnVoIP = value;
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
     * Obtiene el valor de la propiedad blnGaoke.
     * 
     */
    public boolean isBlnGaoke() {
        return blnGaoke;
    }

    /**
     * Define el valor de la propiedad blnGaoke.
     * 
     */
    public void setBlnGaoke(boolean value) {
        this.blnGaoke = value;
    }

    /**
     * Obtiene el valor de la propiedad blnPreactivation.
     * 
     */
    public boolean isBlnPreactivation() {
        return blnPreactivation;
    }

    /**
     * Define el valor de la propiedad blnPreactivation.
     * 
     */
    public void setBlnPreactivation(boolean value) {
        this.blnPreactivation = value;
    }

    /**
     * Obtiene el valor de la propiedad arrAddOnIptv.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrAddOnIPTV }
     *     
     */
    public ArrayOfArrAddOnIPTV getArrAddOnIptv() {
        return arrAddOnIptv;
    }

    /**
     * Define el valor de la propiedad arrAddOnIptv.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrAddOnIPTV }
     *     
     */
    public void setArrAddOnIptv(ArrayOfArrAddOnIPTV value) {
        this.arrAddOnIptv = value;
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
     * Obtiene el valor de la propiedad lngIDaddIP.
     * 
     */
    public long getLngIDaddIP() {
        return lngIDaddIP;
    }

    /**
     * Define el valor de la propiedad lngIDaddIP.
     * 
     */
    public void setLngIDaddIP(long value) {
        this.lngIDaddIP = value;
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

    /**
     * Obtiene el valor de la propiedad intcounttroncal.
     * 
     */
    public int getIntcounttroncal() {
        return intcounttroncal;
    }

    /**
     * Define el valor de la propiedad intcounttroncal.
     * 
     */
    public void setIntcounttroncal(int value) {
        this.intcounttroncal = value;
    }

    /**
     * Obtiene el valor de la propiedad strparamtrunt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrparamtrunt() {
        return strparamtrunt;
    }

    /**
     * Define el valor de la propiedad strparamtrunt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrparamtrunt(String value) {
        this.strparamtrunt = value;
    }

    /**
     * Obtiene el valor de la propiedad strparamIPs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrparamIPs() {
        return strparamIPs;
    }

    /**
     * Define el valor de la propiedad strparamIPs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrparamIPs(String value) {
        this.strparamIPs = value;
    }

    /**
     * Obtiene el valor de la propiedad strparamIPsDynamic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrparamIPsDynamic() {
        return strparamIPsDynamic;
    }

    /**
     * Define el valor de la propiedad strparamIPsDynamic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrparamIPsDynamic(String value) {
        this.strparamIPsDynamic = value;
    }

    /**
     * Obtiene el valor de la propiedad intCountCCTV.
     * 
     */
    public int getIntCountCCTV() {
        return intCountCCTV;
    }

    /**
     * Define el valor de la propiedad intCountCCTV.
     * 
     */
    public void setIntCountCCTV(int value) {
        this.intCountCCTV = value;
    }

}
