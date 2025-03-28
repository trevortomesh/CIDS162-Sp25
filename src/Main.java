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

    int[] deck = new int[52];
    String[] suits = {"♠", "❤", "♦", "♣"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                    "10", "Jack", "Queen", "King"};


    for(int i = 0; i < deck.length; i++) {
            deck[i] = i;
            //System.out.println(deck[i]);
    }

    for(int i = 0; i < deck.length; i++) {
        int index = (int) (Math.random() * deck.length);
        int temp = deck[i];
        deck[i] = deck[index];
        deck[index] = temp;
    }

    for(int card : deck){
        System.out.println(card);
    }

    // Display the first five cards
        for(int i = 0; i < 5; i++){
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " +
                    rank + " of " + suit);
        }


    }
}
