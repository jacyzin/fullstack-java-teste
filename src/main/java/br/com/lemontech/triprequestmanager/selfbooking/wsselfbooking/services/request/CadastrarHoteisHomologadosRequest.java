
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.CadastrarHoteisHomologados;


/**
 * <p>Classe Java de cadastrarHoteisHomologadosRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarHoteisHomologadosRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cadastrarHoteisHomologados" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}cadastrarHoteisHomologados"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarHoteisHomologadosRequest", propOrder = {
    "cadastrarHoteisHomologados"
})
public class CadastrarHoteisHomologadosRequest {

    @XmlElement(required = true)
    protected CadastrarHoteisHomologados cadastrarHoteisHomologados;

    /**
     * Obt�m o valor da propriedade cadastrarHoteisHomologados.
     * 
     * @return
     *     possible object is
     *     {@link CadastrarHoteisHomologados }
     *     
     */
    public CadastrarHoteisHomologados getCadastrarHoteisHomologados() {
        return cadastrarHoteisHomologados;
    }

    /**
     * Define o valor da propriedade cadastrarHoteisHomologados.
     * 
     * @param value
     *     allowed object is
     *     {@link CadastrarHoteisHomologados }
     *     
     */
    public void setCadastrarHoteisHomologados(CadastrarHoteisHomologados value) {
        this.cadastrarHoteisHomologados = value;
    }

}
