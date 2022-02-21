
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para arrResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="arrResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdResult" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ResultDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrResult", propOrder = {
    "idResult",
    "result",
    "resultDescription"
})
public class ArrResult {

    @XmlElement(name = "IdResult")
    protected long idResult;
    @XmlElement(name = "Result")
    protected int result;
    @XmlElement(name = "ResultDescription")
    protected String resultDescription;

    /**
     * Obtiene el valor de la propiedad idResult.
     * 
     */
    public long getIdResult() {
        return idResult;
    }

    /**
     * Define el valor de la propiedad idResult.
     * 
     */
    public void setIdResult(long value) {
        this.idResult = value;
    }

    /**
     * Obtiene el valor de la propiedad result.
     * 
     */
    public int getResult() {
        return result;
    }

    /**
     * Define el valor de la propiedad result.
     * 
     */
    public void setResult(int value) {
        this.result = value;
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

}
