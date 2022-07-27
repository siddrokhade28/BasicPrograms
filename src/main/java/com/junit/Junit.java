package com.junit;

import java.util.regex.Pattern;

public class Junit {
    private static final String nameRegex = "^[A-Z][a-z]{3,}$";
    private static final String emailregex="^[A-za-z0-9]+([.][A-za-z0-9]+)?[@][a-z]+[.][a-z]{2,3}([a-z]{2})?$";


    public static boolean isValidName(String name) {
        return Pattern.matches(nameRegex, name);
    }
    public  static boolean isValidEmail(String email){
        return Pattern.matches(emailregex,email);
    }
}
