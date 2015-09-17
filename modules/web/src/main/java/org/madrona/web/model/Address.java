package org.madrona.web.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "address")
public class Address {

    @Field(value = "home-number")
    private String homeNumber = "";

    @Field(value = "address-line-one")
    private String addressLineOne = "";

    @Field(value = "address-line-two")
    private String addressLineTwo = "";

    @Field(value = "district")
    private String district = "";

    @Field(value = "province")
    private String province = "";

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getAddressLineOne() {
        return addressLineOne;
    }

    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }

    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    public void setAddressLineTwo(String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Address{" +
                "homeNumber='" + homeNumber + '\'' +
                ", addressLineOne='" + addressLineOne + '\'' +
                '}';
    }
}