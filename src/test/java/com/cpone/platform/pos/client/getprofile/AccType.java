package com.cpone.platform.pos.client.getprofile;

/**
 * Created by art_ty on 9/4/2015.
 */
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(
        name = "accType"
)
@XmlEnum
public enum AccType {
    ACC,
    CARD;

    private AccType() {
    }

    public String value() {
        return this.name();
    }

    public static AccType fromValue(String v) {
        return valueOf(v);
    }
}
