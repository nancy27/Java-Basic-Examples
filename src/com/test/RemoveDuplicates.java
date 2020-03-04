package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void removeDuplicates(){
        int a[]= {1,4,5,4,1,8};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <a.length ; i++) {
            list.add(a[i]);
        }
        Set<Integer> set = new HashSet<>(list);
        List<Integer> updatedList= new ArrayList<>(set);
        System.out.print("Elements after removing Duplicates: ");
        updatedList.forEach(x-> System.out.print(x));

    }
}
