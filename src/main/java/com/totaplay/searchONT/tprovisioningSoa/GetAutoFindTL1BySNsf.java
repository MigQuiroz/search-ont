
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
 *         &lt;element name="strSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strPWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "strSerialNumber",
    "strUser",
    "strPWD"
})
@XmlRootElement(name = "GetAutoFindTL1bySNsf")
public class GetAutoFindTL1BySNsf {

    protected String strSerialNumber;
    protected String strUser;
    protected String strPWD;

    /**
     * Obtiene el valor de la propiedad strSerialNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSerialNumber() {
        return strSerialNumber;
    }

    /**
     * Define el valor de la propiedad strSerialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSerialNumber(String value) {
        this.strSerialNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad strUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrUser() {
        return strUser;
    }

    /**
     * Define el valor de la propiedad strUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrUser(String value) {
        this.strUser = value;
    }

    /**
     * Obtiene el valor de la propiedad strPWD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrPWD() {
        return strPWD;
    }

    /**
     * Define el valor de la propiedad strPWD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrPWD(String value) {
        this.strPWD = value;
    }

}
