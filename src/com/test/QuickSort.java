package com.test;

import java.util.Arrays;

public class QuickSort {
    int[] input= {6, 5, 3, 1, 8, 7, 2, 4};
    int length= input.length;
    int low=input[0];
    int high=input[length-1];
    public int quickSort(int []a,int low,int high){

        int pIndex=low;
        int pivot=a[high];

        for (int i = low; i <high ; i++) {
         if (a[i] <=pivot){
             int temp=a[i];
             a[i]=a[pIndex];
             a[pIndex]=temp;
             pIndex++;
         }
        }
        int temp=a[pIndex];
        a[pIndex]=a[high];
        a[high]=temp;
        return pIndex;
    }
    public void quickSorting(int [] a ,int low,int high){

        if(low<high){
            int pIndex=quickSort(a,low,high);
            quickSorting(a,low,pIndex-1);
            quickSorting(a,pIndex+1,high);
        }

    }
}


