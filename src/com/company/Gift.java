package com.company;

public class Gift {
    private String giftname;
    private String gender;
    private String price;
    private String age;

    public Gift(){

    }

    public String getGiftname() {
        return giftname;
    }

    public void setGiftname(String giftname) {
        this.giftname = giftname;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Gift(String giftname, String gender, String price, String age) {
        this.giftname = giftname;
        this.gender = gender;
        this.price = price;
        this.age = age;




    }
}
