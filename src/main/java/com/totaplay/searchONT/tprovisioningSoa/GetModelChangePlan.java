
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
 *         &lt;element name="LngUserId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="strpwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strSnHexONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "lngUserId",
    "strpwd",
    "strSnHexONT"
})
@XmlRootElement(name = "GetModelChangePlan")
public class GetModelChangePlan {

    @XmlElement(name = "LngUserId")
    protected long lngUserId;
    protected String strpwd;
    protected String strSnHexONT;

    /**
     * Obtiene el valor de la propiedad lngUserId.
     * 
     */
    public long getLngUserId() {
        return lngUserId;
    }

    /**
     * Define el valor de la propiedad lngUserId.
     * 
     */
    public void setLngUserId(long value) {
        this.lngUserId = value;
    }

    /**
     * Obtiene el valor de la propiedad strpwd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrpwd() {
        return strpwd;
    }

    /**
     * Define el valor de la propiedad strpwd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrpwd(String value) {
        this.strpwd = value;
    }

    /**
     * Obtiene el valor de la propiedad strSnHexONT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSnHexONT() {
        return strSnHexONT;
    }

    /**
     * Define el valor de la propiedad strSnHexONT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSnHexONT(String value) {
        this.strSnHexONT = value;
    }

}
