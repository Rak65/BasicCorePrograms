package com.bridgelabz;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println(ch+" is a vowel.");
        else if((ch >= 'A' && ch <= 'Z')||(ch>='a'&& ch<='z'))
            System.out.println(ch+" is Consonant.");
        else
            System.out.println("Enter a valid alphabet ");
    }
}
