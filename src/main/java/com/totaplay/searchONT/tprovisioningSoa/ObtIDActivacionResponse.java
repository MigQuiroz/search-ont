
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
 *         &lt;element name="ObtIDActivacionResult" type="{http://tempuri.org/}ID_Transaction_Activation" minOccurs="0"/&gt;
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
    "obtIDActivacionResult"
})
@XmlRootElement(name = "ObtIDActivacionResponse")
public class ObtIDActivacionResponse {

    @XmlElement(name = "ObtIDActivacionResult")
    protected IDTransactionActivation obtIDActivacionResult;

    /**
     * Obtiene el valor de la propiedad obtIDActivacionResult.
     * 
     * @return
     *     possible object is
     *     {@link IDTransactionActivation }
     *     
     */
    public IDTransactionActivation getObtIDActivacionResult() {
        return obtIDActivacionResult;
    }

    /**
     * Define el valor de la propiedad obtIDActivacionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link IDTransactionActivation }
     *     
     */
    public void setObtIDActivacionResult(IDTransactionActivation value) {
        this.obtIDActivacionResult = value;
    }

}
