
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
 *         &lt;element name="Get_VendorResult" type="{http://tempuri.org/}NewVendor" minOccurs="0"/&gt;
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
    "getVendorResult"
})
@XmlRootElement(name = "Get_VendorResponse")
public class GetVendorResponse {

    @XmlElement(name = "Get_VendorResult")
    protected NewVendor getVendorResult;

    /**
     * Obtiene el valor de la propiedad getVendorResult.
     * 
     * @return
     *     possible object is
     *     {@link NewVendor }
     *     
     */
    public NewVendor getGetVendorResult() {
        return getVendorResult;
    }

    /**
     * Define el valor de la propiedad getVendorResult.
     * 
     * @param value
     *     allowed object is
     *     {@link NewVendor }
     *     
     */
    public void setGetVendorResult(NewVendor value) {
        this.getVendorResult = value;
    }

}
