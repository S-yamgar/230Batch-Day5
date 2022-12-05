package com.day5corejavaandfunctional.homework;

import java.util.Scanner;

public class LargestThreeNumberP10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int a = obj.nextInt();
        System.out.println("Enter 2nd number :");
        int b = obj.nextInt();
        System.out.println("Enter 3rd number :");
        int c = obj.nextInt();

        if ( a > b && a > c ) {
            System.out.println("Largest number is " + a );
        } else if ( b > a && b > c ) {
            System.out.println("Largest number is " + b );
        } else {
            System.out.println("Largest number is " + c );
        }
    }
}


