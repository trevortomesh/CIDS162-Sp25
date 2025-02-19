import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    /*
        int x; // this is an integer
        x = 5;
        String s;
        boolean b;
        b = false;
        s = "I like eggs";
        float float_pi = 3.14f;
        double pi = 3.14;
        int r = 1;
        double area = pi * Math.pow(r, 2);
        System.out.println("The area is " + area);
        System.out.print("Hello, World!");
        System.out.println("I'm Dr. T!");
        System.out.println("I like cats!" + " and " + s);
        System.out.println(x);
        System.out.println(11 % 10);

        int a = 4;
        int c = 2;
        System.out.println(a/c);
        int x = 42;
        int y = 12;
        int a = 5;
        int b = 24;
        int c = 21;

        int j = 3;
        int k = 2;
        System.out.println(j/2.0);
        double trouble = ((3+4*x)/5) - ((10 * (y-5) * (a + b + c )) / x) +
                9*((4/x) + ((9+x)/y));
        System.out.println(trouble);

        // farenheit = input("Enter a degree in Fahrenheit: ")

        // create a scanner to take information from the keyboard :-)
        /*
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // convert from freedom units to Canadian units (degrees celsius)
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Fahrenheit: " + fahrenheit + " is " +
                celsius + " in Celsius");
*/
/*        int x = 5;
        x++;  //x = x + 1;
        for(int x = 1; x < 10; x++) {
            System.out.println(x);
        }

        int i = 1;
        int j = i--;
        System.out.println("j is now " + j);
        System.out.println("i is now " + i);*/

//        int a = 5;
//        double x = a; //widening implicit casting
//        System.out.println(x);
//        int y;
//        y = (int) x; //narrowing explicit casting
//        System.out.println(y);
//
//        int i = 1;
//        byte b = (byte) i;
//        System.out.println(b);

//        int a = 50;
//        int b = 30;
//        //boolean compare = (a > b);
//        //System.out.println(compare);
//
//        if(a < b){
//            System.out.println(a);
//        }else{
//            System.out.println(b);
//        }

//        int number1 = (int)(System.currentTimeMillis() % 10);
//        int number2 = (int)(System.currentTimeMillis() / 10 % 10);
//
//        //create a scanner
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("What is " + number1 + " + " + number2 + "?");
//        int answer = input.nextInt();
//
//        System.out.println(
//                number1 + " + " + number2 + " = " + answer + " is " +
//                        (answer == number1 + number2));

//        Scanner input = new Scanner(System.in);
//        System.out.println("Give me a temp in F");
//        int lowtemp = 55; // too cold to go on a pic-nic
//        int hightemp = 80; // too hot to go on a pic-nic
//        int temp = input.nextInt(); // actual temp
//        //System.out.println("temp is " + temp);
//        if(temp >= hightemp){
//            System.out.println("Too hot!");
//        }else{
//            System.out.println("Not too hot!");
//        }
//
//        if(temp <= lowtemp){
//            System.out.println("Too cold!");
//        }else{
//            System.out.println("Not too cold!");
//        }
//
//        if(temp > lowtemp && temp < hightemp){
//            System.out.println("It's pic-nic time!");
//        }
//        else{
//            System.out.println("No pic-nic for you!");
//        }
//
//        boolean gate1_open = true;
//        boolean gate2_open = true;
//        boolean gate3_open = true;
//
//        if(gate1_open) {
//            System.out.println("All the subjects in lvl 1 are dead!!!");
//            if(gate2_open) {
//                System.out.println("All the subjects in lvl 2 are dead!!!");
//                if(gate3_open) {
//                    System.out.println("The king is dead!!!");
//                }
//            }
//        }

//    System.out.println("Enter a numeric grade: ");
//    Scanner input = new Scanner(System.in);
//    int grade = input.nextInt();

   // System.out.println("You entered " + grade);

//    if(grade >= 90 && grade <= 100){
//        System.out.println("A");
//    }
//    if(grade < 90 && grade >=80){
//        System.out.println("B");
//    }
//    if(grade < 80 && grade >= 70){
//        System.out.println("C");
//    }
//    if(grade < 70 && grade >= 60){
//        System.out.println("D");
//    }
//    if(grade < 60){
//        System.out.println("F");
//    }
//    else{
//        System.out.println("That's not a valid number grade!");
//    }

//        if(grade >= 90){
//            System.out.println("A");
//        }
//        else if(grade >= 80){
//            System.out.println("B");
//        }
//        else if(grade >= 70){
//            System.out.println("C");
//        }
//        else if(grade >=60){
//            System.out.println("D");
//        }
//        else{
//            System.out.println("F");
//        }

        // 1. Generate two random single-digit integers
//        int number1 = (int) (Math.random() * 10);
//        int number2 = (int) (Math.random() * 10);
//
//        System.out.println(number1 + " " + number2);
//
//        // 2. if number1 < number, swap number1 with number2
//        if(number1 < number2){
//            int temp = number1;
//            number1 = number2;
//            number2 = temp;
//        }
//
//        // 3. Prompt the student to answer "What is number1 - number2?"
//        System.out.print("What is " + number1 + " - " + number2+"?");
//        Scanner input = new Scanner(System.in);
//        int answer = input.nextInt();
//
//        // 4. Grade the answer and display the result
//
//        if(answer == number1 - number2){
//            System.out.println("You are correct! Great job, you can compete with TI-82!");
//        }else{
//            System.out.print("You are wrong. The answer is ");
//            System.out.print(number1 - number2);
//            System.out.println("! Your parents don't love you anymore!");
//        }

//        if((false ^ false) && (true) || true){
//            System.out.println("TADA!");
//
//        }else{
//            System.out.println("Womp womp...");
//        }
//

//***************************************************************//

    /*
        - check if a number is
        a) divisible by 2 and 3  &&
        b) divisible by 2 or 3   ||
        c) divisible by 2 or 3 but not both  ^
     */

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int number = input.nextInt();
//
//        // number % 2 == 0 is even
//
//        if(number % 2 == 0 && number % 3 == 0){
//            System.out.println(number + " is divisible by 2 and 3.");
//        }
//
//        if(number % 2 == 0 || number % 3 == 0){
//            System.out.println(number + " is divisible by 2 OR 3.");
//        }
//
//        if(number % 2 == 0 ^ number % 3 == 0){
//            System.out.println(number + " is divisible by 2 OR 3 not BOTH.");
//        }
//
//        if(number == 13 || number == 23){
//            System.out.println("Those are stupid numbers... you should feel bad!");
//        }

    int day = 7;

    switch(day){
        case 0: System.out.println("It's Sunday!");
        break;
        case 1: System.out.println("It's Monday!");
        break;
        case 2: System.out.println("It's Tuesday!");
        break;
        case 3: System.out.println("It's Wednesday!");
        break;
        case 4: System.out.println("It's Thursday!");
        break;
        case 5: System.out.println("It's Friday!");
        break;
        case 6: System.out.println("It's Saturday!");
        break;
        default: System.out.println("Enter an int between 0 and 6!");

    }




    }
}
