package com.junit;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.Pattern;

public class Junit {
    // regex to check first name and last name
    private static final String nameRegex = "^[A-Z][a-z]{3,}$";
    // regex to check email
    private static final String emailregex = "^[A-za-z0-9]+([.][A-za-z0-9]+)?[@][a-z]+[.][a-z]{2,3}([a-z]{2})?$";
    //regex to check phone number
    private static final String phoneRegex = "^([+][0-9]{2})?[\\s]?[1-9][0-9]{9}$";
    //regex to check password
    private static final String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()-])[A-Za-z0-9@$!%*?&]{8,}$";

    //    public Collection ValuesOfName(){
//        return Arrays.asList(new Object[][]{
//                {"Rama",true},
//                {"Suraj",true},
//                {"Om",false},
//                {"omkar",false}
//        });
//    }
    // function to check first name and last name
    public static boolean isValidName(String name) {
        return Pattern.matches(nameRegex, name);
    }

    // function to check Email id
    public static boolean isValidEmail(String email) {
        return Pattern.matches(emailregex, email);
    }

    // function to check Phone Number
    public static boolean isValidPhoneNo(String phn) {
        return Pattern.matches(phoneRegex, phn);
    }

    // function to check Password
    public static boolean isValidpassword(String pswd) {
        return Pattern.matches(passwordRegex, pswd);
    }
}
