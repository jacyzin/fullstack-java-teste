
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.rodoviario;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types.ClasseRodoviario;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types.Consolidadora;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types.FormaPagamento;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types.IdentificadoresIntegracao;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types.LocalAssentoRodoviario;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types.PreferenciaAssentoRodoviario;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types.Remarks;


/**
 * <p>Classe Java de rodoviario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="rodoviario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dataSaida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataChegada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="terminalRodoviarioOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalRodoviarioDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empresaViacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classe" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}classeRodoviario" minOccurs="0"/>
 *         &lt;element name="preferenciaAssento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}preferenciaAssentoRodoviario" minOccurs="0"/>
 *         &lt;element name="localAssento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}localAssentoRodoviario" minOccurs="0"/>
 *         &lt;element name="localizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorTarifa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valorTaxa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valorSeguro" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalRodoviario" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="codigoEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoReservador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeReservador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataReserva" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="obsEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maiorTarifa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="menorTarifa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="formaPagamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}formaPagamento" minOccurs="0"/>
 *         &lt;element name="idPassageiroRef" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="justificativaMaiorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusCancelamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taxaCancelamento" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="dataModificacaoStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="usuarioModificouStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigoJustificativaMaiorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificadorIntegracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificadorBackOfficeTipoProduto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autorizacaoCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}remarks" minOccurs="0"/>
 *         &lt;element name="cancelado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="identificadoresIntegracao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}identificadoresIntegracao" minOccurs="0"/>
 *         &lt;element name="taxaFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consolidadora" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}consolidadora" minOccurs="0"/>
 *         &lt;element name="moeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pontoVenda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}pontoVendaOrcamento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rodoviario", propOrder = {
    "id",
    "dataSaida",
    "dataChegada",
    "terminalRodoviarioOrigem",
    "terminalRodoviarioDestino",
    "empresaViacao",
    "assento",
    "classe",
    "preferenciaAssento",
    "localAssento",
    "localizador",
    "valorTarifa",
    "valorTaxa",
    "valorSeguro",
    "totalRodoviario",
    "codigoEmissor",
    "nomeEmissor",
    "codigoReservador",
    "nomeReservador",
    "dataReserva",
    "obsEmissor",
    "maiorTarifa",
    "menorTarifa",
    "formaPagamento",
    "idPassageiroRef",
    "justificativaMaiorTarifa",
    "statusCancelamento",
    "taxaCancelamento",
    "dataModificacaoStatusCancelamento",
    "usuarioModificouStatusCancelamento",
    "codigoJustificativaMaiorTarifa",
    "identificadorIntegracao",
    "identificador",
    "categoria",
    "identificadorBackOfficeTipoProduto",
    "autorizacaoCartao",
    "remarks",
    "cancelado",
    "identificadoresIntegracao",
    "taxaFee",
    "consolidadora",
    "moeda",
    "pontoVenda"
})
public class Rodoviario {

    protected int id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataSaida;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataChegada;
    protected String terminalRodoviarioOrigem;
    protected String terminalRodoviarioDestino;
    protected String empresaViacao;
    protected String assento;
    @XmlSchemaType(name = "string")
    protected ClasseRodoviario classe;
    @XmlSchemaType(name = "string")
    protected PreferenciaAssentoRodoviario preferenciaAssento;
    @XmlSchemaType(name = "string")
    protected LocalAssentoRodoviario localAssento;
    protected String localizador;
    protected Double valorTarifa;
    protected Double valorTaxa;
    protected Double valorSeguro;
    protected Double totalRodoviario;
    protected String codigoEmissor;
    protected String nomeEmissor;
    protected String codigoReservador;
    protected String nomeReservador;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataReserva;
    protected String obsEmissor;
    protected Double maiorTarifa;
    protected Double menorTarifa;
    protected FormaPagamento formaPagamento;
    @XmlElement(nillable = true)
    protected List<Integer> idPassageiroRef;
    protected String justificativaMaiorTarifa;
    protected Integer statusCancelamento;
    protected Double taxaCancelamento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataModificacaoStatusCancelamento;
    protected Integer usuarioModificouStatusCancelamento;
    protected String codigoJustificativaMaiorTarifa;
    protected String identificadorIntegracao;
    protected String identificador;
    protected String categoria;
    protected String identificadorBackOfficeTipoProduto;
    protected String autorizacaoCartao;
    protected Remarks remarks;
    protected boolean cancelado;
    protected IdentificadoresIntegracao identificadoresIntegracao;
    protected Double taxaFee;
    protected Consolidadora consolidadora;
    protected String moeda;
    protected PontoVendaOrcamento pontoVenda;

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
     * Obt�m o valor da propriedade dataSaida.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSaida() {
        return dataSaida;
    }

    /**
     * Define o valor da propriedade dataSaida.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSaida(XMLGregorianCalendar value) {
        this.dataSaida = value;
    }

    /**
     * Obt�m o valor da propriedade dataChegada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataChegada() {
        return dataChegada;
    }

    /**
     * Define o valor da propriedade dataChegada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataChegada(XMLGregorianCalendar value) {
        this.dataChegada = value;
    }

    /**
     * Obt�m o valor da propriedade terminalRodoviarioOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalRodoviarioOrigem() {
        return terminalRodoviarioOrigem;
    }

    /**
     * Define o valor da propriedade terminalRodoviarioOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalRodoviarioOrigem(String value) {
        this.terminalRodoviarioOrigem = value;
    }

    /**
     * Obt�m o valor da propriedade terminalRodoviarioDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalRodoviarioDestino() {
        return terminalRodoviarioDestino;
    }

    /**
     * Define o valor da propriedade terminalRodoviarioDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalRodoviarioDestino(String value) {
        this.terminalRodoviarioDestino = value;
    }

    /**
     * Obt�m o valor da propriedade empresaViacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresaViacao() {
        return empresaViacao;
    }

    /**
     * Define o valor da propriedade empresaViacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresaViacao(String value) {
        this.empresaViacao = value;
    }

    /**
     * Obt�m o valor da propriedade assento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssento() {
        return assento;
    }

    /**
     * Define o valor da propriedade assento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssento(String value) {
        this.assento = value;
    }

    /**
     * Obt�m o valor da propriedade classe.
     * 
     * @return
     *     possible object is
     *     {@link ClasseRodoviario }
     *     
     */
    public ClasseRodoviario getClasse() {
        return classe;
    }

    /**
     * Define o valor da propriedade classe.
     * 
     * @param value
     *     allowed object is
     *     {@link ClasseRodoviario }
     *     
     */
    public void setClasse(ClasseRodoviario value) {
        this.classe = value;
    }

    /**
     * Obt�m o valor da propriedade preferenciaAssento.
     * 
     * @return
     *     possible object is
     *     {@link PreferenciaAssentoRodoviario }
     *     
     */
    public PreferenciaAssentoRodoviario getPreferenciaAssento() {
        return preferenciaAssento;
    }

    /**
     * Define o valor da propriedade preferenciaAssento.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferenciaAssentoRodoviario }
     *     
     */
    public void setPreferenciaAssento(PreferenciaAssentoRodoviario value) {
        this.preferenciaAssento = value;
    }

    /**
     * Obt�m o valor da propriedade localAssento.
     * 
     * @return
     *     possible object is
     *     {@link LocalAssentoRodoviario }
     *     
     */
    public LocalAssentoRodoviario getLocalAssento() {
        return localAssento;
    }

    /**
     * Define o valor da propriedade localAssento.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalAssentoRodoviario }
     *     
     */
    public void setLocalAssento(LocalAssentoRodoviario value) {
        this.localAssento = value;
    }

    /**
     * Obt�m o valor da propriedade localizador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizador() {
        return localizador;
    }

    /**
     * Define o valor da propriedade localizador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizador(String value) {
        this.localizador = value;
    }

    /**
     * Obt�m o valor da propriedade valorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorTarifa() {
        return valorTarifa;
    }

    /**
     * Define o valor da propriedade valorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorTarifa(Double value) {
        this.valorTarifa = value;
    }

    /**
     * Obt�m o valor da propriedade valorTaxa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorTaxa() {
        return valorTaxa;
    }

    /**
     * Define o valor da propriedade valorTaxa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorTaxa(Double value) {
        this.valorTaxa = value;
    }

    /**
     * Obt�m o valor da propriedade valorSeguro.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorSeguro() {
        return valorSeguro;
    }

    /**
     * Define o valor da propriedade valorSeguro.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorSeguro(Double value) {
        this.valorSeguro = value;
    }

    /**
     * Obt�m o valor da propriedade totalRodoviario.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalRodoviario() {
        return totalRodoviario;
    }

    /**
     * Define o valor da propriedade totalRodoviario.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalRodoviario(Double value) {
        this.totalRodoviario = value;
    }

    /**
     * Obt�m o valor da propriedade codigoEmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEmissor() {
        return codigoEmissor;
    }

    /**
     * Define o valor da propriedade codigoEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEmissor(String value) {
        this.codigoEmissor = value;
    }

    /**
     * Obt�m o valor da propriedade nomeEmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEmissor() {
        return nomeEmissor;
    }

    /**
     * Define o valor da propriedade nomeEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEmissor(String value) {
        this.nomeEmissor = value;
    }

    /**
     * Obt�m o valor da propriedade codigoReservador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoReservador() {
        return codigoReservador;
    }

    /**
     * Define o valor da propriedade codigoReservador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoReservador(String value) {
        this.codigoReservador = value;
    }

    /**
     * Obt�m o valor da propriedade nomeReservador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeReservador() {
        return nomeReservador;
    }

    /**
     * Define o valor da propriedade nomeReservador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeReservador(String value) {
        this.nomeReservador = value;
    }

    /**
     * Obt�m o valor da propriedade dataReserva.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataReserva() {
        return dataReserva;
    }

    /**
     * Define o valor da propriedade dataReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataReserva(XMLGregorianCalendar value) {
        this.dataReserva = value;
    }

    /**
     * Obt�m o valor da propriedade obsEmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsEmissor() {
        return obsEmissor;
    }

    /**
     * Define o valor da propriedade obsEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsEmissor(String value) {
        this.obsEmissor = value;
    }

    /**
     * Obt�m o valor da propriedade maiorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaiorTarifa() {
        return maiorTarifa;
    }

    /**
     * Define o valor da propriedade maiorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaiorTarifa(Double value) {
        this.maiorTarifa = value;
    }

    /**
     * Obt�m o valor da propriedade menorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMenorTarifa() {
        return menorTarifa;
    }

    /**
     * Define o valor da propriedade menorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMenorTarifa(Double value) {
        this.menorTarifa = value;
    }

    /**
     * Obt�m o valor da propriedade formaPagamento.
     * 
     * @return
     *     possible object is
     *     {@link FormaPagamento }
     *     
     */
    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * Define o valor da propriedade formaPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link FormaPagamento }
     *     
     */
    public void setFormaPagamento(FormaPagamento value) {
        this.formaPagamento = value;
    }

    /**
     * Gets the value of the idPassageiroRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idPassageiroRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdPassageiroRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIdPassageiroRef() {
        if (idPassageiroRef == null) {
            idPassageiroRef = new ArrayList<Integer>();
        }
        return this.idPassageiroRef;
    }

    /**
     * Obt�m o valor da propriedade justificativaMaiorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaMaiorTarifa() {
        return justificativaMaiorTarifa;
    }

    /**
     * Define o valor da propriedade justificativaMaiorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaMaiorTarifa(String value) {
        this.justificativaMaiorTarifa = value;
    }

    /**
     * Obt�m o valor da propriedade statusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusCancelamento() {
        return statusCancelamento;
    }

    /**
     * Define o valor da propriedade statusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusCancelamento(Integer value) {
        this.statusCancelamento = value;
    }

    /**
     * Obt�m o valor da propriedade taxaCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxaCancelamento() {
        return taxaCancelamento;
    }

    /**
     * Define o valor da propriedade taxaCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxaCancelamento(Double value) {
        this.taxaCancelamento = value;
    }

    /**
     * Obt�m o valor da propriedade dataModificacaoStatusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataModificacaoStatusCancelamento() {
        return dataModificacaoStatusCancelamento;
    }

    /**
     * Define o valor da propriedade dataModificacaoStatusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataModificacaoStatusCancelamento(XMLGregorianCalendar value) {
        this.dataModificacaoStatusCancelamento = value;
    }

    /**
     * Obt�m o valor da propriedade usuarioModificouStatusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsuarioModificouStatusCancelamento() {
        return usuarioModificouStatusCancelamento;
    }

    /**
     * Define o valor da propriedade usuarioModificouStatusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsuarioModificouStatusCancelamento(Integer value) {
        this.usuarioModificouStatusCancelamento = value;
    }

    /**
     * Obt�m o valor da propriedade codigoJustificativaMaiorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoJustificativaMaiorTarifa() {
        return codigoJustificativaMaiorTarifa;
    }

    /**
     * Define o valor da propriedade codigoJustificativaMaiorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoJustificativaMaiorTarifa(String value) {
        this.codigoJustificativaMaiorTarifa = value;
    }

    /**
     * Obt�m o valor da propriedade identificadorIntegracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorIntegracao() {
        return identificadorIntegracao;
    }

    /**
     * Define o valor da propriedade identificadorIntegracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorIntegracao(String value) {
        this.identificadorIntegracao = value;
    }

    /**
     * Obt�m o valor da propriedade identificador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Define o valor da propriedade identificador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificador(String value) {
        this.identificador = value;
    }

    /**
     * Obt�m o valor da propriedade categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define o valor da propriedade categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obt�m o valor da propriedade identificadorBackOfficeTipoProduto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackOfficeTipoProduto() {
        return identificadorBackOfficeTipoProduto;
    }

    /**
     * Define o valor da propriedade identificadorBackOfficeTipoProduto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackOfficeTipoProduto(String value) {
        this.identificadorBackOfficeTipoProduto = value;
    }

    /**
     * Obt�m o valor da propriedade autorizacaoCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorizacaoCartao() {
        return autorizacaoCartao;
    }

    /**
     * Define o valor da propriedade autorizacaoCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorizacaoCartao(String value) {
        this.autorizacaoCartao = value;
    }

    /**
     * Obt�m o valor da propriedade remarks.
     * 
     * @return
     *     possible object is
     *     {@link Remarks }
     *     
     */
    public Remarks getRemarks() {
        return remarks;
    }

    /**
     * Define o valor da propriedade remarks.
     * 
     * @param value
     *     allowed object is
     *     {@link Remarks }
     *     
     */
    public void setRemarks(Remarks value) {
        this.remarks = value;
    }

    /**
     * Obt�m o valor da propriedade cancelado.
     * 
     */
    public boolean isCancelado() {
        return cancelado;
    }

    /**
     * Define o valor da propriedade cancelado.
     * 
     */
    public void setCancelado(boolean value) {
        this.cancelado = value;
    }

    /**
     * Obt�m o valor da propriedade identificadoresIntegracao.
     * 
     * @return
     *     possible object is
     *     {@link IdentificadoresIntegracao }
     *     
     */
    public IdentificadoresIntegracao getIdentificadoresIntegracao() {
        return identificadoresIntegracao;
    }

    /**
     * Define o valor da propriedade identificadoresIntegracao.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificadoresIntegracao }
     *     
     */
    public void setIdentificadoresIntegracao(IdentificadoresIntegracao value) {
        this.identificadoresIntegracao = value;
    }

    /**
     * Obt�m o valor da propriedade taxaFee.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxaFee() {
        return taxaFee;
    }

    /**
     * Define o valor da propriedade taxaFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxaFee(Double value) {
        this.taxaFee = value;
    }

    /**
     * Obt�m o valor da propriedade consolidadora.
     * 
     * @return
     *     possible object is
     *     {@link Consolidadora }
     *     
     */
    public Consolidadora getConsolidadora() {
        return consolidadora;
    }

    /**
     * Define o valor da propriedade consolidadora.
     * 
     * @param value
     *     allowed object is
     *     {@link Consolidadora }
     *     
     */
    public void setConsolidadora(Consolidadora value) {
        this.consolidadora = value;
    }

    /**
     * Obt�m o valor da propriedade moeda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoeda() {
        return moeda;
    }

    /**
     * Define o valor da propriedade moeda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoeda(String value) {
        this.moeda = value;
    }

    /**
     * Obt�m o valor da propriedade pontoVenda.
     * 
     * @return
     *     possible object is
     *     {@link PontoVendaOrcamento }
     *     
     */
    public PontoVendaOrcamento getPontoVenda() {
        return pontoVenda;
    }

    /**
     * Define o valor da propriedade pontoVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link PontoVendaOrcamento }
     *     
     */
    public void setPontoVenda(PontoVendaOrcamento value) {
        this.pontoVenda = value;
    }

}
