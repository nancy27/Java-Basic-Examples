package com.test;

import java.sql.SQLOutput;
import java.util.*;

import static com.test.CheckingNumber.checkPrime;
import static com.test.CheckingNumber.isPalindrome;

public class Main {

 public static void main(String[] args) {
  Permutations permutations = new Permutations();
  System.out.print("Permutation of a string are : ");
  permutations.permutation("", "ABC");
  System.out.println();

  RepeatedCharacters repeatedCharacters = new RepeatedCharacters();
  repeatedCharacters.repeatedCharacters();
  System.out.println();

  //product of two matrices
  System.out.println("ProductOf two Matrices :");
  ProductTwoMatrix.productTwoMatrix();

  //counting Sort
  int[] input1 = {6, 4, 3, 2, 1, 4, 3, 6, 6, 2, 4, 3, 4};
  CountingSort countingSort = new CountingSort();
  countingSort.countSort(input1, input1.length);
  System.out.print("Count Sorting : ");
  System.out.print(Arrays.toString(input1));
  System.out.println();

  //Bucket/Radix sort
  int[] input2 = {80, 50, 30, 10, 90, 60, 0, 70, 40, 20, 50};
  BucketSort bucketSort = new BucketSort();
  bucketSort.radixSort(input2, input2.length);
  System.out.print("Bucket Sorting : ");
  System.out.print(Arrays.toString(input2));
  System.out.println();

  //Merge Sort
  int[] input = {6, 5, 3, 1, 8, 7, 2, 4};
  int length = input.length;
  int low = 0;
  int high = length - 1;
  MergeSort mergeSort = new MergeSort();
  mergeSort.mergeSort(input, low, high);
  System.out.print("Merge Sorting : ");
  System.out.print(Arrays.toString(input));
  System.out.println();

  //Quick Sort
  QuickSort quickSort = new QuickSort();
  quickSort.quickSorting(input, 0, 7);
  System.out.println("Quick Sorted " + Arrays.toString(input));

  //insertion sort
  InsertionSort insertionSort = new InsertionSort();
  insertionSort.insertionSort(input);

  //selection sort
  SelectionSort selectionSort = new SelectionSort();
  selectionSort.sort(input);
  //adding two matrices
  System.out.println("Adding two matrices");
  AddTwoMatrices.addingTwoMatrices();
  //subtracting two matices
  System.out.println("subtracting two matrices");
  AddTwoMatrices.addingTwoMatrices();
  //Reverse String in place
  ReverseStringInPlace.reversingStringInPlace();
  //finding non repeating character in string
  NonRepeatedCharInString.findNonRepeatingCharacterInString();
  //reverse Number
  ReverseNumber.reverseNumber(1234);
  //Strings are anagram
  AnagramStrings.twoStringsAreAnagram();
  //Binary Search
  //     BinarySearchForAInteger.binarySearch();

  //Check Leap year
  System.out.println("2000 Leap year : " + LeapYear.isLeapYear(2000));
  System.out.println("2012 Leap year : " + LeapYear.isLeapYear(2012));
  System.out.println("1901 Leap year : " + LeapYear.isLeapYear(1901));

  //Reversing words in a sentence
  ReverseWordsInSentence.reverseWordsInSentences();

  //reversing an array in place
  ReverseAnArrayInPlace.reverseArrayInPlace();
  //Check if the string has repeated character
  RepeatedCharasInString.printRepeatedCharacterInString("Programming");
  //pyramid pattern
  pyramidPattern.pyramidpattern(6);
  pyramidPattern.pyramidOfNumbers(5);
  //square root
  SquareRoot.squareroot(4);
  //remove duplicates
  RemoveDuplicates.removeDuplicates();
  //reverse string
  System.out.println();
  ReverseStringInPlace.reverseString("Hello");
  System.out.println();

  //factorial
  System.out.println(Factorial.factorial(5));
  String name[] = {"Hello", "Madam", "coco"};
  System.out.println();

  //checks number is armstrong
  CheckingNumber.isArmstrong(153);
  System.out.println();
  //checking integer is palindrome
  CheckingNumber.intIsPalindrome(1001);
  System.out.println();
  //String is Palindrome
  System.out.println("Check String is Palindrome:");
  for (int i = 0; i < name.length; i++) {
   CheckingNumber.isPalindrome(name[i]);
  }
  System.out.println();
  //fibonacci series
  System.out.println("fibonnaci series:");
  for (int i = 1; i <= 6; i++) {
   System.out.print( CheckingNumber.fibonnaci(i) +  ",");
  }
  System.out.println();
  //Check number s prime
  System.out.println();
  System.out.println("Checking Prime :");
  for (int i = 1; i <= 5; i++) {
   CheckingNumber.checkPrime(i);
  }

 }
}
