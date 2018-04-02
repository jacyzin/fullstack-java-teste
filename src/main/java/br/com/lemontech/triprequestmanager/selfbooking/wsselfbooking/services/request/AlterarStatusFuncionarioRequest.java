
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.FuncionarioRef;


/**
 * <p>Classe Java de alterarStatusFuncionarioRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="alterarStatusFuncionarioRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="funcionarioRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/>
 *         &lt;element name="novaMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="novoLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alterarStatusFuncionarioRequest", propOrder = {
    "ativo",
    "funcionarioRef",
    "novaMatricula",
    "novoLogin"
})
public class AlterarStatusFuncionarioRequest {

    protected boolean ativo;
    @XmlElement(required = true)
    protected FuncionarioRef funcionarioRef;
    protected String novaMatricula;
    protected String novoLogin;

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
     * Obt�m o valor da propriedade novaMatricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNovaMatricula() {
        return novaMatricula;
    }

    /**
     * Define o valor da propriedade novaMatricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNovaMatricula(String value) {
        this.novaMatricula = value;
    }

    /**
     * Obt�m o valor da propriedade novoLogin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNovoLogin() {
        return novoLogin;
    }

    /**
     * Define o valor da propriedade novoLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNovoLogin(String value) {
        this.novoLogin = value;
    }

}
