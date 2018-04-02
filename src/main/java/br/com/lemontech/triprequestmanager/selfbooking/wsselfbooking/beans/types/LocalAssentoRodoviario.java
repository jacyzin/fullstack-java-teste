
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de localAssentoRodoviario.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="localAssentoRodoviario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JANELA"/>
 *     &lt;enumeration value="CORREDOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "localAssentoRodoviario")
@XmlEnum
public enum LocalAssentoRodoviario {

    JANELA,
    CORREDOR;

    public String value() {
        return name();
    }

    public static LocalAssentoRodoviario fromValue(String v) {
        return valueOf(v);
    }

}
