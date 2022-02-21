
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
 *         &lt;element name="ArrBrm" type="{http://tempuri.org/}arrBrm" minOccurs="0"/&gt;
 *         &lt;element name="arrActivation" type="{http://tempuri.org/}arrActivation" minOccurs="0"/&gt;
 *         &lt;element name="lngIdPackage" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="strIdCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strCustomerAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arrAddOnVoIP" type="{http://tempuri.org/}ArrayOfArrAddOnVoIP" minOccurs="0"/&gt;
 *         &lt;element name="ArrAddon" type="{http://tempuri.org/}ArrAddons" minOccurs="0"/&gt;
 *         &lt;element name="intCountVoip" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="strDown" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="strUp" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="intCountHSI" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="strTypeInvoke" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intCountTV" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arrAddOnIptv" type="{http://tempuri.org/}ArrayOfArrAddOnIPTV" minOccurs="0"/&gt;
 *         &lt;element name="AddInHSFI" type="{http://tempuri.org/}arrAddOnHSFI" minOccurs="0"/&gt;
 *         &lt;element name="ArrIPStatic" type="{http://tempuri.org/}arrIPStatic" minOccurs="0"/&gt;
 *         &lt;element name="ArrIPDynamic" type="{http://tempuri.org/}arrIPDynamic" minOccurs="0"/&gt;
 *         &lt;element name="mdlBscsQry" type="{http://tempuri.org/}MdlBscQry" minOccurs="0"/&gt;
 *         &lt;element name="ONTCON" type="{http://tempuri.org/}arrRoutingHSI" minOccurs="0"/&gt;
 *         &lt;element name="blnExistONT" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mdlgenerals" type="{http://tempuri.org/}mdlGeneralsSystem" minOccurs="0"/&gt;
 *         &lt;element name="blnConect" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="srrfing" type="{http://tempuri.org/}arrAutoFind" minOccurs="0"/&gt;
 *         &lt;element name="strVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mdlPOrts" type="{http://tempuri.org/}ModelGetModelPorts" minOccurs="0"/&gt;
 *         &lt;element name="blnGaoke" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="strModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "arrBrm",
    "arrActivation",
    "lngIdPackage",
    "strIdCustomer",
    "strCustomerAlias",
    "arrAddOnVoIP",
    "arrAddon",
    "intCountVoip",
    "strDown",
    "strUp",
    "intCountHSI",
    "strTypeInvoke",
    "intCountTV",
    "idCustomer",
    "arrAddOnIptv",
    "addInHSFI",
    "arrIPStatic",
    "arrIPDynamic",
    "mdlBscsQry",
    "ontcon",
    "blnExistONT",
    "mdlgenerals",
    "blnConect",
    "srrfing",
    "strVersion",
    "mdlPOrts",
    "blnGaoke",
    "strModel"
})
@XmlRootElement(name = "validAddDrmCustomerProfileFusion")
public class ValidAddDrmCustomerProfileFusion {

    @XmlElement(name = "ArrBrm")
    protected ArrBrm arrBrm;
    protected ArrActivation arrActivation;
    protected long lngIdPackage;
    protected String strIdCustomer;
    protected String strCustomerAlias;
    protected ArrayOfArrAddOnVoIP arrAddOnVoIP;
    @XmlElement(name = "ArrAddon")
    protected ArrAddons arrAddon;
    protected int intCountVoip;
    protected int strDown;
    protected int strUp;
    protected int intCountHSI;
    protected String strTypeInvoke;
    protected int intCountTV;
    protected String idCustomer;
    protected ArrayOfArrAddOnIPTV arrAddOnIptv;
    @XmlElement(name = "AddInHSFI")
    protected ArrAddOnHSFI addInHSFI;
    @XmlElement(name = "ArrIPStatic")
    protected ArrIPStatic arrIPStatic;
    @XmlElement(name = "ArrIPDynamic")
    protected ArrIPDynamic arrIPDynamic;
    protected MdlBscQry mdlBscsQry;
    @XmlElement(name = "ONTCON")
    protected ArrRoutingHSI ontcon;
    protected boolean blnExistONT;
    protected MdlGeneralsSystem mdlgenerals;
    protected boolean blnConect;
    protected ArrAutoFind srrfing;
    protected String strVersion;
    protected ModelGetModelPorts mdlPOrts;
    protected boolean blnGaoke;
    protected String strModel;

    /**
     * Obtiene el valor de la propiedad arrBrm.
     * 
     * @return
     *     possible object is
     *     {@link ArrBrm }
     *     
     */
    public ArrBrm getArrBrm() {
        return arrBrm;
    }

    /**
     * Define el valor de la propiedad arrBrm.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrBrm }
     *     
     */
    public void setArrBrm(ArrBrm value) {
        this.arrBrm = value;
    }

    /**
     * Obtiene el valor de la propiedad arrActivation.
     * 
     * @return
     *     possible object is
     *     {@link ArrActivation }
     *     
     */
    public ArrActivation getArrActivation() {
        return arrActivation;
    }

    /**
     * Define el valor de la propiedad arrActivation.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrActivation }
     *     
     */
    public void setArrActivation(ArrActivation value) {
        this.arrActivation = value;
    }

    /**
     * Obtiene el valor de la propiedad lngIdPackage.
     * 
     */
    public long getLngIdPackage() {
        return lngIdPackage;
    }

    /**
     * Define el valor de la propiedad lngIdPackage.
     * 
     */
    public void setLngIdPackage(long value) {
        this.lngIdPackage = value;
    }

    /**
     * Obtiene el valor de la propiedad strIdCustomer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrIdCustomer() {
        return strIdCustomer;
    }

    /**
     * Define el valor de la propiedad strIdCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrIdCustomer(String value) {
        this.strIdCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad strCustomerAlias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCustomerAlias() {
        return strCustomerAlias;
    }

    /**
     * Define el valor de la propiedad strCustomerAlias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCustomerAlias(String value) {
        this.strCustomerAlias = value;
    }

    /**
     * Obtiene el valor de la propiedad arrAddOnVoIP.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrAddOnVoIP }
     *     
     */
    public ArrayOfArrAddOnVoIP getArrAddOnVoIP() {
        return arrAddOnVoIP;
    }

    /**
     * Define el valor de la propiedad arrAddOnVoIP.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrAddOnVoIP }
     *     
     */
    public void setArrAddOnVoIP(ArrayOfArrAddOnVoIP value) {
        this.arrAddOnVoIP = value;
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
     * Obtiene el valor de la propiedad intCountVoip.
     * 
     */
    public int getIntCountVoip() {
        return intCountVoip;
    }

    /**
     * Define el valor de la propiedad intCountVoip.
     * 
     */
    public void setIntCountVoip(int value) {
        this.intCountVoip = value;
    }

    /**
     * Obtiene el valor de la propiedad strDown.
     * 
     */
    public int getStrDown() {
        return strDown;
    }

    /**
     * Define el valor de la propiedad strDown.
     * 
     */
    public void setStrDown(int value) {
        this.strDown = value;
    }

    /**
     * Obtiene el valor de la propiedad strUp.
     * 
     */
    public int getStrUp() {
        return strUp;
    }

    /**
     * Define el valor de la propiedad strUp.
     * 
     */
    public void setStrUp(int value) {
        this.strUp = value;
    }

    /**
     * Obtiene el valor de la propiedad intCountHSI.
     * 
     */
    public int getIntCountHSI() {
        return intCountHSI;
    }

    /**
     * Define el valor de la propiedad intCountHSI.
     * 
     */
    public void setIntCountHSI(int value) {
        this.intCountHSI = value;
    }

    /**
     * Obtiene el valor de la propiedad strTypeInvoke.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrTypeInvoke() {
        return strTypeInvoke;
    }

    /**
     * Define el valor de la propiedad strTypeInvoke.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrTypeInvoke(String value) {
        this.strTypeInvoke = value;
    }

    /**
     * Obtiene el valor de la propiedad intCountTV.
     * 
     */
    public int getIntCountTV() {
        return intCountTV;
    }

    /**
     * Define el valor de la propiedad intCountTV.
     * 
     */
    public void setIntCountTV(int value) {
        this.intCountTV = value;
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
     * Obtiene el valor de la propiedad arrAddOnIptv.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrAddOnIPTV }
     *     
     */
    public ArrayOfArrAddOnIPTV getArrAddOnIptv() {
        return arrAddOnIptv;
    }

    /**
     * Define el valor de la propiedad arrAddOnIptv.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrAddOnIPTV }
     *     
     */
    public void setArrAddOnIptv(ArrayOfArrAddOnIPTV value) {
        this.arrAddOnIptv = value;
    }

    /**
     * Obtiene el valor de la propiedad addInHSFI.
     * 
     * @return
     *     possible object is
     *     {@link ArrAddOnHSFI }
     *     
     */
    public ArrAddOnHSFI getAddInHSFI() {
        return addInHSFI;
    }

    /**
     * Define el valor de la propiedad addInHSFI.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrAddOnHSFI }
     *     
     */
    public void setAddInHSFI(ArrAddOnHSFI value) {
        this.addInHSFI = value;
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

    /**
     * Obtiene el valor de la propiedad arrIPDynamic.
     * 
     * @return
     *     possible object is
     *     {@link ArrIPDynamic }
     *     
     */
    public ArrIPDynamic getArrIPDynamic() {
        return arrIPDynamic;
    }

    /**
     * Define el valor de la propiedad arrIPDynamic.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrIPDynamic }
     *     
     */
    public void setArrIPDynamic(ArrIPDynamic value) {
        this.arrIPDynamic = value;
    }

    /**
     * Obtiene el valor de la propiedad mdlBscsQry.
     * 
     * @return
     *     possible object is
     *     {@link MdlBscQry }
     *     
     */
    public MdlBscQry getMdlBscsQry() {
        return mdlBscsQry;
    }

    /**
     * Define el valor de la propiedad mdlBscsQry.
     * 
     * @param value
     *     allowed object is
     *     {@link MdlBscQry }
     *     
     */
    public void setMdlBscsQry(MdlBscQry value) {
        this.mdlBscsQry = value;
    }

    /**
     * Obtiene el valor de la propiedad ontcon.
     * 
     * @return
     *     possible object is
     *     {@link ArrRoutingHSI }
     *     
     */
    public ArrRoutingHSI getONTCON() {
        return ontcon;
    }

    /**
     * Define el valor de la propiedad ontcon.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrRoutingHSI }
     *     
     */
    public void setONTCON(ArrRoutingHSI value) {
        this.ontcon = value;
    }

    /**
     * Obtiene el valor de la propiedad blnExistONT.
     * 
     */
    public boolean isBlnExistONT() {
        return blnExistONT;
    }

    /**
     * Define el valor de la propiedad blnExistONT.
     * 
     */
    public void setBlnExistONT(boolean value) {
        this.blnExistONT = value;
    }

    /**
     * Obtiene el valor de la propiedad mdlgenerals.
     * 
     * @return
     *     possible object is
     *     {@link MdlGeneralsSystem }
     *     
     */
    public MdlGeneralsSystem getMdlgenerals() {
        return mdlgenerals;
    }

    /**
     * Define el valor de la propiedad mdlgenerals.
     * 
     * @param value
     *     allowed object is
     *     {@link MdlGeneralsSystem }
     *     
     */
    public void setMdlgenerals(MdlGeneralsSystem value) {
        this.mdlgenerals = value;
    }

    /**
     * Obtiene el valor de la propiedad blnConect.
     * 
     */
    public boolean isBlnConect() {
        return blnConect;
    }

    /**
     * Define el valor de la propiedad blnConect.
     * 
     */
    public void setBlnConect(boolean value) {
        this.blnConect = value;
    }

    /**
     * Obtiene el valor de la propiedad srrfing.
     * 
     * @return
     *     possible object is
     *     {@link ArrAutoFind }
     *     
     */
    public ArrAutoFind getSrrfing() {
        return srrfing;
    }

    /**
     * Define el valor de la propiedad srrfing.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrAutoFind }
     *     
     */
    public void setSrrfing(ArrAutoFind value) {
        this.srrfing = value;
    }

    /**
     * Obtiene el valor de la propiedad strVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVersion() {
        return strVersion;
    }

    /**
     * Define el valor de la propiedad strVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVersion(String value) {
        this.strVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad mdlPOrts.
     * 
     * @return
     *     possible object is
     *     {@link ModelGetModelPorts }
     *     
     */
    public ModelGetModelPorts getMdlPOrts() {
        return mdlPOrts;
    }

    /**
     * Define el valor de la propiedad mdlPOrts.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelGetModelPorts }
     *     
     */
    public void setMdlPOrts(ModelGetModelPorts value) {
        this.mdlPOrts = value;
    }

    /**
     * Obtiene el valor de la propiedad blnGaoke.
     * 
     */
    public boolean isBlnGaoke() {
        return blnGaoke;
    }

    /**
     * Define el valor de la propiedad blnGaoke.
     * 
     */
    public void setBlnGaoke(boolean value) {
        this.blnGaoke = value;
    }

    /**
     * Obtiene el valor de la propiedad strModel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrModel() {
        return strModel;
    }

    /**
     * Define el valor de la propiedad strModel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrModel(String value) {
        this.strModel = value;
    }

}
