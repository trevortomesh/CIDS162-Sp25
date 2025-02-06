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
    */

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

        int a = 5;
        double x = a; //implicit casting
        System.out.println(x);
        int y;
        y = (int) x; //explicit casting
        System.out.println(y);


    }
}
