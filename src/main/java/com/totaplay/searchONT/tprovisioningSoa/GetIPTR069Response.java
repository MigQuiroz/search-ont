
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
 *         &lt;element name="GetIP_TR069Result" type="{http://tempuri.org/}ArrayOfArrWANIP" minOccurs="0"/&gt;
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
    "getIPTR069Result"
})
@XmlRootElement(name = "GetIP_TR069Response")
public class GetIPTR069Response {

    @XmlElement(name = "GetIP_TR069Result")
    protected ArrayOfArrWANIP getIPTR069Result;

    /**
     * Obtiene el valor de la propiedad getIPTR069Result.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrWANIP }
     *     
     */
    public ArrayOfArrWANIP getGetIPTR069Result() {
        return getIPTR069Result;
    }

    /**
     * Define el valor de la propiedad getIPTR069Result.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrWANIP }
     *     
     */
    public void setGetIPTR069Result(ArrayOfArrWANIP value) {
        this.getIPTR069Result = value;
    }

}
