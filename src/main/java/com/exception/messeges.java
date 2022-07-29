package com.exception;

import java.util.Scanner;

class messeges {
    /*
     Enums Added NULL_ERROR and EMPTY_ERROR
      */
    public static final String NULL_ERROR = "NULL MOOD";
    public static final String EMPTY_ERROR = "EMPTY MOOD ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your mood");
            String msg = scanner.nextLine();
            if (msg.isEmpty()) {
                throw new MoodAnalysisException(EMPTY_ERROR);
            } else if (msg.equals("I am in Sad Mood")||msg.equals("I am in Any Mood")) {
                MoodAnalyser obj = new MoodAnalyser(msg);
                System.out.println( obj.analyseMood());
            } else throw new MoodAnalysisException(NULL_ERROR);
        }
        catch (Exception e) {
            System.out.println("please Enter Valid Mood " + e);
        }
    }
}


