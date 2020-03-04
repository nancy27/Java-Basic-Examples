package com.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedCharInString {
    public static void findNonRepeatingCharacterInString(){
        String name="simplest";
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character, Integer>();
        for (char ch:name.toCharArray()) {
            map.put(ch ,map.containsKey(ch)?map.get(ch) +1 : 1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
           if(entry.getValue() == 1){
               System.out.println("Found char : " + entry.getKey());
               break;
           }
        }
    }
}
