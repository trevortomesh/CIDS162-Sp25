**CIDS 162 - February 3, 2025**

### **Understanding Java and Arithmetic Operations**

#### **Introduction**
Welcome back to CS 162. Today, we will continue our discussion on Java, focusing on its key differences from Python, arithmetic operations, order of operations, and input handling using the `Scanner` class.

#### **Key Differences Between Java and Python**
- **Type Declaration**: Unlike Python, Java requires explicit type declaration. For example:
  ```java
  int x = 5;
  ```
  Java does not allow implicit type conversion between `int` and `float`, meaning the following would cause an error:
  ```java
  int x = 5;
  x = 5.2; // Error: Required int, provided double
  ```
- **String and Boolean Handling**: Java strictly enforces type compatibility.
- **Operations on Numeric Data Types**: Addition (`+`), subtraction (`-`), multiplication (`*`), and division (`/`) work similarly to Python but must follow Java's type constraints.

#### **Order of Operations in Java**
- **PEMDAS (Parentheses, Exponents, Multiplication/Division, Addition/Subtraction)**
- In Canada and the UK, it's referred to as **BEDMAS** (Brackets, Exponents, Division/Multiplication, Addition/Subtraction).
- Java follows these precedence rules strictly.

#### **Understanding Modulus and Complex Expressions**
- The remainder operation (`%`), also called the **modulus**, returns the remainder after division.
- Example:
  ```java
  int result = 10 % 3; // result is 1
  ```
- Consider the following complex mathematical expression:
  ```
  3 + 4 * x / 5 - 10 * (y - 5) * (a + b + c) / x + (9 * 4 / x) + 9 + x / y
  ```
  To properly translate this into Java, use **parentheses liberally** to clarify operator precedence:
  ```java
  double result = (3 + (4 * x) / 5) - ((10 * (y - 5) * (a + b + c)) / x) + ((9 * 4 / x) + 9 + (x / y));
  ```
  Java evaluates expressions from left to right, ensuring the correct precedence is applied.

#### **Integer Division and Precision Handling**
- In Java, **integer division truncates** results instead of rounding.
  ```java
  int j = 2;
  int k = 3;
  System.out.println(j / k); // Outputs 0 instead of 0.6667
  ```
- If mixed data types (e.g., `int` divided by `double`) are used, Java **promotes** the result to the higher precision type:
  ```java
  System.out.println(3 / 2.0); // Outputs 1.5
  ```

#### **Building a Fahrenheit to Celsius Converter in Java**

**1. Import Scanner for User Input:**
  ```java
  import java.util.Scanner;
  ```
The `Scanner` class allows us to read input from the user.

**2. Create a Scanner Object:**
  ```java
  Scanner input = new Scanner(System.in);
  ```
- This initializes the scanner to read from the keyboard (`System.in`).

**3. Prompt User for Fahrenheit Temperature:**
  ```java
  System.out.println("Enter a degree in Fahrenheit:");
  double fahrenheit = input.nextDouble();
  ```

**4. Convert to Celsius:**
  ```java
  double celsius = (fahrenheit - 32) * 5 / 9;
  ```

**5. Display the Result:**
  ```java
  System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
  ```

**6. Complete Program:**
  ```java
  import java.util.Scanner;
  
  public class TemperatureConverter {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          
          System.out.println("Enter a degree in Fahrenheit:");
          double fahrenheit = input.nextDouble();
          
          double celsius = (fahrenheit - 32) * 5 / 9;
          
          System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
      }
  }
  ```

#### **Closing Thoughts**
- **Integer vs. Double Precision:**
    - Integer division truncates instead of rounding.
    - Mixing an `int` with a `double` promotes the result to `double`.
- **Java Enforces Explicit Typing:** Unlike Python, Java requires variable type declarations.
- **Use Parentheses for Clarity:** When writing complex expressions, extra parentheses improve readability and avoid errors.

### **Next Steps**
On Wednesday, we will continue working on Java fundamentals, focusing on input validation and additional mathematical operations.

### **Problems**
1. Write a Java program to convert kilometers to miles.
2. Experiment with integer division and mixed division to observe rounding behavior.
3. Try modifying the Fahrenheit-to-Celsius converter to display results rounded to two decimal places.

**Office Hours:**
- Available from 3:30 PM onwards. Please stop by if you have questions or need help setting up Java.

