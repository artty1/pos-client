package com.cpone.platform.pos.client;

/**
 * Created by art_ty on 9/4/2015.
 */
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "commonRequestData",
        propOrder = {"companyId", "customerId", "storeId", "terminalId"}
)
public class CommonRequestData {
    protected String companyId;
    protected BigInteger customerId;
    protected String storeId;
    protected String terminalId;

    public CommonRequestData() {
    }

    public String getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(String value) {
        this.companyId = value;
    }

    public BigInteger getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(BigInteger value) {
        this.customerId = value;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public void setStoreId(String value) {
        this.storeId = value;
    }

    public String getTerminalId() {
        return this.terminalId;
    }

    public void setTerminalId(String value) {
        this.terminalId = value;
    }
}
