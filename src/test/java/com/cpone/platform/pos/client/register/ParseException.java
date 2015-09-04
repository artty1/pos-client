package com.cpone.platform.pos.client.register;

/**
 * Created by art_ty on 9/4/2015.
 */

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ParseException",
        propOrder = {"errorOffset", "message"}
)
public class ParseException {
    protected Integer errorOffset;
    protected String message;

    public ParseException() {
    }

    public Integer getErrorOffset() {
        return this.errorOffset;
    }

    public void setErrorOffset(Integer value) {
        this.errorOffset = value;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String value) {
        this.message = value;
    }
}

