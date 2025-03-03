/**
 * Main program for my CIDS 162 Course
 * @author Trevor M. Tomesh
 * @version 1.0
 * @since 2025-02-24
 *
 */

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

        System.out.println("    MULTIPLICATION TABLE");
        System.out.print("    ");
        for(int j = 1; j <=9; j++){
            System.out.print("   "+j);
        }
        System.out.println("\n------------------------------");

        for(int i = 1; i <= 9; i++){
            System.out.print(i+" | ");
            for(int j = 1; j <=9; j++){
                System.out.printf("%4d", i*j);
            }
            System.out.println();
        }


    }
}
