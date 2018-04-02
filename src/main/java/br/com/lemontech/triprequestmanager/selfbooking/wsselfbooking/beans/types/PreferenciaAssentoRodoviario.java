
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de preferenciaAssentoRodoviario.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="preferenciaAssentoRodoviario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FRENTE"/>
 *     &lt;enumeration value="MEIO"/>
 *     &lt;enumeration value="FUNDO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "preferenciaAssentoRodoviario")
@XmlEnum
public enum PreferenciaAssentoRodoviario {

    FRENTE,
    MEIO,
    FUNDO;

    public String value() {
        return name();
    }

    public static PreferenciaAssentoRodoviario fromValue(String v) {
        return valueOf(v);
    }

}
