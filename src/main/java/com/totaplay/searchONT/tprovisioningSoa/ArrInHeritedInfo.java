
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para arrInHeritedInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="arrInHeritedInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArrInvInfo" type="{http://tempuri.org/}arrInvInfo" minOccurs="0"/&gt;
 *         &lt;element name="ArrCCInfo" type="{http://tempuri.org/}arrCCInfo" minOccurs="0"/&gt;
 *         &lt;element name="ArrDDInfo" type="{http://tempuri.org/}arrDDInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrInHeritedInfo", propOrder = {
    "arrInvInfo",
    "arrCCInfo",
    "arrDDInfo"
})
public class ArrInHeritedInfo {

    @XmlElement(name = "ArrInvInfo")
    protected ArrInvInfo arrInvInfo;
    @XmlElement(name = "ArrCCInfo")
    protected ArrCCInfo arrCCInfo;
    @XmlElement(name = "ArrDDInfo")
    protected ArrDDInfo arrDDInfo;

    /**
     * Obtiene el valor de la propiedad arrInvInfo.
     * 
     * @return
     *     possible object is
     *     {@link ArrInvInfo }
     *     
     */
    public ArrInvInfo getArrInvInfo() {
        return arrInvInfo;
    }

    /**
     * Define el valor de la propiedad arrInvInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrInvInfo }
     *     
     */
    public void setArrInvInfo(ArrInvInfo value) {
        this.arrInvInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad arrCCInfo.
     * 
     * @return
     *     possible object is
     *     {@link ArrCCInfo }
     *     
     */
    public ArrCCInfo getArrCCInfo() {
        return arrCCInfo;
    }

    /**
     * Define el valor de la propiedad arrCCInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrCCInfo }
     *     
     */
    public void setArrCCInfo(ArrCCInfo value) {
        this.arrCCInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad arrDDInfo.
     * 
     * @return
     *     possible object is
     *     {@link ArrDDInfo }
     *     
     */
    public ArrDDInfo getArrDDInfo() {
        return arrDDInfo;
    }

    /**
     * Define el valor de la propiedad arrDDInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrDDInfo }
     *     
     */
    public void setArrDDInfo(ArrDDInfo value) {
        this.arrDDInfo = value;
    }

}
