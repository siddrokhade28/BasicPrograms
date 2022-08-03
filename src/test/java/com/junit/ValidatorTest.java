package com.junit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class JunitTest {
    Validator junit = new Validator();

    @Test
    public void givenStringWhenCheckedShouldReturnBoolean() {
        boolean result = junit.isValidName("Siddanth");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenEmailWhenCheckedShouldReturnBoolean() {
        boolean result = junit.isValidEmail("abc@gmail.com");
        Assertions.assertEquals(true, result);
    }
    @Test
    public void givenPhoneNumWhenCheckedShouldReturnBoolean() {
        boolean result = junit.isValidPhoneNo("9123456780");
        Assertions.assertEquals(true, result);
    }
    @Test
    public void givenPasswordWhenCheckedShouldReturnBoolean() {
        boolean result = junit.isValidpassword("Abcde@123");
        Assertions.assertEquals(true, result);
    }



}