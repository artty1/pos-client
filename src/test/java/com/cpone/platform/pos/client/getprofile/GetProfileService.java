package com.cpone.platform.pos.client.getprofile;

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
        name = "getProfileService",
        targetNamespace = "http://pos.platform.cpone.com/",
        wsdlLocation = "http://localhost:8080/services/profile?wsdl"
)
public class GetProfileService extends Service {
    private static final URL GETPROFILESERVICE_WSDL_LOCATION;
    private static final WebServiceException GETPROFILESERVICE_EXCEPTION;
    private static final QName GETPROFILESERVICE_QNAME = new QName("http://pos.platform.cpone.com/", "getProfileService");

    public GetProfileService() {
        super(__getWsdlLocation(), GETPROFILESERVICE_QNAME);
    }

    public GetProfileService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @WebEndpoint(
            name = "GetProfileServiceEndpointPort"
    )
    public GetProfileServiceEndpoint getGetProfileServiceEndpointPort() {
        return (GetProfileServiceEndpoint)super.getPort(new QName("http://pos.platform.cpone.com/", "GetProfileServiceEndpointPort"), GetProfileServiceEndpoint.class);
    }

    private static URL __getWsdlLocation() {
        if(GETPROFILESERVICE_EXCEPTION != null) {
            throw GETPROFILESERVICE_EXCEPTION;
        } else {
            return GETPROFILESERVICE_WSDL_LOCATION;
        }
    }

    static {
        URL url = null;
        WebServiceException e = null;

        try {
            url = new URL("http://localhost:8080/services/profile?wsdl");
        } catch (MalformedURLException var3) {
            e = new WebServiceException(var3);
        }

        GETPROFILESERVICE_WSDL_LOCATION = url;
        GETPROFILESERVICE_EXCEPTION = e;
    }

}
