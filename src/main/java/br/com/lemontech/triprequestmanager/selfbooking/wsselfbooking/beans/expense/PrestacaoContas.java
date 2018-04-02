
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.expense;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types.PresacaoContasStatus;


/**
 * <p>Classe Java de prestacaoContas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="prestacaoContas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matriculaAutorizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeAutorizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}presacaoContasStatus" minOccurs="0"/>
 *         &lt;element name="observacaoFinanceiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="justificativaReprovacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reembolso" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="itens" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}prestacaoContaItens" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prestacaoContas", propOrder = {
    "id",
    "matriculaAutorizador",
    "nomeAutorizador",
    "status",
    "observacaoFinanceiro",
    "justificativaReprovacao",
    "reembolso",
    "itens"
})
public class PrestacaoContas {

    protected int id;
    protected String matriculaAutorizador;
    protected String nomeAutorizador;
    @XmlSchemaType(name = "string")
    protected PresacaoContasStatus status;
    protected String observacaoFinanceiro;
    protected String justificativaReprovacao;
    protected Boolean reembolso;
    protected PrestacaoContaItens itens;

    /**
     * Obt�m o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obt�m o valor da propriedade matriculaAutorizador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculaAutorizador() {
        return matriculaAutorizador;
    }

    /**
     * Define o valor da propriedade matriculaAutorizador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculaAutorizador(String value) {
        this.matriculaAutorizador = value;
    }

    /**
     * Obt�m o valor da propriedade nomeAutorizador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAutorizador() {
        return nomeAutorizador;
    }

    /**
     * Define o valor da propriedade nomeAutorizador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAutorizador(String value) {
        this.nomeAutorizador = value;
    }

    /**
     * Obt�m o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link PresacaoContasStatus }
     *     
     */
    public PresacaoContasStatus getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link PresacaoContasStatus }
     *     
     */
    public void setStatus(PresacaoContasStatus value) {
        this.status = value;
    }

    /**
     * Obt�m o valor da propriedade observacaoFinanceiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacaoFinanceiro() {
        return observacaoFinanceiro;
    }

    /**
     * Define o valor da propriedade observacaoFinanceiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacaoFinanceiro(String value) {
        this.observacaoFinanceiro = value;
    }

    /**
     * Obt�m o valor da propriedade justificativaReprovacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaReprovacao() {
        return justificativaReprovacao;
    }

    /**
     * Define o valor da propriedade justificativaReprovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaReprovacao(String value) {
        this.justificativaReprovacao = value;
    }

    /**
     * Obt�m o valor da propriedade reembolso.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReembolso() {
        return reembolso;
    }

    /**
     * Define o valor da propriedade reembolso.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReembolso(Boolean value) {
        this.reembolso = value;
    }

    /**
     * Obt�m o valor da propriedade itens.
     * 
     * @return
     *     possible object is
     *     {@link PrestacaoContaItens }
     *     
     */
    public PrestacaoContaItens getItens() {
        return itens;
    }

    /**
     * Define o valor da propriedade itens.
     * 
     * @param value
     *     allowed object is
     *     {@link PrestacaoContaItens }
     *     
     */
    public void setItens(PrestacaoContaItens value) {
        this.itens = value;
    }

}
