
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de cadastrarHoteisHomologados complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarHoteisHomologados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorBackOffice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hotelHomologado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="vencimentoHomologacao" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarHoteisHomologados", propOrder = {
    "identificadorBackOffice",
    "hotelHomologado",
    "vencimentoHomologacao"
})
public class CadastrarHoteisHomologados {

    @XmlElement(required = true)
    protected String identificadorBackOffice;
    protected boolean hotelHomologado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vencimentoHomologacao;

    /**
     * Obt�m o valor da propriedade identificadorBackOffice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackOffice() {
        return identificadorBackOffice;
    }

    /**
     * Define o valor da propriedade identificadorBackOffice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackOffice(String value) {
        this.identificadorBackOffice = value;
    }

    /**
     * Obt�m o valor da propriedade hotelHomologado.
     * 
     */
    public boolean isHotelHomologado() {
        return hotelHomologado;
    }

    /**
     * Define o valor da propriedade hotelHomologado.
     * 
     */
    public void setHotelHomologado(boolean value) {
        this.hotelHomologado = value;
    }

    /**
     * Obt�m o valor da propriedade vencimentoHomologacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVencimentoHomologacao() {
        return vencimentoHomologacao;
    }

    /**
     * Define o valor da propriedade vencimentoHomologacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVencimentoHomologacao(XMLGregorianCalendar value) {
        this.vencimentoHomologacao = value;
    }

}
