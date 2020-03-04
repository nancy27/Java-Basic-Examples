package com.test;

import java.util.Arrays;

public class ReverseAnArrayInPlace {
    public static void reverseArrayInPlace(){
        String[] name={"Nancy","Hello","Mad"};
        System.out.println("Original order"+ Arrays.toString(name));
        String temp ="";
        int size= name.length;
        if (name==null || size<2){
            return;
        }
        for (int i = 0; i <size/2 ; i++) {
            temp= name[i];
            name[i] = name[size-1-i];
            name[size-1-i]=temp;
            System.out.println("Reversed Array of String " + Arrays.toString(name));
        }

    }
}
