package com.bridgelabz;
import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        equation();
    }
    public static void equation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        double a = sc.nextDouble();
        System.out.println("Enter b : ");
        double b = sc.nextDouble();
        System.out.println("Enter c : ");
        double c = sc.nextDouble();
        double d = b * b - 4 * a * c;

        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Two Distinct real roots.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("Real root:");
            System.out.println("Root: " + root);
        } else {
            System.out.println("No real roots");
        }
    }
}
