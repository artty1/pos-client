package com.cpone.platform.pos.client;

import com.cpone.platform.pos.client.CustomerDto;
import com.cpone.platform.pos.client.GetProfileInputData;
import org.junit.Test;

import javax.xml.ws.BindingProvider;
import java.util.Map;

/**
 * Created by art_ty on 9/4/2015.
 */
public class GetProfileServiceTest {

    @Test
    public void testGetProfile() {
        GetProfileService getProfileService = new GetProfileService();
        GetProfileServiceEndpoint port = getProfileService.getGetProfileServiceEndpointPort();
        GetProfileInputData getProfileInputData = new GetProfileInputData();
        getProfileInputData.setUserName("7711123144657");
        getProfileInputData.setAccType(AccType.ACC);
        getProfileInputData.setCompanyId("25");
        getProfileInputData.setStoreId("23");
        getProfileInputData.setTerminalId("1009");

        createLogin((BindingProvider) port);

        CustomerDto customerDto = port.getCustomer(getProfileInputData);
        System.out.println("customerDto --->" + customerDto.getCustomerId());
    }

    private void createLogin(BindingProvider bindingProvider) {
        Map requestContext = bindingProvider.getRequestContext();
        requestContext.put(BindingProvider.USERNAME_PROPERTY, "fresh");
        requestContext.put(BindingProvider.PASSWORD_PROPERTY, "password");
    }
}
