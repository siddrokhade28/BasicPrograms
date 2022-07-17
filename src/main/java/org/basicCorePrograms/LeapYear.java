package org.basicCorePrograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = 0;
        while (true) {
            System.out.println("enter the year");
            year = scanner.nextInt();

            int len = String.valueOf(year).length();
            if (len == 4) {
                if (year % 400 == 0) {
                    System.out.println("the year " + year + " is leap year");
                    break;
                } else if (year % 100 == 0) {
                    System.out.println("the year " + year + " is leap year");
                    break;
                }
                else if (year % 4 == 0) {
                    System.out.println("the year " + year + " is leap year");
                    break;
                }
                else {
                    System.out.println("entered number is not a year");
                    break;
                }
            }
            else {
                System.out.println("entered number is not a year");
            }
        }
    }
}