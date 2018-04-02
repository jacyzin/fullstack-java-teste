
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de adiantamentoStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="adiantamentoStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDENTE"/>
 *     &lt;enumeration value="LIBERADO"/>
 *     &lt;enumeration value="CANCELADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "adiantamentoStatus")
@XmlEnum
public enum AdiantamentoStatus {

    PENDENTE,
    LIBERADO,
    CANCELADO;

    public String value() {
        return name();
    }

    public static AdiantamentoStatus fromValue(String v) {
        return valueOf(v);
    }

}
