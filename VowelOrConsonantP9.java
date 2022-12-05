package com.day5corejavaandfunctional.homework;

import java.util.Scanner;
public class VowelOrConsonantP9 {
    public static void main(String args[]){
        System.out.println("Enter a alphabetical :");
        Scanner obj = new Scanner(System.in);
        char ch = obj.next().charAt(0);
        if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||
                ch == 'A'|| ch == 'E'|| ch == 'I' || ch == 'O' || ch == 'U' || ch == ' '){
            System.out.println(ch + " alphabetical is vowel");
        }else{
            System.out.println( ch + " alphabetical is consonant");
        }
    }
}