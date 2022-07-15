package org.example;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eneter the Number");
        int num = scanner.nextInt();
        if(num%2==0){
            System.out.println("Number "+num+" is even");
        }
        else {
            System.out.println("Number "+num+" is odd");
        }
    }
}
