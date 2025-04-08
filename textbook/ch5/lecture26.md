**CS 162 – Methods and Overloading (April 7, 2025)**

---

### 📌 Overview

Today we continued our discussion of **methods** in Java, with a focus on where methods belong, how they’re called, and how **overloading** works. We reinforced key syntax rules and explored real-world use cases like the overloaded `System.out.println()` method. We also examined the utility of writing multiple versions of a method, like `max()`, to handle different argument types and numbers.

---

### 🧠 Key Concepts

#### 📍 Declaring Methods in Java
- All methods must be declared **within a class**, but **outside of other methods**.
- For our purposes, we place methods inside the **main class** but outside the **main method**.
- Example structure:
  ```java
  public class Main {
      public static void main(String[] args) {
          // code here
      }

      public static int sum(int a, int b) {
          return a + b;
      }
  }
  ```

#### 🔁 Calling Methods
- Methods can be called from the `main()` method or any other method.
- Method calls look like function calls:
  ```java
  int result = sum(5, 10);
  ```

#### 🧩 Method Structure
Each method includes:
1. **Modifiers**: e.g., `public static`
2. **Return Type**: e.g., `int`, `double`, `void`
3. **Method Name**: e.g., `sum`
4. **Parameter List**: e.g., `(int a, int b)`
5. **Method Body**: Code block inside `{}`

Together, 1–4 form the **method header**, and the parameter list alone is often referred to as the **signature**.

#### 💡 Method Return Types
- The return type must match the type of data returned using the `return` keyword.
- Example:
  ```java
  public static int max(int a, int b) {
      return (a > b) ? a : b;
  }
  ```

#### 🤖 The `void` Return Type
- `void` methods **do not return a value**.
- Useful for methods that only perform actions (e.g., printing).

#### 🔄 Method Overloading
- **Overloading** means defining **multiple methods with the same name** but **different parameter lists**.
- Java uses the number and types of parameters to distinguish between overloaded methods.
- Example:
  ```java
  public static int max(int a, int b) { return (a > b) ? a : b; }
  public static double max(double a, double b) { return (a > b) ? a : b; }
  public static double max(double a, double b, double c) {
      return max(max(a, b), c);
  }
  ```

---

### 🧪 Real-World Example: `System.out.println()`
- The `println()` method is **overloaded** to accept many types:
    - `println(int)`
    - `println(double)`
    - `println(char)`
    - `println(String)`
    - ...and more!
- This makes it easier to use without having to convert everything to a string manually.

---

### 📝 Practice Questions

#### Multiple Choice
1. Which of the following is NOT a valid method header in Java?
   A) `public static void greet()`
   B) `static public int sum(int a, int b)`
   C) `int max(int a, int b)`
   D) `public return void() greet`

2. What keyword is used to exit a method and send a value back to the caller?
   A) `break`
   B) `send`
   C) `exit`
   D) `return`

3. What is the result of the following code?
   ```java
   System.out.println(max(2, 5));

   public static int max(int a, int b) {
       return (a > b) ? a : b;
   }
   ```
   A) 2
   B) 5
   C) 7
   D) Error

4. Which of the following is a correct overloaded method?
   A) `public static int sum(double a, int b)`
   B) `public static void sum()`
   C) `public static double sum(double a, double b, double c)`
   D) All of the above

#### True / False
5. Methods can be declared inside other methods in Java. (False)
6. A method can return an `int` even if its return type is declared as `void`. (False)
7. Overloading allows multiple methods with the same name as long as their parameter lists differ. (True)
8. The `main()` method is an example of a method with a specific signature required by the Java runtime. (True)

#### Output-Based
9. What is the output?
   ```java
   public static void main(String[] args) {
       System.out.println(greet());
   }
   public static String greet() {
       return "Hello!";
   }
   ```
   A) Hello!
   B) greet
   C) Compilation Error
   D) null

10. What is the output?
   ```java
   public static void main(String[] args) {
       System.out.println(max(2.5, 3.9, 1.4));
   }
   public static double max(double a, double b) {
       return (a > b) ? a : b;
   }
   public static double max(double a, double b, double c) {
       return max(max(a, b), c);
   }
   ```
A) 2.5
B) 3.9
C) 1.4
D) Compilation Error
