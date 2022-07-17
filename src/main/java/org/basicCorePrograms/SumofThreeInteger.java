package org.basicCorePrograms;

import java.util.Scanner;

public class SumofThreeInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array length");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int cont = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println("the distinct triplets " + arr[i] + " " + arr[j] + " " + arr[k]);
                        cont++;
                    }
                }
            }

        }
        System.out.println("the number of distinct triplets are "+cont );
    }
}