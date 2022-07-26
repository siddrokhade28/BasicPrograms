package com.regex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User newUser = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First name");
        String firstName= scanner.next();
        newUser.setFirstName(firstName);
        System.out.println("Enter Last name");
        String lastName= scanner.next();
        newUser.setLastName(lastName);
        System.out.println("Enter Email ID");
        String email= scanner.next();
        newUser.setEmail(email);
        System.out.println("Enter Phone Number");
        String phn= scanner.next();
        newUser.setPhn(phn);
//
//        System.out.println("Enter password");
//        String pswd= scanner.next();
//        newUser.setPassword(pswd);

        System.out.println(newUser);


    }
}
