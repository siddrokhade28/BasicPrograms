package com.LogicalPrograms;

import java.util.Scanner;

/*To the Util Class add dayOfWeek static function that takes a date as input and
prints the day of the week that date falls on. Your program should take three
command-line arguments: m (month), d (day), and y (year). For m use 1 for January,
2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for
Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where
/ denotes integer division):
* y0 = y − (14 − m) / 12
* x = y0 + y0/4 − y0/100 + y0/400
* m0 = m + 12 × ((14 − m) / 12) − 2
* d0 = (d + x + 31m0/ 12) mod 7

 */
public class GregorianCalendar {
    static {
        System.out.println("pass the arguments in command line");
        System.out.println("Enter the date in format mm/dd/yyyy");
    }
    public  static int dayOfWeek(int m,int y,int d){
        int year = y - (14 - m) / 12;
        int x = year + (year / 4 ) - (year / 100) + (year/400);
        int month = m + 12 * ((14 - m ) / 12 ) - 2;
        int day = (d + x + 31 * month / 12) % 7;
        return day;
    }
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the date in format mm/dd/yyyy");
        int  month = Integer.valueOf(args[0]);
        int day= Integer.valueOf(args[1]);
        int year= Integer.valueOf(args[2]);
        int ch;
        String week = null;

            ch = dayOfWeek(month, year, day);
            //System.out.println(ch);
        switch (ch){
            case 0:
                 week="SUNDAY";
                break;
            case 1:
                week="MONDAY";
                break;
            case 2:
                week="TUESDAY";
                break;
            case 3:
                week="WEDNESDAY";
                break;
            case 4:
                week="THURSDAY";
                break;
            case 5:
                week="FRIDAY";
                break;
            case 6:
                week="SATURDAY";
                break;
        }
        System.out.println("The day of the week is " +week );


    }
}
