
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
 *         &lt;element name="ATA_cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATA_SN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATA_POT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATA_DN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATA_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATA_DOMINIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "ataCuenta",
    "atasn",
    "atapot",
    "atadn",
    "atastatus",
    "atadominio"
})
@XmlRootElement(name = "insert_ATA")
public class InsertATA {

    @XmlElement(name = "ATA_cuenta")
    protected String ataCuenta;
    @XmlElement(name = "ATA_SN")
    protected String atasn;
    @XmlElement(name = "ATA_POT")
    protected String atapot;
    @XmlElement(name = "ATA_DN")
    protected String atadn;
    @XmlElement(name = "ATA_STATUS")
    protected String atastatus;
    @XmlElement(name = "ATA_DOMINIO")
    protected String atadominio;

    /**
     * Obtiene el valor de la propiedad ataCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATACuenta() {
        return ataCuenta;
    }

    /**
     * Define el valor de la propiedad ataCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATACuenta(String value) {
        this.ataCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad atasn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATASN() {
        return atasn;
    }

    /**
     * Define el valor de la propiedad atasn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATASN(String value) {
        this.atasn = value;
    }

    /**
     * Obtiene el valor de la propiedad atapot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATAPOT() {
        return atapot;
    }

    /**
     * Define el valor de la propiedad atapot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATAPOT(String value) {
        this.atapot = value;
    }

    /**
     * Obtiene el valor de la propiedad atadn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATADN() {
        return atadn;
    }

    /**
     * Define el valor de la propiedad atadn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATADN(String value) {
        this.atadn = value;
    }

    /**
     * Obtiene el valor de la propiedad atastatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATASTATUS() {
        return atastatus;
    }

    /**
     * Define el valor de la propiedad atastatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATASTATUS(String value) {
        this.atastatus = value;
    }

    /**
     * Obtiene el valor de la propiedad atadominio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATADOMINIO() {
        return atadominio;
    }

    /**
     * Define el valor de la propiedad atadominio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATADOMINIO(String value) {
        this.atadominio = value;
    }

}
