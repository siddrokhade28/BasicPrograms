package com.LogicalPrograms;

import java.util.Scanner;

/*To the Util Class add temperaturConversion static function, given the temperature
in fahrenheit as input outputs the temperature in Celsius or viceversa using the
formula
* Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
* Fahrenheit to Celsius: (°F − 32) x 5/9 = °C
 */


public class temperaturConversion {
    public static float CelsiustoFahrenheit(float Celsius){
        float F= (Celsius*(9/5))+32;
        return F;
    }
    public static float FahrenheittoCelsius(float Fahrenheit){
        float C= ((Fahrenheit-32)*(5/9));
        return C;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please select the temperature unit to be given");
        System.out.println("1: To enter in temperature in Celsius");
        System.out.println("2: To enter in temperature in Fahrenheit:");
        int ch= scanner.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter the temperature");
                float Celsius= scanner.nextFloat();
                System.out.println("the Temprature in Fahrenheit is: "+CelsiustoFahrenheit(Celsius));
                break;
            case 2:
                System.out.println("Enter the temperature");
                float Fahrenheit= scanner.nextFloat();
                System.out.println("the Temprature in Celsius is: "+FahrenheittoCelsius(Fahrenheit));
                break;
        }
    }

}
