
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.FuncionarioRef;


/**
 * <p>Classe Java de atrelarUsuariosRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="atrelarUsuariosRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="principal" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/>
 *         &lt;element name="secundario" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/>
 *         &lt;element name="acessoLogas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="acessoExpense" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atrelarUsuariosRequest", propOrder = {
    "principal",
    "secundario",
    "acessoLogas",
    "acessoExpense"
})
public class AtrelarUsuariosRequest {

    @XmlElement(required = true)
    protected FuncionarioRef principal;
    @XmlElement(required = true)
    protected FuncionarioRef secundario;
    protected boolean acessoLogas;
    protected boolean acessoExpense;

    /**
     * Obt�m o valor da propriedade principal.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getPrincipal() {
        return principal;
    }

    /**
     * Define o valor da propriedade principal.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setPrincipal(FuncionarioRef value) {
        this.principal = value;
    }

    /**
     * Obt�m o valor da propriedade secundario.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getSecundario() {
        return secundario;
    }

    /**
     * Define o valor da propriedade secundario.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setSecundario(FuncionarioRef value) {
        this.secundario = value;
    }

    /**
     * Obt�m o valor da propriedade acessoLogas.
     * 
     */
    public boolean isAcessoLogas() {
        return acessoLogas;
    }

    /**
     * Define o valor da propriedade acessoLogas.
     * 
     */
    public void setAcessoLogas(boolean value) {
        this.acessoLogas = value;
    }

    /**
     * Obt�m o valor da propriedade acessoExpense.
     * 
     */
    public boolean isAcessoExpense() {
        return acessoExpense;
    }

    /**
     * Define o valor da propriedade acessoExpense.
     * 
     */
    public void setAcessoExpense(boolean value) {
        this.acessoExpense = value;
    }

}
