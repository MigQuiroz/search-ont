
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
 *         &lt;element name="validAddDrmCustomerProfileFusionResult" type="{http://tempuri.org/}ModelValidReturn" minOccurs="0"/&gt;
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
    "validAddDrmCustomerProfileFusionResult"
})
@XmlRootElement(name = "validAddDrmCustomerProfileFusionResponse")
public class ValidAddDrmCustomerProfileFusionResponse {

    protected ModelValidReturn validAddDrmCustomerProfileFusionResult;

    /**
     * Obtiene el valor de la propiedad validAddDrmCustomerProfileFusionResult.
     * 
     * @return
     *     possible object is
     *     {@link ModelValidReturn }
     *     
     */
    public ModelValidReturn getValidAddDrmCustomerProfileFusionResult() {
        return validAddDrmCustomerProfileFusionResult;
    }

    /**
     * Define el valor de la propiedad validAddDrmCustomerProfileFusionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelValidReturn }
     *     
     */
    public void setValidAddDrmCustomerProfileFusionResult(ModelValidReturn value) {
        this.validAddDrmCustomerProfileFusionResult = value;
    }

}
