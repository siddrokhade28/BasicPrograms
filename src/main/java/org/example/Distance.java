package org.example;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the X coordinate");
        int X = scanner.nextInt();
        System.out.println("Enter the Y cooridnate");
        int Y= scanner.nextInt();
        double distance = Math.sqrt((X*X)+(Y*Y));
        double distance1 = Math.sqrt(Math.pow(X,2)+Math.pow(Y,2));
        System.out.println("the distnce from origin to coordinate is "+String.format("%.4f",distance));

    }
}
