
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
 *         &lt;element name="Activacion_Consulta_DatosResult" type="{http://tempuri.org/}ArrayOfModelGetONT" minOccurs="0"/&gt;
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
    "activacionConsultaDatosResult"
})
@XmlRootElement(name = "Activacion_Consulta_DatosResponse")
public class ActivacionConsultaDatosResponse {

    @XmlElement(name = "Activacion_Consulta_DatosResult")
    protected ArrayOfModelGetONT activacionConsultaDatosResult;

    /**
     * Obtiene el valor de la propiedad activacionConsultaDatosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModelGetONT }
     *     
     */
    public ArrayOfModelGetONT getActivacionConsultaDatosResult() {
        return activacionConsultaDatosResult;
    }

    /**
     * Define el valor de la propiedad activacionConsultaDatosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModelGetONT }
     *     
     */
    public void setActivacionConsultaDatosResult(ArrayOfModelGetONT value) {
        this.activacionConsultaDatosResult = value;
    }

}
