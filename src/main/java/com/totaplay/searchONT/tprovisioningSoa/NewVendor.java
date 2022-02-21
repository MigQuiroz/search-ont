
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NewVendor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NewVendor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vendor" type="{http://tempuri.org/}VendorDestination" minOccurs="0"/&gt;
 *         &lt;element name="idResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datetime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="isEnded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="idLog" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewVendor", propOrder = {
    "vendor",
    "idResult",
    "resultDescription",
    "datetime",
    "isEnded",
    "idLog"
})
public class NewVendor {

    @XmlElement(name = "Vendor")
    protected VendorDestination vendor;
    protected String idResult;
    protected String resultDescription;
    protected Object datetime;
    protected boolean isEnded;
    protected int idLog;

    /**
     * Obtiene el valor de la propiedad vendor.
     * 
     * @return
     *     possible object is
     *     {@link VendorDestination }
     *     
     */
    public VendorDestination getVendor() {
        return vendor;
    }

    /**
     * Define el valor de la propiedad vendor.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorDestination }
     *     
     */
    public void setVendor(VendorDestination value) {
        this.vendor = value;
    }

    /**
     * Obtiene el valor de la propiedad idResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdResult() {
        return idResult;
    }

    /**
     * Define el valor de la propiedad idResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdResult(String value) {
        this.idResult = value;
    }

    /**
     * Obtiene el valor de la propiedad resultDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDescription() {
        return resultDescription;
    }

    /**
     * Define el valor de la propiedad resultDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDescription(String value) {
        this.resultDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad datetime.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDatetime() {
        return datetime;
    }

    /**
     * Define el valor de la propiedad datetime.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDatetime(Object value) {
        this.datetime = value;
    }

    /**
     * Obtiene el valor de la propiedad isEnded.
     * 
     */
    public boolean isIsEnded() {
        return isEnded;
    }

    /**
     * Define el valor de la propiedad isEnded.
     * 
     */
    public void setIsEnded(boolean value) {
        this.isEnded = value;
    }

    /**
     * Obtiene el valor de la propiedad idLog.
     * 
     */
    public int getIdLog() {
        return idLog;
    }

    /**
     * Define el valor de la propiedad idLog.
     * 
     */
    public void setIdLog(int value) {
        this.idLog = value;
    }

}
