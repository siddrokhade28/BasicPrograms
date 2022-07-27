package com.junit;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class JunitTest {
    Junit junit = new Junit();

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