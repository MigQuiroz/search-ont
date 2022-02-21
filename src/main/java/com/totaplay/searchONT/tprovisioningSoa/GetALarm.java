
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetALarm complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetALarm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="strSn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrAlarms" type="{http://tempuri.org/}ArrayOfGetALarmDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetALarm", propOrder = {
    "strSn",
    "arrAlarms"
})
public class GetALarm {

    protected String strSn;
    @XmlElement(name = "ArrAlarms")
    protected ArrayOfGetALarmDetail arrAlarms;

    /**
     * Obtiene el valor de la propiedad strSn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSn() {
        return strSn;
    }

    /**
     * Define el valor de la propiedad strSn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSn(String value) {
        this.strSn = value;
    }

    /**
     * Obtiene el valor de la propiedad arrAlarms.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGetALarmDetail }
     *     
     */
    public ArrayOfGetALarmDetail getArrAlarms() {
        return arrAlarms;
    }

    /**
     * Define el valor de la propiedad arrAlarms.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGetALarmDetail }
     *     
     */
    public void setArrAlarms(ArrayOfGetALarmDetail value) {
        this.arrAlarms = value;
    }

}
