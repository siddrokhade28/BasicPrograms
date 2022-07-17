package com.LogicalPrograms;

import java.util.Scanner;

public class VendingMachine {
    private static final int note[]={1000,500,100,50,10,2,1};
    public static int[] notesChecker(int amount){

        int noteCounter[]= new int[note.length];
        for(int i=0;i<=note.length-1;i++){
            if (amount >= note[i]) {
                noteCounter[i]=amount/note[i];
                amount %= note[i];
                notesChecker( amount);
            }
        }

        return noteCounter;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount = scanner.nextInt();
        int noteCounter[]=notesChecker(amount);
        System.out.println("currency count--->");
        for(int i=0;i<=note.length-1;i++){
            if(noteCounter[i]!=0){
                System.out.println(note[i]+" : "+noteCounter[i]);
            }
        }

    }
}
