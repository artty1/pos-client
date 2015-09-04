package com.cpone.platform.pos.client.register;

/**
 * Created by art_ty on 9/4/2015.
 */

import javax.xml.ws.WebFault;

@WebFault(
        name = "ParseException",
        targetNamespace = "http://pos.platform.cpone.com/"
)
public class ParseException_Exception extends Exception {
    private ParseException faultInfo;

    public ParseException_Exception(String message, ParseException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    public ParseException_Exception(String message, ParseException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    public ParseException getFaultInfo() {
        return this.faultInfo;
    }
}