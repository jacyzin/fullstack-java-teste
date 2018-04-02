
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.aereo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types.Classe;


/**
 * <p>Classe Java de aereoTarifa complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="aereoTarifa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acordo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classe" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}classe" minOccurs="0"/>
 *         &lt;element name="aereoTarifaPax" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}aereoTarifaPax" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="familiaTarifaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bagagem" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aereoTarifa", propOrder = {
    "acordo",
    "classe",
    "aereoTarifaPax",
    "familiaTarifaria",
    "bagagem"
})
public class AereoTarifa {

    protected String acordo;
    @XmlSchemaType(name = "string")
    protected Classe classe;
    @XmlElement(nillable = true)
    protected List<AereoTarifaPax> aereoTarifaPax;
    protected String familiaTarifaria;
    protected boolean bagagem;

    /**
     * Obt�m o valor da propriedade acordo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcordo() {
        return acordo;
    }

    /**
     * Define o valor da propriedade acordo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcordo(String value) {
        this.acordo = value;
    }

    /**
     * Obt�m o valor da propriedade classe.
     * 
     * @return
     *     possible object is
     *     {@link Classe }
     *     
     */
    public Classe getClasse() {
        return classe;
    }

    /**
     * Define o valor da propriedade classe.
     * 
     * @param value
     *     allowed object is
     *     {@link Classe }
     *     
     */
    public void setClasse(Classe value) {
        this.classe = value;
    }

    /**
     * Gets the value of the aereoTarifaPax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aereoTarifaPax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAereoTarifaPax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AereoTarifaPax }
     * 
     * 
     */
    public List<AereoTarifaPax> getAereoTarifaPax() {
        if (aereoTarifaPax == null) {
            aereoTarifaPax = new ArrayList<AereoTarifaPax>();
        }
        return this.aereoTarifaPax;
    }

    /**
     * Obt�m o valor da propriedade familiaTarifaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamiliaTarifaria() {
        return familiaTarifaria;
    }

    /**
     * Define o valor da propriedade familiaTarifaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamiliaTarifaria(String value) {
        this.familiaTarifaria = value;
    }

    /**
     * Obt�m o valor da propriedade bagagem.
     * 
     */
    public boolean isBagagem() {
        return bagagem;
    }

    /**
     * Define o valor da propriedade bagagem.
     * 
     */
    public void setBagagem(boolean value) {
        this.bagagem = value;
    }

}
