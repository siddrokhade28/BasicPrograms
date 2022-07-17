package org.basicCorePrograms;

import java.util.Scanner;
import java.lang.*;

public class Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the character");
       char ch =Character.toLowerCase(scanner.next().charAt(0)); ;

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}
