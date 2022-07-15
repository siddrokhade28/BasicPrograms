package org.example;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number if rows ");
        int rows= scanner.nextInt();
        System.out.println("enter the number of columns");
        int columns = scanner.nextInt();
        int arr[][] = new int[rows][columns];
        for (int i =0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                System.out.println("enter the element for Row "+i+" and column "+j);
                arr[i][j]= scanner.nextInt();
            }
        }
        System.out.println("the array elements are : ");
        for (int i =0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
