
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de enumFornecedorVCN.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="enumFornecedorVCN">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEX"/>
 *     &lt;enumeration value="CONFERMA"/>
 *     &lt;enumeration value="B2BPAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enumFornecedorVCN")
@XmlEnum
public enum EnumFornecedorVCN {

    WEX("WEX"),
    CONFERMA("CONFERMA"),
    @XmlEnumValue("B2BPAY")
    B_2_BPAY("B2BPAY");
    private final String value;

    EnumFornecedorVCN(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumFornecedorVCN fromValue(String v) {
        for (EnumFornecedorVCN c: EnumFornecedorVCN.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
