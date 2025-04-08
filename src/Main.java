/**
 * Main program for my CIDS 162 Course
 * @author Trevor M. Tomesh
 * @version 1.0
 * @since 2025-02-24
 *
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        int sum = 0;
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
    System.out.println("Sum from 1 to 10 is " + sum(1, 10));
    System.out.println("Sum from 20 to 37 is " + sum(20, 37));
    System.out.println("Sum from 35 to 49 is " + sum(35, 49));
    System.out.println(5);
    int a = sum(24, 42);
    System.out.println(a);

    int z = max(13, 21);
    System.out.println("The max is " + z);
    System.out.println(max(12, 3939));
    sayPikachu(100);
    System.out.println(giveMario());

    int pi = (int) giveDouble();

System.out.println(pi);

    double myMax = max(1.2, 3.4);
    System.out.println(myMax);
    int myMax2 = max(2,7);
    System.out.println(myMax2);
    System.out.println(max(2.7, 3.4, 12.9));
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




