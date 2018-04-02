
package br.com.lemontech.triprequestmanager.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de source.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="source">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AZUL"/>
 *     &lt;enumeration value="TAM"/>
 *     &lt;enumeration value="TAM_MERCOSUL"/>
 *     &lt;enumeration value="GOL"/>
 *     &lt;enumeration value="PASSAREDO"/>
 *     &lt;enumeration value="META"/>
 *     &lt;enumeration value="SETE"/>
 *     &lt;enumeration value="PUMAAIR"/>
 *     &lt;enumeration value="NHT"/>
 *     &lt;enumeration value="MAP"/>
 *     &lt;enumeration value="PIQUIATUBA"/>
 *     &lt;enumeration value="AVIANCA"/>
 *     &lt;enumeration value="AVIANCA_V2"/>
 *     &lt;enumeration value="GOL_V2"/>
 *     &lt;enumeration value="TRAVELPORT"/>
 *     &lt;enumeration value="SABRE"/>
 *     &lt;enumeration value="FLYWAYS"/>
 *     &lt;enumeration value="LATAM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "source")
@XmlEnum
public enum Source {

    AZUL("AZUL"),
    TAM("TAM"),
    TAM_MERCOSUL("TAM_MERCOSUL"),
    GOL("GOL"),
    PASSAREDO("PASSAREDO"),
    META("META"),
    SETE("SETE"),
    PUMAAIR("PUMAAIR"),
    NHT("NHT"),
    MAP("MAP"),
    PIQUIATUBA("PIQUIATUBA"),
    AVIANCA("AVIANCA"),
    @XmlEnumValue("AVIANCA_V2")
    AVIANCA_V_2("AVIANCA_V2"),
    @XmlEnumValue("GOL_V2")
    GOL_V_2("GOL_V2"),
    TRAVELPORT("TRAVELPORT"),
    SABRE("SABRE"),
    FLYWAYS("FLYWAYS"),
    LATAM("LATAM");
    private final String value;

    Source(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Source fromValue(String v) {
        for (Source c: Source.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
