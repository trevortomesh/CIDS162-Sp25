/**
 * Main program for my CIDS 162 Course
 * @author Trevor M. Tomesh
 * @version 1.0
 * @since 2025-02-24
 *
 */

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws java.io.IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a URL: ");
        String url = input.nextLine();
        crawler(url);


//        System.out.print("Enter a URL: ");
//        String URLString = new Scanner(System.in).next();
//
//        try{
//            java.net.URL url = new java.net.URL(URLString);
//            int count = 0;
//            Scanner input = new Scanner(url.openStream());
//            while(input.hasNext()){
//                String line = input.nextLine();
//                System.out.println(line);
//                count += line.length();
//            }
//            System.out.println("The file size is " + count + " characters");
//        }catch(java.net.MalformedURLException ex){
//            System.out.println("Invalid URL");
//        }catch(java.io.IOException ex){
//            System.out.println("I/O Errors: no such file");
//        }

        //Scanner input = new Scanner(new File("test.txt"));
//        Scanner input = new Scanner("13 14");
//        int sum = input.nextInt() + input.nextInt();
//        System.out.println("Sum is " + sum);
////        int intValue = input.nextInt();
////        input.nextLine();
////        String line = input.nextLine();
////
////        System.out.println(intValue);
////        System.out.println(line);
////        java.io.File file = new java.io.File("scores.txt");
////        if(file.exists()){
////            System.out.println("File already exists! Reading instead!");
////            Scanner input = new Scanner(file);
////            while(input.hasNext()){
////                String firstName = input.next();
////                String mi = input.next();
////                String lastName = input.next();
////                int score = input.nextInt();
////                System.out.println(firstName + " " +
////                        mi + " " + lastName + " " + score);
////
////            }
////            input.close();
////
////        }else {
////
////            try (java.io.PrintWriter output = new java.io.PrintWriter(file);) {
////
////                output.print("John T. Smith ");
////                output.println(90);
////                output.print("Eric K. Jones ");
////                output.println(85);
////
////            }

}

    public static void crawler(String startingURL){
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();
        listOfPendingURLs.add(startingURL);
        while(!listOfPendingURLs.isEmpty() &&
                listOfTraversedURLs.size() <= 100){
            String urlString = listOfPendingURLs.remove(0);
            if(!listOfTraversedURLs.contains(urlString)){
                listOfTraversedURLs.add(urlString);
                System.out.println("Crawl" + urlString);

                for(String s : getSubURLs(urlString)){
                    if(!listOfTraversedURLs.contains(s))
                        listOfPendingURLs.add(s);
                }
            }
        }

    }

    public static ArrayList<String> getSubURLs(String urlString){
        ArrayList<String> list = new ArrayList<>();
        try{
            java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while(input.hasNext()){
                String line = input.nextLine();
                current = line.indexOf("http", current);
                while(current > 0){
                    int endIndex = line.indexOf("\"",current);
                    if(endIndex > 0){
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    }else{current = -1;}
                }
            }
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
        return list;
    }

//        PrintWriter output = new PrintWriter(filename);
//        File file = new File("/Users/trevortomesh/Desktop/School/SP2025/UWRF/CIDS162-Sp25/src/example.txt");
//        System.out.println("Does it exist? " + file.exists());
//        System.out.println("The file has " + file.length() + " bytes");
//        System.out.println("Can it be read? " + file.canRead());
//        System.out.println("Can it be written? " + file.canWrite());
//        System.out.println("Can it be executed? " + file.canExecute());
//        System.out.println("Is it a directory? " + file.isDirectory());
//        System.out.println("Is it a file? " + file.isFile());
//        System.out.println("Is path absolute? " + file.isAbsolute());
//        System.out.println("The absolute filepath is: " +
//                file.getAbsolutePath());
//        System.out.println("Last modified on " +
//                new java.util.Date(file.lastModified()));


//        Scanner scanner = null;
//
//        try{
//            scanner = new Scanner(new File("example.txt"));
//            if(scanner.hasNextLine()){
//                String line = scanner.nextLine();
//                System.out.println("First line: " + line);
//            }
//        }catch(FileNotFoundException e){
//            System.out.println("File not found!");
//        }finally{
//            if (scanner != null){
//                scanner.close();
//                System.out.println("Scanner closed.");
//            }else{
//                System.out.println("Scanner was not opened. No need to close!");
//            }


//        int a = 10;
//        int b = 10;
//
//        try{
//            int result = a / b;
//            System.out.println("Result: " + result);
//        } catch(ArithmeticException e){
//            System.out.println("Error: Cannot divide by zero!");
//        }finally{
//            System.out.println("This runs no matter what!");
//        }
//
//        System.out.println("Program continues...");

//        Scanner input = new Scanner(System.in);
//        boolean continueInput = true;
//
//        do{
//            try{
//                System.out.println("Enter an integer: ");
//                int number = input.nextInt();
//
//                System.out.println("The number entered is " + number);
//
//                continueInput = false;
//            }catch(InputMismatchException ex){
//                System.out.println("Try again!");
//                input.nextLine(); // Discard input
//            }
//        }while(continueInput);

//        int number1 = input.nextInt();
//        int number2 = input.nextInt();
//
//        try {
//            int result = quotient(number1, number2);
//            System.out.println(number1 + " / " + number2 + " is " + result);
//        }catch(ArithmeticException ex){
//            System.out.println(ex.getMessage());
//        }

        //  System.out.println("Execution continues...");


//    try{
//        File file  = new File("src/example.txt");
//        Scanner scanner = new Scanner(file);
//
//        while(scanner.hasNextLine()){
//            String line = scanner.nextLine();
//            System.out.println(line);
//        }
//        scanner.close();
//    } catch(FileNotFoundException e){
//        System.out.println("File not found!");
//    }
//
//    try(FileWriter writer = new FileWriter("src/output.txt",true)){
//        writer.write("Hello, world!\n");
//        writer.write("Or some crap like that...\n");
//
//    } catch (IOException e) {
//        System.out.println("An error occurred!");
//        System.out.println(e.getMessage());
//    }
//
//    System.out.println("Thanks for programming with us today!");



//        int[][] matrix = new int[10][10];
//
//        for(int row = 0; row < matrix.length; row++){
//            for(int column = 0; column < matrix[row].length; column++){
//                matrix[row][column] = (int)(Math.random() * 100);
//            }
//        }
//
//        System.out.println("The matrix in the main method is " + matrix);
//        printArray(matrix);
//

        /*//        int sum = 0;
//
//        for(int i = 1; i <= 10; i++){
//            sum += i;
//        }
//        System.out.println("Sum from 1 to 10 is " + sum);
//
//        sum = 0;
//        for(int i = 20; i <= 37; i++){
//            sum += i;
//        }
//        System.out.println("Sum from 20 to 37 is " + sum);
//
//        sum = 0;
//        for(int i = 35; i <= 49; i++){
//            sum += i;
//        }
//        System.out.println("Sum from 35 to 49 is " + sum);

//    int[] deck = new int[52];
//    String[] suits = {"♠", "❤", "♦", "♣"};
//    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
//                    "10", "Jack", "Queen", "King"};
//
//
//    for(int i = 0; i < deck.length; i++) {
//            deck[i] = i;
//            //System.out.println(deck[i]);
//    }
//
//    for(int i = 0; i < deck.length; i++) {
//        int index = (int) (Math.random() * deck.length);
//        int temp = deck[i];
//        deck[i] = deck[index];
//        deck[index] = temp;
//    }
//
//    for(int card : deck){
//        System.out.println(card);
//    }
//
//    // Display the first five cards
//        for(int i = 0; i < 5; i++){
//            String suit = suits[deck[i] / 13];
//            String rank = ranks[deck[i] % 13];
//            System.out.println("Card number " + deck[i] + ": " +
//                    rank + " of " + suit);
//        }
//    System.out.println("Sum from 1 to 10 is " + sum(1, 10));
//    System.out.println("Sum from 20 to 37 is " + sum(20, 37));
//    System.out.println("Sum from 35 to 49 is " + sum(35, 49));
//    System.out.println(5);
//    int a = sum(24, 42);
//    System.out.println(a);
//
//    int z = max(13, 21);
//    System.out.println("The max is " + z);
//    System.out.println(max(12, 3939));
//    sayPikachu(100);
//    System.out.println(giveMario());
//
//    int pi = (int) giveDouble();
//
//System.out.println();
//
//    double myMax = max(1.2, 3.4);
//    System.out.println(myMax);
//    int myMax2 = max(2,7);
////    System.out.println(myMax2);
////    System.out.println(max(2.7, 3.4, 12.9));
//
//        int j = 0;
//        while(j < 100){
//            System.out.println(j);
//            j++;
//        }
//
//        for(int i = 0; i < 100; i++){
//            System.out.println(i);
//            System.out.println(j);
//            if(true){
//                int k = 7;
//                System.out.println(i);
//            }
//            System.out.println(k);
//        }
//
//        //System.out.println(i);
//        int i = 5;
//        System.out.println(i);
//        int x = 12;
//        System.out.println(x);
//        doThing();
//        System.out.println(i);
//        System.out.println(x);*/
//        int[] myArray = {36, 32, 19, 19, 19, 18, 21, 20, 19, 19, 19,
//                        20, 18, 19, 51, 20, 20, 20};
//
//        //System.out.println(myArray);
//
//        printArray(myArray);
//        System.out.println("-------------------------");
//        printMultiplyArray(myArray, 5);
//        System.out.println("-------------------------");
//        printArray(myArray);
//
//        System.out.println("The address in the main method is " + myArray);

//        int x = 10;
//        changeX(x);
//        System.out.println(x);

//        int x = 1;
//        int[] numbers = {1,2,3};
//        System.out.println("Before: " + numbers[0]);
//       // System.out.println("Before: " + x);
//
//        System.out.println(numbers);
//        reassignArray(numbers);
//        //changeFirstElement(numbers, x);
//
//        System.out.println("--------------------");
//        System.out.println("After: " + numbers[0]);
//        //System.out.println("After: " + x);

//        int[] list1  = {1,2,3,4,5,6};
//        int[] list2 = reverse(list1);
//        int[] listNew = gimmieArray();
//        printArray(listNew);
//        System.out.println(list2);
//
//        printArray(list2);
//        int[] blankArray = numArray(9,7);
//        printArray(blankArray);

//        int[] myArray =  {1,2,3,4,5};
//        int[][] my2dArray = {{1},{3,4,5},{5,6}};
//        System.out.println(my2dArray[1][1]);
/*        String[] books = {"The Lord of the Rings", "HG2G",
                "Art of Computer Programming", "The Bible"};

        String[] games = {"Legend of Zela", "Pokemon", "Minecraft",
                            "Call of Duty", "Balatro"};

        String[] movies = {"The Lord of the Rings", "HG2G", "The Matrix"};

        String[] guns = {"Walther PDP", "12-Gauge", "AT AR-15", "Taurus Revolver"};

        String[] pens = {"Lammy 2000", "Twisbi", "Lamy Safari"};

        String[][] electronics = {games,movies};
        String[][] other = {books, guns, pens};
        String[][][] collections = {electronics, other};

        System.out.println(collections[0][0][4]);


        int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] triangleArray = {
                {1,2,3,4,5},
                {2,3,4,5},
                {3,4,5},
                {4,5},
                {5}
        };

        System.out.println(triangleArray[0].length);
        System.out.println(triangleArray[1].length);

        int[][] newTriangleArray = new int[5][];
        newTriangleArray[0] = new int[5];
        newTriangleArray[1] = new int[4];
        newTriangleArray[2] = new int[3];
        newTriangleArray[3] = new int[2];
        int a = 5;
        newTriangleArray[4] = new int[1];

        for(int i = 0; i < newTriangleArray.length; i++){
            System.out.println(newTriangleArray[i]);
        }*/

       // System.out.println(collections[2][2]);



    public static int quotient(int number1, int number2){
        if(number2 == 0){
            throw new ArithmeticException("Divisor cannot be zero!");
        }
        return number1 / number2;
    }

    public static int[] gimmieArray(){
        int[] newArray = {1,2,3,4,5,6,12};
        return newArray;
    }

    public static int[] numArray(int l, int num){
        int[] result = new int[l];
        for(int i = 0; i < l; i++){
            result[i] = num;
        }
        return result;
    }

    public static int[] reverse(int[] list){
        int[] result = new int[list.length];

        for(int i = 0, j = result.length - 1;
            i < list.length; i++, j--) {
            result[j] = list[i];
        }
        System.out.println(result);
        return result;
    }


    public static void reassignArray(int[] arr){
        arr = new int[]{9,9,9};
        System.out.println(arr);
        arr = new int[]{7,7,7};
        System.out.println(arr);
    }

    public static void changeFirstElement(int[] array, int x){
        array[0] = 14;
        x = 14;
    }
    public static void changeX(int x){
        x = x + 99;
        System.out.println(x);
    }

    public static void printArray(int[] array){
        for(int element : array){
            System.out.println(element);
        }
    }

    public static void printArray(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        System.out.println("The matrix in the print2darray method is " + matrix);
    }

    public static void printMultiplyArray(int[] array, int n){
        for(int i = 0; i < array.length; i++){
            array[i] = array[i] * n;
            System.out.println(array[i]);
        }
        System.out.println("The address in the method is " + array);
    }

    public static void doThing(){
        int x = 10;
        //System.out.println(j);
        System.out.println(x);
    }

    public static int sum(int i1, int i2){
       int result = 0;
       for(int i = i1; i <= i2; i++){
           result += i;
       }
       return result;
    }

    public static int max(int num1, int num2){
        int result;
        if(num1 > num2){
            result = num1;
        }
        else{
            result = num2;
        }
        return result;
    }

    public static double max(double num1, double num2){
        if(num1 > num2){
            return num1;
        }
        else{
            return num2;
        }
    }

    public static double max(double num1, double num2, double num3){
        return max(max(num1, num2), num3);
    }

    public static double giveDouble(){
        return 3.14159;
    }

    public static void sayPikachu(int times){
        for(int i = 0; i < times; i++){
            System.out.println("PIKACHUUUUUUU!!!!!");
        }
    }

    public static String giveMario(){
        return "It's a me, mario!";
    }

}




