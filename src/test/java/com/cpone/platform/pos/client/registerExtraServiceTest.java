package com.cpone.platform.pos.client;

import org.junit.Test;

import javax.xml.ws.BindingProvider;
import java.util.Map;

/**
 * Created by art_ty on 9/9/2015.
 */
public class registerExtraServiceTest {
    @Test
    public void testCall(){

        RegisterExtraService registerExtraService = new RegisterExtraService();
        RegisterMemberExtraServiceEndpoint registerMemberExtraServiceEndpoint = registerExtraService.getRegisterMemberExtraServiceEndpointPort();

        RegisterMemberExtraInputData registerMemberExtraInputData = new RegisterMemberExtraInputData();

        try {
            registerMemberExtraServiceEndpoint.registerExtraPackage(registerMemberExtraInputData);
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
