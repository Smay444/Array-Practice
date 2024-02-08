package com.Staci1;

public class PracticeClass {

    String str = "";
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
        int[] intArray = new int[256];
        char mostCommonChar = '\0';

        for (char c : newStr.toCharArray()){
            if (Character.isLetter(c)){
                intArray[c]++;
                if(intArray[c]>maxCount){
                    maxCount = intArray[c];
                    mostCommonChar = c;
                }
            }
        }

        return mostCommonChar;
    }



}
