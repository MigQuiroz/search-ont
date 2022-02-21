
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
 *         &lt;element name="GetSearchONT_DashResult" type="{http://tempuri.org/}ArrayOfModelGetONT" minOccurs="0"/&gt;
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
    "getSearchONTDashResult"
})
@XmlRootElement(name = "GetSearchONT_DashResponse")
public class GetSearchONTDashResponse {

    @XmlElement(name = "GetSearchONT_DashResult")
    protected ArrayOfModelGetONT getSearchONTDashResult;

    /**
     * Obtiene el valor de la propiedad getSearchONTDashResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModelGetONT }
     *     
     */
    public ArrayOfModelGetONT getGetSearchONTDashResult() {
        return getSearchONTDashResult;
    }

    /**
     * Define el valor de la propiedad getSearchONTDashResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModelGetONT }
     *     
     */
    public void setGetSearchONTDashResult(ArrayOfModelGetONT value) {
        this.getSearchONTDashResult = value;
    }

}
