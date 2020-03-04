package com.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AnagramStrings {
    public static void twoStringsAreAnagram() {
        String name = "Word";
        String nameToCompare = "drow";
        if (name.length() == nameToCompare.length()) {
            boolean result = sorting(name.toLowerCase(),nameToCompare.toLowerCase());
            System.out.println("Is Anagram : " + result);
        } else
            System.out.println("Two Strings Are not the Same");
    }

    public static boolean sorting(String name,String name2) {
        HashSet<Character> set = new HashSet<>();
        for (char ch : name.toCharArray()) {
            set.add(ch);
        }
        for (char ch: name2.toCharArray()){
            if(set.add(ch))
                return false;
        }
        return true;
    }

}