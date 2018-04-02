
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types.TipoDeSolicitacao;


/**
 * <p>Classe Java de parametrizacaoCentroDeCustoAprovacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="parametrizacaoCentroDeCustoAprovacao">
 *   &lt;complexContent>
 *     &lt;extension base="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoAprovacaoRef">
 *       &lt;sequence>
 *         &lt;element name="vencimento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="periodoViagemFinal" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="valorAlcadaInicial" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valorAlcadaFinal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tipoDeSolicitacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoDeSolicitacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrizacaoCentroDeCustoAprovacao", propOrder = {
    "vencimento",
    "periodoViagemFinal",
    "valorAlcadaInicial",
    "valorAlcadaFinal",
    "tipoDeSolicitacao"
})
public class ParametrizacaoCentroDeCustoAprovacao
    extends ParametrizacaoCentroDeCustoAprovacaoRef
{

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vencimento;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodoViagemFinal;
    @XmlElement(defaultValue = "0")
    protected Double valorAlcadaInicial;
    @XmlElement(defaultValue = "0")
    protected Double valorAlcadaFinal;
    @XmlElement(defaultValue = "TODOS")
    @XmlSchemaType(name = "string")
    protected TipoDeSolicitacao tipoDeSolicitacao;

    /**
     * Obt�m o valor da propriedade vencimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVencimento() {
        return vencimento;
    }

    /**
     * Define o valor da propriedade vencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVencimento(XMLGregorianCalendar value) {
        this.vencimento = value;
    }

    /**
     * Obt�m o valor da propriedade periodoViagemFinal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodoViagemFinal() {
        return periodoViagemFinal;
    }

    /**
     * Define o valor da propriedade periodoViagemFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodoViagemFinal(XMLGregorianCalendar value) {
        this.periodoViagemFinal = value;
    }

    /**
     * Obt�m o valor da propriedade valorAlcadaInicial.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorAlcadaInicial() {
        return valorAlcadaInicial;
    }

    /**
     * Define o valor da propriedade valorAlcadaInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorAlcadaInicial(Double value) {
        this.valorAlcadaInicial = value;
    }

    /**
     * Obt�m o valor da propriedade valorAlcadaFinal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorAlcadaFinal() {
        return valorAlcadaFinal;
    }

    /**
     * Define o valor da propriedade valorAlcadaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorAlcadaFinal(Double value) {
        this.valorAlcadaFinal = value;
    }

    /**
     * Obt�m o valor da propriedade tipoDeSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link TipoDeSolicitacao }
     *     
     */
    public TipoDeSolicitacao getTipoDeSolicitacao() {
        return tipoDeSolicitacao;
    }

    /**
     * Define o valor da propriedade tipoDeSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDeSolicitacao }
     *     
     */
    public void setTipoDeSolicitacao(TipoDeSolicitacao value) {
        this.tipoDeSolicitacao = value;
    }

}
