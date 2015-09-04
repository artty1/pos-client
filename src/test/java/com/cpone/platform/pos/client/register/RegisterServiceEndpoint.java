package com.cpone.platform.pos.client.register;

/**
 * Created by art_ty on 9/4/2015.
 */
import com.cpone.platform.pos.client.RegisterDto;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(
        name = "RegisterServiceEndpoint",
        targetNamespace = "http://pos.platform.cpone.com/"
)
public interface RegisterServiceEndpoint {
    @WebMethod
    @RequestWrapper(
            localName = "register",
            targetNamespace = "http://pos.platform.cpone.com/",
            className = "com.cpone.platform.pos.client.Register"
    )
    @ResponseWrapper(
            localName = "registerResponse",
            targetNamespace = "http://pos.platform.cpone.com/",
            className = "com.cpone.platform.pos.client.RegisterResponse"
    )
    void register(@WebParam(
            name = "registerData",
            targetNamespace = ""
    ) RegisterDto var1) throws ParseException_Exception;
}
