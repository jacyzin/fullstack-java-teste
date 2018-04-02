
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.FuncionarioRef;


/**
 * <p>Classe Java de pesquisarFuncionarioRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pesquisarFuncionarioRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idClienteRef" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="funcionarioRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="dataInicialAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *             &lt;element name="dataFinalAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *             &lt;element name="registroInicial">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                   &lt;minInclusive value="1"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="quantidadeRegistros" minOccurs="0">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                   &lt;maxInclusive value="100"/>
 *                   &lt;minInclusive value="1"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisarFuncionarioRequest", propOrder = {
    "idClienteRef",
    "funcionarioRef",
    "dataInicialAtualizacao",
    "dataFinalAtualizacao",
    "registroInicial",
    "quantidadeRegistros"
})
public class PesquisarFuncionarioRequest {

    protected Integer idClienteRef;
    protected FuncionarioRef funcionarioRef;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicialAtualizacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFinalAtualizacao;
    protected Integer registroInicial;
    @XmlElement(defaultValue = "50")
    protected Integer quantidadeRegistros;

    /**
     * Obt�m o valor da propriedade idClienteRef.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdClienteRef() {
        return idClienteRef;
    }

    /**
     * Define o valor da propriedade idClienteRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdClienteRef(Integer value) {
        this.idClienteRef = value;
    }

    /**
     * Obt�m o valor da propriedade funcionarioRef.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getFuncionarioRef() {
        return funcionarioRef;
    }

    /**
     * Define o valor da propriedade funcionarioRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setFuncionarioRef(FuncionarioRef value) {
        this.funcionarioRef = value;
    }

    /**
     * Obt�m o valor da propriedade dataInicialAtualizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicialAtualizacao() {
        return dataInicialAtualizacao;
    }

    /**
     * Define o valor da propriedade dataInicialAtualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicialAtualizacao(XMLGregorianCalendar value) {
        this.dataInicialAtualizacao = value;
    }

    /**
     * Obt�m o valor da propriedade dataFinalAtualizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFinalAtualizacao() {
        return dataFinalAtualizacao;
    }

    /**
     * Define o valor da propriedade dataFinalAtualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFinalAtualizacao(XMLGregorianCalendar value) {
        this.dataFinalAtualizacao = value;
    }

    /**
     * Obt�m o valor da propriedade registroInicial.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegistroInicial() {
        return registroInicial;
    }

    /**
     * Define o valor da propriedade registroInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegistroInicial(Integer value) {
        this.registroInicial = value;
    }

    /**
     * Obt�m o valor da propriedade quantidadeRegistros.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadeRegistros() {
        return quantidadeRegistros;
    }

    /**
     * Define o valor da propriedade quantidadeRegistros.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadeRegistros(Integer value) {
        this.quantidadeRegistros = value;
    }

}
