
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
 *         &lt;element name="GetDataATAResult" type="{http://tempuri.org/}ArrayOfModelATA" minOccurs="0"/&gt;
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
    "getDataATAResult"
})
@XmlRootElement(name = "GetDataATAResponse")
public class GetDataATAResponse {

    @XmlElement(name = "GetDataATAResult")
    protected ArrayOfModelATA getDataATAResult;

    /**
     * Obtiene el valor de la propiedad getDataATAResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModelATA }
     *     
     */
    public ArrayOfModelATA getGetDataATAResult() {
        return getDataATAResult;
    }

    /**
     * Define el valor de la propiedad getDataATAResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModelATA }
     *     
     */
    public void setGetDataATAResult(ArrayOfModelATA value) {
        this.getDataATAResult = value;
    }

}
