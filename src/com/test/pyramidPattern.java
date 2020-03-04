package com.test;

public class pyramidPattern {
    public static void pyramidpattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pyramidOfNumbers(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i ; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
