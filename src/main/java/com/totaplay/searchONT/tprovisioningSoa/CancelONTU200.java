
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
 *         &lt;element name="filter" type="{http://tempuri.org/}FilterOLTS" minOccurs="0"/&gt;
 *         &lt;element name="strModeInvoke" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LngUserId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="strIpInvoke" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blnGuiNew" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "filter",
    "strModeInvoke",
    "lngUserId",
    "strIpInvoke",
    "blnGuiNew"
})
@XmlRootElement(name = "CancelONTU200")
public class CancelONTU200 {

    protected FilterOLTS filter;
    protected String strModeInvoke;
    @XmlElement(name = "LngUserId")
    protected long lngUserId;
    protected String strIpInvoke;
    protected boolean blnGuiNew;

    /**
     * Obtiene el valor de la propiedad filter.
     * 
     * @return
     *     possible object is
     *     {@link FilterOLTS }
     *     
     */
    public FilterOLTS getFilter() {
        return filter;
    }

    /**
     * Define el valor de la propiedad filter.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterOLTS }
     *     
     */
    public void setFilter(FilterOLTS value) {
        this.filter = value;
    }

    /**
     * Obtiene el valor de la propiedad strModeInvoke.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrModeInvoke() {
        return strModeInvoke;
    }

    /**
     * Define el valor de la propiedad strModeInvoke.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrModeInvoke(String value) {
        this.strModeInvoke = value;
    }

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
     * Obtiene el valor de la propiedad strIpInvoke.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrIpInvoke() {
        return strIpInvoke;
    }

    /**
     * Define el valor de la propiedad strIpInvoke.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrIpInvoke(String value) {
        this.strIpInvoke = value;
    }

    /**
     * Obtiene el valor de la propiedad blnGuiNew.
     * 
     */
    public boolean isBlnGuiNew() {
        return blnGuiNew;
    }

    /**
     * Define el valor de la propiedad blnGuiNew.
     * 
     */
    public void setBlnGuiNew(boolean value) {
        this.blnGuiNew = value;
    }

}
