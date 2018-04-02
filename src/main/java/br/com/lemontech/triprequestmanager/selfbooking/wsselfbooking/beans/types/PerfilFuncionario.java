
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de perfilFuncionario.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="perfilFuncionario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GESTOR"/>
 *     &lt;enumeration value="APROVADOR"/>
 *     &lt;enumeration value="SOLICITANTE"/>
 *     &lt;enumeration value="PASSAGEIRO"/>
 *     &lt;enumeration value="APROVADOR_MASTER"/>
 *     &lt;enumeration value="PASSAGEIRO_TERCEIRO"/>
 *     &lt;enumeration value="USUARIO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "perfilFuncionario")
@XmlEnum
public enum PerfilFuncionario {

    GESTOR,
    APROVADOR,
    SOLICITANTE,
    PASSAGEIRO,
    APROVADOR_MASTER,
    PASSAGEIRO_TERCEIRO,
    USUARIO;

    public String value() {
        return name();
    }

    public static PerfilFuncionario fromValue(String v) {
        return valueOf(v);
    }

}
