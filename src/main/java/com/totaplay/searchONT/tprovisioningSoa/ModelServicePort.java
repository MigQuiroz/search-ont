
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ModelServicePort complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ModelServicePort"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NOMBRESERVICIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserVLAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceVLAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PERFILBAJADA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BAJADAMEGAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PERFILSUBIDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SUBIDAMEGAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENRUTADO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MODELO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GEMPORTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelServicePort", propOrder = {
    "nombreservicio",
    "userVLAN",
    "serviceVLAN",
    "perfilbajada",
    "bajadamegas",
    "perfilsubida",
    "subidamegas",
    "enrutado",
    "modelo",
    "gemportid"
})
public class ModelServicePort {

    @XmlElement(name = "NOMBRESERVICIO")
    protected String nombreservicio;
    @XmlElement(name = "UserVLAN")
    protected String userVLAN;
    @XmlElement(name = "ServiceVLAN")
    protected String serviceVLAN;
    @XmlElement(name = "PERFILBAJADA")
    protected String perfilbajada;
    @XmlElement(name = "BAJADAMEGAS")
    protected String bajadamegas;
    @XmlElement(name = "PERFILSUBIDA")
    protected String perfilsubida;
    @XmlElement(name = "SUBIDAMEGAS")
    protected String subidamegas;
    @XmlElement(name = "ENRUTADO")
    protected String enrutado;
    @XmlElement(name = "MODELO")
    protected String modelo;
    @XmlElement(name = "GEMPORTID")
    protected String gemportid;

    /**
     * Obtiene el valor de la propiedad nombreservicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRESERVICIO() {
        return nombreservicio;
    }

    /**
     * Define el valor de la propiedad nombreservicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRESERVICIO(String value) {
        this.nombreservicio = value;
    }

    /**
     * Obtiene el valor de la propiedad userVLAN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserVLAN() {
        return userVLAN;
    }

    /**
     * Define el valor de la propiedad userVLAN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserVLAN(String value) {
        this.userVLAN = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceVLAN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceVLAN() {
        return serviceVLAN;
    }

    /**
     * Define el valor de la propiedad serviceVLAN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceVLAN(String value) {
        this.serviceVLAN = value;
    }

    /**
     * Obtiene el valor de la propiedad perfilbajada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERFILBAJADA() {
        return perfilbajada;
    }

    /**
     * Define el valor de la propiedad perfilbajada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERFILBAJADA(String value) {
        this.perfilbajada = value;
    }

    /**
     * Obtiene el valor de la propiedad bajadamegas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAJADAMEGAS() {
        return bajadamegas;
    }

    /**
     * Define el valor de la propiedad bajadamegas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAJADAMEGAS(String value) {
        this.bajadamegas = value;
    }

    /**
     * Obtiene el valor de la propiedad perfilsubida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERFILSUBIDA() {
        return perfilsubida;
    }

    /**
     * Define el valor de la propiedad perfilsubida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERFILSUBIDA(String value) {
        this.perfilsubida = value;
    }

    /**
     * Obtiene el valor de la propiedad subidamegas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBIDAMEGAS() {
        return subidamegas;
    }

    /**
     * Define el valor de la propiedad subidamegas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBIDAMEGAS(String value) {
        this.subidamegas = value;
    }

    /**
     * Obtiene el valor de la propiedad enrutado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENRUTADO() {
        return enrutado;
    }

    /**
     * Define el valor de la propiedad enrutado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENRUTADO(String value) {
        this.enrutado = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODELO() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODELO(String value) {
        this.modelo = value;
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

}
