
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
 *         &lt;element name="validAddDrmCustomerProfileFusionEnlaceResult" type="{http://tempuri.org/}ModelValidReturn" minOccurs="0"/&gt;
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
    "validAddDrmCustomerProfileFusionEnlaceResult"
})
@XmlRootElement(name = "validAddDrmCustomerProfileFusionEnlaceResponse")
public class ValidAddDrmCustomerProfileFusionEnlaceResponse {

    protected ModelValidReturn validAddDrmCustomerProfileFusionEnlaceResult;

    /**
     * Obtiene el valor de la propiedad validAddDrmCustomerProfileFusionEnlaceResult.
     * 
     * @return
     *     possible object is
     *     {@link ModelValidReturn }
     *     
     */
    public ModelValidReturn getValidAddDrmCustomerProfileFusionEnlaceResult() {
        return validAddDrmCustomerProfileFusionEnlaceResult;
    }

    /**
     * Define el valor de la propiedad validAddDrmCustomerProfileFusionEnlaceResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelValidReturn }
     *     
     */
    public void setValidAddDrmCustomerProfileFusionEnlaceResult(ModelValidReturn value) {
        this.validAddDrmCustomerProfileFusionEnlaceResult = value;
    }

}
