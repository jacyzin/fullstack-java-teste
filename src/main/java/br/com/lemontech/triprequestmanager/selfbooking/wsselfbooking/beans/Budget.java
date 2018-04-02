
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types.ModalidadeLancamentoBudget;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types.TipoOperacaoBudget;


/**
 * <p>Classe Java de budget complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="budget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="regionalRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}regionalRef"/>
 *           &lt;element name="centroDeCustoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}centroDeCustoRef"/>
 *           &lt;element name="subCentroDeCustoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}subCentroDeCustoRef"/>
 *           &lt;element name="projetoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}projetoRef"/>
 *         &lt;/choice>
 *         &lt;element name="modalidadeLancamentoBudget" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}modalidadeLancamentoBudget"/>
 *         &lt;element name="tipoOperacaoBudget" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoOperacaoBudget"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "budget", propOrder = {
    "regionalRef",
    "centroDeCustoRef",
    "subCentroDeCustoRef",
    "projetoRef",
    "modalidadeLancamentoBudget",
    "tipoOperacaoBudget",
    "valor"
})
public class Budget {

    protected RegionalRef regionalRef;
    protected CentroDeCustoRef centroDeCustoRef;
    protected SubCentroDeCustoRef subCentroDeCustoRef;
    protected ProjetoRef projetoRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ModalidadeLancamentoBudget modalidadeLancamentoBudget;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoOperacaoBudget tipoOperacaoBudget;
    protected double valor;

    /**
     * Obt�m o valor da propriedade regionalRef.
     * 
     * @return
     *     possible object is
     *     {@link RegionalRef }
     *     
     */
    public RegionalRef getRegionalRef() {
        return regionalRef;
    }

    /**
     * Define o valor da propriedade regionalRef.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalRef }
     *     
     */
    public void setRegionalRef(RegionalRef value) {
        this.regionalRef = value;
    }

    /**
     * Obt�m o valor da propriedade centroDeCustoRef.
     * 
     * @return
     *     possible object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public CentroDeCustoRef getCentroDeCustoRef() {
        return centroDeCustoRef;
    }

    /**
     * Define o valor da propriedade centroDeCustoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public void setCentroDeCustoRef(CentroDeCustoRef value) {
        this.centroDeCustoRef = value;
    }

    /**
     * Obt�m o valor da propriedade subCentroDeCustoRef.
     * 
     * @return
     *     possible object is
     *     {@link SubCentroDeCustoRef }
     *     
     */
    public SubCentroDeCustoRef getSubCentroDeCustoRef() {
        return subCentroDeCustoRef;
    }

    /**
     * Define o valor da propriedade subCentroDeCustoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SubCentroDeCustoRef }
     *     
     */
    public void setSubCentroDeCustoRef(SubCentroDeCustoRef value) {
        this.subCentroDeCustoRef = value;
    }

    /**
     * Obt�m o valor da propriedade projetoRef.
     * 
     * @return
     *     possible object is
     *     {@link ProjetoRef }
     *     
     */
    public ProjetoRef getProjetoRef() {
        return projetoRef;
    }

    /**
     * Define o valor da propriedade projetoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjetoRef }
     *     
     */
    public void setProjetoRef(ProjetoRef value) {
        this.projetoRef = value;
    }

    /**
     * Obt�m o valor da propriedade modalidadeLancamentoBudget.
     * 
     * @return
     *     possible object is
     *     {@link ModalidadeLancamentoBudget }
     *     
     */
    public ModalidadeLancamentoBudget getModalidadeLancamentoBudget() {
        return modalidadeLancamentoBudget;
    }

    /**
     * Define o valor da propriedade modalidadeLancamentoBudget.
     * 
     * @param value
     *     allowed object is
     *     {@link ModalidadeLancamentoBudget }
     *     
     */
    public void setModalidadeLancamentoBudget(ModalidadeLancamentoBudget value) {
        this.modalidadeLancamentoBudget = value;
    }

    /**
     * Obt�m o valor da propriedade tipoOperacaoBudget.
     * 
     * @return
     *     possible object is
     *     {@link TipoOperacaoBudget }
     *     
     */
    public TipoOperacaoBudget getTipoOperacaoBudget() {
        return tipoOperacaoBudget;
    }

    /**
     * Define o valor da propriedade tipoOperacaoBudget.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOperacaoBudget }
     *     
     */
    public void setTipoOperacaoBudget(TipoOperacaoBudget value) {
        this.tipoOperacaoBudget = value;
    }

    /**
     * Obt�m o valor da propriedade valor.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

}
