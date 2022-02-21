
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para arrResultCancelONT complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="arrResultCancelONT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArrResult" type="{http://tempuri.org/}arrResult" minOccurs="0"/&gt;
 *         &lt;element name="ArrActivation" type="{http://tempuri.org/}arrActivationCancel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrResultCancelONT", propOrder = {
    "arrResult",
    "arrActivation"
})
public class ArrResultCancelONT {

    @XmlElement(name = "ArrResult")
    protected ArrResult arrResult;
    @XmlElement(name = "ArrActivation")
    protected ArrActivationCancel arrActivation;

    /**
     * Obtiene el valor de la propiedad arrResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrResult }
     *     
     */
    public ArrResult getArrResult() {
        return arrResult;
    }

    /**
     * Define el valor de la propiedad arrResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrResult }
     *     
     */
    public void setArrResult(ArrResult value) {
        this.arrResult = value;
    }

    /**
     * Obtiene el valor de la propiedad arrActivation.
     * 
     * @return
     *     possible object is
     *     {@link ArrActivationCancel }
     *     
     */
    public ArrActivationCancel getArrActivation() {
        return arrActivation;
    }

    /**
     * Define el valor de la propiedad arrActivation.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrActivationCancel }
     *     
     */
    public void setArrActivation(ArrActivationCancel value) {
        this.arrActivation = value;
    }

}
