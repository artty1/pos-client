//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.cpone.platform.pos.client.testcall;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;

@WebServiceClient(
        name = "helloService",
        targetNamespace = "http://pos.platform.cpone.com/",
        wsdlLocation = "http://localhost:8080/services/hello?wsdl"
)
public class HelloService extends Service {
    private static final URL HELLOSERVICE_WSDL_LOCATION;
    private static final WebServiceException HELLOSERVICE_EXCEPTION;
    private static final QName HELLOSERVICE_QNAME = new QName("http://pos.platform.cpone.com/", "helloService");

    public HelloService() {
        super(__getWsdlLocation(), HELLOSERVICE_QNAME);
    }

    public HelloService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @WebEndpoint(
            name = "helloPort"
    )
    public Hello getHelloPort() {
        return (Hello)super.getPort(new QName("http://pos.platform.cpone.com/", "helloPort"), Hello.class);
    }

    private static URL __getWsdlLocation() {
        if(HELLOSERVICE_EXCEPTION != null) {
            throw HELLOSERVICE_EXCEPTION;
        } else {
            return HELLOSERVICE_WSDL_LOCATION;
        }
    }

    static {
        URL url = null;
        WebServiceException e = null;

        try {
            url = new URL("http://localhost:8080/services/hello?wsdl");
        } catch (MalformedURLException var3) {
            e = new WebServiceException(var3);
        }

        HELLOSERVICE_WSDL_LOCATION = url;
        HELLOSERVICE_EXCEPTION = e;
    }
}
