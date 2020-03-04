package com.test;

import java.util.Arrays;

public class ReverseWordsInSentence {
public static void reverseWordsInSentences(){
    String sentence="This is a Sentence";
    String reverse="";
    String[] sentenceArray = sentence.split(" ") ;
    System.out.println(Arrays.toString(sentenceArray));

    String[] reverseArray ;
    for (int i = sentenceArray.length-1; i >=0; i--) {
        String single = "";
        single = sentenceArray[i];
        reverse = reverse + " " +reverseString(single);
    }
    System.out.println("Reversed Words ina Sentence : " + reverse);
}
    public static String reverseString(String n){
        String reverse ="";
        for (int i = n.length()-1; i >=0 ; i--) {
            reverse = reverse + n.charAt(i);
        }
        return reverse;
    }


}
