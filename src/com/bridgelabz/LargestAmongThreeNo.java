package com.bridgelabz;

import java.util.Scanner;

public class LargestAmongThreeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int gretestNum = num1>(num2>num3 ? num2:num3) ? num1 :(num2>num3 ? num2 :num3);
        System.out.println("Greatest number is "+gretestNum);
    }
}
