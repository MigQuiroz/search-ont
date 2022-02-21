
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para arrNetwork complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="arrNetwork"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IPOlt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Slot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Frame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LaserBiasCurrent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpticalPower" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONUOpticsModuleInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VLANs" type="{http://tempuri.org/}ArrayOfModelServicePort" minOccurs="0"/&gt;
 *         &lt;element name="UptreamTrafficName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DownStreamTrafficName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STBs" type="{http://tempuri.org/}ArrayOfArrAddOnIPTV" minOccurs="0"/&gt;
 *         &lt;element name="arrResult" type="{http://tempuri.org/}arrResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrNetwork", propOrder = {
    "olt",
    "ipOlt",
    "port",
    "slot",
    "frame",
    "model",
    "serialNumber",
    "status",
    "temperature",
    "laserBiasCurrent",
    "opticalPower",
    "onuOpticsModuleInformation",
    "vlaNs",
    "uptreamTrafficName",
    "downStreamTrafficName",
    "externalIPAddress",
    "stBs",
    "arrResult"
})
public class ArrNetwork {

    @XmlElement(name = "OLT")
    protected String olt;
    @XmlElement(name = "IPOlt")
    protected String ipOlt;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "Slot")
    protected String slot;
    @XmlElement(name = "Frame")
    protected String frame;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "Status")
    protected String status;
    protected String temperature;
    @XmlElement(name = "LaserBiasCurrent")
    protected String laserBiasCurrent;
    @XmlElement(name = "OpticalPower")
    protected String opticalPower;
    @XmlElement(name = "ONUOpticsModuleInformation")
    protected String onuOpticsModuleInformation;
    @XmlElement(name = "VLANs")
    protected ArrayOfModelServicePort vlaNs;
    @XmlElement(name = "UptreamTrafficName")
    protected String uptreamTrafficName;
    @XmlElement(name = "DownStreamTrafficName")
    protected String downStreamTrafficName;
    @XmlElement(name = "ExternalIPAddress")
    protected String externalIPAddress;
    @XmlElement(name = "STBs")
    protected ArrayOfArrAddOnIPTV stBs;
    protected ArrResult arrResult;

    /**
     * Obtiene el valor de la propiedad olt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLT() {
        return olt;
    }

    /**
     * Define el valor de la propiedad olt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLT(String value) {
        this.olt = value;
    }

    /**
     * Obtiene el valor de la propiedad ipOlt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPOlt() {
        return ipOlt;
    }

    /**
     * Define el valor de la propiedad ipOlt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPOlt(String value) {
        this.ipOlt = value;
    }

    /**
     * Obtiene el valor de la propiedad port.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Define el valor de la propiedad port.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Obtiene el valor de la propiedad slot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlot() {
        return slot;
    }

    /**
     * Define el valor de la propiedad slot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlot(String value) {
        this.slot = value;
    }

    /**
     * Obtiene el valor de la propiedad frame.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrame() {
        return frame;
    }

    /**
     * Define el valor de la propiedad frame.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrame(String value) {
        this.frame = value;
    }

    /**
     * Obtiene el valor de la propiedad model.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Define el valor de la propiedad model.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
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
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad temperature.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * Define el valor de la propiedad temperature.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperature(String value) {
        this.temperature = value;
    }

    /**
     * Obtiene el valor de la propiedad laserBiasCurrent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaserBiasCurrent() {
        return laserBiasCurrent;
    }

    /**
     * Define el valor de la propiedad laserBiasCurrent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaserBiasCurrent(String value) {
        this.laserBiasCurrent = value;
    }

    /**
     * Obtiene el valor de la propiedad opticalPower.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticalPower() {
        return opticalPower;
    }

    /**
     * Define el valor de la propiedad opticalPower.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticalPower(String value) {
        this.opticalPower = value;
    }

    /**
     * Obtiene el valor de la propiedad onuOpticsModuleInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONUOpticsModuleInformation() {
        return onuOpticsModuleInformation;
    }

    /**
     * Define el valor de la propiedad onuOpticsModuleInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONUOpticsModuleInformation(String value) {
        this.onuOpticsModuleInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad vlaNs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModelServicePort }
     *     
     */
    public ArrayOfModelServicePort getVLANs() {
        return vlaNs;
    }

    /**
     * Define el valor de la propiedad vlaNs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModelServicePort }
     *     
     */
    public void setVLANs(ArrayOfModelServicePort value) {
        this.vlaNs = value;
    }

    /**
     * Obtiene el valor de la propiedad uptreamTrafficName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUptreamTrafficName() {
        return uptreamTrafficName;
    }

    /**
     * Define el valor de la propiedad uptreamTrafficName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUptreamTrafficName(String value) {
        this.uptreamTrafficName = value;
    }

    /**
     * Obtiene el valor de la propiedad downStreamTrafficName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownStreamTrafficName() {
        return downStreamTrafficName;
    }

    /**
     * Define el valor de la propiedad downStreamTrafficName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownStreamTrafficName(String value) {
        this.downStreamTrafficName = value;
    }

    /**
     * Obtiene el valor de la propiedad externalIPAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalIPAddress() {
        return externalIPAddress;
    }

    /**
     * Define el valor de la propiedad externalIPAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalIPAddress(String value) {
        this.externalIPAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad stBs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrAddOnIPTV }
     *     
     */
    public ArrayOfArrAddOnIPTV getSTBs() {
        return stBs;
    }

    /**
     * Define el valor de la propiedad stBs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrAddOnIPTV }
     *     
     */
    public void setSTBs(ArrayOfArrAddOnIPTV value) {
        this.stBs = value;
    }

    /**
     * Obtiene el valor de la propiedad arrResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrResult }
     *     
     */
    public ArrResult getArrResult() {
        return arrResult;
    }

    /**
     * Define el valor de la propiedad arrResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrResult }
     *     
     */
    public void setArrResult(ArrResult value) {
        this.arrResult = value;
    }

}
