
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
 *         &lt;element name="GetSearchONTResult" type="{http://tempuri.org/}ArrayOfModelGetONT" minOccurs="0"/&gt;
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
    "getSearchONTResult"
})
@XmlRootElement(name = "GetSearchONTResponse")
public class GetSearchONTResponse {

    @XmlElement(name = "GetSearchONTResult")
    protected ArrayOfModelGetONT getSearchONTResult;

    /**
     * Obtiene el valor de la propiedad getSearchONTResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModelGetONT }
     *     
     */
    public ArrayOfModelGetONT getGetSearchONTResult() {
        return getSearchONTResult;
    }

    /**
     * Define el valor de la propiedad getSearchONTResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModelGetONT }
     *     
     */
    public void setGetSearchONTResult(ArrayOfModelGetONT value) {
        this.getSearchONTResult = value;
    }

}
