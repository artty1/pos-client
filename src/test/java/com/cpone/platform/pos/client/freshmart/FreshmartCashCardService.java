package com.cpone.platform.pos.client.freshmart;

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
        name = "freshmartCashCardService",
        targetNamespace = "http://pos.platform.cpone.com/",
        wsdlLocation = "http://localhost:8080/services/freshmartCashCardService?wsdl"
)
public class FreshmartCashCardService extends Service {
    private static final URL FRESHMARTCASHCARDSERVICE_WSDL_LOCATION;
    private static final WebServiceException FRESHMARTCASHCARDSERVICE_EXCEPTION;
    private static final QName FRESHMARTCASHCARDSERVICE_QNAME = new QName("http://pos.platform.cpone.com/", "freshmartCashCardService");

    public FreshmartCashCardService() {
        super(__getWsdlLocation(), FRESHMARTCASHCARDSERVICE_QNAME);
    }

    public FreshmartCashCardService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @WebEndpoint(
            name = "FreshmartCashCardServiceEndPointPort"
    )
    public FreshmartCashCardServiceEndPoint getFreshmartCashCardServiceEndPointPort() {
        return (FreshmartCashCardServiceEndPoint)super.getPort(new QName("http://pos.platform.cpone.com/", "FreshmartCashCardServiceEndPointPort"), FreshmartCashCardServiceEndPoint.class);
    }

    private static URL __getWsdlLocation() {
        if(FRESHMARTCASHCARDSERVICE_EXCEPTION != null) {
            throw FRESHMARTCASHCARDSERVICE_EXCEPTION;
        } else {
            return FRESHMARTCASHCARDSERVICE_WSDL_LOCATION;
        }
    }

    static {
        URL url = null;
        WebServiceException e = null;

        try {
            url = new URL("http://localhost:8080/services/freshmartCashCardService?wsdl");
        } catch (MalformedURLException var3) {
            e = new WebServiceException(var3);
        }

        FRESHMARTCASHCARDSERVICE_WSDL_LOCATION = url;
        FRESHMARTCASHCARDSERVICE_EXCEPTION = e;
    }
}
