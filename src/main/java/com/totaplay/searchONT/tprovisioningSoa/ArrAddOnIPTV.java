
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para arrAddOnIPTV complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="arrAddOnIPTV"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DUMMY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdPAckageIPTV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NewMiddleware" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AddOn" type="{http://tempuri.org/}ArrayOfArrAddOnIPTVSingle" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrAddOnIPTV", propOrder = {
    "dn",
    "dummy",
    "mac",
    "sn",
    "idPAckageIPTV",
    "type",
    "newMiddleware",
    "addOn"
})
public class ArrAddOnIPTV {

    @XmlElement(name = "DN")
    protected String dn;
    @XmlElement(name = "DUMMY")
    protected String dummy;
    @XmlElement(name = "MAC")
    protected String mac;
    @XmlElement(name = "SN")
    protected String sn;
    @XmlElement(name = "IdPAckageIPTV")
    protected String idPAckageIPTV;
    @XmlElement(name = "Type")
    protected int type;
    @XmlElement(name = "NewMiddleware")
    protected boolean newMiddleware;
    @XmlElement(name = "AddOn")
    protected ArrayOfArrAddOnIPTVSingle addOn;

    /**
     * Obtiene el valor de la propiedad dn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDN() {
        return dn;
    }

    /**
     * Define el valor de la propiedad dn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDN(String value) {
        this.dn = value;
    }

    /**
     * Obtiene el valor de la propiedad dummy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUMMY() {
        return dummy;
    }

    /**
     * Define el valor de la propiedad dummy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUMMY(String value) {
        this.dummy = value;
    }

    /**
     * Obtiene el valor de la propiedad mac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAC() {
        return mac;
    }

    /**
     * Define el valor de la propiedad mac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAC(String value) {
        this.mac = value;
    }

    /**
     * Obtiene el valor de la propiedad sn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSN() {
        return sn;
    }

    /**
     * Define el valor de la propiedad sn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSN(String value) {
        this.sn = value;
    }

    /**
     * Obtiene el valor de la propiedad idPAckageIPTV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPAckageIPTV() {
        return idPAckageIPTV;
    }

    /**
     * Define el valor de la propiedad idPAckageIPTV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPAckageIPTV(String value) {
        this.idPAckageIPTV = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad newMiddleware.
     * 
     */
    public boolean isNewMiddleware() {
        return newMiddleware;
    }

    /**
     * Define el valor de la propiedad newMiddleware.
     * 
     */
    public void setNewMiddleware(boolean value) {
        this.newMiddleware = value;
    }

    /**
     * Obtiene el valor de la propiedad addOn.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrAddOnIPTVSingle }
     *     
     */
    public ArrayOfArrAddOnIPTVSingle getAddOn() {
        return addOn;
    }

    /**
     * Define el valor de la propiedad addOn.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrAddOnIPTVSingle }
     *     
     */
    public void setAddOn(ArrayOfArrAddOnIPTVSingle value) {
        this.addOn = value;
    }

}
