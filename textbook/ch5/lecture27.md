# CS 162 - April 9, 2025

## Lecture Topic: Method Overloading & Variable Scope

---

### ✨ Recap: Method Overloading
- **Definition**: Multiple methods with the same name but different parameter lists.
- **Ways to Overload**:
    1. Change **number** of parameters.
    2. Change **type** of parameters.

**Example: Max Method Overloads**
```java
public static int max(int num1, int num2) { ... }
public static double max(double num1, double num2) { ... }
public static double max(double num1, double num2, double num3) {
    return max(max(num1, num2), num3);
}
```

- We can reuse the simpler method inside the 3-parameter version for cleaner code.

**Java's `System.out.println()` is overloaded!**
```java
System.out.println(int);
System.out.println(double);
System.out.println(String);
System.out.println(boolean);
System.out.println(char);
// etc.
```
These are all different versions of the same method.

---

### 🔎 Variable Scope

**What is scope?**
> The region of a program where a variable can be accessed.

#### 📝 Key Takeaways:
- **Local variables**: Declared inside a method. Only exist during that method's execution.
- **Method parameters**: Also local to the method. Gone when method exits.
- **Variables in loops** (e.g., `for`, `while`) are scoped to the loop block.

**Example 1: Local Variable Scope**
```java
public static void doThing() {
    int x = 10; // x is local to doThing
    System.out.println(x);
}

public static void main(String[] args) {
    doThing();
    // System.out.println(x); // ERROR: x not visible here
}
```

**Example 2: Loop Scope**
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i); // OK
}
System.out.println(i); // ERROR: i is out of scope
```

**Example 3: Method vs. Class Scope**
```java
public class Main {
    static int j = 12; // visible to all static methods in class

    public static void doThing() {
        System.out.println(j); // OK
    }
}
```

---

### 🔢 Arrays and Methods

**Passing arrays to methods:**
```java
public static void printArray(int[] array) {
    for (int value : array) {
        System.out.println(value);
    }
}
```

**Modifying arrays in methods:**
```java
public static void multiplyArray(int[] array, int n) {
    for (int i = 0; i < array.length; i++) {
        array[i] = array[i] * n;
    }
}
```
> Arrays are **reference types**. If modified inside a method, the change **persists** outside.

---

### 🎯 Practice Questions

#### True/False:
1. You can overload a method by changing its return type. (**False**)
2. Local variables declared in a method are destroyed when the method ends. (**True**)
3. You can declare a method inside another method in Java. (**False**)

#### Multiple Choice:
4. What does `public static void` indicate in a method declaration?
    - A. The method returns a value
    - B. The method can be accessed from outside the class
    - C. The method is inside a loop
    - **D. The method does not return a value and belongs to the class**

5. Which of the following will compile?
```java
public static int max(int a, int b) { ... }
public static int max(double a, double b) { ... }
public static int max(int a, double b) { ... }
```
- A. Only the first method
- B. First and second only
- **C. All three**
- D. None

#### Code Output:
6. What is the output?
```java
public static void main(String[] args) {
    int x = 5;
    change(x);
    System.out.println(x);
}

public static void change(int x) {
    x = 10;
}
```
- A. 5
- B. 10
- C. Compilation Error
- **Answer: A (pass-by-value)**

7. What will this code print?
```java
public static void main(String[] args) {
    int[] data = {1, 2, 3};
    modify(data);
    System.out.println(data[0]);
}

public static void modify(int[] arr) {
    arr[0] = 99;
}
```
- A. 1
- **B. 99**
- C. Compilation Error

---

### 📅 Next Steps
- Friday: Continue with arrays and scope.
- Start combining arrays and methods in more powerful ways!

---

Let me know if you have any questions or want a quiz based on these concepts!

