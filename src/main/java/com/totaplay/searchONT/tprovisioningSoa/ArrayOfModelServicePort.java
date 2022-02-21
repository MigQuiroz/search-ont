
package com.totaplay.searchONT.tprovisioningSoa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfModelServicePort complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfModelServicePort"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ModelServicePort" type="{http://tempuri.org/}ModelServicePort" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfModelServicePort", propOrder = {
    "modelServicePort"
})
public class ArrayOfModelServicePort {

    @XmlElement(name = "ModelServicePort", nillable = true)
    protected List<ModelServicePort> modelServicePort;

    /**
     * Gets the value of the modelServicePort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modelServicePort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelServicePort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelServicePort }
     * 
     * 
     */
    public List<ModelServicePort> getModelServicePort() {
        if (modelServicePort == null) {
            modelServicePort = new ArrayList<ModelServicePort>();
        }
        return this.modelServicePort;
    }

}
