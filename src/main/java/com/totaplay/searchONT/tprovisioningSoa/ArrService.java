
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para arrService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="arrService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="incluidoFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="latitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="longutud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrProductos" type="{http://tempuri.org/}ArrayOfArrProductos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrService", propOrder = {
    "service",
    "serialNumber",
    "mac",
    "incluidoFlag",
    "packageDescription",
    "packageId",
    "latitud",
    "longutud",
    "arrProductos"
})
public class ArrService {

    protected String service;
    protected String serialNumber;
    protected String mac;
    protected String incluidoFlag;
    protected String packageDescription;
    protected String packageId;
    protected String latitud;
    protected String longutud;
    @XmlElement(name = "ArrProductos")
    protected ArrayOfArrProductos arrProductos;

    /**
     * Obtiene el valor de la propiedad service.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Define el valor de la propiedad service.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Obtiene el valor de la propiedad serialNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Define el valor de la propiedad serialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad mac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMac() {
        return mac;
    }

    /**
     * Define el valor de la propiedad mac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(String value) {
        this.mac = value;
    }

    /**
     * Obtiene el valor de la propiedad incluidoFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncluidoFlag() {
        return incluidoFlag;
    }

    /**
     * Define el valor de la propiedad incluidoFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncluidoFlag(String value) {
        this.incluidoFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad packageDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageDescription() {
        return packageDescription;
    }

    /**
     * Define el valor de la propiedad packageDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageDescription(String value) {
        this.packageDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad packageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageId() {
        return packageId;
    }

    /**
     * Define el valor de la propiedad packageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageId(String value) {
        this.packageId = value;
    }

    /**
     * Obtiene el valor de la propiedad latitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitud() {
        return latitud;
    }

    /**
     * Define el valor de la propiedad latitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitud(String value) {
        this.latitud = value;
    }

    /**
     * Obtiene el valor de la propiedad longutud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongutud() {
        return longutud;
    }

    /**
     * Define el valor de la propiedad longutud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongutud(String value) {
        this.longutud = value;
    }

    /**
     * Obtiene el valor de la propiedad arrProductos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrProductos }
     *     
     */
    public ArrayOfArrProductos getArrProductos() {
        return arrProductos;
    }

    /**
     * Define el valor de la propiedad arrProductos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrProductos }
     *     
     */
    public void setArrProductos(ArrayOfArrProductos value) {
        this.arrProductos = value;
    }

}
