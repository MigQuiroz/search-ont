
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
 *         &lt;element name="Login" type="{http://tempuri.org/}arrLogin" minOccurs="0"/&gt;
 *         &lt;element name="arrONT" type="{http://tempuri.org/}arrActivation" minOccurs="0"/&gt;
 *         &lt;element name="ArrAddon" type="{http://tempuri.org/}ArrAddons" minOccurs="0"/&gt;
 *         &lt;element name="ArrIPStatic" type="{http://tempuri.org/}arrIPStatic" minOccurs="0"/&gt;
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
    "login",
    "arrONT",
    "arrAddon",
    "arrIPStatic"
})
@XmlRootElement(name = "SetAdon")
public class SetAdon {

    @XmlElement(name = "Login")
    protected ArrLogin login;
    protected ArrActivation arrONT;
    @XmlElement(name = "ArrAddon")
    protected ArrAddons arrAddon;
    @XmlElement(name = "ArrIPStatic")
    protected ArrIPStatic arrIPStatic;

    /**
     * Obtiene el valor de la propiedad login.
     * 
     * @return
     *     possible object is
     *     {@link ArrLogin }
     *     
     */
    public ArrLogin getLogin() {
        return login;
    }

    /**
     * Define el valor de la propiedad login.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrLogin }
     *     
     */
    public void setLogin(ArrLogin value) {
        this.login = value;
    }

    /**
     * Obtiene el valor de la propiedad arrONT.
     * 
     * @return
     *     possible object is
     *     {@link ArrActivation }
     *     
     */
    public ArrActivation getArrONT() {
        return arrONT;
    }

    /**
     * Define el valor de la propiedad arrONT.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrActivation }
     *     
     */
    public void setArrONT(ArrActivation value) {
        this.arrONT = value;
    }

    /**
     * Obtiene el valor de la propiedad arrAddon.
     * 
     * @return
     *     possible object is
     *     {@link ArrAddons }
     *     
     */
    public ArrAddons getArrAddon() {
        return arrAddon;
    }

    /**
     * Define el valor de la propiedad arrAddon.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrAddons }
     *     
     */
    public void setArrAddon(ArrAddons value) {
        this.arrAddon = value;
    }

    /**
     * Obtiene el valor de la propiedad arrIPStatic.
     * 
     * @return
     *     possible object is
     *     {@link ArrIPStatic }
     *     
     */
    public ArrIPStatic getArrIPStatic() {
        return arrIPStatic;
    }

    /**
     * Define el valor de la propiedad arrIPStatic.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrIPStatic }
     *     
     */
    public void setArrIPStatic(ArrIPStatic value) {
        this.arrIPStatic = value;
    }

}
