package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;

        System.out.println("After swap first number is "+num1+" and second number is "+num2);
    }
}
