package com.test;

public class ReverseNumber {
public static void reverseNumber(int n){
    int reverse=0;
    while (n>0){
        int remin= n%10;
        reverse=reverse*10+remin;
        n=n/10;
    }
    System.out.println("Reversed number is : " + reverse);
}
}
