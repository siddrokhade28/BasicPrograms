package com.junit;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.Pattern;

public class Junit {
    private static final String nameRegex = "^[A-Z][a-z]{3,}$";
    private static final String emailregex = "^[A-za-z0-9]+([.][A-za-z0-9]+)?[@][a-z]+[.][a-z]{2,3}([a-z]{2})?$";
    private static final String phoneRegex = "^([+][0-9]{2})?[\\s]?[1-9][0-9]{9}$";
    private static final String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()-])[A-Za-z0-9@$!%*?&]{8,}$";

//    public Collection ValuesOfName(){
//        return Arrays.asList(new Object[][]{
//                {"Rama",true},
//                {"Suraj",true},
//                {"Om",false},
//                {"omkar",false}
//        });
//    }

    public static boolean isValidName(String name) {
        return Pattern.matches(nameRegex, name);
    }

    public static boolean isValidEmail(String email) {
        return Pattern.matches(emailregex, email);
    }

    public static boolean isValidPhoneNo(String phn) {
        return Pattern.matches(phoneRegex, phn);
    }

    public static boolean isValidpassword(String pswd) {
        return Pattern.matches(passwordRegex, pswd);
    }
}
