
package com.totaplay.searchONT.tprovisioningSoa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfGetALarmDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGetALarmDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetALarmDetail" type="{http://tempuri.org/}GetALarmDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGetALarmDetail", propOrder = {
    "getALarmDetail"
})
public class ArrayOfGetALarmDetail {

    @XmlElement(name = "GetALarmDetail", nillable = true)
    protected List<GetALarmDetail> getALarmDetail;

    /**
     * Gets the value of the getALarmDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getALarmDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetALarmDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetALarmDetail }
     * 
     * 
     */
    public List<GetALarmDetail> getGetALarmDetail() {
        if (getALarmDetail == null) {
            getALarmDetail = new ArrayList<GetALarmDetail>();
        }
        return this.getALarmDetail;
    }

}
