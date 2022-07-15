package org.example;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the temprature in in Fahrenheit");
        double temprature= scanner.nextDouble();
        System.out.println("enetr the wind speed in miles per hour");
        double windSpeed= scanner.nextDouble();
        double effectiveTemp;
        if(temprature>50 || windSpeed>120 || windSpeed<3 ){
            System.out.println("effective temperature cannot be calculated");
        }
        else {
            effectiveTemp= 35.74+(0.6215*temprature)+(((0.4275*temprature)-35.75)*Math.pow(windSpeed,0.16));
            System.out.println("defines the effective temperature (the wind chill) is "+ effectiveTemp);
        }
    }
}
