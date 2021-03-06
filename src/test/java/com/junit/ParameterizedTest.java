package com.junit;

import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

//parameterized class
@RunWith(Parameterized.class)
public class ParameterizedTest {
    private String email;
    private boolean expectedResult;
    //parameterized Constructor
    public ParameterizedTest(String email, boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }
    //paasing the arrays as list to the constructor with annotation
    @Parameterized.Parameters
    public static Collection valueWithExpectedResult() {
        return Arrays.asList((new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", false},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", false},
                {"abc.100@abc.com.au", false},
                {"abc@1.com", false},
                {"abc@gmail.com.com", false},
                {"aabc+100@gmail.com", false},

        }));
    }
    //function to validate email
    @Test
    public void givenStringWhenCheckedShouldReturnValidOrInvalid() {
        Validator obj = new Validator();
        boolean result = obj.isValidEmail(this.email);
        Assert.assertEquals(this.expectedResult, result);
    }
}