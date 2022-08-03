package com.junit;

import java.util.regex.Pattern;

public class Validator {
    //E.g. abc.xyz@bl.co.in
    // regex to check email
    private static final String emailregex = "^[A-za-z0-9]+([.][A-za-z0-9]+)?[@][a-z]+[.][a-z]{2,3}([a-z]{2})?$";
    //function to validate email
    public static boolean isValidEmail(String email) {
        return Pattern.matches(emailregex, email);
    }


}
