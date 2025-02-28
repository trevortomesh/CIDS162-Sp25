**Lecture Notes: Loops and the Guessing Game**  
**CS 162 - February 28, 2025**

---

### Introduction to Loops
- Computers excel at performing repetitive tasks efficiently.
- Loops allow us to execute a block of code multiple times until a condition is met.
- Types of loops in Java:
    - `while` loop
    - `do-while` loop
    - `for` loop (covered in the next lecture)

### Infinite Loops
- A `while (true)` loop with no exit condition will run indefinitely, potentially causing the program to crash.
- Example of an infinite loop:
  ```java
  while (true) {
      System.out.println("Oops");
  }
  ```
- Always ensure loops have a way to terminate!

---

### The Guessing Game
#### Objective:
- The program will generate a random number between 1 and 100.
- The user will repeatedly guess until they get the correct number.
- The program will indicate whether the guess is too high or too low.

#### Steps to Implement:
1. Generate a random number.
2. Prompt the user to guess.
3. Compare the guess to the number.
4. Provide feedback (too high, too low, correct guess).
5. Repeat until the correct guess is made.

#### Code Implementation:
```java
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1; // Generate random number between 1-100
        int guess;
        boolean running = true;

        System.out.println("Guess a number between 1 and 100:");

        while (running) {
            guess = input.nextInt();

            if (guess == number) {
                System.out.println("You win!");
                running = false;
            } else if (guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
        }
        input.close();
    }
}
```
- Uses a `while` loop to keep the game running until the user guesses correctly.
- Uses a flag (`running`) to control the loop execution.
- Uses `if-else` statements to guide the user.

---

### Sentinel Values and the Adding Machine
#### Concept:
- A sentinel value is a special value that signals termination of a loop.
- Example: An adding machine that sums numbers until the user enters `0`.

#### Code Implementation:
```java
import java.util.Scanner;

public class AddingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int data;

        System.out.println("Enter integers to sum. Input 0 to stop.");

        while ((data = input.nextInt()) != 0) {
            sum += data;
        }

        System.out.println("The sum is " + sum);
        input.close();
    }
}
```
- The loop continues until the user enters `0`.
- The sentinel value (`0`) controls when the loop exits.

---

### `do-while` Loop
- Similar to a `while` loop but guarantees at least one execution of the loop body.
- Syntax:
  ```java
  do {
      // Code to execute
  } while (condition);
  ```
- Example:
  ```java
  int count = 0;
  do {
      System.out.println("Count: " + count);
      count++;
  } while (count < 5);
  ```
- Executes the block first, then checks the condition.
- Useful when user input is required at least once.

---

### Practice Problems
#### **Basic Loop Exercises**
1. Write a `while` loop that prints numbers from 1 to 50.
2. Modify the guessing game to limit the number of attempts to 5.
3. Implement a `do-while` loop that keeps asking the user for input until they enter "exit".

#### **Intermediate Challenges**
4. Modify the adding machine so that it also keeps track of the count of numbers entered.
5. Implement a multiplication table generator using a `while` loop.
6. Modify the guessing game to provide a hint if the user is within 5 numbers of the correct guess.

#### **Advanced Challenge**
7. Implement a simple menu system using a `do-while` loop that allows the user to choose from multiple options (e.g., Guessing Game, Adding Machine, Exit).

---

### Summary
- **`while` loop**: Repeats while the condition is true.
- **`do-while` loop**: Executes at least once before checking the condition.
- **Infinite loops**: Avoid unless intentional.
- **Sentinel values**: Used to signal loop termination.
- **Games and interactive programs** rely heavily on loops for repeated execution.

**Next Lecture: `for` Loops - Making Looping More Efficient**

