
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para arrAddOnIPTVSingle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="arrAddOnIPTVSingle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddonID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddonDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrAddOnIPTVSingle", propOrder = {
    "addonID",
    "addonDescription"
})
public class ArrAddOnIPTVSingle {

    @XmlElement(name = "AddonID")
    protected String addonID;
    @XmlElement(name = "AddonDescription")
    protected String addonDescription;

    /**
     * Obtiene el valor de la propiedad addonID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddonID() {
        return addonID;
    }

    /**
     * Define el valor de la propiedad addonID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddonID(String value) {
        this.addonID = value;
    }

    /**
     * Obtiene el valor de la propiedad addonDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddonDescription() {
        return addonDescription;
    }

    /**
     * Define el valor de la propiedad addonDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddonDescription(String value) {
        this.addonDescription = value;
    }

}
