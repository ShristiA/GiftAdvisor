package com.company;

public class Gift {
    private String giftname;
    private String gender;
    private String price;

    public Gift(String giftname, String gender, String price) {
        this.giftname = giftname;
        this.gender = gender;
        this.price = price;
    }
    public Gift (){

    }

    public String getGiftname() {
        return giftname;
    }

    public void setGiftname(String gift) {
        this.giftname = gift;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
