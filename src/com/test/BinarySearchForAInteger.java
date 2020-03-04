package com.test;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchForAInteger {

    public static void binarySearch(){
        int []inputArray = {10,20,30,40,50,60,77};

        System.out.println("given Integer Array : " + Arrays.toString(inputArray));
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the element to serach ");
        int search = scanner.nextInt();
        int value = search(inputArray,0,inputArray.length-1,search);
        if(value == -1)
        System.out.println("Not Found " );
        else
            System.out.println("Found");
         }
      public static int search(int[] inpArray ,int l,int r, int searchNumber){
        if(r >=1){
       int mid = l+ (r-1)/2;
       if (inpArray[mid] == searchNumber){
           return mid;
      }
       if(inpArray[mid] > searchNumber ){
           return search(inpArray,l,mid-1,searchNumber);
       }
       else if (inpArray[mid] <searchNumber) {
       return search(inpArray,mid + 1, r, searchNumber);
      }
        }
      return -1;
     }
   }

