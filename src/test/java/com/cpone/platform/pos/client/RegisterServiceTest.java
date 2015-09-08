package com.cpone.platform.pos.client;

/**
 * Created by art_ty on 9/4/2015.
 */

import com.cpone.platform.pos.client.RegisterDto;
import org.junit.Test;

import javax.xml.ws.BindingProvider;
import java.util.Map;

public class RegisterServiceTest {

    @Test
    public void testRegister() {

        RegisterServiceEndpoint port = new RegisterService().getRegisterServiceEndpointPort();


        RegisterDto registerDto = new RegisterDto();

        registerDto.setTitleName("นาย");
        registerDto.setFirstName("Theerawat");
        registerDto.setLastName("Linitda");
        registerDto.setDay("02");
        registerDto.setMonth("04");
        registerDto.setYear("2015");
        registerDto.setThaiId("7711123144657");
        registerDto.setMobile("0960839561");

        registerDto.setHouseNo("6090");
        registerDto.setVillageNo("8");
        registerDto.setBuildingVillage("พญาไท");
        registerDto.setAlley("ตรอกซอย");
        registerDto.setSoi("ซอย");
        registerDto.setRoad("สนามบิน");
        registerDto.setProvince("นนทบุรี");
        registerDto.setDistrict("เมือง");
        registerDto.setSubDistrict("บางกระสอ");

        registerDto.setStoreId("099");
        registerDto.setCompanyId("01");
        registerDto.setTerminalId("809");

        createLogin((BindingProvider) port);

        try {
            port.register(registerDto);
        } catch (ParseException_Exception e) {
            e.printStackTrace();
        } catch (ConstrainViolationException_Exception e){
            e.printStackTrace();
        }
    }

    private void createLogin(BindingProvider bindingProvider) {
        Map requestContext = bindingProvider.getRequestContext();
        requestContext.put(BindingProvider.USERNAME_PROPERTY, "fresh");
        requestContext.put(BindingProvider.PASSWORD_PROPERTY, "password");
    }


}
