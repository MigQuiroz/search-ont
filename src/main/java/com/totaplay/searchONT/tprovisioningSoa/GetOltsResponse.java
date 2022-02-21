
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
 *         &lt;element name="GetOltsResult" type="{http://tempuri.org/}ArrayOfModelGetCatalogOlts" minOccurs="0"/&gt;
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
    "getOltsResult"
})
@XmlRootElement(name = "GetOltsResponse")
public class GetOltsResponse {

    @XmlElement(name = "GetOltsResult")
    protected ArrayOfModelGetCatalogOlts getOltsResult;

    /**
     * Obtiene el valor de la propiedad getOltsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModelGetCatalogOlts }
     *     
     */
    public ArrayOfModelGetCatalogOlts getGetOltsResult() {
        return getOltsResult;
    }

    /**
     * Define el valor de la propiedad getOltsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModelGetCatalogOlts }
     *     
     */
    public void setGetOltsResult(ArrayOfModelGetCatalogOlts value) {
        this.getOltsResult = value;
    }

}
