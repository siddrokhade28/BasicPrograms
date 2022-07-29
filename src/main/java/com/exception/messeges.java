package com.exception;

class messeges {
     public static void main(String[] args) {
         MoodAnalyser obj = new MoodAnalyser();
         System.out.println(obj.analyseMood("I am in Any Mood"));
     }


    }
 class MoodAnalyser{
     String sad="I am in Sad Mood";
     String happy="I am in Any Mood";
     public String   analyseMood(String msg){
         String value=null;
         if(msg.equals(sad)){
             value="SAD";
         }
         else if(msg.equals(happy)){
             value="Happy";
         }
         return value;
 }
}
