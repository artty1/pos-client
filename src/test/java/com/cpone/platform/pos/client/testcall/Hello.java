//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.cpone.platform.pos.client.testcall;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(
        name = "Hello",
        targetNamespace = "http://pos.platform.cpone.com/"
)
public interface Hello {
    @WebMethod
    @WebResult(
            targetNamespace = ""
    )
    @RequestWrapper(
            localName = "sayHi",
            targetNamespace = "http://pos.platform.cpone.com/",
            className = "com.cpone.platform.pos.client.SayHi"
    )
    @ResponseWrapper(
            localName = "sayHiResponse",
            targetNamespace = "http://pos.platform.cpone.com/",
            className = "com.cpone.platform.pos.client.SayHiResponse"
    )
    String sayHi(@WebParam(
            name = "name",
            targetNamespace = ""
    ) String var1);
}
