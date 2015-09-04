package com.cpone.platform.pos.client.register;

/**
 * Created by art_ty on 9/4/2015.
 */

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;

@WebServiceClient(
        name = "registerService",
        targetNamespace = "http://pos.platform.cpone.com/",
        wsdlLocation = "http://localhost:8080/services/register?wsdl"
)
public class RegisterService extends Service {
    private static final URL REGISTERSERVICE_WSDL_LOCATION;
    private static final WebServiceException REGISTERSERVICE_EXCEPTION;
    private static final QName REGISTERSERVICE_QNAME = new QName("http://pos.platform.cpone.com/", "registerService");

    public RegisterService() {
        super(__getWsdlLocation(), REGISTERSERVICE_QNAME);
    }

    public RegisterService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @WebEndpoint(
            name = "RegisterServiceEndpointPort"
    )
    public RegisterServiceEndpoint getRegisterServiceEndpointPort() {
        return (RegisterServiceEndpoint)super.getPort(new QName("http://pos.platform.cpone.com/", "RegisterServiceEndpointPort"), RegisterServiceEndpoint.class);
    }

    private static URL __getWsdlLocation() {
        if(REGISTERSERVICE_EXCEPTION != null) {
            throw REGISTERSERVICE_EXCEPTION;
        } else {
            return REGISTERSERVICE_WSDL_LOCATION;
        }
    }

    static {
        URL url = null;
        WebServiceException e = null;

        try {
            url = new URL("http://localhost:8080/services/register?wsdl");
        } catch (MalformedURLException var3) {
            e = new WebServiceException(var3);
        }

        REGISTERSERVICE_WSDL_LOCATION = url;
        REGISTERSERVICE_EXCEPTION = e;
    }
}
