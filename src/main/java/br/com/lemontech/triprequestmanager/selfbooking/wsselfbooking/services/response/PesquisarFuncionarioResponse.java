
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.services.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.Funcionarios;
import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types.ResultadoOperacao;


/**
 * <p>Classe Java de pesquisarFuncionarioResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pesquisarFuncionarioResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoOperacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}resultadoOperacao" minOccurs="0"/>
 *         &lt;element name="funcionarios" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarios" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisarFuncionarioResponse", propOrder = {
    "resultadoOperacao",
    "funcionarios"
})
public class PesquisarFuncionarioResponse {

    protected ResultadoOperacao resultadoOperacao;
    protected Funcionarios funcionarios;

    /**
     * Obt�m o valor da propriedade resultadoOperacao.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoOperacao }
     *     
     */
    public ResultadoOperacao getResultadoOperacao() {
        return resultadoOperacao;
    }

    /**
     * Define o valor da propriedade resultadoOperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoOperacao }
     *     
     */
    public void setResultadoOperacao(ResultadoOperacao value) {
        this.resultadoOperacao = value;
    }

    /**
     * Obt�m o valor da propriedade funcionarios.
     * 
     * @return
     *     possible object is
     *     {@link Funcionarios }
     *     
     */
    public Funcionarios getFuncionarios() {
        return funcionarios;
    }

    /**
     * Define o valor da propriedade funcionarios.
     * 
     * @param value
     *     allowed object is
     *     {@link Funcionarios }
     *     
     */
    public void setFuncionarios(Funcionarios value) {
        this.funcionarios = value;
    }

}
