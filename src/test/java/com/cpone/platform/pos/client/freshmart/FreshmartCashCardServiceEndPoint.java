package com.cpone.platform.pos.client.freshmart;

/**
 * Created by art_ty on 9/4/2015.
 */
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(
        name = "FreshmartCashCardServiceEndPoint",
        targetNamespace = "http://pos.platform.cpone.com/"
)
public interface FreshmartCashCardServiceEndPoint {
    @WebMethod
    @RequestWrapper(
            localName = "registerCpFreshmartCard",
            targetNamespace = "http://pos.platform.cpone.com/",
            className = "com.cpone.platform.pos.client.RegisterCpFreshmartCard"
    )
    @ResponseWrapper(
            localName = "registerCpFreshmartCardResponse",
            targetNamespace = "http://pos.platform.cpone.com/",
            className = "com.cpone.platform.pos.client.RegisterCpFreshmartCardResponse"
    )
    void registerCpFreshmartCard(@WebParam(
            name = "registerCashCardData",
            targetNamespace = ""
    ) RegisterCashCardData var1);
}
