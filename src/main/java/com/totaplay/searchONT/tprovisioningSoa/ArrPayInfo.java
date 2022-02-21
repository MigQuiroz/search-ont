
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para arrPayInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="arrPayInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="payInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invTipe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrInHeritedInfo" type="{http://tempuri.org/}arrInHeritedInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrPayInfo", propOrder = {
    "payInfo",
    "invTipe",
    "paymentTerm",
    "paymentOffset",
    "flags",
    "arrInHeritedInfo"
})
public class ArrPayInfo {

    protected String payInfo;
    protected String invTipe;
    protected String paymentTerm;
    protected String paymentOffset;
    protected String flags;
    @XmlElement(name = "ArrInHeritedInfo")
    protected ArrInHeritedInfo arrInHeritedInfo;

    /**
     * Obtiene el valor de la propiedad payInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayInfo() {
        return payInfo;
    }

    /**
     * Define el valor de la propiedad payInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayInfo(String value) {
        this.payInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad invTipe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvTipe() {
        return invTipe;
    }

    /**
     * Define el valor de la propiedad invTipe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvTipe(String value) {
        this.invTipe = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentTerm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * Define el valor de la propiedad paymentTerm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTerm(String value) {
        this.paymentTerm = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentOffset.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOffset() {
        return paymentOffset;
    }

    /**
     * Define el valor de la propiedad paymentOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOffset(String value) {
        this.paymentOffset = value;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlags(String value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad arrInHeritedInfo.
     * 
     * @return
     *     possible object is
     *     {@link ArrInHeritedInfo }
     *     
     */
    public ArrInHeritedInfo getArrInHeritedInfo() {
        return arrInHeritedInfo;
    }

    /**
     * Define el valor de la propiedad arrInHeritedInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrInHeritedInfo }
     *     
     */
    public void setArrInHeritedInfo(ArrInHeritedInfo value) {
        this.arrInHeritedInfo = value;
    }

}
