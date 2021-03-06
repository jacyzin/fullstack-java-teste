
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de centroDeCusto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="centroDeCusto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}centroDeCustoRef">
 *       &lt;sequence>
 *         &lt;element name="descricao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100"/>
 *         &lt;element name="configuracao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}configuracaoCentroDeCusto"/>
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "centroDeCusto", propOrder = {
    "descricao",
    "configuracao",
    "ativo"
})
public class CentroDeCusto
    extends CentroDeCustoRef
{

    @XmlElement(required = true)
    protected String descricao;
    @XmlElement(required = true)
    protected ConfiguracaoCentroDeCusto configuracao;
    protected boolean ativo;

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
     * Obt�m o valor da propriedade configuracao.
     * 
     * @return
     *     possible object is
     *     {@link ConfiguracaoCentroDeCusto }
     *     
     */
    public ConfiguracaoCentroDeCusto getConfiguracao() {
        return configuracao;
    }

    /**
     * Define o valor da propriedade configuracao.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfiguracaoCentroDeCusto }
     *     
     */
    public void setConfiguracao(ConfiguracaoCentroDeCusto value) {
        this.configuracao = value;
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

}
