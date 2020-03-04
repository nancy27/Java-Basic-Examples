package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedCharasInString {
    public static void printRepeatedCharacterInString(String name){
        Map<Character,Integer> characterMap = new HashMap<Character,Integer>();
        for (int i = 0; i < name.length(); i++) {
          char singlechar=  name.charAt(i);
          if(characterMap.containsKey(singlechar)){
              characterMap.put(singlechar,characterMap.get(singlechar)+1);
            }
          else
              characterMap.put(singlechar,1);
        }
        Set<Map.Entry<Character,Integer>> entrySet = characterMap.entrySet();
        for( Map.Entry<Character,Integer> entry : entrySet){
            if (entry.getValue() >1){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }

    }


}
