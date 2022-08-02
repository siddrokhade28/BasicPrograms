package com.exception;

//Custom Exception Handler
public class MoodAnalysisException extends Exception {
    public MoodAnalysisException(String error) {
        super(error);
    }
}
