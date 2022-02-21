
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para arrBrm complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="arrBrm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CveEdoCEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CveMunicipioCEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CvePobCEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Account_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Business_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BaseRent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrPayInfo" type="{http://tempuri.org/}arrPayInfo" minOccurs="0"/&gt;
 *         &lt;element name="ArrAdress" type="{http://tempuri.org/}ArrayOfArrAdress" minOccurs="0"/&gt;
 *         &lt;element name="cluster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idPackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calificacionBuroCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plazo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrService" type="{http://tempuri.org/}ArrayOfArrService" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrBrm", propOrder = {
    "idRegion",
    "cveEdoCEN",
    "cveMunicipioCEN",
    "cvePobCEN",
    "company",
    "accountNo",
    "businessType",
    "currency",
    "baseRent",
    "dateBirth",
    "arrPayInfo",
    "arrAdress",
    "cluster",
    "packageDescription",
    "idPackage",
    "calificacionBuroCredito",
    "tipoContrato",
    "plazo",
    "arrService"
})
public class ArrBrm {

    protected String idRegion;
    @XmlElement(name = "CveEdoCEN")
    protected String cveEdoCEN;
    @XmlElement(name = "CveMunicipioCEN")
    protected String cveMunicipioCEN;
    @XmlElement(name = "CvePobCEN")
    protected String cvePobCEN;
    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "Account_no")
    protected String accountNo;
    @XmlElement(name = "Business_type")
    protected String businessType;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "BaseRent")
    protected String baseRent;
    @XmlElement(name = "DateBirth")
    protected String dateBirth;
    @XmlElement(name = "ArrPayInfo")
    protected ArrPayInfo arrPayInfo;
    @XmlElement(name = "ArrAdress")
    protected ArrayOfArrAdress arrAdress;
    protected String cluster;
    protected String packageDescription;
    protected String idPackage;
    protected String calificacionBuroCredito;
    protected String tipoContrato;
    protected String plazo;
    @XmlElement(name = "ArrService")
    protected ArrayOfArrService arrService;

    /**
     * Obtiene el valor de la propiedad idRegion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRegion() {
        return idRegion;
    }

    /**
     * Define el valor de la propiedad idRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRegion(String value) {
        this.idRegion = value;
    }

    /**
     * Obtiene el valor de la propiedad cveEdoCEN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveEdoCEN() {
        return cveEdoCEN;
    }

    /**
     * Define el valor de la propiedad cveEdoCEN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveEdoCEN(String value) {
        this.cveEdoCEN = value;
    }

    /**
     * Obtiene el valor de la propiedad cveMunicipioCEN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveMunicipioCEN() {
        return cveMunicipioCEN;
    }

    /**
     * Define el valor de la propiedad cveMunicipioCEN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveMunicipioCEN(String value) {
        this.cveMunicipioCEN = value;
    }

    /**
     * Obtiene el valor de la propiedad cvePobCEN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvePobCEN() {
        return cvePobCEN;
    }

    /**
     * Define el valor de la propiedad cvePobCEN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvePobCEN(String value) {
        this.cvePobCEN = value;
    }

    /**
     * Obtiene el valor de la propiedad company.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Define el valor de la propiedad company.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Obtiene el valor de la propiedad accountNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Define el valor de la propiedad accountNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Obtiene el valor de la propiedad businessType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * Define el valor de la propiedad businessType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessType(String value) {
        this.businessType = value;
    }

    /**
     * Obtiene el valor de la propiedad currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Define el valor de la propiedad currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Obtiene el valor de la propiedad baseRent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRent() {
        return baseRent;
    }

    /**
     * Define el valor de la propiedad baseRent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRent(String value) {
        this.baseRent = value;
    }

    /**
     * Obtiene el valor de la propiedad dateBirth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateBirth() {
        return dateBirth;
    }

    /**
     * Define el valor de la propiedad dateBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateBirth(String value) {
        this.dateBirth = value;
    }

    /**
     * Obtiene el valor de la propiedad arrPayInfo.
     * 
     * @return
     *     possible object is
     *     {@link ArrPayInfo }
     *     
     */
    public ArrPayInfo getArrPayInfo() {
        return arrPayInfo;
    }

    /**
     * Define el valor de la propiedad arrPayInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrPayInfo }
     *     
     */
    public void setArrPayInfo(ArrPayInfo value) {
        this.arrPayInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad arrAdress.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrAdress }
     *     
     */
    public ArrayOfArrAdress getArrAdress() {
        return arrAdress;
    }

    /**
     * Define el valor de la propiedad arrAdress.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrAdress }
     *     
     */
    public void setArrAdress(ArrayOfArrAdress value) {
        this.arrAdress = value;
    }

    /**
     * Obtiene el valor de la propiedad cluster.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * Define el valor de la propiedad cluster.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCluster(String value) {
        this.cluster = value;
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
     * Obtiene el valor de la propiedad idPackage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPackage() {
        return idPackage;
    }

    /**
     * Define el valor de la propiedad idPackage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPackage(String value) {
        this.idPackage = value;
    }

    /**
     * Obtiene el valor de la propiedad calificacionBuroCredito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalificacionBuroCredito() {
        return calificacionBuroCredito;
    }

    /**
     * Define el valor de la propiedad calificacionBuroCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalificacionBuroCredito(String value) {
        this.calificacionBuroCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoContrato() {
        return tipoContrato;
    }

    /**
     * Define el valor de la propiedad tipoContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoContrato(String value) {
        this.tipoContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad plazo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlazo() {
        return plazo;
    }

    /**
     * Define el valor de la propiedad plazo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlazo(String value) {
        this.plazo = value;
    }

    /**
     * Obtiene el valor de la propiedad arrService.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrService }
     *     
     */
    public ArrayOfArrService getArrService() {
        return arrService;
    }

    /**
     * Define el valor de la propiedad arrService.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrService }
     *     
     */
    public void setArrService(ArrayOfArrService value) {
        this.arrService = value;
    }

}
