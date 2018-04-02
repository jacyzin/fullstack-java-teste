
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de modalidadeLancamentoBudget.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="modalidadeLancamentoBudget">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RESIDUAL"/>
 *     &lt;enumeration value="MENSAL"/>
 *     &lt;enumeration value="ANUAL"/>
 *     &lt;enumeration value="EXTRA"/>
 *     &lt;enumeration value="ACERTO"/>
 *     &lt;enumeration value="ATUALIZACAO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "modalidadeLancamentoBudget")
@XmlEnum
public enum ModalidadeLancamentoBudget {

    RESIDUAL,
    MENSAL,
    ANUAL,
    EXTRA,
    ACERTO,
    ATUALIZACAO;

    public String value() {
        return name();
    }

    public static ModalidadeLancamentoBudget fromValue(String v) {
        return valueOf(v);
    }

}
