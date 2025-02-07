# CIS 162 - February 7, 2025

## Casting in Java

### Implicit vs. Explicit Casting
Casting is the process of converting a variable from one data type to another. There are two main types of casting:

1. **Implicit Casting (Widening Cast)**
    - Occurs when a smaller data type is converted into a larger data type automatically.
    - Example:

      ```java
      int a = 5;
      double x = a; // Implicit casting (int to double)
      ```
    - No special syntax is required because no data loss occurs.

2. **Explicit Casting (Narrowing Cast)**
    - Required when converting from a larger data type to a smaller one.
    - Example:

      ```java
      double x = 5.0;
      int y = (int) x; // Explicit casting (double to int)
      ```
    - Java enforces explicit casting to prevent data loss.
    - Without explicit casting, the following would result in a compile-time error:

      ```java
      int y = x; // Error: possible lossy conversion from double to int
      ```

### Narrowing vs. Widening Casts
| Cast Type         | Implicit or Explicit | Description                      |
|------------------|------------------|--------------------------------|
| **Widening Cast** | Implicit           | Converts a smaller type to a larger type (e.g., `int` → `double`) |
| **Narrowing Cast** | Explicit           | Converts a larger type to a smaller type (e.g., `double` → `int`) |

### Example with Numeric Types
```java
int i = 1;
byte b = (byte) i; // Narrowing cast required
```
- A **byte** can hold values from -128 to 127.
- An explicit cast ensures the compiler knows the possible data loss.

## Relational Operations
Relational operations compare two values and return a **boolean** (`true` or `false`).

### Common Relational Operators
| Operator | Meaning  | Example  | Result  |
|----------|---------|----------|---------|
| `<`      | Less than  | `5 < 10`  | `true`  |
| `<=`     | Less than or equal to | `5 <= 5`  | `true`  |
| `>`      | Greater than  | `5 > 3`  | `true`  |
| `>=`     | Greater than or equal to | `5 >= 6`  | `false`  |
| `==`     | Equal to | `5 == 5`  | `true`  |
| `!=`     | Not equal to | `5 != 2`  | `true`  |

### Example Usage
```java
int a = 5;
int b = 10;
boolean result = a < b; // true
```

## If-Statements
If-statements control the flow of a program by executing code based on a condition.

### Basic If-Else Statement
```java
int temp = 60;
if (temp > 80) {
    System.out.println("Too hot!");
} else if (temp < 55) {
    System.out.println("Too cold!");
} else {
    System.out.println("Just right!");
}
```

### Example: Addition Quiz
```java
import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);
        
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (answer == (number1 + number2)));
    }
}
```

## Practice Questions

1. **Casting and Data Types**
    - What is the difference between implicit and explicit casting in Java?
    - What would happen if you tried to assign a `double` to an `int` without casting?

2. **Relational Operators**
    - What is the result of the following expression?
      ```java
      System.out.println(10 > 5);
      ```
    - What would be the result of `System.out.println(5 == 5.0);`?

3. **If-Statements and Boolean Logic**
    - Write a Java program that checks if a given number is positive, negative, or zero using if-statements.

---

