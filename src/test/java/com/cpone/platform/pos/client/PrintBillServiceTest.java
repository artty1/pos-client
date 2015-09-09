package com.cpone.platform.pos.client;

import org.junit.Test;

import javax.xml.ws.BindingProvider;
import java.util.Map;

/**
 * Created by art_ty on 9/9/2015.
 */
public class PrintBillServiceTest {

    @Test
    public void testCall(){
        BillPrintService billPrintService = new BillPrintService();
        BillPrintServiceEndpoint billPrintServiceEndpoint = billPrintService.getBillPrintServiceEndpointPort();
        createLogin((BindingProvider)billPrintServiceEndpoint);
        BillPrintDto billPrintDto = new BillPrintDto();

        try {
            billPrintServiceEndpoint.printBill(billPrintDto);
        } catch (ConstrainViolationException_Exception e) {
            //Use violation for render message to user.
            e.getFaultInfo().getViolations();
        }
    }

    private void createLogin(BindingProvider bindingProvider) {
        Map requestContext = bindingProvider.getRequestContext();
        requestContext.put(BindingProvider.USERNAME_PROPERTY, "fresh");
        requestContext.put(BindingProvider.PASSWORD_PROPERTY, "password");
    }
}
