package com.test;

public class Permutations {

    public void permut(String a,int l,int r){
        if(l==r){
            System.out.println(a);
        }
        else{
            for (int i = l; i <=r ; i++) {
              a=swap(a,l,i);
              permut(a,l+1,r);
              a=swap(a,l,i);
            }
        }
    }
    public String swap(String a,int l,int i){
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[l] ;
        charArray[l] = charArray[i];
        charArray[i] = temp;
        return String.valueOf(charArray);
}

public void permutation(String a, String remaing){

        if(remaing.length()==0){

            System.out.print(a + ",");
        }
        else{
            for (int i = 0; i <remaing.length() ; i++) {
                String newResult= a+remaing.charAt(i);
                String newRemain1=remaing.substring(0,i);
                String newRemain2=remaing.substring(i+1);
                String newRemain=newRemain1+newRemain2;
                permutation(newResult,newRemain);
            }
        }
}
}
