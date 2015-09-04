package com.cpone.platform.pos.client.freshmart;

/**
 * Created by art_ty on 9/4/2015.
 */
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "registerCashCardData",
        propOrder = {"branchId", "cashCardNo", "companyId", "customerId", "terminalId"}
)
public class RegisterCashCardData {
    protected BigInteger branchId;
    protected String cashCardNo;
    protected BigInteger companyId;
    protected BigInteger customerId;
    protected String terminalId;

    public RegisterCashCardData() {
    }

    public BigInteger getBranchId() {
        return this.branchId;
    }

    public void setBranchId(BigInteger value) {
        this.branchId = value;
    }

    public String getCashCardNo() {
        return this.cashCardNo;
    }

    public void setCashCardNo(String value) {
        this.cashCardNo = value;
    }

    public BigInteger getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(BigInteger value) {
        this.companyId = value;
    }

    public BigInteger getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(BigInteger value) {
        this.customerId = value;
    }

    public String getTerminalId() {
        return this.terminalId;
    }

    public void setTerminalId(String value) {
        this.terminalId = value;
    }
}
