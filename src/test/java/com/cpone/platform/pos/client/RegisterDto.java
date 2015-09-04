package com.cpone.platform.pos.client;

/**
 * Created by art_ty on 9/4/2015.
 */

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "registerDto",
        propOrder = {"alley", "buildingVillage", "companyId", "day", "district", "firstName", "houseNo", "lastName", "mobile", "month", "postCode", "province", "road", "soi", "storeId", "subDistrict", "terminalId", "thaiId", "titleName", "villageNo", "year"}
)
public class RegisterDto {
    protected String alley;
    protected String buildingVillage;
    protected String companyId;
    protected String day;
    protected String district;
    protected String firstName;
    protected String houseNo;
    protected String lastName;
    protected String mobile;
    protected String month;
    protected String postCode;
    protected String province;
    protected String road;
    protected String soi;
    protected String storeId;
    protected String subDistrict;
    protected String terminalId;
    protected String thaiId;
    protected String titleName;
    protected String villageNo;
    protected String year;

    public RegisterDto() {
    }

    public String getAlley() {
        return this.alley;
    }

    public void setAlley(String value) {
        this.alley = value;
    }

    public String getBuildingVillage() {
        return this.buildingVillage;
    }

    public void setBuildingVillage(String value) {
        this.buildingVillage = value;
    }

    public String getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(String value) {
        this.companyId = value;
    }

    public String getDay() {
        return this.day;
    }

    public void setDay(String value) {
        this.day = value;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String value) {
        this.district = value;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getHouseNo() {
        return this.houseNo;
    }

    public void setHouseNo(String value) {
        this.houseNo = value;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String value) {
        this.mobile = value;
    }

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String value) {
        this.month = value;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public void setPostCode(String value) {
        this.postCode = value;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String value) {
        this.province = value;
    }

    public String getRoad() {
        return this.road;
    }

    public void setRoad(String value) {
        this.road = value;
    }

    public String getSoi() {
        return this.soi;
    }

    public void setSoi(String value) {
        this.soi = value;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public void setStoreId(String value) {
        this.storeId = value;
    }

    public String getSubDistrict() {
        return this.subDistrict;
    }

    public void setSubDistrict(String value) {
        this.subDistrict = value;
    }

    public String getTerminalId() {
        return this.terminalId;
    }

    public void setTerminalId(String value) {
        this.terminalId = value;
    }

    public String getThaiId() {
        return this.thaiId;
    }

    public void setThaiId(String value) {
        this.thaiId = value;
    }

    public String getTitleName() {
        return this.titleName;
    }

    public void setTitleName(String value) {
        this.titleName = value;
    }

    public String getVillageNo() {
        return this.villageNo;
    }

    public void setVillageNo(String value) {
        this.villageNo = value;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String value) {
        this.year = value;
    }
}
