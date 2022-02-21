
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mdlGeneralsSystem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mdlGeneralsSystem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="strVlanStatic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strTimeSpanMinutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strAutoFind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVLAN35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVLAN118" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strHSIRouting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strHSInRouting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strHSIFlowpara" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strHSIRoutingPre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVlansHSI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVlansHSIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVlansHSOUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strHSIRoutingEnlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strHSInRoutingEnlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strHSIRoutingPreEnlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVlansHSIEnlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVlansHSINEnlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVlansHSOUTEnlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVlanIPdynamicPublic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVlansVOIPEnlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVlansHSI_TP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVlansVOIP_TP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVlansIPTV_TP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVlansHSI_Static_TP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVlanIPdynamicPublicTP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVlanIPdynamicPublicEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strSncodesIptv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strSncodesHsiUp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strSncodesHsiDown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strTFEHsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strTFEVoIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strTFEHVoIPDigital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVLANS_HSI_USER_TP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVLANS_HSI_USER_EC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mdlGeneralsSystem", propOrder = {
    "strVlanStatic",
    "strTimeSpanMinutes",
    "strAutoFind",
    "strVLAN35",
    "strVLAN118",
    "strHSIRouting",
    "strHSInRouting",
    "strHSIFlowpara",
    "strHSIRoutingPre",
    "strVlansHSI",
    "strVlansHSIN",
    "strVlansHSOUT",
    "strHSIRoutingEnlace",
    "strHSInRoutingEnlace",
    "strHSIRoutingPreEnlace",
    "strVlansHSIEnlace",
    "strVlansHSINEnlace",
    "strVlansHSOUTEnlace",
    "strVlanIPdynamicPublic",
    "strVlansVOIPEnlace",
    "strVlansHSITP",
    "strVlansVOIPTP",
    "strVlansIPTVTP",
    "strVlansHSIStaticTP",
    "strVlanIPdynamicPublicTP",
    "strVlanIPdynamicPublicEC",
    "strSncodesIptv",
    "strSncodesHsiUp",
    "strSncodesHsiDown",
    "strTFEHsi",
    "strTFEVoIP",
    "strTFEHVoIPDigital",
    "strVLANSHSIUSERTP",
    "strVLANSHSIUSEREC"
})
public class MdlGeneralsSystem {

    protected String strVlanStatic;
    protected String strTimeSpanMinutes;
    protected String strAutoFind;
    protected String strVLAN35;
    protected String strVLAN118;
    protected String strHSIRouting;
    protected String strHSInRouting;
    protected String strHSIFlowpara;
    protected String strHSIRoutingPre;
    protected String strVlansHSI;
    protected String strVlansHSIN;
    protected String strVlansHSOUT;
    protected String strHSIRoutingEnlace;
    protected String strHSInRoutingEnlace;
    protected String strHSIRoutingPreEnlace;
    protected String strVlansHSIEnlace;
    protected String strVlansHSINEnlace;
    protected String strVlansHSOUTEnlace;
    protected String strVlanIPdynamicPublic;
    protected String strVlansVOIPEnlace;
    @XmlElement(name = "strVlansHSI_TP")
    protected String strVlansHSITP;
    @XmlElement(name = "strVlansVOIP_TP")
    protected String strVlansVOIPTP;
    @XmlElement(name = "strVlansIPTV_TP")
    protected String strVlansIPTVTP;
    @XmlElement(name = "strVlansHSI_Static_TP")
    protected String strVlansHSIStaticTP;
    protected String strVlanIPdynamicPublicTP;
    protected String strVlanIPdynamicPublicEC;
    protected String strSncodesIptv;
    protected String strSncodesHsiUp;
    protected String strSncodesHsiDown;
    protected String strTFEHsi;
    protected String strTFEVoIP;
    protected String strTFEHVoIPDigital;
    @XmlElement(name = "strVLANS_HSI_USER_TP")
    protected String strVLANSHSIUSERTP;
    @XmlElement(name = "strVLANS_HSI_USER_EC")
    protected String strVLANSHSIUSEREC;

    /**
     * Obtiene el valor de la propiedad strVlanStatic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVlanStatic() {
        return strVlanStatic;
    }

    /**
     * Define el valor de la propiedad strVlanStatic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVlanStatic(String value) {
        this.strVlanStatic = value;
    }

    /**
     * Obtiene el valor de la propiedad strTimeSpanMinutes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrTimeSpanMinutes() {
        return strTimeSpanMinutes;
    }

    /**
     * Define el valor de la propiedad strTimeSpanMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrTimeSpanMinutes(String value) {
        this.strTimeSpanMinutes = value;
    }

    /**
     * Obtiene el valor de la propiedad strAutoFind.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrAutoFind() {
        return strAutoFind;
    }

    /**
     * Define el valor de la propiedad strAutoFind.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrAutoFind(String value) {
        this.strAutoFind = value;
    }

    /**
     * Obtiene el valor de la propiedad strVLAN35.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVLAN35() {
        return strVLAN35;
    }

    /**
     * Define el valor de la propiedad strVLAN35.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVLAN35(String value) {
        this.strVLAN35 = value;
    }

    /**
     * Obtiene el valor de la propiedad strVLAN118.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVLAN118() {
        return strVLAN118;
    }

    /**
     * Define el valor de la propiedad strVLAN118.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVLAN118(String value) {
        this.strVLAN118 = value;
    }

    /**
     * Obtiene el valor de la propiedad strHSIRouting.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrHSIRouting() {
        return strHSIRouting;
    }

    /**
     * Define el valor de la propiedad strHSIRouting.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrHSIRouting(String value) {
        this.strHSIRouting = value;
    }

    /**
     * Obtiene el valor de la propiedad strHSInRouting.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrHSInRouting() {
        return strHSInRouting;
    }

    /**
     * Define el valor de la propiedad strHSInRouting.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrHSInRouting(String value) {
        this.strHSInRouting = value;
    }

    /**
     * Obtiene el valor de la propiedad strHSIFlowpara.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrHSIFlowpara() {
        return strHSIFlowpara;
    }

    /**
     * Define el valor de la propiedad strHSIFlowpara.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrHSIFlowpara(String value) {
        this.strHSIFlowpara = value;
    }

    /**
     * Obtiene el valor de la propiedad strHSIRoutingPre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrHSIRoutingPre() {
        return strHSIRoutingPre;
    }

    /**
     * Define el valor de la propiedad strHSIRoutingPre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrHSIRoutingPre(String value) {
        this.strHSIRoutingPre = value;
    }

    /**
     * Obtiene el valor de la propiedad strVlansHSI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVlansHSI() {
        return strVlansHSI;
    }

    /**
     * Define el valor de la propiedad strVlansHSI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVlansHSI(String value) {
        this.strVlansHSI = value;
    }

    /**
     * Obtiene el valor de la propiedad strVlansHSIN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVlansHSIN() {
        return strVlansHSIN;
    }

    /**
     * Define el valor de la propiedad strVlansHSIN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVlansHSIN(String value) {
        this.strVlansHSIN = value;
    }

    /**
     * Obtiene el valor de la propiedad strVlansHSOUT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVlansHSOUT() {
        return strVlansHSOUT;
    }

    /**
     * Define el valor de la propiedad strVlansHSOUT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVlansHSOUT(String value) {
        this.strVlansHSOUT = value;
    }

    /**
     * Obtiene el valor de la propiedad strHSIRoutingEnlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrHSIRoutingEnlace() {
        return strHSIRoutingEnlace;
    }

    /**
     * Define el valor de la propiedad strHSIRoutingEnlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrHSIRoutingEnlace(String value) {
        this.strHSIRoutingEnlace = value;
    }

    /**
     * Obtiene el valor de la propiedad strHSInRoutingEnlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrHSInRoutingEnlace() {
        return strHSInRoutingEnlace;
    }

    /**
     * Define el valor de la propiedad strHSInRoutingEnlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrHSInRoutingEnlace(String value) {
        this.strHSInRoutingEnlace = value;
    }

    /**
     * Obtiene el valor de la propiedad strHSIRoutingPreEnlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrHSIRoutingPreEnlace() {
        return strHSIRoutingPreEnlace;
    }

    /**
     * Define el valor de la propiedad strHSIRoutingPreEnlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrHSIRoutingPreEnlace(String value) {
        this.strHSIRoutingPreEnlace = value;
    }

    /**
     * Obtiene el valor de la propiedad strVlansHSIEnlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVlansHSIEnlace() {
        return strVlansHSIEnlace;
    }

    /**
     * Define el valor de la propiedad strVlansHSIEnlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVlansHSIEnlace(String value) {
        this.strVlansHSIEnlace = value;
    }

    /**
     * Obtiene el valor de la propiedad strVlansHSINEnlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVlansHSINEnlace() {
        return strVlansHSINEnlace;
    }

    /**
     * Define el valor de la propiedad strVlansHSINEnlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVlansHSINEnlace(String value) {
        this.strVlansHSINEnlace = value;
    }

    /**
     * Obtiene el valor de la propiedad strVlansHSOUTEnlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVlansHSOUTEnlace() {
        return strVlansHSOUTEnlace;
    }

    /**
     * Define el valor de la propiedad strVlansHSOUTEnlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVlansHSOUTEnlace(String value) {
        this.strVlansHSOUTEnlace = value;
    }

    /**
     * Obtiene el valor de la propiedad strVlanIPdynamicPublic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVlanIPdynamicPublic() {
        return strVlanIPdynamicPublic;
    }

    /**
     * Define el valor de la propiedad strVlanIPdynamicPublic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVlanIPdynamicPublic(String value) {
        this.strVlanIPdynamicPublic = value;
    }

    /**
     * Obtiene el valor de la propiedad strVlansVOIPEnlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVlansVOIPEnlace() {
        return strVlansVOIPEnlace;
    }

    /**
     * Define el valor de la propiedad strVlansVOIPEnlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVlansVOIPEnlace(String value) {
        this.strVlansVOIPEnlace = value;
    }

    /**
     * Obtiene el valor de la propiedad strVlansHSITP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVlansHSITP() {
        return strVlansHSITP;
    }

    /**
     * Define el valor de la propiedad strVlansHSITP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVlansHSITP(String value) {
        this.strVlansHSITP = value;
    }

    /**
     * Obtiene el valor de la propiedad strVlansVOIPTP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVlansVOIPTP() {
        return strVlansVOIPTP;
    }

    /**
     * Define el valor de la propiedad strVlansVOIPTP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVlansVOIPTP(String value) {
        this.strVlansVOIPTP = value;
    }

    /**
     * Obtiene el valor de la propiedad strVlansIPTVTP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVlansIPTVTP() {
        return strVlansIPTVTP;
    }

    /**
     * Define el valor de la propiedad strVlansIPTVTP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVlansIPTVTP(String value) {
        this.strVlansIPTVTP = value;
    }

    /**
     * Obtiene el valor de la propiedad strVlansHSIStaticTP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVlansHSIStaticTP() {
        return strVlansHSIStaticTP;
    }

    /**
     * Define el valor de la propiedad strVlansHSIStaticTP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVlansHSIStaticTP(String value) {
        this.strVlansHSIStaticTP = value;
    }

    /**
     * Obtiene el valor de la propiedad strVlanIPdynamicPublicTP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVlanIPdynamicPublicTP() {
        return strVlanIPdynamicPublicTP;
    }

    /**
     * Define el valor de la propiedad strVlanIPdynamicPublicTP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVlanIPdynamicPublicTP(String value) {
        this.strVlanIPdynamicPublicTP = value;
    }

    /**
     * Obtiene el valor de la propiedad strVlanIPdynamicPublicEC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVlanIPdynamicPublicEC() {
        return strVlanIPdynamicPublicEC;
    }

    /**
     * Define el valor de la propiedad strVlanIPdynamicPublicEC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVlanIPdynamicPublicEC(String value) {
        this.strVlanIPdynamicPublicEC = value;
    }

    /**
     * Obtiene el valor de la propiedad strSncodesIptv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSncodesIptv() {
        return strSncodesIptv;
    }

    /**
     * Define el valor de la propiedad strSncodesIptv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSncodesIptv(String value) {
        this.strSncodesIptv = value;
    }

    /**
     * Obtiene el valor de la propiedad strSncodesHsiUp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSncodesHsiUp() {
        return strSncodesHsiUp;
    }

    /**
     * Define el valor de la propiedad strSncodesHsiUp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSncodesHsiUp(String value) {
        this.strSncodesHsiUp = value;
    }

    /**
     * Obtiene el valor de la propiedad strSncodesHsiDown.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSncodesHsiDown() {
        return strSncodesHsiDown;
    }

    /**
     * Define el valor de la propiedad strSncodesHsiDown.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSncodesHsiDown(String value) {
        this.strSncodesHsiDown = value;
    }

    /**
     * Obtiene el valor de la propiedad strTFEHsi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrTFEHsi() {
        return strTFEHsi;
    }

    /**
     * Define el valor de la propiedad strTFEHsi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrTFEHsi(String value) {
        this.strTFEHsi = value;
    }

    /**
     * Obtiene el valor de la propiedad strTFEVoIP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrTFEVoIP() {
        return strTFEVoIP;
    }

    /**
     * Define el valor de la propiedad strTFEVoIP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrTFEVoIP(String value) {
        this.strTFEVoIP = value;
    }

    /**
     * Obtiene el valor de la propiedad strTFEHVoIPDigital.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrTFEHVoIPDigital() {
        return strTFEHVoIPDigital;
    }

    /**
     * Define el valor de la propiedad strTFEHVoIPDigital.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrTFEHVoIPDigital(String value) {
        this.strTFEHVoIPDigital = value;
    }

    /**
     * Obtiene el valor de la propiedad strVLANSHSIUSERTP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVLANSHSIUSERTP() {
        return strVLANSHSIUSERTP;
    }

    /**
     * Define el valor de la propiedad strVLANSHSIUSERTP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVLANSHSIUSERTP(String value) {
        this.strVLANSHSIUSERTP = value;
    }

    /**
     * Obtiene el valor de la propiedad strVLANSHSIUSEREC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVLANSHSIUSEREC() {
        return strVLANSHSIUSEREC;
    }

    /**
     * Define el valor de la propiedad strVLANSHSIUSEREC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVLANSHSIUSEREC(String value) {
        this.strVLANSHSIUSEREC = value;
    }

}
