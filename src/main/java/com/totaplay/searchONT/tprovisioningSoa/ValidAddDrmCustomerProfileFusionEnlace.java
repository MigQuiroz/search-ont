
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
 *         &lt;element name="lngIdPackage" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="strIdCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strCustomerAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arrAddOnVoIP" type="{http://tempuri.org/}ArrayOfArrAddOnVoIP" minOccurs="0"/&gt;
 *         &lt;element name="strTypeInvoke" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddInHSFI" type="{http://tempuri.org/}arrAddOnHSFI" minOccurs="0"/&gt;
 *         &lt;element name="ArrIPStatic" type="{http://tempuri.org/}arrIPStatic" minOccurs="0"/&gt;
 *         &lt;element name="ArrIPDynamic" type="{http://tempuri.org/}arrIPDynamic" minOccurs="0"/&gt;
 *         &lt;element name="intcounttroncal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ArrIPStaticCCTV" type="{http://tempuri.org/}arrIPStaticCCTV" minOccurs="0"/&gt;
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
    "lngIdPackage",
    "strIdCustomer",
    "strCustomerAlias",
    "arrAddOnVoIP",
    "strTypeInvoke",
    "addInHSFI",
    "arrIPStatic",
    "arrIPDynamic",
    "intcounttroncal",
    "arrIPStaticCCTV"
})
@XmlRootElement(name = "validAddDrmCustomerProfileFusionEnlace")
public class ValidAddDrmCustomerProfileFusionEnlace {

    protected ArrActivation arrActivation;
    protected long lngIdPackage;
    protected String strIdCustomer;
    protected String strCustomerAlias;
    protected ArrayOfArrAddOnVoIP arrAddOnVoIP;
    protected String strTypeInvoke;
    @XmlElement(name = "AddInHSFI")
    protected ArrAddOnHSFI addInHSFI;
    @XmlElement(name = "ArrIPStatic")
    protected ArrIPStatic arrIPStatic;
    @XmlElement(name = "ArrIPDynamic")
    protected ArrIPDynamic arrIPDynamic;
    protected int intcounttroncal;
    @XmlElement(name = "ArrIPStaticCCTV")
    protected ArrIPStaticCCTV arrIPStaticCCTV;

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
     * Obtiene el valor de la propiedad lngIdPackage.
     * 
     */
    public long getLngIdPackage() {
        return lngIdPackage;
    }

    /**
     * Define el valor de la propiedad lngIdPackage.
     * 
     */
    public void setLngIdPackage(long value) {
        this.lngIdPackage = value;
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
     * Obtiene el valor de la propiedad strCustomerAlias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCustomerAlias() {
        return strCustomerAlias;
    }

    /**
     * Define el valor de la propiedad strCustomerAlias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCustomerAlias(String value) {
        this.strCustomerAlias = value;
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
     * Obtiene el valor de la propiedad strTypeInvoke.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrTypeInvoke() {
        return strTypeInvoke;
    }

    /**
     * Define el valor de la propiedad strTypeInvoke.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrTypeInvoke(String value) {
        this.strTypeInvoke = value;
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

}
