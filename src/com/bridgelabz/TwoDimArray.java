package com.bridgelabz;

import java.util.Scanner;

public class TwoDimArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows :");
        int row = sc.nextInt();
        System.out.println("Enter the column :");
        int column = sc.nextInt();

        int[][] arr = new int[row][column];

        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
