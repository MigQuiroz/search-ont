
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ID_Transaction_Activation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ID_Transaction_Activation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="METHOD_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OPERATION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATE_PARAMETER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID_Transaction_Activation", propOrder = {
    "id",
    "methodname",
    "operationid",
    "dateparameter"
})
public class IDTransactionActivation {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "METHOD_NAME")
    protected String methodname;
    @XmlElement(name = "OPERATION_ID")
    protected String operationid;
    @XmlElement(name = "DATE_PARAMETER")
    protected String dateparameter;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad methodname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMETHODNAME() {
        return methodname;
    }

    /**
     * Define el valor de la propiedad methodname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMETHODNAME(String value) {
        this.methodname = value;
    }

    /**
     * Obtiene el valor de la propiedad operationid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERATIONID() {
        return operationid;
    }

    /**
     * Define el valor de la propiedad operationid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERATIONID(String value) {
        this.operationid = value;
    }

    /**
     * Obtiene el valor de la propiedad dateparameter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATEPARAMETER() {
        return dateparameter;
    }

    /**
     * Define el valor de la propiedad dateparameter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATEPARAMETER(String value) {
        this.dateparameter = value;
    }

}
