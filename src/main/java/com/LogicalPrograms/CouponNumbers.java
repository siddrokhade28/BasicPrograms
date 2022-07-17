package com.LogicalPrograms;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
    static String coupon = "";
   // function to create a random number
    static int randomNumber()
    {
        Random random = new Random();
       double num= Math.ceil(Math.random() * 10 % 9);
        return (int)num;
    }
    //function to create coupon number by concatenating the string with random number
    static String couponNumber(int random)
    {

        coupon += String.valueOf(random);
        //coupon+= String.valueOf(char[random]);
        return coupon;
    }
    static  String AddingChar(String coupon ,int random){
        char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        coupon += chars[random];
        return coupon;
    }
    public static void main(String[] args) {
        System.out.println("Coupon Numbers");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0 ; i < (n/2) ; i++)
        {
            int random = randomNumber();
            coupon =  couponNumber(random);
            coupon = AddingChar(coupon,random);
        }
        System.out.println("Your Coupon is " + coupon);
    }
}
