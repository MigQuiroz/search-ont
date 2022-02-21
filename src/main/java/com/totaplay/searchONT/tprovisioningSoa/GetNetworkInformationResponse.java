
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getNetworkInformationResult" type="{http://tempuri.org/}arrNetwork" minOccurs="0"/&gt;
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
    "getNetworkInformationResult"
})
@XmlRootElement(name = "getNetworkInformationResponse")
public class GetNetworkInformationResponse {

    protected ArrNetwork getNetworkInformationResult;

    /**
     * Obtiene el valor de la propiedad getNetworkInformationResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrNetwork }
     *     
     */
    public ArrNetwork getGetNetworkInformationResult() {
        return getNetworkInformationResult;
    }

    /**
     * Define el valor de la propiedad getNetworkInformationResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrNetwork }
     *     
     */
    public void setGetNetworkInformationResult(ArrNetwork value) {
        this.getNetworkInformationResult = value;
    }

}
