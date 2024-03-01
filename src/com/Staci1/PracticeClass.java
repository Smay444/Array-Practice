package com.Staci1;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class PracticeClass {

    static String str = "";
    /*Write a method called returnMost/ReturnMost that takes in a string
    and returns the character that appears the most in the string

    EX returnMost("Hi, this is my string")  => returns i
    */
    public static char returnMost(String str){
        //convert the string to lowercase
        //initialize a counter
        //initialize a variable to store the char shown the most
        //need to place the new array somewhere
        //loop through the string

        String newStr = str.toLowerCase();
        int maxCount = 0;
        char mostCommonChar = '\0'; // \0 represents a null character
        int[] charCount = new int[256]; //to accomodate for all 255 ASCII characters

        for (char c : newStr.toCharArray()){
            //if the character is a letter add one to the counter
            if(Character.isLetter(c)){
                charCount[c]++;
                if (charCount[c] > maxCount){
                    maxCount = charCount[c];
                    mostCommonChar = c;
                }
            }
        }
            return mostCommonChar;
    }

    public static char returnMostTwo(String str){

        int maxCount = 0;
        String newStr = str.toLowerCase();
        char mostCommonChar = '\0';
        int[] charCount = new int[256];

        for (char c : newStr.toCharArray()){
            if (Character.isLetter(c)){
                charCount[c]++;

                if (charCount[c]>maxCount){
                    maxCount = charCount[c];
                    charCount[c] = mostCommonChar;
                }
            }
        }

        return mostCommonChar;
    }

    static int[] array = {1, 2, 3, 5};
    int k = 3;
   public static int kthBiggest (int[] array, int k){
        //find all possible pairs within the array and calculate their sums
       // store them in an array or list
       // sort the array/list to get the kth biggest

        List<Integer> sums = new ArrayList<>();
       for (int i = 0; i < array.length; i++) {
           for (int j = i+1; j < array.length; j++) {
                int sum = array[i] + array[j];
                sums.add(sum);
           }
       }

       sums.sort(Collections.reverseOrder()); // this will sort in ascending order
       //I need it in descending order

        return sums.get(k-1);
   }
//    You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
//    starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
//    Return the merged string.
    String word1 = "Staci";
   String word2 = "May";
    public static String mergeAlternately(String word1, String word2){

        //get the character at the the first index of word 1
        //add that to a new string
        //get the character at the first index of word 2
        //add that to a new string

        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
       while (i < word1.length() || j < word2.length()){
           if (i < word1.length()){
               sb.append(word1.charAt(i));
               i++;
           }
           if (j < word2.length()){
               sb.append(word2.charAt(j));
               j++;
           }

       }

        return sb.toString();




    }



}
