package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Power : ");
        int power = sc.nextInt();

        if (power < 0 || power > 31)
            System.out.println("Invalid, Enter again---Power should be between 0 and 31");
        else
            System.out.println(Math.pow(2, power));
    }
}
