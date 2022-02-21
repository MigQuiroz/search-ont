
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
 *         &lt;element name="OTNRoutingHSIResult" type="{http://tempuri.org/}arrResult" minOccurs="0"/&gt;
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
    "otnRoutingHSIResult"
})
@XmlRootElement(name = "OTNRoutingHSIResponse")
public class OTNRoutingHSIResponse {

    @XmlElement(name = "OTNRoutingHSIResult")
    protected ArrResult otnRoutingHSIResult;

    /**
     * Obtiene el valor de la propiedad otnRoutingHSIResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrResult }
     *     
     */
    public ArrResult getOTNRoutingHSIResult() {
        return otnRoutingHSIResult;
    }

    /**
     * Define el valor de la propiedad otnRoutingHSIResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrResult }
     *     
     */
    public void setOTNRoutingHSIResult(ArrResult value) {
        this.otnRoutingHSIResult = value;
    }

}
