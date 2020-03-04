package com.test;

import java.util.Arrays;

public class SelectionSort {
    public void sort(int[] a){
        for (int i = 0; i <a.length-1 ; i++) {
            int min =i;

            for (int j = i+1; j <a.length ; j++) {
                if (a[j]<a[min]) {
                    min = j;
                }               }
                if(min!=i){
                    int temp =a[min];
                    a[min]=a[i];
                    a[i]=temp;
                 //swap(a[i],a[min]);
                }
            }

        System.out.println("Selection Sort: " + Arrays.toString(a));
            }

        public void swap(int a, int b){

    }
}
