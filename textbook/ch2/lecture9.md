**CIDS 162 Lecture Summary – February 14, 2025**

### **Announcements**
- A chat room in Canvas is available for asking questions.
- **First assignment** will be assigned on **Monday, February 17**.
- **First quiz** will be open on **Friday, February 21**.

---

## **Lecture Content**

### **1. Random Number Generation in Java**
- Java allows us to generate **random numbers** using `Math.random()`.
- `Math.random()` generates a **double** between **0.0 (inclusive) and 1.0 (exclusive)**.
- Example:
  ```java
  double randomNumber = Math.random();
  System.out.println(randomNumber); // Output: a random number between 0.0 and 1.0
  ```
- We can scale this to generate numbers in a different range by multiplying the output.
  ```java
  double scaledNumber = Math.random() * 10; // Generates between 0 and 10 (exclusive)
  ```
- To get an **integer**, we apply **explicit type casting**:
  ```java
  int randomInt = (int)(Math.random() * 10); // Generates an int between 0 and 9
  ```

### **2. Type Casting in Java**
- **Explicit Narrowing Cast:** Converts a **larger** data type (e.g., `double`) to a **smaller** one (e.g., `int`).
  ```java
  double num = 5.9;
  int newNum = (int) num; // Truncates decimal part, result: 5
  ```
- **Implicit Widening Cast:** Converts a **smaller** data type to a **larger** one automatically.
  ```java
  int num = 5;
  double newNum = num; // No need for explicit cast
  ```

### **3. Creating a Simple Subtraction Quiz**
#### **Steps to implement the quiz:**
1. **Generate two random numbers**
2. **Ensure subtraction is always positive** by swapping numbers if necessary
3. **Prompt the user to enter an answer**
4. **Compare the user’s answer with the correct one** and provide feedback

#### **Implementation:**
```java
import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        // Step 1: Generate two random numbers
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        // Step 2: Swap if necessary to ensure a positive result
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Step 3: Prompt user for input
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + num1 + " - " + num2 + "? ");
        int answer = input.nextInt();

        // Step 4: Check answer and provide feedback
        if (answer == (num1 - num2)) {
            System.out.println("Correct! Great job!");
        } else {
            System.out.println("Wrong. The correct answer is " + (num1 - num2));
        }
    }
}
```

### **4. Boolean Operators in Java**
#### **Logical Operators and Their Usage**
| Operator | Name               | Description |
|---|--------------------|-------------|
| `&&` | AND (Conjunction)  | Both conditions must be true |
| `¦¦`                   | OR (Disjunction) | At least one condition must be true |
| `!` | NOT (Negation)     | Inverts a boolean value |
| `^` | XOR (Exclusive OR) | Only one condition can be true, not both |

#### **Examples:**
```java
boolean a = true;
boolean b = false;

System.out.println(a && b); // false (both must be true)
System.out.println(a || b); // true (one is true)
System.out.println(!a); // false (inverts true to false)
System.out.println(a ^ b); // true (only one is true, not both)
```

---

## **Practice Problems**

### **1. Random Number Generation**
1. Modify the program to generate a random integer between **1 and 100**.
2. Create a program that simulates a **coin flip** (output: "Heads" or "Tails").
3. Generate a random integer between **-50 and 50**.

### **2. Type Casting**
1. Convert a **double** to an **integer** and print both values.
2. Convert an **integer** to a **double** and print both values.

### **3. Subtraction Quiz Enhancements**
1. Modify the subtraction quiz to include **addition** as well.
2. Instead of always ensuring a positive result, allow **negative answers**.
3. Implement a **score counter** that tracks the user’s correct answers.

### **4. Boolean Logic**
1. Write an `if` statement that checks if a number is **both even and positive**.
2. Modify the previous problem to check if the number is **either even or positive**.
3. Create a program that **negates a boolean value** and prints the result.

---

### **Conclusion**
- **Random numbers** are useful for creating dynamic programs.
- **Type casting** allows conversion between data types.
- **Boolean operators** help control logic flow in programs.
- **Breaking problems into steps** makes programming easier to approach.

Next time: More on **logical operations and control structures!**