
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para arrAddOnHSFI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="arrAddOnHSFI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Down" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Up" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrAddOnHSFI", propOrder = {
    "down",
    "up"
})
public class ArrAddOnHSFI {

    @XmlElement(name = "Down")
    protected String down;
    @XmlElement(name = "Up")
    protected String up;

    /**
     * Obtiene el valor de la propiedad down.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDown() {
        return down;
    }

    /**
     * Define el valor de la propiedad down.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDown(String value) {
        this.down = value;
    }

    /**
     * Obtiene el valor de la propiedad up.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUp() {
        return up;
    }

    /**
     * Define el valor de la propiedad up.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUp(String value) {
        this.up = value;
    }

}
