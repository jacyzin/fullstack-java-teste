
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de moeda.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="moeda">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ARS"/>
 *     &lt;enumeration value="BRL"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="NUC"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="JPY"/>
 *     &lt;enumeration value="CNY"/>
 *     &lt;enumeration value="PLN"/>
 *     &lt;enumeration value="KHR"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="MXN"/>
 *     &lt;enumeration value="COP"/>
 *     &lt;enumeration value="AFA"/>
 *     &lt;enumeration value="PEN"/>
 *     &lt;enumeration value="SGD"/>
 *     &lt;enumeration value="ZAR"/>
 *     &lt;enumeration value="PYG"/>
 *     &lt;enumeration value="CLP"/>
 *     &lt;enumeration value="CHF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "moeda")
@XmlEnum
public enum Moeda {

    ARS,
    BRL,
    USD,
    NUC,
    EUR,
    GBP,
    JPY,
    CNY,
    PLN,
    KHR,
    CAD,
    MXN,
    COP,
    AFA,
    PEN,
    SGD,
    ZAR,
    PYG,
    CLP,
    CHF;

    public String value() {
        return name();
    }

    public static Moeda fromValue(String v) {
        return valueOf(v);
    }

}
