
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="InVoIPs" type="{http://tempuri.org/}ArrayOfArrAddOnVoIP" minOccurs="0"/&gt;
 *         &lt;element name="InIPTVs" type="{http://tempuri.org/}ArrayOfArrAddOnIPTV" minOccurs="0"/&gt;
 *         &lt;element name="strDnMaster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PeriodHrs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dteLimit" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="intReason" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="strComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strIdUserEvergent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "inVoIPs",
    "inIPTVs",
    "strDnMaster",
    "periodHrs",
    "dteLimit",
    "intReason",
    "strComments",
    "strIdUserEvergent"
})
@XmlRootElement(name = "Suppression")
public class Suppression {

    @XmlElement(name = "Login")
    protected ArrLogin login;
    protected ArrActivation arrActivation;
    protected long idPackage;
    protected String idCustomer;
    @XmlElement(name = "CustomerAlias")
    protected String customerAlias;
    @XmlElement(name = "InVoIPs")
    protected ArrayOfArrAddOnVoIP inVoIPs;
    @XmlElement(name = "InIPTVs")
    protected ArrayOfArrAddOnIPTV inIPTVs;
    protected String strDnMaster;
    @XmlElement(name = "PeriodHrs")
    protected String periodHrs;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dteLimit;
    protected int intReason;
    protected String strComments;
    protected String strIdUserEvergent;

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
     * Obtiene el valor de la propiedad inVoIPs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrAddOnVoIP }
     *     
     */
    public ArrayOfArrAddOnVoIP getInVoIPs() {
        return inVoIPs;
    }

    /**
     * Define el valor de la propiedad inVoIPs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrAddOnVoIP }
     *     
     */
    public void setInVoIPs(ArrayOfArrAddOnVoIP value) {
        this.inVoIPs = value;
    }

    /**
     * Obtiene el valor de la propiedad inIPTVs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrAddOnIPTV }
     *     
     */
    public ArrayOfArrAddOnIPTV getInIPTVs() {
        return inIPTVs;
    }

    /**
     * Define el valor de la propiedad inIPTVs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrAddOnIPTV }
     *     
     */
    public void setInIPTVs(ArrayOfArrAddOnIPTV value) {
        this.inIPTVs = value;
    }

    /**
     * Obtiene el valor de la propiedad strDnMaster.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDnMaster() {
        return strDnMaster;
    }

    /**
     * Define el valor de la propiedad strDnMaster.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDnMaster(String value) {
        this.strDnMaster = value;
    }

    /**
     * Obtiene el valor de la propiedad periodHrs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodHrs() {
        return periodHrs;
    }

    /**
     * Define el valor de la propiedad periodHrs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodHrs(String value) {
        this.periodHrs = value;
    }

    /**
     * Obtiene el valor de la propiedad dteLimit.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDteLimit() {
        return dteLimit;
    }

    /**
     * Define el valor de la propiedad dteLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDteLimit(XMLGregorianCalendar value) {
        this.dteLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad intReason.
     * 
     */
    public int getIntReason() {
        return intReason;
    }

    /**
     * Define el valor de la propiedad intReason.
     * 
     */
    public void setIntReason(int value) {
        this.intReason = value;
    }

    /**
     * Obtiene el valor de la propiedad strComments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrComments() {
        return strComments;
    }

    /**
     * Define el valor de la propiedad strComments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrComments(String value) {
        this.strComments = value;
    }

    /**
     * Obtiene el valor de la propiedad strIdUserEvergent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrIdUserEvergent() {
        return strIdUserEvergent;
    }

    /**
     * Define el valor de la propiedad strIdUserEvergent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrIdUserEvergent(String value) {
        this.strIdUserEvergent = value;
    }

}
