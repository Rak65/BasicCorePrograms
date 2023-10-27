package com.bridgelabz;

import java.util.Scanner;

public class ThreeIntegerAddsToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count =0;
        System.out.println("Enter size of the array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size - 2; i++){
            for (int j = i+1; j < size -1; j++){
                for (int k = j+1; k < size; k++){
                    if (arr[i]+arr[j]+arr[k]==0){
                        System.out.println("Triplets are as follows :"+i+" "+j+" "+k);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total count of Triplets = "+count);
    }
}
