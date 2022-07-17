package org.basicCorePrograms;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the coefficient of the quadratic equation");
        int a= scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double delta = ((Math.pow(b,2))-(4*a*c));
        if(delta>0) {
            double root1 = ((-b + (Math.sqrt(delta))) / (2 * a));
            double root2 = ((-b - (Math.sqrt(delta))) / (2 * a));
            System.out.println("roots of quadratic equation are real and different " + root1+" "+root2);
        }
        else if(delta==0){
            double root1 = ((-b + (Math.sqrt(delta))) / (2 * a));
            System.out.println("roots of quadratic equation are real and same "+ root1);
        }
        else if(delta<0){
            System.out.println("roots of quadratic equation are imaginary or complex.");
        }
        else {
            System.out.println("please enter proper co-efficient");
        }
    }
}
