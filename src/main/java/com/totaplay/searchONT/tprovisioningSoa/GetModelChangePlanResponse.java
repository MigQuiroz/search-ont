
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
 *         &lt;element name="GetModelChangePlanResult" type="{http://tempuri.org/}arrResultCancelONT" minOccurs="0"/&gt;
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
    "getModelChangePlanResult"
})
@XmlRootElement(name = "GetModelChangePlanResponse")
public class GetModelChangePlanResponse {

    @XmlElement(name = "GetModelChangePlanResult")
    protected ArrResultCancelONT getModelChangePlanResult;

    /**
     * Obtiene el valor de la propiedad getModelChangePlanResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrResultCancelONT }
     *     
     */
    public ArrResultCancelONT getGetModelChangePlanResult() {
        return getModelChangePlanResult;
    }

    /**
     * Define el valor de la propiedad getModelChangePlanResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrResultCancelONT }
     *     
     */
    public void setGetModelChangePlanResult(ArrResultCancelONT value) {
        this.getModelChangePlanResult = value;
    }

}
