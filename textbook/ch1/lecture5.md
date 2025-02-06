# User Input and Data Types in Java

## Introduction to User Input in Java

Unlike Python, where input collection is straightforward using `input()`, Java requires a **Scanner** object to handle user input.

### Creating a Scanner Object
To read user input, we need to:

1. **Import the Scanner class** from Java's `java.util` package.
2. **Instantiate a Scanner object**, which allows us to read different types of input.

```java
import java.util.Scanner;  // Step 1: Import Scanner

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Step 2: Create Scanner

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();  // Step 3: Read user input

        double celsius = (fahrenheit - 32) * 5 / 9;  // Convert to Celsius
        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius");
        
        input.close();  // Step 4: Close Scanner
    }
}
```

### Breaking it Down
- `Scanner input = new Scanner(System.in);` → Creates a Scanner object that reads from the keyboard (`System.in`).
- `input.nextDouble();` → Reads the next **double** (decimal number) typed by the user.
- `System.out.println();` → Prints the result to the console.

### Why Use a Scanner?
- Java is **strongly typed**, meaning it needs to know the exact type of input before processing.
- Scanners can **read input from multiple sources**, including files, network streams, and the console.

---

## Augmented Operators in Java

Java provides **augmented operators** that simplify expressions. Instead of writing:

```java
x = x + 1;
```

We can use **increment operators**:

```java
x++;
```

### Common Augmented Operators

| Operator   | Equivalent To  | Description |
|------------|---------------|-------------|
| `+=`       | `x = x + n`   | Addition assignment |
| `-=`       | `x = x - n`   | Subtraction assignment |
| `*=`       | `x = x * n`   | Multiplication assignment |
| `/=`       | `x = x / n`   | Division assignment |
| `%=`       | `x = x % n`   | Modulus assignment |
| `++`       | `x = x + 1`   | Increment by 1 |
| `--`       | `x = x - 1`   | Decrement by 1 |

#### Example:
```java
int x = 5;
x += 3;  // x is now 8
x *= 2;  // x is now 16
```

---

## Type Casting in Java

### Implicit vs. Explicit Casting

#### **Implicit Casting (Widening Conversion)**
Converting a **smaller type** to a **larger type** automatically (safe, no data loss):

```java
int x = 5;
double y = x;  // Implicitly converts int to double
System.out.println(y);  // Outputs 5.0
```

#### **Explicit Casting (Narrowing Conversion)**
Converting a **larger type** to a **smaller type** manually (can lose precision):

```java
double a = 5.75;
int b = (int) a;  // Explicit cast
System.out.println(b);  // Outputs 5 (decimal part lost)
```

### Why Does Java Require Explicit Casting for Narrowing?
- Java prevents unintended **loss of precision**.
- Example:
  ```java
  double num = 3.999;
  int result = (int) num;  // Explicit cast needed
  System.out.println(result);  // Outputs 3, decimal part is lost
  ```

---

## Practice Questions

1. **Scanner Input**: What is the purpose of `Scanner input = new Scanner(System.in);` in Java?
    - A) It creates a Scanner object that reads from a file
    - B) It creates a Scanner object that reads input from the keyboard
    - C) It prints user input to the console
    - D) It converts user input to uppercase

2. **Augmented Operators**: What is the output of the following code?
   ```java
   int x = 10;
   x += 5;
   x *= 2;
   System.out.println(x);
   ```
    - A) 10
    - B) 20
    - C) 30
    - D) 50

3. **Type Casting**: What happens when you try to assign a `double` value to an `int` variable without explicit casting?
    - A) The program will run normally, converting the value automatically
    - B) The program will compile but may produce incorrect results
    - C) The program will not compile, as Java requires explicit casting
    - D) The program will throw a runtime error

---
