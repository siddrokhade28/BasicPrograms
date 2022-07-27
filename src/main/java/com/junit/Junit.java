package com.junit;

import java.util.regex.Pattern;

public class Junit {
    private static final String nameRegex = "^[A-Z][a-z]{3,}$";

    public static boolean isValidName(String name) {
        return Pattern.matches(nameRegex, name);
    }
}
