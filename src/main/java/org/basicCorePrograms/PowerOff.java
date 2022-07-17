package org.basicCorePrograms;

import java.util.Scanner;

public class PowerOff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the Power Value N");
        int n = scanner.nextInt();
        if(n>=0 && n<=31){
            double value=Math.pow(2,n);
            System.out.println("the value is "+(int)value);
        }
        else {
            System.out.println("exceeds the limit");
        }

    }
}
