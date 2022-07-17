package com.LogicalPrograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int num= scanner.nextInt();
        System.out.println("the reversed Number is "+ reverse(num));

    }
    static int rev=0;
    static int reverse(int num){
        if(num<=0) {
            return rev;
        }
        int rem = num%10;
        rev= rev*10 + rem;
        reverse(num/=10);
        return rev;
    }
}
