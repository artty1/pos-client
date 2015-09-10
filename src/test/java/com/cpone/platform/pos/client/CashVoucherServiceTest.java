package com.cpone.platform.pos.client;

import org.junit.Test;

import javax.xml.ws.BindingProvider;
import java.math.BigInteger;
import java.util.Map;

/**
 * Created by art_ty on 9/9/2015.
 */
public class CashVoucherServiceTest {

    @Test
    public void testCall() {

        CashVoucherService cashVoucherService = new CashVoucherService();
        CashVoucherServiceEndpoint cashVoucherServiceEndpoint = cashVoucherService.getCashVoucherServiceEndpointPort();
        createLogin((BindingProvider) cashVoucherServiceEndpoint);

        CashVoucherRequest cashVoucherRequest = new CashVoucherRequest();
        cashVoucherRequest.setCustomerId(BigInteger.ONE);
        cashVoucherRequest.setRewardCode("testPxf");

        try {
            cashVoucherServiceEndpoint.cashVoucher(cashVoucherRequest);
        } catch (ConstrainViolationException_Exception e) {
            //Use violation for render message to user.
            e.getFaultInfo().getViolations();
        } catch (SystemException_Exception e) {
            e.getFaultInfo().getMessage();
        }
    }

    private void createLogin(BindingProvider bindingProvider) {
        Map requestContext = bindingProvider.getRequestContext();
        requestContext.put(BindingProvider.USERNAME_PROPERTY, "fresh");
        requestContext.put(BindingProvider.PASSWORD_PROPERTY, "password");
    }
}
