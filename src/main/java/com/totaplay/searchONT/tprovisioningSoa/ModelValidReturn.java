
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ModelValidReturn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ModelValidReturn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bolError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="strCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="strError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strTypeError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intCountHSI" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="intCountVoipAnalog" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="intCountVoipDigital" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="intCountVoipSofhone" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="intCountCCTV" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelValidReturn", propOrder = {
    "bolError",
    "strCode",
    "strError",
    "strTypeError",
    "intCountHSI",
    "intCountVoipAnalog",
    "intCountVoipDigital",
    "intCountVoipSofhone",
    "intCountCCTV"
})
public class ModelValidReturn {

    protected boolean bolError;
    protected int strCode;
    protected String strError;
    protected String strTypeError;
    protected int intCountHSI;
    protected int intCountVoipAnalog;
    protected int intCountVoipDigital;
    protected int intCountVoipSofhone;
    protected int intCountCCTV;

    /**
     * Obtiene el valor de la propiedad bolError.
     * 
     */
    public boolean isBolError() {
        return bolError;
    }

    /**
     * Define el valor de la propiedad bolError.
     * 
     */
    public void setBolError(boolean value) {
        this.bolError = value;
    }

    /**
     * Obtiene el valor de la propiedad strCode.
     * 
     */
    public int getStrCode() {
        return strCode;
    }

    /**
     * Define el valor de la propiedad strCode.
     * 
     */
    public void setStrCode(int value) {
        this.strCode = value;
    }

    /**
     * Obtiene el valor de la propiedad strError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrError() {
        return strError;
    }

    /**
     * Define el valor de la propiedad strError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrError(String value) {
        this.strError = value;
    }

    /**
     * Obtiene el valor de la propiedad strTypeError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrTypeError() {
        return strTypeError;
    }

    /**
     * Define el valor de la propiedad strTypeError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrTypeError(String value) {
        this.strTypeError = value;
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
     * Obtiene el valor de la propiedad intCountVoipAnalog.
     * 
     */
    public int getIntCountVoipAnalog() {
        return intCountVoipAnalog;
    }

    /**
     * Define el valor de la propiedad intCountVoipAnalog.
     * 
     */
    public void setIntCountVoipAnalog(int value) {
        this.intCountVoipAnalog = value;
    }

    /**
     * Obtiene el valor de la propiedad intCountVoipDigital.
     * 
     */
    public int getIntCountVoipDigital() {
        return intCountVoipDigital;
    }

    /**
     * Define el valor de la propiedad intCountVoipDigital.
     * 
     */
    public void setIntCountVoipDigital(int value) {
        this.intCountVoipDigital = value;
    }

    /**
     * Obtiene el valor de la propiedad intCountVoipSofhone.
     * 
     */
    public int getIntCountVoipSofhone() {
        return intCountVoipSofhone;
    }

    /**
     * Define el valor de la propiedad intCountVoipSofhone.
     * 
     */
    public void setIntCountVoipSofhone(int value) {
        this.intCountVoipSofhone = value;
    }

    /**
     * Obtiene el valor de la propiedad intCountCCTV.
     * 
     */
    public int getIntCountCCTV() {
        return intCountCCTV;
    }

    /**
     * Define el valor de la propiedad intCountCCTV.
     * 
     */
    public void setIntCountCCTV(int value) {
        this.intCountCCTV = value;
    }

}
