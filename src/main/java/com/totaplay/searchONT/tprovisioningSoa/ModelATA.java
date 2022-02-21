
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ModelATA complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ModelATA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ATAID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ATA_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATA_SN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATAPOT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ATADN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ModelATA", propOrder = {
    "ataid",
    "ataaccount",
    "atasn",
    "atapot",
    "atadn",
    "atastatus",
    "atadominio"
})
public class ModelATA {

    @XmlElement(name = "ATAID")
    protected int ataid;
    @XmlElement(name = "ATA_ACCOUNT")
    protected String ataaccount;
    @XmlElement(name = "ATA_SN")
    protected String atasn;
    @XmlElement(name = "ATAPOT")
    protected int atapot;
    @XmlElement(name = "ATADN")
    protected String atadn;
    @XmlElement(name = "ATA_STATUS")
    protected String atastatus;
    @XmlElement(name = "ATA_DOMINIO")
    protected String atadominio;

    /**
     * Obtiene el valor de la propiedad ataid.
     * 
     */
    public int getATAID() {
        return ataid;
    }

    /**
     * Define el valor de la propiedad ataid.
     * 
     */
    public void setATAID(int value) {
        this.ataid = value;
    }

    /**
     * Obtiene el valor de la propiedad ataaccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATAACCOUNT() {
        return ataaccount;
    }

    /**
     * Define el valor de la propiedad ataaccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATAACCOUNT(String value) {
        this.ataaccount = value;
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
     */
    public int getATAPOT() {
        return atapot;
    }

    /**
     * Define el valor de la propiedad atapot.
     * 
     */
    public void setATAPOT(int value) {
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
