package com.exception;

class messeges {
     public static void main(String[] args) {
         MoodAnalyser obj = new MoodAnalyser("I am in Any Mood");
         System.out.println("the Mood is "+obj.analyseMood());
         //System.out.println("the Mood is "+obj.analyseMood());
     }


    }
 class MoodAnalyser{
     String sad="I am in Sad Mood";
     String happy="I am in Any Mood";
     String msg;

     public MoodAnalyser() {
     }

     public MoodAnalyser(String msg) {
         this.msg = msg;
     }

     public String analyseMood(){
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
