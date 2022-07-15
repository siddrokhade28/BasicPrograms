package org.example;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Random number = new Random();
        int heads=0;
        int tails=0;
        Scanner s = new Scanner(System.in);
        System.out.println("eneter the number of time the coin to be flip");
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            int random1 =number.nextInt(2);
            if(random1==0){
                heads++;
            }
            else {
                tails++;
            }
        }
        float percenatgeOfHeads=0;
        float percenatgeOfTails=0;
        percenatgeOfHeads=(heads*100)/n;
        percenatgeOfTails=(tails*100)/n;
        System.out.println("the percentage of heads is " + Math.round(percenatgeOfHeads));
        System.out.println("the percentage of Tails is " + Math.round(percenatgeOfTails));

    }
}