/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpone.platform.pos.client;

import java.util.Map;
import javax.xml.ws.BindingProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pramoth
 */
public class FreshmartCashCardServiceTest {
    
    public FreshmartCashCardServiceTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCall(){
        FreshmartCashCardService service = new FreshmartCashCardService();
        FreshmartCashCardServiceEndPoint freshmartCashCardServiceEndPointPort = service.getFreshmartCashCardServiceEndPointPort();
        createLogin((BindingProvider)freshmartCashCardServiceEndPointPort);
        RegisterCashCardData data = new RegisterCashCardData();
        try {
            freshmartCashCardServiceEndPointPort.registerCpFreshmartCard(data);
        } catch (ConstrainViolationException_Exception e) {
            e.getFaultInfo().violations.forEach(v->System.out.println(v.propertyPath +" " +v.message));
        } catch (SystemException_Exception e){
            e.getFaultInfo().getMessage();
        }
    }

    private void createLogin(BindingProvider bindingProvider) {
       Map requestContext = bindingProvider.getRequestContext();
        requestContext.put(BindingProvider.USERNAME_PROPERTY, "fresh");
        requestContext.put(BindingProvider.PASSWORD_PROPERTY, "password");
    }
    
}
