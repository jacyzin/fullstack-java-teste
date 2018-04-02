
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de hotelFinalizar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="hotelFinalizar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="localizador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="controleAgencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoFornecedor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoConfirmacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataConfirmacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotelFinalizar", propOrder = {
    "localizador",
    "controleAgencia",
    "codigoFornecedor",
    "codigoConfirmacao",
    "dataConfirmacao"
})
public class HotelFinalizar {

    @XmlElement(required = true)
    protected String localizador;
    @XmlElement(required = true)
    protected String controleAgencia;
    @XmlElement(required = true)
    protected String codigoFornecedor;
    @XmlElement(required = true)
    protected String codigoConfirmacao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataConfirmacao;

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
     * Obt�m o valor da propriedade controleAgencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControleAgencia() {
        return controleAgencia;
    }

    /**
     * Define o valor da propriedade controleAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControleAgencia(String value) {
        this.controleAgencia = value;
    }

    /**
     * Obt�m o valor da propriedade codigoFornecedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFornecedor() {
        return codigoFornecedor;
    }

    /**
     * Define o valor da propriedade codigoFornecedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFornecedor(String value) {
        this.codigoFornecedor = value;
    }

    /**
     * Obt�m o valor da propriedade codigoConfirmacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoConfirmacao() {
        return codigoConfirmacao;
    }

    /**
     * Define o valor da propriedade codigoConfirmacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoConfirmacao(String value) {
        this.codigoConfirmacao = value;
    }

    /**
     * Obt�m o valor da propriedade dataConfirmacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataConfirmacao() {
        return dataConfirmacao;
    }

    /**
     * Define o valor da propriedade dataConfirmacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataConfirmacao(XMLGregorianCalendar value) {
        this.dataConfirmacao = value;
    }

}
