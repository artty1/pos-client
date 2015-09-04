package com.cpone.platform.pos.client.testcall;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import javax.xml.ws.BindingProvider;
import java.util.Map;

/**
 * Created by art_ty on 9/4/2015.
 */
@RunWith(value = BlockJUnit4ClassRunner.class)
public class HelloServiceTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCall() {

        HelloService service = new HelloService();
        Hello hello = service.getHelloPort();

        createLogin((BindingProvider) hello);
        String helloMessage = hello.sayHi("art");
        System.out.println("xxx--->" + helloMessage);
    }

    private void createLogin(BindingProvider bindingProvider) {
        Map requestContext = bindingProvider.getRequestContext();
        requestContext.put(BindingProvider.USERNAME_PROPERTY, "fresh");
        requestContext.put(BindingProvider.PASSWORD_PROPERTY, "password");
    }
}
