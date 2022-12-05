package com.day5corejavaandfunctional.homework;

import java.util.Scanner;

public class QuotientAndRemainderP6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter dividend value  is : ");
        System.out.println("Enter divisor value  is : ");
        int dividend = obj.nextInt();
        int divisor = obj.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("quotient number is  :" + quotient);
        System.out.println("remainder is  :" + remainder);
    }
}
