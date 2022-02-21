
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
 *         &lt;element name="GetAutoFindResult" type="{http://tempuri.org/}arrAutoFind" minOccurs="0"/&gt;
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
    "getAutoFindResult"
})
@XmlRootElement(name = "GetAutoFindResponse")
public class GetAutoFindResponse {

    @XmlElement(name = "GetAutoFindResult")
    protected ArrAutoFind getAutoFindResult;

    /**
     * Obtiene el valor de la propiedad getAutoFindResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrAutoFind }
     *     
     */
    public ArrAutoFind getGetAutoFindResult() {
        return getAutoFindResult;
    }

    /**
     * Define el valor de la propiedad getAutoFindResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrAutoFind }
     *     
     */
    public void setGetAutoFindResult(ArrAutoFind value) {
        this.getAutoFindResult = value;
    }

}
