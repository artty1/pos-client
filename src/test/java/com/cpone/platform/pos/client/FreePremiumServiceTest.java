package com.cpone.platform.pos.client;

import org.junit.Test;

import javax.xml.ws.BindingProvider;
import java.math.BigInteger;
import java.util.Map;

/**
 * Created by art_ty on 9/9/2015.
 */
public class FreePremiumServiceTest {

    @Test
    public void testCall(){

        FreePremiumService freePremiumService = new FreePremiumService();
        FreePremiumServiceEndpoint freePremiumServiceEndpoint = freePremiumService.getFreePremiumServiceEndpointPort();
        createLogin((BindingProvider) freePremiumServiceEndpoint);

        UseRewardRequest useRewardRequest = new UseRewardRequest();
        useRewardRequest.setCustomerId(BigInteger.valueOf(Long.valueOf(1)));
        useRewardRequest.setRewardCode("testPxf");
        FreePremiumRequest freePremiumRequest = new FreePremiumRequest();
        freePremiumRequest.setCustomerId(BigInteger.valueOf(Long.valueOf(1)));
        freePremiumRequest.setRewardCode("testPxf");


        try {
            freePremiumServiceEndpoint.freePremium(freePremiumRequest);
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
