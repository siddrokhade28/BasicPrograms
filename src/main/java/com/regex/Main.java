package com.regex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creating object of the pojo class to set values
        User newUser = new User();
        //scanner object to take input from the user
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
        System.out.println("Enter password");
        String password= scanner.next();
        newUser.setPassword(password);
        System.out.println(newUser);


    }
}
