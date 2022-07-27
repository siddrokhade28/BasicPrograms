package com.junit;

import java.util.regex.Pattern;

public class Validator {
    //E.g. abc.xyz@bl.co.in
    private static final String nameRegex = "^[A-Z][a-z]{3,}$";


    public static boolean isValidName(String name) {
        return Pattern.matches(nameRegex, name);
    }


}
