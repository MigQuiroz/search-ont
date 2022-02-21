
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VendorDestination complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VendorDestination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VendorONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VendorOLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OLT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IP_OLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorDestination", propOrder = {
    "vendorONT",
    "vendorOLT",
    "oltname",
    "ipolt",
    "company"
})
public class VendorDestination {

    @XmlElement(name = "VendorONT")
    protected String vendorONT;
    @XmlElement(name = "VendorOLT")
    protected String vendorOLT;
    @XmlElement(name = "OLT_NAME")
    protected String oltname;
    @XmlElement(name = "IP_OLT")
    protected String ipolt;
    @XmlElement(name = "Company")
    protected String company;

    /**
     * Obtiene el valor de la propiedad vendorONT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorONT() {
        return vendorONT;
    }

    /**
     * Define el valor de la propiedad vendorONT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorONT(String value) {
        this.vendorONT = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorOLT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorOLT() {
        return vendorOLT;
    }

    /**
     * Define el valor de la propiedad vendorOLT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorOLT(String value) {
        this.vendorOLT = value;
    }

    /**
     * Obtiene el valor de la propiedad oltname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLTNAME() {
        return oltname;
    }

    /**
     * Define el valor de la propiedad oltname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLTNAME(String value) {
        this.oltname = value;
    }

    /**
     * Obtiene el valor de la propiedad ipolt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPOLT() {
        return ipolt;
    }

    /**
     * Define el valor de la propiedad ipolt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPOLT(String value) {
        this.ipolt = value;
    }

    /**
     * Obtiene el valor de la propiedad company.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Define el valor de la propiedad company.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

}
