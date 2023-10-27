package com.bridgelabz;
import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Distance distance = new Distance();
        distance.distanceCal();
    }

    public void distanceCal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input x : ");
        int x = sc.nextInt();
        System.out.println("Enter the input y : ");
        int y = sc.nextInt();

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("Euclidean distance from (" + x + ", " + y + ") to the origin (0, 0) is: " + distance);
    }
}
