
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
 *         &lt;element name="GetIPWAN_TR069Result" type="{http://tempuri.org/}arrRes_IPWAN" minOccurs="0"/&gt;
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
    "getIPWANTR069Result"
})
@XmlRootElement(name = "GetIPWAN_TR069Response")
public class GetIPWANTR069Response {

    @XmlElement(name = "GetIPWAN_TR069Result")
    protected ArrResIPWAN getIPWANTR069Result;

    /**
     * Obtiene el valor de la propiedad getIPWANTR069Result.
     * 
     * @return
     *     possible object is
     *     {@link ArrResIPWAN }
     *     
     */
    public ArrResIPWAN getGetIPWANTR069Result() {
        return getIPWANTR069Result;
    }

    /**
     * Define el valor de la propiedad getIPWANTR069Result.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrResIPWAN }
     *     
     */
    public void setGetIPWANTR069Result(ArrResIPWAN value) {
        this.getIPWANTR069Result = value;
    }

}
