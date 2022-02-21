
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrAddons complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrAddons"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddOnIPTV" type="{http://tempuri.org/}ArrayOfArrAddOnIPTV" minOccurs="0"/&gt;
 *         &lt;element name="AddOnHSFI" type="{http://tempuri.org/}arrAddOnHSFI" minOccurs="0"/&gt;
 *         &lt;element name="AddOnVoIP" type="{http://tempuri.org/}ArrayOfArrAddOnVoIP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrAddons", propOrder = {
    "addOnIPTV",
    "addOnHSFI",
    "addOnVoIP"
})
public class ArrAddons {

    @XmlElement(name = "AddOnIPTV")
    protected ArrayOfArrAddOnIPTV addOnIPTV;
    @XmlElement(name = "AddOnHSFI")
    protected ArrAddOnHSFI addOnHSFI;
    @XmlElement(name = "AddOnVoIP")
    protected ArrayOfArrAddOnVoIP addOnVoIP;

    /**
     * Obtiene el valor de la propiedad addOnIPTV.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrAddOnIPTV }
     *     
     */
    public ArrayOfArrAddOnIPTV getAddOnIPTV() {
        return addOnIPTV;
    }

    /**
     * Define el valor de la propiedad addOnIPTV.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrAddOnIPTV }
     *     
     */
    public void setAddOnIPTV(ArrayOfArrAddOnIPTV value) {
        this.addOnIPTV = value;
    }

    /**
     * Obtiene el valor de la propiedad addOnHSFI.
     * 
     * @return
     *     possible object is
     *     {@link ArrAddOnHSFI }
     *     
     */
    public ArrAddOnHSFI getAddOnHSFI() {
        return addOnHSFI;
    }

    /**
     * Define el valor de la propiedad addOnHSFI.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrAddOnHSFI }
     *     
     */
    public void setAddOnHSFI(ArrAddOnHSFI value) {
        this.addOnHSFI = value;
    }

    /**
     * Obtiene el valor de la propiedad addOnVoIP.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrAddOnVoIP }
     *     
     */
    public ArrayOfArrAddOnVoIP getAddOnVoIP() {
        return addOnVoIP;
    }

    /**
     * Define el valor de la propiedad addOnVoIP.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrAddOnVoIP }
     *     
     */
    public void setAddOnVoIP(ArrayOfArrAddOnVoIP value) {
        this.addOnVoIP = value;
    }

}
