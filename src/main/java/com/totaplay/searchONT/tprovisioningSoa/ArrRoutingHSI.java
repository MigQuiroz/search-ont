
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para arrRoutingHSI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="arrRoutingHSI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Slot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Frame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumberONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VLANID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SVPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GEMPORTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FLOWPARA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdModel" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="intStatus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="intType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MainSoftVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SrvProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SrvName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blnerrorConectionU2000" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OLT_IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PON_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strLineProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrRoutingHSI", propOrder = {
    "olt",
    "port",
    "slot",
    "frame",
    "serialNumberONT",
    "vlanid",
    "svpid",
    "ontid",
    "gemportid",
    "tx",
    "rx",
    "uv",
    "idCustomer",
    "flowpara",
    "idModel",
    "intStatus",
    "intType",
    "mainSoftVersion",
    "srvProfileName",
    "srvName",
    "strType",
    "blnerrorConectionU2000",
    "oltip",
    "ponid",
    "strLineProfile"
})
public class ArrRoutingHSI {

    @XmlElement(name = "OLT")
    protected String olt;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "Slot")
    protected String slot;
    @XmlElement(name = "Frame")
    protected String frame;
    @XmlElement(name = "SerialNumberONT")
    protected String serialNumberONT;
    @XmlElement(name = "VLANID")
    protected String vlanid;
    @XmlElement(name = "SVPID")
    protected String svpid;
    @XmlElement(name = "ONTID")
    protected String ontid;
    @XmlElement(name = "GEMPORTID")
    protected String gemportid;
    @XmlElement(name = "TX")
    protected String tx;
    @XmlElement(name = "RX")
    protected String rx;
    @XmlElement(name = "UV")
    protected String uv;
    @XmlElement(name = "IdCustomer")
    protected String idCustomer;
    @XmlElement(name = "FLOWPARA")
    protected String flowpara;
    @XmlElement(name = "IdModel")
    protected long idModel;
    protected int intStatus;
    protected int intType;
    @XmlElement(name = "MainSoftVersion")
    protected String mainSoftVersion;
    @XmlElement(name = "SrvProfileName")
    protected String srvProfileName;
    @XmlElement(name = "SrvName")
    protected String srvName;
    protected String strType;
    protected boolean blnerrorConectionU2000;
    @XmlElement(name = "OLT_IP")
    protected String oltip;
    @XmlElement(name = "PON_ID")
    protected String ponid;
    protected String strLineProfile;

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
     * Obtiene el valor de la propiedad serialNumberONT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumberONT() {
        return serialNumberONT;
    }

    /**
     * Define el valor de la propiedad serialNumberONT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumberONT(String value) {
        this.serialNumberONT = value;
    }

    /**
     * Obtiene el valor de la propiedad vlanid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVLANID() {
        return vlanid;
    }

    /**
     * Define el valor de la propiedad vlanid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVLANID(String value) {
        this.vlanid = value;
    }

    /**
     * Obtiene el valor de la propiedad svpid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVPID() {
        return svpid;
    }

    /**
     * Define el valor de la propiedad svpid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVPID(String value) {
        this.svpid = value;
    }

    /**
     * Obtiene el valor de la propiedad ontid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONTID() {
        return ontid;
    }

    /**
     * Define el valor de la propiedad ontid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONTID(String value) {
        this.ontid = value;
    }

    /**
     * Obtiene el valor de la propiedad gemportid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGEMPORTID() {
        return gemportid;
    }

    /**
     * Define el valor de la propiedad gemportid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGEMPORTID(String value) {
        this.gemportid = value;
    }

    /**
     * Obtiene el valor de la propiedad tx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTX() {
        return tx;
    }

    /**
     * Define el valor de la propiedad tx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTX(String value) {
        this.tx = value;
    }

    /**
     * Obtiene el valor de la propiedad rx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRX() {
        return rx;
    }

    /**
     * Define el valor de la propiedad rx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRX(String value) {
        this.rx = value;
    }

    /**
     * Obtiene el valor de la propiedad uv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUV() {
        return uv;
    }

    /**
     * Define el valor de la propiedad uv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUV(String value) {
        this.uv = value;
    }

    /**
     * Obtiene el valor de la propiedad idCustomer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCustomer() {
        return idCustomer;
    }

    /**
     * Define el valor de la propiedad idCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCustomer(String value) {
        this.idCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad flowpara.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLOWPARA() {
        return flowpara;
    }

    /**
     * Define el valor de la propiedad flowpara.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLOWPARA(String value) {
        this.flowpara = value;
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
     * Obtiene el valor de la propiedad intStatus.
     * 
     */
    public int getIntStatus() {
        return intStatus;
    }

    /**
     * Define el valor de la propiedad intStatus.
     * 
     */
    public void setIntStatus(int value) {
        this.intStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad intType.
     * 
     */
    public int getIntType() {
        return intType;
    }

    /**
     * Define el valor de la propiedad intType.
     * 
     */
    public void setIntType(int value) {
        this.intType = value;
    }

    /**
     * Obtiene el valor de la propiedad mainSoftVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainSoftVersion() {
        return mainSoftVersion;
    }

    /**
     * Define el valor de la propiedad mainSoftVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainSoftVersion(String value) {
        this.mainSoftVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad srvProfileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrvProfileName() {
        return srvProfileName;
    }

    /**
     * Define el valor de la propiedad srvProfileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrvProfileName(String value) {
        this.srvProfileName = value;
    }

    /**
     * Obtiene el valor de la propiedad srvName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrvName() {
        return srvName;
    }

    /**
     * Define el valor de la propiedad srvName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrvName(String value) {
        this.srvName = value;
    }

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
     * Obtiene el valor de la propiedad blnerrorConectionU2000.
     * 
     */
    public boolean isBlnerrorConectionU2000() {
        return blnerrorConectionU2000;
    }

    /**
     * Define el valor de la propiedad blnerrorConectionU2000.
     * 
     */
    public void setBlnerrorConectionU2000(boolean value) {
        this.blnerrorConectionU2000 = value;
    }

    /**
     * Obtiene el valor de la propiedad oltip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLTIP() {
        return oltip;
    }

    /**
     * Define el valor de la propiedad oltip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLTIP(String value) {
        this.oltip = value;
    }

    /**
     * Obtiene el valor de la propiedad ponid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPONID() {
        return ponid;
    }

    /**
     * Define el valor de la propiedad ponid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPONID(String value) {
        this.ponid = value;
    }

    /**
     * Obtiene el valor de la propiedad strLineProfile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrLineProfile() {
        return strLineProfile;
    }

    /**
     * Define el valor de la propiedad strLineProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrLineProfile(String value) {
        this.strLineProfile = value;
    }

}
