package com.LogicalPrograms;
/*Function to calculate monthlyPayment that reads in three
command-line arguments P, Y, and R and calculates the monthly payments you
would have to make over Y years to pay off a P principal loan amount at R per cent
interest compounded monthly.
* check the file for form file
*/

import java.util.Scanner;

public class CompoundIntrest {
    public static double monthlyPayment(long Principal, double n, double r ){
        double payment=0;
        payment=((Principal*r)/(1-(Math.pow((1+r),(-n)))));
        return payment;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        long Principal = scanner.nextLong();
        System.out.println("Enter the year ");
        int year= scanner.nextInt();
        System.out.println("Enter the rate of interest");
        float rateOfInt = scanner.nextFloat();
        // calculating the variables according to formula
       double n= 12*year;
       double r= rateOfInt/(12*100);
        System.out.println("the monthly payment for \n Principal: "+Principal+"\n Years: "+year+"\n Rate of intrest "+rateOfInt+"\n is: "+ monthlyPayment(Principal,n,r));

    }

}
