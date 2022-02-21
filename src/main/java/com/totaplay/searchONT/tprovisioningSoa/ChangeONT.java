
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
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NewSerialONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdModel" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="strOldSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "customerId",
    "newSerialONT",
    "idModel",
    "strOldSerialNumber"
})
@XmlRootElement(name = "ChangeONT")
public class ChangeONT {

    @XmlElement(name = "Login")
    protected ArrLogin login;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "NewSerialONT")
    protected String newSerialONT;
    @XmlElement(name = "IdModel")
    protected long idModel;
    protected String strOldSerialNumber;

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
     * Obtiene el valor de la propiedad customerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Define el valor de la propiedad customerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Obtiene el valor de la propiedad newSerialONT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSerialONT() {
        return newSerialONT;
    }

    /**
     * Define el valor de la propiedad newSerialONT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSerialONT(String value) {
        this.newSerialONT = value;
    }

    /**
     * Obtiene el valor de la propiedad idModel.
     * 
     */
    public long getIdModel() {
        return idModel;
    }

    /**
     * Define el valor de la propiedad idModel.
     * 
     */
    public void setIdModel(long value) {
        this.idModel = value;
    }

    /**
     * Obtiene el valor de la propiedad strOldSerialNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrOldSerialNumber() {
        return strOldSerialNumber;
    }

    /**
     * Define el valor de la propiedad strOldSerialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrOldSerialNumber(String value) {
        this.strOldSerialNumber = value;
    }

}
