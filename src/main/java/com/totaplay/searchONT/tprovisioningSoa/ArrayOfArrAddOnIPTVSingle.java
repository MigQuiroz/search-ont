
package com.totaplay.searchONT.tprovisioningSoa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfArrAddOnIPTVSingle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArrAddOnIPTVSingle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arrAddOnIPTVSingle" type="{http://tempuri.org/}arrAddOnIPTVSingle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrAddOnIPTVSingle", propOrder = {
    "arrAddOnIPTVSingle"
})
public class ArrayOfArrAddOnIPTVSingle {

    @XmlElement(nillable = true)
    protected List<ArrAddOnIPTVSingle> arrAddOnIPTVSingle;

    /**
     * Gets the value of the arrAddOnIPTVSingle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrAddOnIPTVSingle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrAddOnIPTVSingle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrAddOnIPTVSingle }
     * 
     * 
     */
    public List<ArrAddOnIPTVSingle> getArrAddOnIPTVSingle() {
        if (arrAddOnIPTVSingle == null) {
            arrAddOnIPTVSingle = new ArrayList<ArrAddOnIPTVSingle>();
        }
        return this.arrAddOnIPTVSingle;
    }

}
