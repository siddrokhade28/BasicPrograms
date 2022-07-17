package com.LogicalPrograms;

import java.util.Scanner;
import java.util.SortedMap;

public class PerfectNumber {
    public static void main(String[] args) {
        long n, sum = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = scanner.nextLong();
        for(int i=2;i<n;i++)
        {
            if(n==1){
                sum=1;
        }
            if (n % i == 0) {
                sum += i;
            }

        }
        if (sum == n) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }
    }
