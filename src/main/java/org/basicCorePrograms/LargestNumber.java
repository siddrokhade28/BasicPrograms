package org.basicCorePrograms;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eneter the first number");
        int first= scanner.nextInt();
        System.out.println("eneter the Second number");
        int second= scanner.nextInt();
        System.out.println("eneter the third number");
        int third= scanner.nextInt();
        if(first>second && first>third){
            System.out.println(first+" is the largest number");
        }
        else if (second>first && second>third) {
            System.out.println(second+" is the largest number");
        }
        else {
            System.out.println(third+" is the largest number");
        }

    }
}
