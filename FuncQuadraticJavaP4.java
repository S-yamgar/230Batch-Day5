package com.day5corejavaandfunctional.homework;

import java.util.Scanner;

public class FuncQuadraticJavaP4 {
    public static void main(String[] args) {
        System.out.println("quadratic equation= a*x*x + b*x + c");
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the value of a =");
        int a = obj.nextInt();
        System.out.println("enter the value of b =");
        int b = obj.nextInt();
        System.out.println("enter the value of c =");
        int c = obj.nextInt();
        System.out.println(a+"*x*x "+ b + "*x+"+c);
        System.out.println("find the roots");
        int delta=b*b - 4*a*c;
        int root1 = (int) ((-b + Math.sqrt(delta))/(2*a));
        int root2 = (int) ((-b - Math.sqrt(delta))/(2*a));

        System.out.println("root1 of x = " + root1);
        System.out.println("root2 of x = " + root2);


    }

}
