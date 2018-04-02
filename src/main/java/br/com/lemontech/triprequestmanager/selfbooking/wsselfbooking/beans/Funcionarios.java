
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de funcionarios complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="funcionarios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="funcionario" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionario" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funcionarios", propOrder = {
    "funcionario"
})
public class Funcionarios {

    @XmlElement(nillable = true)
    protected List<Funcionario> funcionario;

    /**
     * Gets the value of the funcionario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the funcionario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuncionario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Funcionario }
     * 
     * 
     */
    public List<Funcionario> getFuncionario() {
        if (funcionario == null) {
            funcionario = new ArrayList<Funcionario>();
        }
        return this.funcionario;
    }

}
