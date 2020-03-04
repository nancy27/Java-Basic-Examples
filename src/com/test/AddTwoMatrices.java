package com.test;

import java.util.Scanner;

public class AddTwoMatrices {
    public static void addingTwoMatrices(){
        int row=2 ;
        int column=2;
        int [][]a={{1,2},{3,4}};
        int [][]b={{1,2},{3,4}};
        add(a,b,row ,column);
    }
    public static void subtractingTwoMatrices(){
        int row=2 ;
        int column=2;
        int [][]a={{1,2},{3,4}};
        int [][]b={{1,2},{3,4}};
        sub(a,b,row,column);
    }


    public static void add(int[][] a ,int[][] b,int r, int c){
        int[][] result = new int[r][c];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
              result[i][j] = a[i][j]+b[i][j];
            }
        }
        printMatrix(result);

    }
    public static void sub(int[][] a ,int[][] b,int r, int c){
        int[][] result = new int[r][c];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                result[i][j] = a[i][j]-b[i][j];
            }
        }
        printMatrix(result);

    }

    public static void printMatrix(int[][] result){
        for (int i = 0; i <result.length ; i++) {
            for (int j = 0; j <result[0].length ; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
