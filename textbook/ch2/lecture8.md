**CIDS 162 - Conditional Logic and Randomness in Java (February 12, 2025)**

---

### **1. Introduction**
- New **chat feature** available in Canvas:
    - Enables students to ask questions during class without raising hands.
    - Visible to all students, not just the instructor.
    - Instructor will monitor and respond throughout class.
- **Accessing class source code:**
    - Located under **"Class Code"** in Canvas.
    - Includes the **living textbook** and all previously written source code.
    - Updated manually every afternoon.

---

### **2. Nested If Statements Review**
- **Conceptual Analogy: Medieval Castle Gates**
    - To reach the king (final condition), all gates (if conditions) must be open (true).
    - If **any** gate is closed (false), access is denied.
- **Code Example:**
  ```java
  if (gate1Open) {
      if (gate2Open) {
          if (gate3Open) {
              System.out.println("The king is dead.");
          }
      }
  }
  ```
- **Best Practices:**
    - Avoid deep nesting beyond **two or three levels** to maintain readability.
    - Consider alternative logic structures such as **logical operators** (&&) or **functions**.

---

### **3. Grade Conversion Program**
#### **Objective:** Convert a numeric grade into a letter grade using conditional logic.
- **Grade Ranges:**
    - A: **90-100**
    - B: **80-89**
    - C: **70-79**
    - D: **60-69**
    - F: **Below 60**

#### **Step 1: Prompt User for Input**
```java
System.out.println("Enter a numeric grade:");
Scanner input = new Scanner(System.in);
int grade = input.nextInt();
```

#### **Step 2: Implement If-Else Logic**
```java
if (grade >= 90 && grade <= 100) {
    System.out.println("A");
} else if (grade >= 80) {
    System.out.println("B");
} else if (grade >= 70) {
    System.out.println("C");
} else if (grade >= 60) {
    System.out.println("D");
} else {
    System.out.println("F");
}
```

#### **Step 3: Handling Invalid Inputs**
- If grade is **greater than 100**, display an error message.
- If the input is **not a valid integer**, handle exceptions.

```java
if (grade > 100) {
    System.out.println("Invalid grade: Grades cannot exceed 100.");
} else if (grade < 0) {
    System.out.println("Invalid grade: Negative numbers are not valid.");
}
```

---

### **4. Else-If Chains & Logical Flow**
- **Why Else-If is Useful:**
    - Prevents redundant evaluations when a condition is met.
    - Ensures only one block executes per input.

#### **Incorrect Implementation (Multiple Ifs)**
```java
if (grade >= 90) {
    System.out.println("A");
}
if (grade >= 80) {
    System.out.println("B");
}
if (grade >= 70) {
    System.out.println("C");
}
if (grade >= 60) {
    System.out.println("D");
}
```
- **Problem:** Multiple outputs may print, leading to incorrect results.
- **Solution:** Use Else-If structure instead.

---

### **5. Introduction to Random Numbers**
- **Why Randomness is Important:**
    - Essential for games, simulations, and security applications.
    - Used in procedural generation (e.g., Minecraft world creation).
- **Generating Random Numbers in Java:**
    - Uses `Math.random()` to generate a value **between 0.0 and 1.0**.
    - Multiply by desired range and cast to an integer.

```java
int number = (int) (Math.random() * 10); // Generates number between 0 and 9
System.out.println(number);
```

- **Explanation:**
    - `Math.random()` returns a decimal from **0.0 to 0.9999...**
    - Multiplying by **10** shifts the range to **0.0 - 9.9999...**
    - Casting to `int` removes the decimal, giving values from **0 to 9**.

---

### **6. Preview for Next Class**
- **Combining If Statements & Randomness:**
    - Implementing a **subtraction quiz** using random numbers.
    - Introduction to loops for repeated guessing.

---

### **Practice Questions**
#### **Conceptual Questions:**
1. What is the advantage of using Else-If statements over multiple If statements?
2. Why is nesting too many If statements considered bad practice?
3. What is the difference between `Math.random()` and a true random number generator?
4. How does Java handle generating random numbers internally?

#### **Coding Exercises:**
1. **Modify the Grade Conversion Program:**
    - Add error handling for negative numbers.
    - Extend it to include **pluses and minuses** (e.g., A-, B+).
2. **Write a Program That Simulates Rolling a Die:**
    - Generate a random number between **1 and 6**.
    - Print the result.
3. **Write a Simple Higher-Lower Game:**
    - Generate a random number between **1 and 100**.
    - Prompt the user to guess.
    - Provide feedback on whether their guess is too high, too low, or correct.

---

**End of Lecture Notes**