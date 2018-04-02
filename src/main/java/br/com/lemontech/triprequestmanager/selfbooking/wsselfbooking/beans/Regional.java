
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de regional complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="regional">
 *   &lt;complexContent>
 *     &lt;extension base="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}regionalRef">
 *       &lt;sequence>
 *         &lt;element name="descricao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100"/>
 *         &lt;element name="pcc" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice" minOccurs="0"/>
 *         &lt;element name="identificadorBackofficeCliente" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice" minOccurs="0"/>
 *         &lt;element name="identificadorBackofficeFranquia" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice" minOccurs="0"/>
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="taxaFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="corporateIdGol" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}corporateIdGol" minOccurs="0"/>
 *         &lt;element name="numeroDk" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroDkTreinamento" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroDkEvento" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="emitirNotaFiscalEmNomeDoHospede" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="emitirNotaFiscalEmNomeDaRegional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regional", propOrder = {
    "descricao",
    "pcc",
    "identificadorBackofficeCliente",
    "identificadorBackofficeFranquia",
    "ativo",
    "taxaFee",
    "corporateIdGol",
    "numeroDk",
    "numeroDkTreinamento",
    "numeroDkEvento",
    "emitirNotaFiscalEmNomeDoHospede",
    "emitirNotaFiscalEmNomeDaRegional"
})
public class Regional
    extends RegionalRef
{

    @XmlElement(required = true)
    protected String descricao;
    protected String pcc;
    protected String identificadorBackofficeCliente;
    protected String identificadorBackofficeFranquia;
    protected boolean ativo;
    protected Double taxaFee;
    protected String corporateIdGol;
    protected String numeroDk;
    protected String numeroDkTreinamento;
    protected String numeroDkEvento;
    protected boolean emitirNotaFiscalEmNomeDoHospede;
    protected boolean emitirNotaFiscalEmNomeDaRegional;

    /**
     * Obt�m o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obt�m o valor da propriedade pcc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcc() {
        return pcc;
    }

    /**
     * Define o valor da propriedade pcc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcc(String value) {
        this.pcc = value;
    }

    /**
     * Obt�m o valor da propriedade identificadorBackofficeCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackofficeCliente() {
        return identificadorBackofficeCliente;
    }

    /**
     * Define o valor da propriedade identificadorBackofficeCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackofficeCliente(String value) {
        this.identificadorBackofficeCliente = value;
    }

    /**
     * Obt�m o valor da propriedade identificadorBackofficeFranquia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackofficeFranquia() {
        return identificadorBackofficeFranquia;
    }

    /**
     * Define o valor da propriedade identificadorBackofficeFranquia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackofficeFranquia(String value) {
        this.identificadorBackofficeFranquia = value;
    }

    /**
     * Obt�m o valor da propriedade ativo.
     * 
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Define o valor da propriedade ativo.
     * 
     */
    public void setAtivo(boolean value) {
        this.ativo = value;
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
     * Obt�m o valor da propriedade corporateIdGol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateIdGol() {
        return corporateIdGol;
    }

    /**
     * Define o valor da propriedade corporateIdGol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateIdGol(String value) {
        this.corporateIdGol = value;
    }

    /**
     * Obt�m o valor da propriedade numeroDk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDk() {
        return numeroDk;
    }

    /**
     * Define o valor da propriedade numeroDk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDk(String value) {
        this.numeroDk = value;
    }

    /**
     * Obt�m o valor da propriedade numeroDkTreinamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDkTreinamento() {
        return numeroDkTreinamento;
    }

    /**
     * Define o valor da propriedade numeroDkTreinamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDkTreinamento(String value) {
        this.numeroDkTreinamento = value;
    }

    /**
     * Obt�m o valor da propriedade numeroDkEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDkEvento() {
        return numeroDkEvento;
    }

    /**
     * Define o valor da propriedade numeroDkEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDkEvento(String value) {
        this.numeroDkEvento = value;
    }

    /**
     * Obt�m o valor da propriedade emitirNotaFiscalEmNomeDoHospede.
     * 
     */
    public boolean isEmitirNotaFiscalEmNomeDoHospede() {
        return emitirNotaFiscalEmNomeDoHospede;
    }

    /**
     * Define o valor da propriedade emitirNotaFiscalEmNomeDoHospede.
     * 
     */
    public void setEmitirNotaFiscalEmNomeDoHospede(boolean value) {
        this.emitirNotaFiscalEmNomeDoHospede = value;
    }

    /**
     * Obt�m o valor da propriedade emitirNotaFiscalEmNomeDaRegional.
     * 
     */
    public boolean isEmitirNotaFiscalEmNomeDaRegional() {
        return emitirNotaFiscalEmNomeDaRegional;
    }

    /**
     * Define o valor da propriedade emitirNotaFiscalEmNomeDaRegional.
     * 
     */
    public void setEmitirNotaFiscalEmNomeDaRegional(boolean value) {
        this.emitirNotaFiscalEmNomeDaRegional = value;
    }

}
