
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
 *         &lt;element name="getOpticalONTResult" type="{http://tempuri.org/}OntOptical" minOccurs="0"/&gt;
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
    "getOpticalONTResult"
})
@XmlRootElement(name = "getOpticalONTResponse")
public class GetOpticalONTResponse {

    protected OntOptical getOpticalONTResult;

    /**
     * Obtiene el valor de la propiedad getOpticalONTResult.
     * 
     * @return
     *     possible object is
     *     {@link OntOptical }
     *     
     */
    public OntOptical getGetOpticalONTResult() {
        return getOpticalONTResult;
    }

    /**
     * Define el valor de la propiedad getOpticalONTResult.
     * 
     * @param value
     *     allowed object is
     *     {@link OntOptical }
     *     
     */
    public void setGetOpticalONTResult(OntOptical value) {
        this.getOpticalONTResult = value;
    }

}
