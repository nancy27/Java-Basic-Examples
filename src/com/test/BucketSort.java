package com.test;

public class BucketSort {
    public void radixSort(int[] a,int n){
        int max=a[0];
        for (int i = 0; i <n ; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        for (int pos=1; max/pos>0 ;){
            sort(a,n,pos);
            pos=pos*10;
        }
    }
    public void sort(int[] a,int n, int pos){
        int []count=new int[n];
        int b[]= new int[n];
        for (int i = 0; i <n ; i++) {
            count[(a[i]/pos )%10]=count[(a[i]/pos )%10]+1;
        }
        for (int i = 1; i <n ; i++) {
            count[i]=count[i-1]+count[i];
        }

        for (int i = n-1; i >=0 ; i--) {
           b[--count[(a[i]/pos)%10]]=a[i];
        }
        for (int i = 0; i <n ; i++) {
            a[i]=b[i];
        }
    }
}
