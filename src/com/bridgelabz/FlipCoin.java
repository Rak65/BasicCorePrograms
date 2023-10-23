package com.bridgelabz;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int countHead = 0;
        int countTail = 0;
        System.out.println("How many times you want to flip the coin : ");
        int n = sc.nextInt();
        if (n <= 0)            //check n is positive number or not
            System.out.println("Invalid times---Enter no should be greater than zero");
        else
        {
            for (int i = 0; i < n; i++)
            {
                double ran = (Math.random()*10)%2;
                if (ran <0.5)
                {
                    countTail++;
                }
                else
                {
                    countHead++;
                }
            }
            int headPerc = (100 / n) * countHead;          //calculate head percentage
            int tailPerc= (100 / n) * countTail;           //calculate tail percentage
            System.out.println("Head Percentage = " + headPerc + " %");
            System.out.println("Tail Percentage = " + tailPerc + " %");
        }
    }
}
