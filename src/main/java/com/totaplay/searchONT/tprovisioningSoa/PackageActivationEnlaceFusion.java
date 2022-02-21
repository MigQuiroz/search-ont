
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
 *         &lt;element name="arrActivation" type="{http://tempuri.org/}arrActivation" minOccurs="0"/&gt;
 *         &lt;element name="idPackage" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="idCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddInHSFI" type="{http://tempuri.org/}arrAddOnHSFI" minOccurs="0"/&gt;
 *         &lt;element name="arrAddInVoIP" type="{http://tempuri.org/}ArrayOfArrAddOnVoIP" minOccurs="0"/&gt;
 *         &lt;element name="arrAddInVoIPTroncal" type="{http://tempuri.org/}ArrayOfArrAddOnVoIP" minOccurs="0"/&gt;
 *         &lt;element name="ArrIPStatic" type="{http://tempuri.org/}arrIPStatic" minOccurs="0"/&gt;
 *         &lt;element name="ArrIPDynamic" type="{http://tempuri.org/}arrIPDynamic" minOccurs="0"/&gt;
 *         &lt;element name="lngIDaddIP" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="intcounttroncal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="strparamIPsStatic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strCCTV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrIPStaticCCTV" type="{http://tempuri.org/}arrIPStaticCCTV" minOccurs="0"/&gt;
 *         &lt;element name="intEncoderTV" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "login",
    "arrActivation",
    "idPackage",
    "idCustomer",
    "customerAlias",
    "addInHSFI",
    "arrAddInVoIP",
    "arrAddInVoIPTroncal",
    "arrIPStatic",
    "arrIPDynamic",
    "lngIDaddIP",
    "intcounttroncal",
    "strparamIPsStatic",
    "strCCTV",
    "arrIPStaticCCTV",
    "intEncoderTV",
    "intCountCCTV"
})
@XmlRootElement(name = "PackageActivationEnlaceFusion")
public class PackageActivationEnlaceFusion {

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
    protected ArrayOfArrAddOnVoIP arrAddInVoIPTroncal;
    @XmlElement(name = "ArrIPStatic")
    protected ArrIPStatic arrIPStatic;
    @XmlElement(name = "ArrIPDynamic")
    protected ArrIPDynamic arrIPDynamic;
    protected long lngIDaddIP;
    protected int intcounttroncal;
    protected String strparamIPsStatic;
    protected String strCCTV;
    @XmlElement(name = "ArrIPStaticCCTV")
    protected ArrIPStaticCCTV arrIPStaticCCTV;
    protected int intEncoderTV;
    protected int intCountCCTV;

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
     * Obtiene el valor de la propiedad arrAddInVoIPTroncal.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrAddOnVoIP }
     *     
     */
    public ArrayOfArrAddOnVoIP getArrAddInVoIPTroncal() {
        return arrAddInVoIPTroncal;
    }

    /**
     * Define el valor de la propiedad arrAddInVoIPTroncal.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrAddOnVoIP }
     *     
     */
    public void setArrAddInVoIPTroncal(ArrayOfArrAddOnVoIP value) {
        this.arrAddInVoIPTroncal = value;
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
     * Obtiene el valor de la propiedad strparamIPsStatic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrparamIPsStatic() {
        return strparamIPsStatic;
    }

    /**
     * Define el valor de la propiedad strparamIPsStatic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrparamIPsStatic(String value) {
        this.strparamIPsStatic = value;
    }

    /**
     * Obtiene el valor de la propiedad strCCTV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCCTV() {
        return strCCTV;
    }

    /**
     * Define el valor de la propiedad strCCTV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCCTV(String value) {
        this.strCCTV = value;
    }

    /**
     * Obtiene el valor de la propiedad arrIPStaticCCTV.
     * 
     * @return
     *     possible object is
     *     {@link ArrIPStaticCCTV }
     *     
     */
    public ArrIPStaticCCTV getArrIPStaticCCTV() {
        return arrIPStaticCCTV;
    }

    /**
     * Define el valor de la propiedad arrIPStaticCCTV.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrIPStaticCCTV }
     *     
     */
    public void setArrIPStaticCCTV(ArrIPStaticCCTV value) {
        this.arrIPStaticCCTV = value;
    }

    /**
     * Obtiene el valor de la propiedad intEncoderTV.
     * 
     */
    public int getIntEncoderTV() {
        return intEncoderTV;
    }

    /**
     * Define el valor de la propiedad intEncoderTV.
     * 
     */
    public void setIntEncoderTV(int value) {
        this.intEncoderTV = value;
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
