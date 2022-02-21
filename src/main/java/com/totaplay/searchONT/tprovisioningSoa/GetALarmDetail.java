
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetALarmDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetALarmDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="strType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetALarmDetail", propOrder = {
    "strType",
    "strStatus",
    "strDescription"
})
public class GetALarmDetail {

    protected String strType;
    protected String strStatus;
    protected String strDescription;

    /**
     * Obtiene el valor de la propiedad strType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrType() {
        return strType;
    }

    /**
     * Define el valor de la propiedad strType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrType(String value) {
        this.strType = value;
    }

    /**
     * Obtiene el valor de la propiedad strStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrStatus() {
        return strStatus;
    }

    /**
     * Define el valor de la propiedad strStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrStatus(String value) {
        this.strStatus = value;
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

}
