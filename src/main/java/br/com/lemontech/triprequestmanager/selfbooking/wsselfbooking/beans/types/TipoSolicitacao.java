
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoSolicitacao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoSolicitacao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CORPORATIVO"/>
 *     &lt;enumeration value="TREINAMENTO"/>
 *     &lt;enumeration value="INCENTIVO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoSolicitacao")
@XmlEnum
public enum TipoSolicitacao {

    CORPORATIVO,
    TREINAMENTO,
    INCENTIVO;

    public String value() {
        return name();
    }

    public static TipoSolicitacao fromValue(String v) {
        return valueOf(v);
    }

}
