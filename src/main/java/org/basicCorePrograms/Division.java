package org.basicCorePrograms;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eneter the Divisor");
        double divisor= scanner.nextDouble();
        System.out.println("eneter the Dividend");
        double dividend= scanner.nextDouble();
        double reminder=0;
        double quotient=0;
        if(divisor>0){
            quotient= dividend/divisor;
            reminder= (dividend%divisor);

            System.out.println("the reminder is "+reminder);
            System.out.println("the quotient is "+quotient);
        }
        else {
            System.out.println("divisor is zero");
        }

    }
}
