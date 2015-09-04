package com.cpone.platform.pos.client.getprofile;

/**
 * Created by art_ty on 9/4/2015.
 */
import com.cpone.platform.pos.client.CustomerDto;
import com.cpone.platform.pos.client.GetProfileInputData;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(
        name = "GetProfileServiceEndpoint",
        targetNamespace = "http://pos.platform.cpone.com/"
)
public interface GetProfileServiceEndpoint {
    @WebMethod
    @WebResult(
            targetNamespace = ""
    )
    @RequestWrapper(
            localName = "getCustomer",
            targetNamespace = "http://pos.platform.cpone.com/",
            className = "com.cpone.platform.pos.client.GetCustomer"
    )
    @ResponseWrapper(
            localName = "getCustomerResponse",
            targetNamespace = "http://pos.platform.cpone.com/",
            className = "com.cpone.platform.pos.client.GetCustomerResponse"
    )
    CustomerDto getCustomer(@WebParam(
            name = "getProfileInputData",
            targetNamespace = ""
    ) GetProfileInputData var1);
}
