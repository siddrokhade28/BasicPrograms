package org.basicCorePrograms;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number for X");
        int X= scanner.nextInt();
        System.out.println("enter the number for Y");
        int Y = scanner.nextInt();
        System.out.println("number before swapping X= "+X+" Y= "+Y);
        int temp;
        temp=X;
        X=Y;
        Y=temp;
        System.out.println("number after swapping X= "+X+" Y= "+Y);

    }
}
