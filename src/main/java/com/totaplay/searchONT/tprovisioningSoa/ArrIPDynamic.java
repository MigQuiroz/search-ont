
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para arrIPDynamic complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="arrIPDynamic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bnsIPDynamicPublic" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrIPDynamic", propOrder = {
    "bnsIPDynamicPublic",
    "mode"
})
public class ArrIPDynamic {

    protected boolean bnsIPDynamicPublic;
    @XmlElement(name = "Mode")
    protected String mode;

    /**
     * Obtiene el valor de la propiedad bnsIPDynamicPublic.
     * 
     */
    public boolean isBnsIPDynamicPublic() {
        return bnsIPDynamicPublic;
    }

    /**
     * Define el valor de la propiedad bnsIPDynamicPublic.
     * 
     */
    public void setBnsIPDynamicPublic(boolean value) {
        this.bnsIPDynamicPublic = value;
    }

    /**
     * Obtiene el valor de la propiedad mode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Define el valor de la propiedad mode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

}
