package com.test;

public class ProductTwoMatrix {
    public static void productTwoMatrix(){
        int[][] a={{1,2},{1,2}};
        int[][] b={{1,2},{2,1}};
        int arow= a.length;
        int acolumn= a[0].length;
        int brow=b.length;
        int bcolumn=b[0].length;
        if(acolumn==brow){
            productOfTwo(a,b,arow,bcolumn);
        }
        else
            System.out.println("Column of 1st and row of 2nd are not Equal");
    }
    public static void productOfTwo(int[][] a,int[][] b,int r,int c ){
        int[][] result= new int[r][c] ;
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                int sum=0;
                for (int k = 0; k <b.length ; k++) {
                 sum = sum + a[i][k]*b[k][j];
                }
                result[i][j] = sum;
            }
        } printMatrix(result);
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
