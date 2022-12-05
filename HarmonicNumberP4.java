package com.day5corejavaandfunctional.homework;

import java.util.Scanner;

public class HarmonicNumberP4 {
    static double nthHarmonic(int num)
    {
        float harmonic = 1;


        for (int i = 2; i <= num; i++) {
            harmonic += (float)1 / i;
        }

        return harmonic;
    }

    public static void main (String[] args) {
        int num;
        System.out.println("Enter number : ");
        Scanner obj =new Scanner(System.in);
        num= obj.nextInt();
        System.out.print(nthHarmonic(num));

    }
}
