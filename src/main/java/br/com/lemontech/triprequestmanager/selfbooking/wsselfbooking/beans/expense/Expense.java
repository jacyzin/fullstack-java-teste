
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.expense;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de expense complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="expense">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adiantamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}adiantamento" minOccurs="0"/>
 *         &lt;element name="prestacaoContas" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}prestacaoContas" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expense", propOrder = {
    "adiantamento",
    "prestacaoContas"
})
public class Expense {

    protected Adiantamento adiantamento;
    protected PrestacaoContas prestacaoContas;

    /**
     * Obt�m o valor da propriedade adiantamento.
     * 
     * @return
     *     possible object is
     *     {@link Adiantamento }
     *     
     */
    public Adiantamento getAdiantamento() {
        return adiantamento;
    }

    /**
     * Define o valor da propriedade adiantamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Adiantamento }
     *     
     */
    public void setAdiantamento(Adiantamento value) {
        this.adiantamento = value;
    }

    /**
     * Obt�m o valor da propriedade prestacaoContas.
     * 
     * @return
     *     possible object is
     *     {@link PrestacaoContas }
     *     
     */
    public PrestacaoContas getPrestacaoContas() {
        return prestacaoContas;
    }

    /**
     * Define o valor da propriedade prestacaoContas.
     * 
     * @param value
     *     allowed object is
     *     {@link PrestacaoContas }
     *     
     */
    public void setPrestacaoContas(PrestacaoContas value) {
        this.prestacaoContas = value;
    }

}
