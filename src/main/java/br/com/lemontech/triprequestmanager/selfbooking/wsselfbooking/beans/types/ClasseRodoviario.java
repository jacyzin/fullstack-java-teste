
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de classeRodoviario.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="classeRodoviario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRIMEIRA_CLASSE"/>
 *     &lt;enumeration value="CONVENCIONAL"/>
 *     &lt;enumeration value="EXECUTIVO"/>
 *     &lt;enumeration value="LEITO"/>
 *     &lt;enumeration value="LEITO_CAMA"/>
 *     &lt;enumeration value="SEMI_LEITO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "classeRodoviario")
@XmlEnum
public enum ClasseRodoviario {

    PRIMEIRA_CLASSE,
    CONVENCIONAL,
    EXECUTIVO,
    LEITO,
    LEITO_CAMA,
    SEMI_LEITO;

    public String value() {
        return name();
    }

    public static ClasseRodoviario fromValue(String v) {
        return valueOf(v);
    }

}
