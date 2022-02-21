
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
 *         &lt;element name="idCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arrActivation" type="{http://tempuri.org/}ModelGetONT" minOccurs="0"/&gt;
 *         &lt;element name="arrVoIP" type="{http://tempuri.org/}ArrayOfArrAddOnVoIP" minOccurs="0"/&gt;
 *         &lt;element name="arrIPTV" type="{http://tempuri.org/}ArrayOfArrAddOnIPTV" minOccurs="0"/&gt;
 *         &lt;element name="strDnMaster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "idCustomer",
    "arrActivation",
    "arrVoIP",
    "arrIPTV",
    "strDnMaster"
})
@XmlRootElement(name = "DeleteActivation")
public class DeleteActivation {

    @XmlElement(name = "Login")
    protected ArrLogin login;
    protected String idCustomer;
    protected ModelGetONT arrActivation;
    protected ArrayOfArrAddOnVoIP arrVoIP;
    protected ArrayOfArrAddOnIPTV arrIPTV;
    protected String strDnMaster;

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
     * Obtiene el valor de la propiedad arrActivation.
     * 
     * @return
     *     possible object is
     *     {@link ModelGetONT }
     *     
     */
    public ModelGetONT getArrActivation() {
        return arrActivation;
    }

    /**
     * Define el valor de la propiedad arrActivation.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelGetONT }
     *     
     */
    public void setArrActivation(ModelGetONT value) {
        this.arrActivation = value;
    }

    /**
     * Obtiene el valor de la propiedad arrVoIP.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrAddOnVoIP }
     *     
     */
    public ArrayOfArrAddOnVoIP getArrVoIP() {
        return arrVoIP;
    }

    /**
     * Define el valor de la propiedad arrVoIP.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrAddOnVoIP }
     *     
     */
    public void setArrVoIP(ArrayOfArrAddOnVoIP value) {
        this.arrVoIP = value;
    }

    /**
     * Obtiene el valor de la propiedad arrIPTV.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrAddOnIPTV }
     *     
     */
    public ArrayOfArrAddOnIPTV getArrIPTV() {
        return arrIPTV;
    }

    /**
     * Define el valor de la propiedad arrIPTV.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrAddOnIPTV }
     *     
     */
    public void setArrIPTV(ArrayOfArrAddOnIPTV value) {
        this.arrIPTV = value;
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

}
