package com.test;

import java.util.HashSet;

public class RepeatedCharacters {
    public RepeatedCharacters() {
    }

    void repeatedCharacters(){
        String name="Hello";
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i <name.length() ; i++) {
            set.add(name.charAt(i));
        }
        System.out.print("Does Duplicates Exist: ");
        if(set.size() < name.length()){
            System.out.print("exist");
        }
        else{
            System.out.print("NotExist");
        }
    }
}
