
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoOperacaoBudget.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoOperacaoBudget">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREDITO"/>
 *     &lt;enumeration value="DEBITO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoOperacaoBudget")
@XmlEnum
public enum TipoOperacaoBudget {

    CREDITO,
    DEBITO;

    public String value() {
        return name();
    }

    public static TipoOperacaoBudget fromValue(String v) {
        return valueOf(v);
    }

}
