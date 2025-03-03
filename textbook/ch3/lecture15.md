**CS 162 Lecture Notes - March 3, 2025**

### Assignment Reminder
- Your assignment is due soon!
- Make sure to follow the template provided.
- Common mistakes:
    - Submitting just a picture and a paragraph (not enough detail).
    - Taking full-screen screenshots instead of cropping.
    - Taking a photo of your screen instead of using a proper screenshot tool.
- If you have any questions, I am available in my office from 3 to 5 PM today.

### Quiz Error Explanation
- There was an error in the quiz regarding switch statements.
- Missing `break;` statements caused unintended fall-through behavior.
- Example:
  ```java
  int number = 4;
  switch (number) {
      case 2:
          System.out.println("Two");
      case 4:
          System.out.println("Four");
      case 6:
          System.out.println("Six");
      default:
          System.out.println("Other");
  }
  ```
  **Output:**
  ```
  Four
  Six
  Other
  ```
- Without `break;`, execution continues into the next case block.
- Always include `break;` unless intentional fall-through is desired.

### For Loops
#### Basic For Loop Structure
```java
for (initialization; condition; update) {
    // Code block to execute
}
```
- Example:
  ```java
  for (int i = 0; i < 10; i++) {
      System.out.println(i);
  }
  ```
    - **Initialization:** `int i = 0` (starts at 0)
    - **Condition:** `i < 10` (runs while `i` is less than 10)
    - **Update:** `i++` (increments `i` by 1 each iteration)

#### Variations
- Incrementing by different values:
  ```java
  for (int i = 0; i < 100; i += 2) {
      System.out.println(i); // Prints even numbers from 0 to 98
  }
  ```
- Decrementing:
  ```java
  for (int i = 100; i > 0; i--) {
      System.out.println(i); // Prints from 100 to 1
  }
  ```

### Nested Loops
- A loop inside another loop.
- Useful for handling multi-dimensional data like tables.
- Example:
  ```java
  for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
          System.out.print(i * j + "\t");
      }
      System.out.println();
  }
  ```
  **Output:**
  ```
  1   2   3   4   5
  2   4   6   8   10
  3   6   9   12  15
  4   8   12  16  20
  5   10  15  20  25
  ```

### Multiplication Table Program
```java
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("    Multiplication Table");
        
        System.out.print("    ");
        for (int j = 1; j <= 9; j++) {
            System.out.printf("%4d", j);
        }
        System.out.println("\n   -----------------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
```
**Key Features:**
- Prints a multiplication table from 1 to 9.
- Uses nested loops: outer loop for rows (`i`), inner loop for columns (`j`).
- Uses `printf` for formatted output.

---

### Practice Problems
1. **Basic Iteration:**
   Write a `for` loop that prints numbers from 10 to 1 in reverse order.

2. **Sum of Numbers:**
   Write a program that uses a `for` loop to calculate the sum of numbers from 1 to 100.

3. **Even Numbers:**
   Modify the loop to print only even numbers from 1 to 50.

4. **Multiplication Table (User Input):**
   Modify the multiplication table program to accept a user input number `n` and print an `n x n` table.

5. **Pattern Printing:**
   Write a nested `for` loop that prints the following pattern:
   ```
   *
   **
   ***
   ****
   *****
   ```

6. **Fibonacci Sequence:**
   Write a `for` loop to generate the first 10 numbers of the Fibonacci sequence.

7. **Prime Number Checker:**
   Write a `for` loop that checks if a given number is prime.

8. **Countdown Timer:**
   Implement a countdown timer using a `for` loop that counts down from 10 to 1 and prints "Liftoff!" at the end.

9. **Number Triangle:**
   Write a nested loop to print:
   ```
   1
   1 2
   1 2 3
   1 2 3 4
   1 2 3 4 5
   ```

10. **Diamond Pattern:**
    Write a nested loop that prints a diamond shape using `*` characters.

---

This concludes our discussion on `for` loops. Next, we'll explore how `for-each` loops simplify iteration for collections and arrays.

See you in the next class! 🚀

