package com.exception;

public class MoodAnalyser {
    String sad = "I am in Sad Mood";
    String happy = "I am in Any Mood";
    String msg;

    public MoodAnalyser(String msg) {
        this.msg = msg;
    }

    public String analyseMood() {
        String value = null;
        if (msg.equals(sad)) {
            value = "SAD";
        } else if (msg.equals(happy)) {
            value = "HAPPY";
        }
        return value;

    }

}
