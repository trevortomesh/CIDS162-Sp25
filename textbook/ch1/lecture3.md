# **Lecture 3: Java Data Types and Operations**

📅 **Date:** January 31, 2025  
📌 **Course:** CIDS 162 – Intermediate Programming

---

## **1️⃣ Review & Housekeeping**
At the beginning of class, we discussed the **Living Textbook** and its structure. If you find typos or errors (like "sting" instead of "string"), you can either:
- Submit a **pull request** on GitHub (if you know how).
- Message Dr. T directly about corrections.

💡 **Reminder:** The Living Textbook is meant to evolve, and your feedback helps improve its accuracy!

We also addressed **installation issues with IntelliJ IDEA** and encouraged students to reach out if they need help setting it up.

---

## **2️⃣ Java Program Structure: A Quick Recap**
Before diving deeper, we reviewed the **basic structure** of a Java program.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

🔹 Key points:
	•	Every Java program starts with a class (e.g., public class Main).
	•	The main method is the entry point.
	•	System.out.println() is used to print output to the console.

---

3️⃣ Understanding Java Variables & Data Types

In Python, variables can be assigned without declaring their type:

```py
x = 5  # No type declaration needed
```

However, Java requires explicit type declarations:

```java
int x = 5;  // Declaring an integer variable
```



Common Java Data Types

| **Data Type** | **Description**               | **Example**              |
| ------------- | ----------------------------- | ------------------------ |
| `int`         | Integer numbers               | `int x = 5;`             |
| `double`      | Decimal numbers               | `double y = 5.2;`        |
| `boolean`     | True/False values             | `boolean isOn = true;`   |
| `char`        | Single characters             | `char letter = 'A';`     |
| `String`      | Text (sequence of characters) | `String name = "Alice";` |

🚀 Important Notes:
	•	Integers (int): Whole numbers (no decimals).
	•	Doubles (double): Used for decimal numbers.
	•	Booleans (boolean): Can only hold true or false.
	•	Characters (char): A single letter, must be enclosed in single quotes ('A').
	•	Strings (String): Represent text, enclosed in double quotes ("Hello").

💡 Why is String capitalized but int isn’t?
	•	int, double, boolean, and char are primitive types.
	•	String is not primitive—it’s an object, so it follows a different naming convention.

---

4️⃣ Basic Operations in Java

Arithmetic Operators

Java supports the following basic arithmetic operations:

| Operator | Operation           | Example | Result |
| -------- | ------------------- | ------- | ------ |
| +        | Addition            | 5+3     | 8      |
| -        | Subtraction         | 10-4    | 6      |
| *        | Multiplication      | 6*7     | 42     |
| /        | Division            | 10/2    | 5      |
| %        | Modulus (remainder) | 10%3    | 1      |

Modulus Operator (%)
	•	The modulus operator returns the remainder of division.
	•	Example:

```java
System.out.println(20 % 3); // Output: 2
```

🔹 Use case: Checking if a number is even or odd:

```java
if (num % 2 == 0) {
    System.out.println("Even number");
} else {
    System.out.println("Odd number");
}
```

---

5️⃣ Working with Floating-Point Numbers

Java has two types of floating-point numbers:
	1.	float (Stores ~6-7 decimal digits)
	2.	double (Stores ~15-16 decimal digits, more precise)

Example:

```java
double pi = 3.14159;
float smallPi = 3.14f;  // `float` needs an 'f' suffix
```

💡 Why use double instead of float?
double is more precise, so it’s preferred for most calculations.

---

6️⃣ Exponents & The Math Class

Java does not have a built-in exponent operator (** in Python). Instead, we use:

double squared = Math.pow(2, 3);  // 2^3 = 8

Example: Calculating the area of a circle (πr²):

double radius = 5.0;
double area = Math.PI * Math.pow(radius, 2);
System.out.println("Area: " + area);

🔹 Why Math.pow()?
	•	Math is a built-in class in Java that provides mathematical operations.
	•	Math.pow(x, y) calculates x^y.

---

7️⃣ Integer Division in Java

🚨 Beware of integer division!

In Java, dividing two integers truncates the result (no decimals):

int result = 5 / 2;
System.out.println(result);  // Output: 2 (not 2.5!)

To get a decimal result, use double:

double result = 5.0 / 2;
System.out.println(result);  // Output: 2.5

🔹 Key takeaway:
If both numbers are int, Java does integer division. At least one must be double to get a decimal result.

---

8️⃣ Summary & Key Takeaways

✅ Java vs Python Differences

| Feature                  | Java                              | Python                 |
| ------------------------ | --------------------------------- | ---------------------- |
| **Variable Declaration** | Must specify type (int x = 5;)    | No type needed (x = 5) |
| **Printing**             | System.out.println("Hello");      | print("Hello")         |
| **Semicolons (;)**       | Required at the end of statements | Not required           |
| **Whitespace**           | Doesn’t matter                    | Indentation matters    |
| **Integer Division**     | 5 / 2 == 2 (truncates)            | 5 / 2 == 2.5           |

🔹 Core Concepts from Today

✔ Java is strongly typed—you must declare variable types.

✔ Modulus operator (%) is useful for checking even/odd numbers.

✔ Integer division truncates, unless at least one value is double.

✔ Use Math.pow() for exponentiation.

---

9️⃣ Practice Questions

Test your understanding with these questions:
1.	What is the difference between int and double in Java?
2. Why does 5 / 2 return 2 instead of 2.5 in Java?
3.	What will be the output of System.out.println(10 % 4);?
4.	How can you check if a number is even or odd using Java?