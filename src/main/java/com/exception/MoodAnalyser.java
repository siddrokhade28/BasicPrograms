package com.exception;

public class MoodAnalyser {
    //Defining Happy and Sad String
    private static final String sad = "I am in Sad Mood";
    private static final String happy = "I am in Any Mood";
    String message;

    //parameterized constructor to accept the value
    public MoodAnalyser(String message) {
        this.message = message;
    }

    //function to check the message given by user
    public String analyseMood() {
        String value = null;
        if (message.equals(sad)) {
            value = "SAD";
        } else if (message.equals(happy)) {
            value = "HAPPY";
        }
        return value;
    }

}
