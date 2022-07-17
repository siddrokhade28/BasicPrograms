package org.basicCorePrograms;

import java.util.Scanner;

public class HarmonicNumber {
    static double HarmonicCalc(int N)
    {
        // H1 = 1
        float harmonic = 1;
        for (int i = 2; i <= N; i++) {
            harmonic += (float)1 / i;
        }

        return harmonic;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Harmonic Value N");
        int N= scanner.nextInt();
        System.out.println( N+ "th Harmonic Value "+String.format("%.4f",HarmonicCalc(N)));
    }

}
