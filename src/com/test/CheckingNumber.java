package com.test;

public class CheckingNumber {
    public static void isArmstrong(int n) {
        int armstrong = n;
        int reverse = 0;
        while (n > 0) {
            int value = n % 10;
            reverse = value*value*value + reverse;
            n = n / 10;
        }
        if (armstrong == reverse) {
            System.out.println("Armstsrong");
        }
    }

    public static void intIsPalindrome(int n){
        int palindrome= n;
        int finalValue = 0;
        while(n>0){
            int remin =n%10;
            finalValue = finalValue*10 +remin;
            n = n/10;
        }
        if (finalValue == palindrome){
            System.out.println("Palindrome");
        }
    }
    public static void isPalindrome(String s) {
        String reverse = "";
        int length = s.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        if (reverse.equalsIgnoreCase(s)) {
            System.out.println(s + " is Palindrome");
        } else {
            System.out.println(s + " is Not a  Palindrome");
        }
    }    public static void checkPrime(int n){
        int flag =0;
        for (int i = 1; i <=n ; i++) {
            if (n%i ==0){
                flag = flag+1;
            }
        }
        if (flag ==2){
            System.out.println(n +" is prime no");
        }
        else
            System.out.println(n + " is Not a Prime no");

    }

    public static int  fibonnaci(int n ){
        int first=1;
        int second=1;
        int fibo = 1;

        if(n==1 || n==2){
            return 1;
        }
        else{
            for (int i = 3; i <=n ; i++) {
                fibo =first+second;
                first=second;
                second=fibo;
            }
            return fibo;}
    }



}
