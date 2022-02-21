
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
 *         &lt;element name="strOLTName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strFrame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strSlot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strONTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "strOLTName",
    "strFrame",
    "strSlot",
    "strPort",
    "strONTID",
    "user"
})
@XmlRootElement(name = "getOpticalONT")
public class GetOpticalONT {

    protected String strOLTName;
    protected String strFrame;
    protected String strSlot;
    protected String strPort;
    protected String strONTID;
    @XmlElement(name = "User")
    protected String user;

    /**
     * Obtiene el valor de la propiedad strOLTName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrOLTName() {
        return strOLTName;
    }

    /**
     * Define el valor de la propiedad strOLTName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrOLTName(String value) {
        this.strOLTName = value;
    }

    /**
     * Obtiene el valor de la propiedad strFrame.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrFrame() {
        return strFrame;
    }

    /**
     * Define el valor de la propiedad strFrame.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrFrame(String value) {
        this.strFrame = value;
    }

    /**
     * Obtiene el valor de la propiedad strSlot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSlot() {
        return strSlot;
    }

    /**
     * Define el valor de la propiedad strSlot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSlot(String value) {
        this.strSlot = value;
    }

    /**
     * Obtiene el valor de la propiedad strPort.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrPort() {
        return strPort;
    }

    /**
     * Define el valor de la propiedad strPort.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrPort(String value) {
        this.strPort = value;
    }

    /**
     * Obtiene el valor de la propiedad strONTID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrONTID() {
        return strONTID;
    }

    /**
     * Define el valor de la propiedad strONTID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrONTID(String value) {
        this.strONTID = value;
    }

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

}
