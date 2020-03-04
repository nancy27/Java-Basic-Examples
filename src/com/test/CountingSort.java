package com.test;

public class CountingSort {
    public void countSort(int[] a,int n){
        int max=a[0];
        for (int i = 0; i <n ; i++) {
            if (a[i] >= max) {
                max=a[i];
            }
        }
        int b[]=new int[n];
        int k=max;
        int []count= new int[k+1];
        for (int i = 0; i <n ; i++) {
            count[a[i]]=count[a[i]]+1;
        }
        for (int i = 1; i <=k ; i++) {
            count[i]=count[i]+count[i-1];
        }
        for (int i = n-1; i >=0 ; i--) {
            b[--count[a[i]]]=a[i];
        }
        for (int i = 0; i <n ; i++) {
            a[i]=b[i];
        }
    }
}
