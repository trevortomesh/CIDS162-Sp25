# CS 162 Lecture Summary - February 19, 2025

## Logical Operators and Control Structures

Today, we explored **logical operators** in Java and how they work with control structures. We focused on `AND (&&)`, `OR (||)`, and `Exclusive OR (^)` operators, and later introduced the `switch` statement as an alternative to long chains of `if-else` conditions.

---

### 🧮 **Logical Operators**
Logical operators are used to form compound conditions:
- `&&` (AND): True if both conditions are true.
- `||` (OR): True if at least one condition is true.
- `^` (XOR - Exclusive OR): True if exactly one condition is true, but not both.

#### ⚡ **Common Mistake:**
Be cautious not to confuse the caret (`^`) with an exponent operator. In Java, exponentiation uses `Math.pow()`, not `^`. Example:
```java
Math.pow(2, 3); // Correct way for 2^3
2 ^ 3;          // Performs bitwise XOR, not exponentiation
```

---

### ✅ **Truth Table for XOR**
| A     | B     | A ^ B |
|-------|-------|-------|
| false | false | false |
| false | true  | true  |
| true  | false | true  |
| true  | true  | false |

#### 📝 **Example:**
```java
System.out.println(false ^ true); // true
System.out.println(true ^ true);  // false
```

---

### 🧪 **Compound Logical Operations**
Logical operators can be combined:
```java
boolean result = (true ^ false) && true; // true
```
Step-by-step evaluation:
1. `true ^ false` → `true`
2. `true && true` → `true`

Experimenting with nested conditions helps understand operator precedence and evaluation order.

---

### 🧭 **Example Program: Divisibility Checker**
We wrote a program that checks whether a number is:
- Divisible by 2 and 3
- Divisible by 2 or 3
- Divisible by 2 or 3, but not both (using XOR)

#### 💻 **Code Example:**
```java
import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by 2 and 3.");
        }
        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number + " is divisible by 2 or 3.");
        }
        if ((number % 2 == 0) ^ (number % 3 == 0)) {
            System.out.println(number + " is divisible by 2 or 3, but not both.");
        }
        input.close();
    }
}
```

#### 🧮 **Sample Run:**
```
Enter an integer: 12
12 is divisible by 2 and 3.
12 is divisible by 2 or 3.

Enter an integer: 9
9 is divisible by 2 or 3.
9 is divisible by 2 or 3, but not both.
```

---

### 🔄 **Switch Statements**
Switch statements provide a cleaner alternative to complex `if-else` chains.

#### 🧩 **Syntax:**
```java
switch (variable) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    default:
        // default code block
}
```

#### 📅 **Day of the Week Example:**
```java
int day = 3; // Wednesday
switch (day) {
    case 0: System.out.println("Sunday"); break;
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    case 4: System.out.println("Thursday"); break;
    case 5: System.out.println("Friday"); break;
    case 6: System.out.println("Saturday"); break;
    default: System.out.println("Invalid day.");
}
```
**Output:**
```
Wednesday
```

#### 💡 **Why Use `switch`?**
- Improves code clarity for multiple discrete cases.
- Prevents repetitive `if-else` chains.
- Easier to maintain and debug.

---

### 🧭 **Upcoming**
Next lecture: We'll calculate a user's **Chinese Zodiac** sign using the `switch` statement based on the year input.

---

### 📝 **Practice Questions:**
1. Write a program that checks if a number is divisible by 5 or 7 but not both.
2. Modify the day-of-the-week example to include abbreviations (e.g., Mon, Tue, Wed).
3. Create a program using `switch` that outputs the season based on a given month (1-12).
4. What happens if you forget the `break` statement in a `switch` case? Try it out!
5. How would you rewrite the divisibility checker using only `if-else` statements?

---

✅ **Remember:** Logical operators are fundamental in controlling program flow. Practice using them with different conditions to solidify your understanding. See you on Friday! 🎉

