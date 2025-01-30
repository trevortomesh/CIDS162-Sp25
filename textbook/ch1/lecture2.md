# CIDS 162: Introduction to Programming with Java
## Lecture 2 - January 29, 2025

---

## **Introduction**

Welcome to **CIDS 162**! Today, we'll get an overview of the course structure and make sure everyone is on the same page regarding **prior knowledge from CIDS 161 (Python)**.

Before diving into Java, I’d like to assess what you already know from **161**, so we can tailor the review accordingly.

---

## **Course Resources**

### **1. GitHub Repository**
This course includes a **GitHub repository** where I will upload:
- **Lecture notes** formatted into a **living textbook**.
- **All code written during class** for easy reference.

🔗 **[GitHub Repository Link](#)** (Coming Soon)

> If you haven’t used **GitHub** before, don’t worry! I’ll walk you through it as we go.

---

### **2. Class Notes in GoodNotes**
I occasionally **scribble notes on my iPad**, which sync to a **collaborative notebook**.
- **You can view these notes, but please don’t edit them.**
- The notes will update automatically after class.

📖 **[GoodNotes Class Notes](#)** (Coming Soon)

---

### **3. Additional Practice Exercises**
At the end of each lecture, I will provide **extra practice questions**.
- These **aren’t graded**, but they’re helpful for reinforcement.
- Write them down in a **notebook** or answer them in your **head**.

---

## **Review of CIDS 161 (Python)**

I want to **gauge what you remember from Python**, so let’s list out some topics:

- **Defining functions**
- **Memory diagrams**
- **Conditionals (`if`, `else`, `elif`)**
- **Loops (`for`, `while`)**
- **Syntax (indentation, colons, white space)**
- **File input/output (reading/writing files)**
- **Libraries & imports**

✅ **Key difference between Python & Java:**
- Python is **dynamically typed**, meaning variables can **change type**.
- Java is **statically typed**, meaning variables **must be declared with a type**.

---

## **Introduction to Java & IDE Setup**

### **1. Choosing an IDE**
We will be using **IntelliJ IDEA** for Java development.

💡 **Download IntelliJ IDEA:**
- **Free Educational License:** [JetBrains for Students](https://www.jetbrains.com/community/education/)
- **Community Edition (Free Alternative):** [IntelliJ IDEA Community](https://www.jetbrains.com/idea/download/)

If you run into **license issues**, use the **Community Edition**, which has all the features we need.

---

### **2. Setting Up IntelliJ IDEA**
1. Open **IntelliJ IDEA**
2. Click **"New Project"**
3. Choose a **location** for your project
4. Select **"Build System"** → Use **Maven** if IntelliJ is unavailable
5. Select **JDK (Java Development Kit)**
    - If you don’t have one, click **"Download JDK"** inside IntelliJ

---

## **Java vs. Python: Key Differences**

| Feature              | Python                     | Java                     |
|----------------------|---------------------------|--------------------------|
| **Typing**          | Dynamic (`x = 5`)         | Static (`int x = 5;`)   |
| **Indentation**     | Required for structure     | Not required            |
| **Semicolons**      | Not needed                 | **Required** (`;`)      |
| **Code Blocks**     | Indentation-based          | Uses `{ }` braces       |
| **Functions**       | `def my_function():`       | `void myFunction() { }` |
| **Printing Output** | `print("Hello")`          | `System.out.println("Hello");` |

---

## **Java Syntax & First Program**

Let's start with a **basic Java program**:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Breaking It Down
1. public class Main → Defines a class (Java programs are class-based).
2. public static void main(String[] args) → Main method (program entry point).
3. System.out.println("Hello, World!"); → Prints output with a new line.

### **Working with Variables in Java**

In Python, we can declare variables easily:

```python
x = 5  # No type declaration needed
```

In Java, we must explicitly declare the type:

```python
int x = 5; // Declaring an integer variable
```

### 💡 Common Data Types in Java:

| Data Type           | Description                   | Example               |
|---------------------|-------------------------------|-----------------------|
| **int**             | Integer numbers               | int x = 5;            |
| **double**          | Decimal numbers               | double y = 5.2;       |
| **boolean**         | True / False Values           | booean isOn = true;   |
| **char**            | Single characters             | char letter = 'A'     |
| **String**          | Text (sequence of characters  | Sting name = "Alice"; |

### Printing in Java: print vs. println

```java
System.out.print("Hello ");
System.out.print("World!");
```

### 🔹 Output: Hello World! (Same line)

```java
System.out.println("Hello");
System.out.println("World!");
```

### 🔹 Output:

```
Hello  
World!  
```

(println adds a new line after printing.)

## Importance of Semicolons (;)

Java requires semicolons at the end of statements:

✅ Correct:

```java
int x = 5;
System.out.println(x);
```

❌ Incorrect (Missing Semicolon):

```java
int x = 5
System.out.println(x)
```

🚨 Error: "';' expected"

Java Memory & Variable Types

Java is a strongly typed language, meaning:
	•	A variable’s type cannot change after declaration.
	•	Memory is allocated efficiently based on data type.

Example:

```java
int x = 5;       // Integer variable
String name = "Java";  // String variable
```

🚨 Error Example (Type Mismatch):

```java
int num = "Hello"; 
```

❌ ERROR: "Type mismatch"

## Practice Questions
1. What is the difference between print() in Python and System.out.println() in Java?
2. Why does Java require semicolons at the end of statements, but Python does not?
3. What are three major differences between Java and Python?

## Next Lecture Preview

### In our next session, we’ll explore:
- Data Types & Memory Management in Java 
- Working with Operators & Expressions
- Using Variables in Java Programs

🚀 See you on Friday!

