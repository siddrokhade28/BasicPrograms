package com.LogicalPrograms;
 /*function sqrt to compute the square root of a non-negative number c
given in the input using Newton's method*/

import java.util.Scanner;

public class NewtonsMethod {
    public double sqrt( int c){
        double epsilon= 1e-15;
        double t=c;
        double result=(t-(c/t));
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
        return t;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find Square Root");
        //refer the formula for variables
        int c= scanner.nextInt();
        NewtonsMethod nm = new NewtonsMethod();
        System.out.println(nm.sqrt(c));

    }


}
