package com.cpone.platform.pos.client;

import org.junit.Test;

import javax.xml.ws.BindingProvider;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

/**
 * Created by art_ty on 9/9/2015.
 */
public class DiscountVoucherServiceTest {

    @Test
    public void testCall(){

        DiscountVoucherService discountVoucherService = new DiscountVoucherService();
        DiscountVoucherServiceEndpoint discountVoucherServiceEndpoint = discountVoucherService.getDiscountVoucherServiceEndpointPort();

        createLogin((BindingProvider) discountVoucherServiceEndpoint);

        DiscountVoucherRequest discountVoucherRequest = new DiscountVoucherRequest();
        discountVoucherRequest.setCustomerId(BigInteger.valueOf(Long.valueOf(1)));
        discountVoucherRequest.setRewardCode("testPxf");
        discountVoucherRequest.setNetTaxTotal(new BigDecimal(1000));

        try {
            discountVoucherServiceEndpoint.discountVoucher(discountVoucherRequest);
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
