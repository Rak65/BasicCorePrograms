package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Harmonic value N :");
        int n = sc.nextInt();
        double  sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum=sum+ (double) 1 /i;
        }
        System.out.println("The "+n+"th Harmonic value = "+Math.round(sum*100.0)/100.0);
    }
}
