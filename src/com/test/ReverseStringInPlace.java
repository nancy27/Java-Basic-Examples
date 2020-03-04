package com.test;

public class ReverseStringInPlace {


    public static void reversingStringInPlace(){
        String name="Hello";
        StringBuilder builder= new StringBuilder(name);
        int length = builder.length();
        for (int i=0;i<length/2;i++){
            char temp = builder.charAt(i);
            int length1=length-i-1;
            builder.setCharAt(i,builder.charAt(length1));
            builder.setCharAt(length1,temp);
        }

        System.out.println("Reverse String"  + " Hello "+ "In Place : " + builder.toString());
    }


    public static void reverseString(String n){
        String reverse ="";
        for (int i = 0; i <n.length() ; i++) {
            reverse = reverse+n.charAt(i);
        }
        System.out.print( "reverse string : "+ reverse);
    }
}
