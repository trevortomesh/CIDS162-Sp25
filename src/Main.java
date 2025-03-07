/**
 * Main program for my CIDS 162 Course
 * @author Trevor M. Tomesh
 * @version 1.0
 * @since 2025-02-24
 *
 */
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


//        for(int i = 0; i < 100; i++){
//            System.out.println(i);
//        }
//
//        for(int i = 0, j = 0; i+j < 10; i++, j++){
//            System.out.println(i);
//            System.out.println(j);
//        }

        /*for(int i = 0; i < 10; i++){
            for(int j = 10; j > 0; j--){
                System.out.println("j is " + j);
                System.out.println("i is " + i);
            }
        }*/

//        System.out.println("    MULTIPLICATION TABLE");
//        System.out.print("    ");
//        for(int j = 1; j <=9; j++){
//            System.out.print("   "+j);
//        }
//        System.out.println("\n------------------------------");
//
//        for(int i = 1; i <= 9; i++){
//            System.out.print(i+" | ");
//            for(int j = 1; j <=9; j++){
//                System.out.printf("%4d", i*j);
//            }
//            System.out.println();
//        }

//        int sum = 0;
//        int number = 0;
//
//        while (number < 20){
//            number++;
//            sum += number;
//            if(sum >= 100){
//                break;
//            }
//
//            System.out.println("The number is " + number);
//            System.out.println("The sum is " + sum);
//        }


//
//        int i = 0;
//        while( i < 20){
//            i++;
//            if(i == 10 || i == 11){
//                break;
//            }
//            System.out.println(i);
//        }

////// Palindrome Checker
//Scanner input = new Scanner(System.in);
//
////// 1) Prompt user to enter a string
//System.out.print("Enter a string: ");
//String s = input.nextLine();
//
////// 2) Get lowest and highest characters of the string
//int low = 0;
//int high = s.length() - 1;
//
////// assume we have a palindrome
//boolean isPalindrome = true;
//
//while(low < high){
//    if(s.charAt(low) != s.charAt(high)) {
//        isPalindrome = false;
//        break;
//    }
//    low++;
//    high--;
//}
//
//    if(isPalindrome){
//        System.out.println(s + " is a palindrome!");
//    }else{
//        System.out.println(s + " is NOT a palindrome!");
//    }

//        String s = "tacocat";
//        System.out.println(s.charAt(3));
//        char a = s.charAt(3);
//        System.out.println("s.charAt(3) is " + a);
//        String b = "Hello";
//        String c = " World!";
//        String d = b + c + " This is neato!";
//        String x = "             129 TACOS";
//        System.out.println(x.trim());

//        String thing = "My preciousssssss!";
//        System.out.println(thing.startsWith("My"));
//        System.out.println("One Ring to Rule Them All!".endsWith("Monkey!"));
//        String password = "Mellon";
//        Scanner input = new Scanner(System.in);
//        System.out.println("What is the password?");
//        String userPassword = input.nextLine();
//        System.out.println("You entered: " + userPassword);
//
//        userPassword = userPassword.toLowerCase();
//        if(userPassword.contains(password.toLowerCase())){
//            System.out.println("You may enter!");
//        }else{
//            System.out.println("YOUUU SHALL NOT PAAAASSSSSS!");
//        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        if(city1.compareTo(city2) < 0) {
            System.out.println("The cities in alphabetical order are " +
                    city1 + " " + city2);
        }else {
            System.out.println("The cities in alphabetical order are " +
                    city2 + " " + city1);
        }


    }
}
