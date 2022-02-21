
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
 *         &lt;element name="GetRegionByOLTResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "getRegionByOLTResult"
})
@XmlRootElement(name = "GetRegionByOLTResponse")
public class GetRegionByOLTResponse {

    @XmlElement(name = "GetRegionByOLTResult")
    protected int getRegionByOLTResult;

    /**
     * Obtiene el valor de la propiedad getRegionByOLTResult.
     * 
     */
    public int getGetRegionByOLTResult() {
        return getRegionByOLTResult;
    }

    /**
     * Define el valor de la propiedad getRegionByOLTResult.
     * 
     */
    public void setGetRegionByOLTResult(int value) {
        this.getRegionByOLTResult = value;
    }

}
