package com.LogicalPrograms;
 /*function sqrt to compute the square root of a non-negative number c
given in the input using Newton's method*/

import java.util.Scanner;

public class NewtonsMethod {
    public void sqrt(){
        System.out.println("y0 = y − (14 − m) / 12\n" +
                "x = y0 + y0\n" +
                "/4 − y0\n" +
                "/100 + y0\n" +
                "/400\n" +
                "m0 = m + 12 × ((14 − m) / 12) − 2\n" +
                "d0 = (d + x + 31m0\n" +
                "\n" +
                "/ 12) mod 7");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NewtonsMethod nm = new NewtonsMethod();
        nm.sqrt();

    }


}
