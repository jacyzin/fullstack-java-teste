
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.rodoviario;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de rodoviarios complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="rodoviarios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rodoviarios" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/rodoviario}rodoviario" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rodoviarios", propOrder = {
    "rodoviarios"
})
public class Rodoviarios {

    protected List<Rodoviario> rodoviarios;

    /**
     * Gets the value of the rodoviarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rodoviarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRodoviarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rodoviario }
     * 
     * 
     */
    public List<Rodoviario> getRodoviarios() {
        if (rodoviarios == null) {
            rodoviarios = new ArrayList<Rodoviario>();
        }
        return this.rodoviarios;
    }

}
