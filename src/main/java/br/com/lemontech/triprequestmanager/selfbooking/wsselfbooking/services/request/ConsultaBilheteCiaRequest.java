
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.ConsultaBilheteCia;


/**
 * <p>Classe Java de consultaBilheteCiaRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="consultaBilheteCiaRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consultaBilheteCia" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}consultaBilheteCia"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaBilheteCiaRequest", propOrder = {
    "consultaBilheteCia"
})
public class ConsultaBilheteCiaRequest {

    @XmlElement(required = true)
    protected ConsultaBilheteCia consultaBilheteCia;

    /**
     * Obt�m o valor da propriedade consultaBilheteCia.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaBilheteCia }
     *     
     */
    public ConsultaBilheteCia getConsultaBilheteCia() {
        return consultaBilheteCia;
    }

    /**
     * Define o valor da propriedade consultaBilheteCia.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaBilheteCia }
     *     
     */
    public void setConsultaBilheteCia(ConsultaBilheteCia value) {
        this.consultaBilheteCia = value;
    }

}
