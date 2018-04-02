
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de statusCancelamento.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="statusCancelamento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REEMBOLSO"/>
 *     &lt;enumeration value="CREDITO_CIA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusCancelamento")
@XmlEnum
public enum StatusCancelamento {

    REEMBOLSO,
    CREDITO_CIA;

    public String value() {
        return name();
    }

    public static StatusCancelamento fromValue(String v) {
        return valueOf(v);
    }

}
