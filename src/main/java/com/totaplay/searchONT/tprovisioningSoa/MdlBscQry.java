
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MdlBscQry complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MdlBscQry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="blnExis" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="strIDcustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MdlBscQry", propOrder = {
    "blnExis",
    "strIDcustomer"
})
public class MdlBscQry {

    protected boolean blnExis;
    protected String strIDcustomer;

    /**
     * Obtiene el valor de la propiedad blnExis.
     * 
     */
    public boolean isBlnExis() {
        return blnExis;
    }

    /**
     * Define el valor de la propiedad blnExis.
     * 
     */
    public void setBlnExis(boolean value) {
        this.blnExis = value;
    }

    /**
     * Obtiene el valor de la propiedad strIDcustomer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrIDcustomer() {
        return strIDcustomer;
    }

    /**
     * Define el valor de la propiedad strIDcustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrIDcustomer(String value) {
        this.strIDcustomer = value;
    }

}
