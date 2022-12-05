package com.day5corejavaandfunctional.homework;

import java.util.Scanner;

public class EvenOddnumberP8 {
    public static void main(String[]args) {
        int num ;
        System.out.println("Enter no is : ");
        Scanner obj = new Scanner(System.in);
        num = obj .nextInt();
        if (num % 2 == 0 ) {
            System.out.println("Even number is " + num );
        }
        else {
            System.out.println("Odd number is " + num );
        }
    }
}
