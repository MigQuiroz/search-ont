
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
 *         &lt;element name="deleteActivation" type="{http://tempuri.org/}dtoDeleteActivation" minOccurs="0"/&gt;
 *         &lt;element name="PackageActivation" type="{http://tempuri.org/}dtoPackageActivation" minOccurs="0"/&gt;
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
    "deleteActivation",
    "packageActivation"
})
@XmlRootElement(name = "Upgrade")
public class Upgrade {

    @XmlElement(name = "Login")
    protected ArrLogin login;
    protected DtoDeleteActivation deleteActivation;
    @XmlElement(name = "PackageActivation")
    protected DtoPackageActivation packageActivation;

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
     * Obtiene el valor de la propiedad deleteActivation.
     * 
     * @return
     *     possible object is
     *     {@link DtoDeleteActivation }
     *     
     */
    public DtoDeleteActivation getDeleteActivation() {
        return deleteActivation;
    }

    /**
     * Define el valor de la propiedad deleteActivation.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoDeleteActivation }
     *     
     */
    public void setDeleteActivation(DtoDeleteActivation value) {
        this.deleteActivation = value;
    }

    /**
     * Obtiene el valor de la propiedad packageActivation.
     * 
     * @return
     *     possible object is
     *     {@link DtoPackageActivation }
     *     
     */
    public DtoPackageActivation getPackageActivation() {
        return packageActivation;
    }

    /**
     * Define el valor de la propiedad packageActivation.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoPackageActivation }
     *     
     */
    public void setPackageActivation(DtoPackageActivation value) {
        this.packageActivation = value;
    }

}
