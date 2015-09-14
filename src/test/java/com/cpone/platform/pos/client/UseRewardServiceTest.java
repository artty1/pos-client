package com.cpone.platform.pos.client;

import org.junit.Test;

import javax.xml.ws.BindingProvider;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

/**
 * Created by art_ty on 9/10/2015.
 */
public class UseRewardServiceTest {
    @Test
    public void testCall(){

        UseRewardCodService useRewardCodService = new UseRewardCodService();
        UseRewardCodeServiceEndpoint useRewardCodeServiceEndpoint = useRewardCodService.getUseRewardCodeServiceEndpointPort();

        createLogin((BindingProvider) useRewardCodeServiceEndpoint);

        UseRewardRequest useRewardRequest = new UseRewardRequest();
        useRewardRequest.setCustomerId(new Long(1));
        useRewardRequest.setRewardCode("testPrefixCode");
        SkuData skuData = new SkuData();
        skuData.setSeq(new Long(1));
        skuData.setProductId("234");
        skuData.setAmount(BigDecimal.valueOf(Long.valueOf(20)));
        skuData.setQty(new Long(1));

        skuData.setUnitPrice(BigDecimal.valueOf(Long.valueOf(2)));
        skuData.setPromotionType(PromotionType.BULKSALE);

        useRewardRequest.getSkuDataList().add(skuData);
        try {
            useRewardCodeServiceEndpoint.useRewardCode(useRewardRequest);
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
