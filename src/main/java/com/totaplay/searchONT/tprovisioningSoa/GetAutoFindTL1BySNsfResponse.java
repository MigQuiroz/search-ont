
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
 *         &lt;element name="GetAutoFindTL1bySNsfResult" type="{http://tempuri.org/}AutofindONT" minOccurs="0"/&gt;
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
    "getAutoFindTL1BySNsfResult"
})
@XmlRootElement(name = "GetAutoFindTL1bySNsfResponse")
public class GetAutoFindTL1BySNsfResponse {

    @XmlElement(name = "GetAutoFindTL1bySNsfResult")
    protected AutofindONT getAutoFindTL1BySNsfResult;

    /**
     * Obtiene el valor de la propiedad getAutoFindTL1BySNsfResult.
     * 
     * @return
     *     possible object is
     *     {@link AutofindONT }
     *     
     */
    public AutofindONT getGetAutoFindTL1BySNsfResult() {
        return getAutoFindTL1BySNsfResult;
    }

    /**
     * Define el valor de la propiedad getAutoFindTL1BySNsfResult.
     * 
     * @param value
     *     allowed object is
     *     {@link AutofindONT }
     *     
     */
    public void setGetAutoFindTL1BySNsfResult(AutofindONT value) {
        this.getAutoFindTL1BySNsfResult = value;
    }

}
