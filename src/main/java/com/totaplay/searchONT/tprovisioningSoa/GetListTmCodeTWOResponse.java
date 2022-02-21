
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
 *         &lt;element name="GetListTmCodeTWOResult" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/&gt;
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
    "getListTmCodeTWOResult"
})
@XmlRootElement(name = "GetListTmCodeTWOResponse")
public class GetListTmCodeTWOResponse {

    @XmlElement(name = "GetListTmCodeTWOResult")
    protected ArrayOfString getListTmCodeTWOResult;

    /**
     * Obtiene el valor de la propiedad getListTmCodeTWOResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetListTmCodeTWOResult() {
        return getListTmCodeTWOResult;
    }

    /**
     * Define el valor de la propiedad getListTmCodeTWOResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetListTmCodeTWOResult(ArrayOfString value) {
        this.getListTmCodeTWOResult = value;
    }

}
