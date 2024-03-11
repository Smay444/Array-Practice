import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    private static String fileName = "C:\\Users\\Student\\Desktop\\mysandbox\\ArrayPractice\\PracticeIO.txt";

    public static void main(String[] args) {
        Main main = new Main();
        main.howToFindTheLargestValueInAnArray();
        main.readFile();
        main.getFileInfo();
        main.writeToAFile();
        main.localDateAndTime();
        main.frontBack();
        main.doubleChar();
        main.countHi();
        main.catDog();
        main.reverseAString();
        main.reverseAnotherString();
        main.arrayFront9(nums);
        main.newStr(string);
        main.firstTwo(string);
        main.has23(myArray);
        main.fib(n);
        main.fizzBuzz(numbers);
        main.fibonnaci(num);
        main.fibPractice(num);
        main.fixxBuxx(myNums);
        main.catDog(str);


    }

    public void howToFindTheLargestValueInAnArray() {
        int[] nums = {1, 2, 3, 4, 5, 100};

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("The largest number in the Array is: " + max);
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");
    }

    public void readFile() {
        try {
            File myObj = new File("C:\\Users\\Student\\Desktop\\mysandbox\\ArrayPractice\\PracticeIO.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (Exception ex) {
            System.out.println("An error has occured");
            ex.printStackTrace();
        }
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");
    }

    public static void getFileInfo() {
        File myObj = new File(fileName);
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());
        } else {
            System.out.println("File does not exist");
        }
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");
    }

    public static void writeToAFile() {
        try {
            FileWriter myWriter = new FileWriter(fileName, true);
            myWriter.write("Files in Java might be tricky, but it is fun enough!\n");
            myWriter.write("I'm really excited to learn what I'm doing!");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
            System.out.println("____________________________________________________________________");
            System.out.println("____________________________________________________________________");
        } catch (IOException ex) {
            System.out.println("An error occurred");
            ex.printStackTrace();

        }
    }

    public static void localDateAndTime() {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");
    }

    public static String frontBack() {

        String str = "";

        if (str.length() == 0) {
            return null;
        } else if (str.length() <= 1) {
            return str;
        } else {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            String mid = str.substring(1, str.length() - 1);
            System.out.println("The first character is: " + firstChar);
            System.out.println("The last character is: " + lastChar);
            System.out.println("The mid String is: " + mid);
            System.out.println("______________________________________");
            System.out.println(lastChar + mid + firstChar);
            System.out.println("____________________________________________________________________");
            System.out.println("____________________________________________________________________");
            return str;
        }
    }

    public static void doubleChar() {
        String newString = "";
        String str = "The";
        for (int i = 0; i < str.length(); i++) {
            newString += str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        System.out.println("Your new String is: " + newString);
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");


    }

    public static int countHi() {
        String str = "ABChi hi";
        int counter = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            String subStr = str.substring(i, i + 2);
            if (subStr.equals("hi")) {
                counter++;
            }
        }
        System.out.println("Hi is in the word " + counter + " number of times");
        return counter;
    }

    public static boolean catDog() {
        String str = "catdog";
        int dogCounter = 0;
        int catCounter = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String subStr = str.substring(i, i + 3);
            if (subStr.equals("dog")) {
                dogCounter++;
            } else if (subStr.equals("cat")) {
                catCounter++;
            }
        }
        if (dogCounter == catCounter) {
            return true;
        }
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");
        return false;
    }

    public static String reverseAString() {

        String myStr = "Staci";

        String myNewStr = "";

        char ch;

        for (int i = 0; i < myStr.length(); i++) {
            ch = myStr.charAt(i);
            myNewStr = ch + myNewStr;
        }
        System.out.println(myNewStr);
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");
        return myNewStr;

    }

    public static int[] reverseArr() {
        int[] arr = {0, 2, 4, 6, 8, 56, 23, 45, 11, 223};
        int[] newArr = {};

        int start = 0;
        int end = arr.length - 1;
        int temp;

        while (start < end) {
            // Swapping elements at start and end indices
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");
        return arr;

    }


    public static String reverseAnotherString() {
        String myStr = "Richard May";
        String myNewStr = "";
        char ch;

        for (int i = 0; i < myStr.length(); i++) {
            ch = myStr.charAt(i);
            myNewStr = ch + myNewStr;
        }
        System.out.println(myNewStr);
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");
        return myNewStr;

    }

    static int[] nums = {9, 2, 3};

    public boolean arrayFront9(int[] nums) {
        // if first four elements == 9 / return true
        int end = Math.min(nums.length, 4);

        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");
        return false;
    }


        /* Given a string, return a version without the first 2 chars.
        Except keep the first char if it is 'a' and keep the second char if it is 'b'.
        The string may be any length. Harder than it looks.

        Example:

        deFront("Hello") → "llo"
        deFront("java") → "va"
        deFront("away") → "aay"*/

    //return a all other characters except the first two
    //create a variable that starts at index two through the end
    //return that string

    static String string = "away";

    public String newStr(String string) {
        String newString = string.substring(2, string.length());

        System.out.println(newString);
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");
        return newString;
    }

    /* Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
    and otherwise return the string unchanged. This is a little harder than it looks.

    withoutX2("xHi") → "Hi"
    withoutX2("Hxi") → "Hi"
    withoutX2("Hexllo") → "Hello"
    withoutX2("Hi") -> "Hi"*/

    public String firstTwo(String string) {
        //check to see if char0 || char1 contains an 'x'
        // if true - return string without those x characters
        //else - return the string unchanged

        char first = string.charAt(0);
        char second = string.charAt(1);

        if (first == ('x') && second == ('x')) {
            System.out.println(string.substring(1, string.length()));
            return string.substring(1, string.length());
        } else if (first == ('x') && second != ('x')) {
            System.out.println(string.charAt(0) + string.substring(2, string.length()));
            return string.charAt(0) + string.substring(2, string.length());
        } else if (first != ('x') && second == ('x')) {
            System.out.println(string.substring(1, string.length()));
            return string.substring(1, string.length());
        }
        System.out.println(string);
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");
        return string;
    }

    /* Create a boolean method called has23 that takes in an integer array called nums and

    returns true if the array contains a 2 or a 3.*/
    static int[] myArray = {1, 1, 4, 2, 5, 6, 7, 8, 9, 10};

    public boolean has23(int[] myArray) {

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 2 || myArray[i] == 3) {
                System.out.println("true");
                System.out.println("____________________________________________________________________");
                System.out.println("____________________________________________________________________");
                return true;
            }
        }
        System.out.println("false");
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");
        return false;
    }

    /* Create a list of type string method called reverseList that takes in a list of type string "strings".

    Return a new list of type string that is the reverse order of the original.

    (HINT:  Think of data structures that might help us).

    reverseList (["purple", "red", "orange"])  ->  ["orange", "red", "purple"]

    reverseList([“one”, “two”, “three”, “four”]) => [“four”, “three”, “two”, “one”]*/

    static int n = 25;

    public void fib(int n) {
        int a = 0;
        int b = 1;
        int counter = 0;

        for (int i = 0; i < n; i++) {
            int temp = 0;
            temp = a + b;
            System.out.println("Fib#: " + temp);

            a = b;
            b = temp;
            counter++;

        }
        System.out.println("The number of loops was: " + counter);
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");

    }

    static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

    //return
    public void fizzBuzz(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0 && numbers[i] % 5 == 0) {
                System.out.println(numbers[i] + " = FizzBuzz");
            } else if (numbers[i] % 3 == 0) {
                System.out.println(numbers[i] + " = Fizz");
            } else if (numbers[i] % 5 == 0) {
                System.out.println(numbers[i] + " = Buzz");
            }
        }
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");


    }

    //create a function that will display the fibonnaci sequence up to and including an integer parameter
    static int num = 16;

    public void fibonnaci(int num) {

        int first = 0;
        int second = 1;


        for (int i = 0; i < num; i++) {
            int temp = 0;
            temp = first + second;
            first = second;
            second = temp;
            System.out.println(temp);

        }
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");
    }

    public static void fibPractice(int num) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < num; i++) {
            int temp = a + b;
            a = b;
            b = temp;
            System.out.println(temp);
        }
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");


    }

    static int[] myNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

    public static void fixxBuxx(int[] myNums) {

        for (int i = 0; i < myNums.length; i++) {
            if (myNums[i] % 3 == 0 && myNums[i] % 5 == 0) {
                System.out.println(myNums[i] + " = FixxBuxx");
            } else if (myNums[i] % 3 == 0) {
                System.out.println(myNums[i] + " = Fixx");
            } else if (myNums[i] % 5 == 0) {
                System.out.println(myNums[i] + " = Buxx");
            }
        }
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");

    }

    static String str = "catxxdogxxxdog";

    public boolean catDog(String str) {
        //create a counter for cat
        //create a counter for dog
        //loop through the str
        //if charat0 = d, etc.
        //add one to the dogcounter
        // if charA0=c, etc.
        //add one to the catcounter

        //if dog counter == cat counter

        int dogCounter = 0;
        int catCounter = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g') {
                dogCounter++;
            }
            else if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') {
                catCounter++;
            }


        }
        if (catCounter == dogCounter) {
            return true;
        }
        return false;

    }

    public static void practiceMore(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println();
        System.out.println("Enter Choice");

        int choice = Integer.parseInt(input.nextLine());
        if (choice == 1){
            //add();
        } else if (choice == 2){
            //subtract();
        } else if (choice == 3){
            //multiply();
        } else if (choice == 4){
            //divide();
        } else {
            System.out.println("Wrong Entry - Try again");
        }
    }
    public static void switchStatement(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println();
        System.out.println("Enter Choice");

        int choice = Integer.parseInt(input.nextLine());
        switch (choice){
            case 1:
                //add();
                break;
            case 2:
                //subtract();
                break;
            case 3:
                //multiply();
                break;
            case 4:
                //divide();
                break;
        }
    }

    public static void loops(){

        int x = 5;

        for (int i=5; i<16; i++){
            System.out.println(x);
        }

        while (x < 16){
            System.out.println(x);
        }

        do {
            System.out.println(x);
            x++;
        } while
            (x < 16);

    }

}

















