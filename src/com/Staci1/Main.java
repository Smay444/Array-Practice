package com.Staci1;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.Staci1.PracticeClass.returnMost;
import static com.Staci1.PracticeClass.returnMostTwo;

public class Main {

    public static void main(String[] args) {
        //create an array - must list the length of the array
      /*  int[] numbers = new int[5];

        int howMany = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers in the array");
        howMany = Integer.parseInt(scanner.nextLine());
        int[] numberArray = new int[howMany];
        System.out.println("This array holds " + howMany + " elements");

        for (int i = 0; i < numberArray.length; i++) {
            System.out.print("Enter a number: ");
            numberArray[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("The Array is ");
        for (int n : numberArray) {
            System.out.println(n);
        }
        //find the minimum value
        int max = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (max < numberArray[i]) {
                max = numberArray[i];
            }
        }
        System.out.println("Maximum value is " + max);

        //find the maximum value
        int min = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (min > numberArray[i]) {
                min = numberArray[i];
            }
        }
        System.out.println("Maximum value is " + min);

        //find the average
        int sum = 0;
        for (int n : numberArray) {
            sum += n;

        }
        double average = (double) sum / numberArray.length;
        System.out.println("The Average is " + average);

        //sort the array - using bubble sort - easiest one to remember
        //nested loops are required nonrecursive sorting algorithms
        //outer loop looks at the pass
        //inner loop looks to swap them
        //keep comparing the two numbers all the way through

        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray.length - 1; j++) {
                // 45 23 67 12 1
                //anytime you're using a +1 using indexes, you'll need to use -1
                if (numberArray[j] > numberArray[j + 1]) {
                    //swap the numbers
                    int temp = numberArray[j];
                    numberArray[j] = numberArray[j + 1];
                    numberArray[j + 1] = temp;

                }

            }
        }
        System.out.println("The sorted Array is ");
        for (int n : numberArray) {
            System.out.println(n);
        }*/

      /*  Map<String, Integer> map = new HashMap<>();
        //map is an interface and hashmap is our concrete class
        boolean isDone = false;
        while (!isDone) {
            System.out.println("Enter a name");
            String name = scanner.nextLine();
            //load names into the map
            if (map.containsKey(name)) {
                map.put(name, 1);
                System.out.println("Enter more? Y/N ");
                if (scanner.nextLine().equalsIgnoreCase("n")) {
                    isDone = true;
                }
            }
            System.out.println(map);

        }*/

        PracticeClass practiceClass = new PracticeClass();
//        String str = "hello";
//        char mostCommonChar = returnMost(str);
//        System.out.println("The most common character is: " + mostCommonChar);
//
//        String newStr = "This is super difficult, but we won't be defeated by code";
//        char mostCommonCharTwo = returnMostTwo(newStr);
//        System.out.println("The most common character is: " + mostCommonCharTwo);

        int[] array = {1,2,3,4};
        // 1+2, 1+3, 1+4, 2+3, 2+4, 3+4
        int k = 3;
        System.out.println("The " + k + "th value is: " + practiceClass.kthBiggest(array, k));


    }


}