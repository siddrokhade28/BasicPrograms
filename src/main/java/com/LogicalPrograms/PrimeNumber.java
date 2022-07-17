package com.LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eneter numbere to be checked");
        int num = scanner.nextInt();
        int flag= PrimeNumber.checkPrime(num);
        if(flag==1){
            System.out.println(num+" is a prime number");
        }
        else {
            System.out.println(num+" is not prime number");
        }

    }
    public static int checkPrime(int num) {
        int flag=1;
        if (num == 0 || num == 1) {
            flag=0;

        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag=0;
                    break;
                }
            }
        }
        return flag;
    }
}
