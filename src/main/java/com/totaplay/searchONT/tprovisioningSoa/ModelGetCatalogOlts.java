
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ModelGetCatalogOlts complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ModelGetCatalogOlts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lngIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelGetCatalogOlts", propOrder = {
    "lngIP",
    "strDescription",
    "intID"
})
public class ModelGetCatalogOlts {

    protected String lngIP;
    protected String strDescription;
    protected int intID;

    /**
     * Obtiene el valor de la propiedad lngIP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLngIP() {
        return lngIP;
    }

    /**
     * Define el valor de la propiedad lngIP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLngIP(String value) {
        this.lngIP = value;
    }

    /**
     * Obtiene el valor de la propiedad strDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDescription() {
        return strDescription;
    }

    /**
     * Define el valor de la propiedad strDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDescription(String value) {
        this.strDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad intID.
     * 
     */
    public int getIntID() {
        return intID;
    }

    /**
     * Define el valor de la propiedad intID.
     * 
     */
    public void setIntID(int value) {
        this.intID = value;
    }

}
