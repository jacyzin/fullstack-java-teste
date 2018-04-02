
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.expense;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types.AdiantamentoStatus;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types.TipoCredito;


/**
 * <p>Classe Java de adiantamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="adiantamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matriculaAutorizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeAutorizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tipoCredito" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoCredito" minOccurs="0"/>
 *         &lt;element name="numeroAutorizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacaoSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacaoFinanceiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}adiantamentoStatus" minOccurs="0"/>
 *         &lt;element name="dataLiberacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="matriculaCancelador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeCancelador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCancelamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="itens" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}adiantamentoItens" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adiantamento", propOrder = {
    "id",
    "matriculaAutorizador",
    "nomeAutorizador",
    "dataInicial",
    "dataFinal",
    "tipoCredito",
    "numeroAutorizacao",
    "observacaoSolicitante",
    "observacaoFinanceiro",
    "status",
    "dataLiberacao",
    "matriculaCancelador",
    "nomeCancelador",
    "dataCancelamento",
    "itens"
})
public class Adiantamento {

    protected int id;
    protected String matriculaAutorizador;
    protected String nomeAutorizador;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicial;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFinal;
    @XmlSchemaType(name = "string")
    protected TipoCredito tipoCredito;
    protected String numeroAutorizacao;
    protected String observacaoSolicitante;
    protected String observacaoFinanceiro;
    @XmlSchemaType(name = "string")
    protected AdiantamentoStatus status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataLiberacao;
    protected String matriculaCancelador;
    protected String nomeCancelador;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCancelamento;
    protected AdiantamentoItens itens;

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
     * Obt�m o valor da propriedade dataInicial.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicial() {
        return dataInicial;
    }

    /**
     * Define o valor da propriedade dataInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicial(XMLGregorianCalendar value) {
        this.dataInicial = value;
    }

    /**
     * Obt�m o valor da propriedade dataFinal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFinal() {
        return dataFinal;
    }

    /**
     * Define o valor da propriedade dataFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFinal(XMLGregorianCalendar value) {
        this.dataFinal = value;
    }

    /**
     * Obt�m o valor da propriedade tipoCredito.
     * 
     * @return
     *     possible object is
     *     {@link TipoCredito }
     *     
     */
    public TipoCredito getTipoCredito() {
        return tipoCredito;
    }

    /**
     * Define o valor da propriedade tipoCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCredito }
     *     
     */
    public void setTipoCredito(TipoCredito value) {
        this.tipoCredito = value;
    }

    /**
     * Obt�m o valor da propriedade numeroAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAutorizacao() {
        return numeroAutorizacao;
    }

    /**
     * Define o valor da propriedade numeroAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAutorizacao(String value) {
        this.numeroAutorizacao = value;
    }

    /**
     * Obt�m o valor da propriedade observacaoSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacaoSolicitante() {
        return observacaoSolicitante;
    }

    /**
     * Define o valor da propriedade observacaoSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacaoSolicitante(String value) {
        this.observacaoSolicitante = value;
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
     * Obt�m o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link AdiantamentoStatus }
     *     
     */
    public AdiantamentoStatus getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link AdiantamentoStatus }
     *     
     */
    public void setStatus(AdiantamentoStatus value) {
        this.status = value;
    }

    /**
     * Obt�m o valor da propriedade dataLiberacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataLiberacao() {
        return dataLiberacao;
    }

    /**
     * Define o valor da propriedade dataLiberacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataLiberacao(XMLGregorianCalendar value) {
        this.dataLiberacao = value;
    }

    /**
     * Obt�m o valor da propriedade matriculaCancelador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculaCancelador() {
        return matriculaCancelador;
    }

    /**
     * Define o valor da propriedade matriculaCancelador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculaCancelador(String value) {
        this.matriculaCancelador = value;
    }

    /**
     * Obt�m o valor da propriedade nomeCancelador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCancelador() {
        return nomeCancelador;
    }

    /**
     * Define o valor da propriedade nomeCancelador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCancelador(String value) {
        this.nomeCancelador = value;
    }

    /**
     * Obt�m o valor da propriedade dataCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCancelamento() {
        return dataCancelamento;
    }

    /**
     * Define o valor da propriedade dataCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCancelamento(XMLGregorianCalendar value) {
        this.dataCancelamento = value;
    }

    /**
     * Obt�m o valor da propriedade itens.
     * 
     * @return
     *     possible object is
     *     {@link AdiantamentoItens }
     *     
     */
    public AdiantamentoItens getItens() {
        return itens;
    }

    /**
     * Define o valor da propriedade itens.
     * 
     * @param value
     *     allowed object is
     *     {@link AdiantamentoItens }
     *     
     */
    public void setItens(AdiantamentoItens value) {
        this.itens = value;
    }

}
