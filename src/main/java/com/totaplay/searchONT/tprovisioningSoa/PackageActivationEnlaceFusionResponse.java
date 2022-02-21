
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
 *         &lt;element name="PackageActivationEnlaceFusionResult" type="{http://tempuri.org/}arrResult" minOccurs="0"/&gt;
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
    "packageActivationEnlaceFusionResult"
})
@XmlRootElement(name = "PackageActivationEnlaceFusionResponse")
public class PackageActivationEnlaceFusionResponse {

    @XmlElement(name = "PackageActivationEnlaceFusionResult")
    protected ArrResult packageActivationEnlaceFusionResult;

    /**
     * Obtiene el valor de la propiedad packageActivationEnlaceFusionResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrResult }
     *     
     */
    public ArrResult getPackageActivationEnlaceFusionResult() {
        return packageActivationEnlaceFusionResult;
    }

    /**
     * Define el valor de la propiedad packageActivationEnlaceFusionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrResult }
     *     
     */
    public void setPackageActivationEnlaceFusionResult(ArrResult value) {
        this.packageActivationEnlaceFusionResult = value;
    }

}
