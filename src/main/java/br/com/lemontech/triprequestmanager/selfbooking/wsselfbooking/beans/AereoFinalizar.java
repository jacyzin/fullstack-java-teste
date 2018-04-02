
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types.FormaPagamento;


/**
 * <p>Classe Java de aereoFinalizar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="aereoFinalizar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="localizador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoCia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bilhete" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="formaPagamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}formaPagamento"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aereoFinalizar", propOrder = {
    "localizador",
    "codigoCia",
    "bilhete",
    "dataEmissao",
    "formaPagamento"
})
public class AereoFinalizar {

    @XmlElement(required = true)
    protected String localizador;
    @XmlElement(required = true)
    protected String codigoCia;
    @XmlElement(required = true)
    protected String bilhete;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataEmissao;
    @XmlElement(required = true)
    protected FormaPagamento formaPagamento;

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
     * Obt�m o valor da propriedade codigoCia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCia() {
        return codigoCia;
    }

    /**
     * Define o valor da propriedade codigoCia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCia(String value) {
        this.codigoCia = value;
    }

    /**
     * Obt�m o valor da propriedade bilhete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilhete() {
        return bilhete;
    }

    /**
     * Define o valor da propriedade bilhete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilhete(String value) {
        this.bilhete = value;
    }

    /**
     * Obt�m o valor da propriedade dataEmissao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Define o valor da propriedade dataEmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissao(XMLGregorianCalendar value) {
        this.dataEmissao = value;
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

}
