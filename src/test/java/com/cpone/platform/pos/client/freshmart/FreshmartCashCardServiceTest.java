package com.cpone.platform.pos.client.freshmart;

import org.junit.Test;

import javax.xml.ws.BindingProvider;
import java.util.Map;

/**
 * Created by art_ty on 9/4/2015.
 */
public class FreshmartCashCardServiceTest {

    @Test
    public void testGetProfile() {
        FreshmartCashCardService freshmartCashCardService = new FreshmartCashCardService();
        FreshmartCashCardServiceEndPoint port = freshmartCashCardService.getFreshmartCashCardServiceEndPointPort();

        createLogin((BindingProvider) port);
        RegisterCashCardData registerCashCardData = new RegisterCashCardData();
        //registerCashCardData.setCashCardNo();
        //registerCashCardData.setCustomerId();
        //registerCashCardData.setCompanyId();
        port.registerCpFreshmartCard(registerCashCardData);

        //System.out.println("customerDto --->" + customerDto.getCustomerId());
    }

    private void createLogin(BindingProvider bindingProvider) {
        Map requestContext = bindingProvider.getRequestContext();
        requestContext.put(BindingProvider.USERNAME_PROPERTY, "fresh");
        requestContext.put(BindingProvider.PASSWORD_PROPERTY, "password");
    }


}
