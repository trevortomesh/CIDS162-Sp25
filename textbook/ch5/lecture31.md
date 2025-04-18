# Command-Line Arguments and Unix Commands in Java

**Course**: CS 162  
**Date**: April 18, 2025  
**Topic**: Using the command line in Java, command-line arguments, Unix/Linux terminal basics

---

## 🧠 Summary

In this lecture, we shifted gears from multidimensional arrays to working with the **command line** and **command-line arguments** in Java. Students learned:

- What `String[] args` is in the `main` method.
- How to run Java programs from the command line.
- How to pass arguments via the terminal.
- The basics of Unix/Linux terminal commands: listing files, navigating folders, creating/deleting files and folders.

Additionally, we explored writing a simple Java **calculator** that takes command-line input (e.g., `java Calculator 5 + 3`) and returns the computed result.

---

## 📌 Key Concepts

### 1. `main(String[] args)`
- Java's `main` method takes a single argument: an array of `String`s.
- When a Java program is run from the terminal, the extra words (separated by spaces) after the program name become entries in `args`.

### 2. Terminal Basics (Unix-style)
| Command     | Description                               |
|-------------|-------------------------------------------|
| `ls`        | Lists contents of the current directory    |
| `cd`        | Changes directory                          |
| `cd ..`     | Moves up one directory                     |
| `pwd`       | Prints present working directory           |
| `mkdir name`| Creates a new directory                    |
| `rm name`   | Removes a file                             |
| `rm -r name`| Removes a directory recursively            |
| `touch file`| Creates an empty file                      |

> ⚠️ Caution: `rm` and `rm -r` delete immediately and do **not** go to trash.

### 3. Writing a Java Program That Uses Command-Line Arguments

**Example**: A Java calculator that takes three arguments (e.g., `5 + 2`) and returns the result.

```java
public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator <operand1> <operator> <operand2>");
            System.exit(1);
        }

        int result = 0;
        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                break;
            case '.': // used instead of '*' because '*' is reserved in terminal
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            default:
                System.out.println("Unknown operator");
                System.exit(1);
        }

        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
    }
}
```

**Example Execution:**
```bash
java Calculator 10 + 4
// Output: 10 + 4 = 14
```

---

## 🛠️ Practice Problems

1. **Terminal Navigation**  
   Use the following commands to complete the steps below:
    - Create a new directory called `lab1`
    - Navigate into `lab1`
    - Create a file called `notes.txt`
    - Delete the file and go back to the parent directory

2. **Command-Line Args**  
   Modify the `Calculator` program to also support modulus (`%`).

3. **Debugging Terminal Usage**  
   If `java` or `javac` are not recognized in your terminal, what should you check?

4. **File Generation with Java**  
   Write a Java program that takes a filename from the command line and creates that file using Java's file I/O APIs.

5. **Argument Parsing**  
   Write a Java program that prints the number of arguments provided and each argument on a new line.

---

## ✅ Takeaways

- The terminal is a powerful interface for navigating, creating, and managing files.
- Java's `main(String[] args)` method allows you to build programs that react to terminal input.
- You can build full programs like calculators, text generators, or file editors entirely from command-line arguments.
- Always remember to be careful when using powerful commands like `rm` and `rm -r`.

---

Let me know if you want a Windows-specific tutorial or a deeper dive into `javac`, shell scripting, or file I/O!

