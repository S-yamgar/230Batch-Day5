package com.day5corejavaandfunctional.homework;

import java.util.Scanner;

public class factorP5 {
    public static void main(String args[]){
        int input;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value :");
        input = obj.nextInt();

        for(int i = 2; i < input; i++) {
            while(input % i == 0) {
                System.out.println( "factor no is : " +  i+" ");
                input = input/i;
            }
        }
        if(input > 2) {
            System.out.println("factor no is : " + input);
        }
    }
}
