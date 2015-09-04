package com.cpone.platform.pos.client;

/**
 * Created by art_ty on 9/4/2015.
 */
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "customerDto",
        propOrder = {"accumulatePoint", "birthDate", "cardMemberLevel", "chesterExpireDate", "chesterStatus", "cpOneId", "customerId", "customerMobile", "customerName", "customerRegisterDate", "customerThaiId", "freshmartExpireDate", "freshmartStatus"}
)
public class CustomerDto {
    protected BigInteger accumulatePoint;
    @XmlSchemaType(
            name = "dateTime"
    )
    protected XMLGregorianCalendar birthDate;
    protected String cardMemberLevel;
    @XmlSchemaType(
            name = "dateTime"
    )
    protected XMLGregorianCalendar chesterExpireDate;
    protected boolean chesterStatus;
    protected BigInteger cpOneId;
    protected BigInteger customerId;
    protected String customerMobile;
    protected String customerName;
    @XmlSchemaType(
            name = "dateTime"
    )
    protected XMLGregorianCalendar customerRegisterDate;
    protected String customerThaiId;
    @XmlSchemaType(
            name = "dateTime"
    )
    protected XMLGregorianCalendar freshmartExpireDate;
    protected boolean freshmartStatus;

    public CustomerDto() {
    }

    public BigInteger getAccumulatePoint() {
        return this.accumulatePoint;
    }

    public void setAccumulatePoint(BigInteger value) {
        this.accumulatePoint = value;
    }

    public XMLGregorianCalendar getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    public String getCardMemberLevel() {
        return this.cardMemberLevel;
    }

    public void setCardMemberLevel(String value) {
        this.cardMemberLevel = value;
    }

    public XMLGregorianCalendar getChesterExpireDate() {
        return this.chesterExpireDate;
    }

    public void setChesterExpireDate(XMLGregorianCalendar value) {
        this.chesterExpireDate = value;
    }

    public boolean isChesterStatus() {
        return this.chesterStatus;
    }

    public void setChesterStatus(boolean value) {
        this.chesterStatus = value;
    }

    public BigInteger getCpOneId() {
        return this.cpOneId;
    }

    public void setCpOneId(BigInteger value) {
        this.cpOneId = value;
    }

    public BigInteger getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(BigInteger value) {
        this.customerId = value;
    }

    public String getCustomerMobile() {
        return this.customerMobile;
    }

    public void setCustomerMobile(String value) {
        this.customerMobile = value;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String value) {
        this.customerName = value;
    }

    public XMLGregorianCalendar getCustomerRegisterDate() {
        return this.customerRegisterDate;
    }

    public void setCustomerRegisterDate(XMLGregorianCalendar value) {
        this.customerRegisterDate = value;
    }

    public String getCustomerThaiId() {
        return this.customerThaiId;
    }

    public void setCustomerThaiId(String value) {
        this.customerThaiId = value;
    }

    public XMLGregorianCalendar getFreshmartExpireDate() {
        return this.freshmartExpireDate;
    }

    public void setFreshmartExpireDate(XMLGregorianCalendar value) {
        this.freshmartExpireDate = value;
    }

    public boolean isFreshmartStatus() {
        return this.freshmartStatus;
    }

    public void setFreshmartStatus(boolean value) {
        this.freshmartStatus = value;
    }
}
