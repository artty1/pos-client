package com.cpone.platform.pos.client;

/**
 * Created by art_ty on 9/4/2015.
 */
import com.cpone.platform.pos.client.getprofile.AccType;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "getProfileInputData",
        propOrder = {"accType", "branchId", "userName"}
)
public class GetProfileInputData extends CommonRequestData {
    protected AccType accType;
    protected BigInteger branchId;
    protected String userName;

    public GetProfileInputData() {
    }

    public AccType getAccType() {
        return this.accType;
    }

    public void setAccType(AccType value) {
        this.accType = value;
    }

    public BigInteger getBranchId() {
        return this.branchId;
    }

    public void setBranchId(BigInteger value) {
        this.branchId = value;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String value) {
        this.userName = value;
    }
}
