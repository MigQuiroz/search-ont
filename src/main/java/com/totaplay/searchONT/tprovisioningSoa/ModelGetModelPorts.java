
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ModelGetModelPorts complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ModelGetModelPorts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lngPorts" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="IdModel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lngPortLines" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="strEquiomentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strMainSoftVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intPortId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LineProfile" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ServiceProfile" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="VasProfile" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RemoteProfile" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PrefixServProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelGetModelPorts", propOrder = {
    "lngPorts",
    "idModel",
    "lngPortLines",
    "strEquiomentID",
    "strMainSoftVersion",
    "strVender",
    "intPortId",
    "lineProfile",
    "serviceProfile",
    "vasProfile",
    "remoteProfile",
    "prefixServProfile"
})
public class ModelGetModelPorts {

    protected long lngPorts;
    @XmlElement(name = "IdModel")
    protected int idModel;
    protected long lngPortLines;
    protected String strEquiomentID;
    protected String strMainSoftVersion;
    protected String strVender;
    protected int intPortId;
    @XmlElement(name = "LineProfile")
    protected int lineProfile;
    @XmlElement(name = "ServiceProfile")
    protected int serviceProfile;
    @XmlElement(name = "VasProfile")
    protected int vasProfile;
    @XmlElement(name = "RemoteProfile")
    protected int remoteProfile;
    @XmlElement(name = "PrefixServProfile")
    protected String prefixServProfile;

    /**
     * Obtiene el valor de la propiedad lngPorts.
     * 
     */
    public long getLngPorts() {
        return lngPorts;
    }

    /**
     * Define el valor de la propiedad lngPorts.
     * 
     */
    public void setLngPorts(long value) {
        this.lngPorts = value;
    }

    /**
     * Obtiene el valor de la propiedad idModel.
     * 
     */
    public int getIdModel() {
        return idModel;
    }

    /**
     * Define el valor de la propiedad idModel.
     * 
     */
    public void setIdModel(int value) {
        this.idModel = value;
    }

    /**
     * Obtiene el valor de la propiedad lngPortLines.
     * 
     */
    public long getLngPortLines() {
        return lngPortLines;
    }

    /**
     * Define el valor de la propiedad lngPortLines.
     * 
     */
    public void setLngPortLines(long value) {
        this.lngPortLines = value;
    }

    /**
     * Obtiene el valor de la propiedad strEquiomentID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrEquiomentID() {
        return strEquiomentID;
    }

    /**
     * Define el valor de la propiedad strEquiomentID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrEquiomentID(String value) {
        this.strEquiomentID = value;
    }

    /**
     * Obtiene el valor de la propiedad strMainSoftVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrMainSoftVersion() {
        return strMainSoftVersion;
    }

    /**
     * Define el valor de la propiedad strMainSoftVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrMainSoftVersion(String value) {
        this.strMainSoftVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad strVender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVender() {
        return strVender;
    }

    /**
     * Define el valor de la propiedad strVender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVender(String value) {
        this.strVender = value;
    }

    /**
     * Obtiene el valor de la propiedad intPortId.
     * 
     */
    public int getIntPortId() {
        return intPortId;
    }

    /**
     * Define el valor de la propiedad intPortId.
     * 
     */
    public void setIntPortId(int value) {
        this.intPortId = value;
    }

    /**
     * Obtiene el valor de la propiedad lineProfile.
     * 
     */
    public int getLineProfile() {
        return lineProfile;
    }

    /**
     * Define el valor de la propiedad lineProfile.
     * 
     */
    public void setLineProfile(int value) {
        this.lineProfile = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceProfile.
     * 
     */
    public int getServiceProfile() {
        return serviceProfile;
    }

    /**
     * Define el valor de la propiedad serviceProfile.
     * 
     */
    public void setServiceProfile(int value) {
        this.serviceProfile = value;
    }

    /**
     * Obtiene el valor de la propiedad vasProfile.
     * 
     */
    public int getVasProfile() {
        return vasProfile;
    }

    /**
     * Define el valor de la propiedad vasProfile.
     * 
     */
    public void setVasProfile(int value) {
        this.vasProfile = value;
    }

    /**
     * Obtiene el valor de la propiedad remoteProfile.
     * 
     */
    public int getRemoteProfile() {
        return remoteProfile;
    }

    /**
     * Define el valor de la propiedad remoteProfile.
     * 
     */
    public void setRemoteProfile(int value) {
        this.remoteProfile = value;
    }

    /**
     * Obtiene el valor de la propiedad prefixServProfile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixServProfile() {
        return prefixServProfile;
    }

    /**
     * Define el valor de la propiedad prefixServProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixServProfile(String value) {
        this.prefixServProfile = value;
    }

}
