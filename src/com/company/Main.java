package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //creating objects of Gift class in an arraylist.
        ArrayList<Gift> giftList = new ArrayList<>();
        giftList.add(new Gift("Jewelry", "Female", "High", "adult"));
        giftList.add(new Gift("Weekend Getaway", "Female", "High", "adult"));
        giftList.add(new Gift("Selfie Stick", "Female", "Low", "teen"));
        giftList.add(new Gift("Wine Bottle", "Female", "Low", "teen"));
        giftList.add(new Gift("Perfume", "Female", "Medium", "child"));
        giftList.add(new Gift("Sweater", "Female", "Medium", "child"));
        giftList.add(new Gift("Smart TV", "Male", "High", "adult"));
        giftList.add(new Gift(" Apple Watch", "Male", "High", "adult"));
        giftList.add(new Gift(" Books", "Male", "low", "teen"));
        giftList.add(new Gift("Shoes", "Male", "Low", "teen"));
        giftList.add(new Gift("Guitar", "Male", "Medium", "child"));
        giftList.add(new Gift("Playstation", "Male", "Medium", "child"));


        System.out.println("Enter the gender ");
        String userGender = sc.next();

        System.out.println("Enter the price");
        String userPrice = sc.next();

        System.out.println("is the person child or adult or teen?");
        String userAge = sc.next();
//g is storing the temporary value from the arrayList

        int countGiftSuggestion = 0;

        for (Gift g : giftList) {
            if (g.getGender().equalsIgnoreCase(userGender) && g.getPrice().equalsIgnoreCase(userPrice) && g.getAge().equalsIgnoreCase(userAge)) {
                System.out.println(g.getGiftname());
                countGiftSuggestion++;
            }
        }
        if (countGiftSuggestion == 0) {
            System.out.println("get him/her certificate");


        }
    }
}





