**CS 162 - Methods and Reusable Code (April 4, 2025)**

---

## Announcements

- **Midterm Recap:**
    - The average score was in the mid-70s.
    - One question was thrown out due to incomplete lecture coverage (bitwise operations).
    - The exam was scored out of 29 points instead of 30.
    - If your performance was unexpectedly low, you're encouraged to reach out and review your exam.

- **Quizzes:**
    - A new quiz is now available.
    - Expect quizzes to come more frequently in the last few weeks due to a condensed schedule.

---

## Lecture Topic: Methods in Java

Today, we pivot from our work with arrays and decks of cards to focus on *methods* in Java, also known as *functions* in other languages.

### Why Use Methods?
Methods allow you to:
- Reuse code efficiently
- Simplify complex programs
- Improve readability and maintainability

For example, rather than writing the same loop to sum numbers multiple times, we can wrap that logic in a method and call it with different arguments.

### From Function to Method
- In Java, we use the term **method** instead of **function**.
- Methods belong to classes and objects.
- The only real difference: methods are tied to an object (even `main` is a method!).

### Basic Example: Sum of Integers
Here's how you'd sum numbers from 1 to 10 using a method:

```java
public static int sum(int start, int end) {
    int result = 0;
    for (int i = start; i <= end; i++) {
        result += i;
    }
    return result;
}
```

Calling the method:
```java
System.out.println("Sum from 1 to 10: " + sum(1, 10));
System.out.println("Sum from 20 to 37: " + sum(20, 37));
System.out.println("Sum from 35 to 49: " + sum(35, 49));
```

### Understanding Method Anatomy
- **Modifiers**: e.g. `public static`
- **Return Type**: the type of value the method gives back (`int`, `String`, `void`, etc.)
- **Method Name**: e.g. `sum`
- **Parameters**: variables the method needs to run (`int start, int end`)
- **Body**: block of code that executes

Together, the method name + parameters form the **method signature**.

### Return Types
- A method must return a value of the type specified.
- If it returns nothing, use `void`.

### Example: Max Method
```java
public static int max(int a, int b) {
    if (a > b) return a;
    else return b;
}
```
You can call it directly:
```java
System.out.println("Max is: " + max(13, 21));
```

### Void Methods (No Return)
Sometimes you just want to *do* something:
```java
public static void sayPikachu(int times) {
    for (int i = 0; i < times; i++) {
        System.out.println("Pikachu!");
    }
}
```
Call it like this:
```java
sayPikachu(5);
```

This is fine because the purpose is *only* to print, but avoid mixing print + return unless absolutely necessary (to avoid side effects).

### Methods Without Parameters
```java
public static String getMario() {
    return "It's-a me, Mario!";
}
```
Call:
```java
System.out.println(getMario());
```

### Method Rules
- Methods must declare a return type.
- Methods may or may not take parameters.
- Return type must match the actual returned value.

### Coming Up
- We'll discuss **method overloading** (same method name, different parameters).
- We'll also combine **arrays + methods** to solve bigger problems.

---

See you next time!

