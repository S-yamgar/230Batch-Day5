package com.day5corejavaandfunctional.homework;

import java.util.Scanner;

public class SwapTwoNumbersP7 {
    public static void main(String[] args) {
        int a ;
        int b ;
        int function ;
        System.out.println("Enter two numbers is : ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("before swaping two number "+ a +" "+ b );
        function = a;
        a = b;
        b=function;

        System.out.println("after swaping output is : "+a+" "+b);

    }
}
