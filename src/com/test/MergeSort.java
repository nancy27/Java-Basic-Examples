package com.test;

import java.util.Arrays;

public class MergeSort {
    public void mergeSort(int a[],int low,int high){
        if (low < high){
            int mid=(low+high)/2;
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);
            }
    }
    private void merge(int[] a, int low, int mid, int high) {
    int k=0;
    int i=low;
    int j=mid+1;
    int[] b= new int[high-low+1];
    while(i <=mid && j<=high ) {
        if (a[i] >= a[j]) {
            b[k] = a[j];
            j++;k++;
        } else {
            b[k] = a[i];
            i++;k++;
        }
    }
    while (j <= high) {
            b[k] = a[j];
            j++;k++;
        }
    while (i <= mid) {
            b[k] = a[i];
            i++;
            k++;
        }
        for(i = low; i <= high; i += 1) {
            a[i] = b[i - low];
        }
    }
}






