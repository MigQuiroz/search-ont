
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
 *         &lt;element name="strSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intCompany" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "strSN",
    "intCompany"
})
@XmlRootElement(name = "GetONTStatusRoutingHSI")
public class GetONTStatusRoutingHSI {

    protected String strSN;
    protected int intCompany;

    /**
     * Obtiene el valor de la propiedad strSN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSN() {
        return strSN;
    }

    /**
     * Define el valor de la propiedad strSN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSN(String value) {
        this.strSN = value;
    }

    /**
     * Obtiene el valor de la propiedad intCompany.
     * 
     */
    public int getIntCompany() {
        return intCompany;
    }

    /**
     * Define el valor de la propiedad intCompany.
     * 
     */
    public void setIntCompany(int value) {
        this.intCompany = value;
    }

}
