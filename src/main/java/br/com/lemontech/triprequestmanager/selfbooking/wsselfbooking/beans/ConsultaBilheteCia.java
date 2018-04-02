
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types.Source;


/**
 * <p>Classe Java de consultaBilheteCia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="consultaBilheteCia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="localizador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bilhete" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="source" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}source"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaBilheteCia", propOrder = {
    "localizador",
    "bilhete",
    "source"
})
public class ConsultaBilheteCia {

    @XmlElement(required = true)
    protected String localizador;
    @XmlElement(required = true)
    protected String bilhete;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Source source;

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
     * Obt�m o valor da propriedade source.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Define o valor da propriedade source.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
    }

}
