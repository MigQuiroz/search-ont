
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
 *         &lt;element name="GetONTStatusRoutingHSIResult" type="{http://tempuri.org/}arrsStatusRoutingHSI" minOccurs="0"/&gt;
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
    "getONTStatusRoutingHSIResult"
})
@XmlRootElement(name = "GetONTStatusRoutingHSIResponse")
public class GetONTStatusRoutingHSIResponse {

    @XmlElement(name = "GetONTStatusRoutingHSIResult")
    protected ArrsStatusRoutingHSI getONTStatusRoutingHSIResult;

    /**
     * Obtiene el valor de la propiedad getONTStatusRoutingHSIResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrsStatusRoutingHSI }
     *     
     */
    public ArrsStatusRoutingHSI getGetONTStatusRoutingHSIResult() {
        return getONTStatusRoutingHSIResult;
    }

    /**
     * Define el valor de la propiedad getONTStatusRoutingHSIResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrsStatusRoutingHSI }
     *     
     */
    public void setGetONTStatusRoutingHSIResult(ArrsStatusRoutingHSI value) {
        this.getONTStatusRoutingHSIResult = value;
    }

}
