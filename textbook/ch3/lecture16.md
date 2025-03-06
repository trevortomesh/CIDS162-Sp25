# CS 162 - March 5, 2025

## Loops and Control Flow in Java

### Nested Loops and Multiplication Tables

In our last discussion, we explored **nested loops**, particularly using `for` loops, to generate a **multiplication table**. This involved using:

- An **outer loop** that controlled the rows (multiplication of numbers from 1 to 9)
- An **inner loop** that iterated through each column, computing the product of the row index and column index.

#### Key Takeaways:
- The **outer loop** runs **once** for every **N executions** of the **inner loop**.
- The **inner loop** iterates much faster than the **outer loop**, processing all columns before moving to the next row.
- Nesting loops is useful for handling structured data like **tables** or **grids**.

### `break` Statement in Loops

We revisited the **`break` statement**, which is commonly seen in `switch` statements but is also very useful in **loops**. The `break` statement immediately **exits the loop**, terminating execution even if the loop condition is still true.

#### Example: Summing Numbers Until 100
We wrote a program that summed numbers from **1 to 20** but **stopped** as soon as the sum **reached or exceeded 100**:

```java
int sum = 0;
int number = 0;

while (number < 20) {
    number++;
    sum += number;
    if (sum >= 100) {
        break;
    }
}
System.out.println("Final sum: " + sum);
```

#### Without `break`:
If we removed `break`, the loop would have continued until **number == 20**, leading to a final sum of **210** instead of stopping at 100.

**Why use `break`?**
- When a loop needs to exit **before reaching the natural stopping condition**.
- Helps prevent **unnecessary iterations**, making programs more efficient.
- Useful when the exact stopping point isn’t known in advance.

### `continue` Statement in Loops

The `continue` statement is different from `break`. Instead of **exiting** the loop entirely, it **skips** the rest of the current iteration and immediately starts the next loop iteration.

#### Example: Skipping 10 and 11
In this example, we printed numbers from **1 to 20** but skipped **10 and 11** using `continue`:

```java
for (int i = 1; i <= 20; i++) {
    if (i == 10 || i == 11) {
        continue;
    }
    System.out.println(i);
}
```

**Key Differences Between `break` and `continue`:**
| Statement  | Effect |
|------------|--------|
| `break`    | Exits the loop immediately. |
| `continue` | Skips the **current iteration** and moves to the next iteration. |

### Checking for Palindromes Using Loops

A **palindrome** is a string that reads the same forward and backward (e.g., `racecar`, `tacocat`). We wrote a **Java program** to check if a given string is a palindrome.

#### Steps to Check for a Palindrome:
1. Get user input (`Scanner` class).
2. Set two indices:
    - `low` at the **start** of the string.
    - `high` at the **end** of the string.
3. Use a `while` loop to **compare characters** at `low` and `high` indices.
4. If any character **mismatch** is found, **break** out of the loop.
5. If all characters match, the string is a palindrome.

#### Java Implementation:
```java
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        input.close();

        int low = 0;
        int high = s.length() - 1;
        boolean isPalindrome = true;

        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }

        if (isPalindrome) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
    }
}
```

**Explanation:**
- `charAt(low)` and `charAt(high)` compare the **first and last characters**.
- If **mismatch** occurs, `break` exits the loop.
- Otherwise, `low` moves forward, `high` moves backward until they meet.

### Strings as Derived Data Types

Unlike primitive types (`int`, `double`, `boolean`), **strings** are composed of **characters** and are considered a **derived data type**.

**Important String Operations:**
- **`charAt(index)`** - Retrieves a character at a specific index.
- **`length()`** - Returns the length of the string.
- **Indexing starts at `0`** (e.g., in `tacocat`, `'t'` is at index `0`).

#### Example:
```java
String s = "tacocat";
System.out.println("Character at index 3: " + s.charAt(3)); // Outputs 'o'
```

### Summary
- **Nested loops** are useful for structured data like tables.
- **`break`** exits a loop immediately.
- **`continue`** skips the rest of an iteration but continues looping.
- **Palindrome checking** can be done with a loop comparing first and last characters.
- **Strings** are derived data types, composed of characters with indexed access.

### Practice Questions

1. **Understanding Loops:**
    - What is the output of the following nested loop?

   ```java
   for (int i = 1; i <= 3; i++) {
       for (int j = 1; j <= 2; j++) {
           System.out.println(i + " " + j);
       }
   }
   ```

2. **`break` vs. `continue`:**
    - What is the difference between `break` and `continue` in loops?
    - Given the following loop, what will be the output?

   ```java
   for (int i = 1; i <= 5; i++) {
       if (i == 3) {
           continue;
       }
       System.out.print(i + " ");
   }
   ```

3. **Palindrome Checker Enhancement:**
    - Modify the palindrome checker program to ignore spaces and case sensitivity.
    - Example: `"A man a plan a canal Panama"` should be considered a palindrome.

4. **String Indexing:**
    - Given `String s = "programming";`, what is `s.charAt(4)`?
    - How do you find the last character of a string without knowing its length?

---
This concludes today’s lecture. Next time, we will explore **arrays**, an essential data structure in Java!

