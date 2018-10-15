package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Gift gf = new Gift();

        //creating objects of ArrayList Gifts. It has to have constructor(class name) as a type.
        ArrayList<Gift> giftList = new ArrayList<>();
        giftList.add(new Gift("Jewelry", "Female", "High"));
        giftList.add(new Gift("Weekend Getaway", "Female", "High"));
        giftList.add(new Gift("Selfie Stick", "Female", "Low"));
        giftList.add(new Gift("Wine Bottle", "Female", "Low"));
        giftList.add(new Gift("Perfume", "Female", "Medium"));
        giftList.add(new Gift("Sweater", "Female", "Medium"));
        giftList.add(new Gift("Smart TV", "Male", "High"));
        giftList.add(new Gift(" Apple Watch", "Male", "High"));
        giftList.add(new Gift(" Books", "Male", "low"));
        giftList.add(new Gift("Shoes", "Male", "Low"));
        giftList.add(new Gift("Guitar", "Male", "Medium"));
        giftList.add(new Gift("Playstation", "Male", "Medium"));


        System.out.println("Enter the gender ");
        String userGender = sc.next();

        System.out.println("Enter the price");
        String userPrice = sc.next();

        gf.setGender(userGender);
        gf.setPrice(userPrice);

        for (Gift g : giftList) {
//            System.out.println(g.getGiftname());
            if (g.getGender().equalsIgnoreCase(userGender) && g.getPrice().equalsIgnoreCase(userPrice)) {
                System.out.println(g.getGiftname());
            }


        }
    }

}



