**CIS 162 Lecture Summary: April 30, 2025**

---

### Topic: Advanced Exception Handling and Java's File Class

#### Recap & Context
We resumed our discussion on exception handling today, with a specific emphasis on:
- Input validation with `try`/`catch`
- Understanding `finally`
- Introducing the `File` class in Java

Dr. Tomesh began by thanking everyone for their flexibility during his wife's surgery recovery and outlined the remaining class schedule. He clarified the format of the final exam (online, similar to the midterm) and reminded students of the two remaining quizzes and final assignment.

---

### Exception Handling Refresher

We revisited a basic example of input validation using:
```java
Scanner input = new Scanner(System.in);
boolean continueInput = true;

// Input validation loop
while (continueInput) {
    try {
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("Number entered: " + number);
        continueInput = false; // valid input
    } catch (InputMismatchException ex) {
        System.out.println("Try again. (Incorrect input: an integer is required)");
        input.nextLine(); // clear the invalid input
    }
}
```

Key principle: **Always handle exceptions in the calling method, not where the exception originates.**

---

### Throwable Hierarchy in Java

Exceptions in Java are objects and derive from the `Throwable` class. There are two main categories:

- **Errors** – internal JVM failures (e.g., `OutOfMemoryError`, `LinkageError`)
- **Exceptions** – application-level issues, either:
    - **Checked** (e.g., `IOException`) — must be declared or handled
    - **Unchecked** (e.g., `NullPointerException`, `ArithmeticException`) — don't require handling

Unchecked exceptions usually result from logic errors and can be prevented. Checked exceptions, however, must be managed explicitly.

---

### The `finally` Block

We introduced the `finally` block as part of the `try`/`catch` structure:

```java
try {
    // code that may throw exception
} catch (ExceptionType e) {
    // handle exception
} finally {
    // code that always executes
}
```

Use cases for `finally`:
- Releasing resources (e.g., closing files, sockets)
- Cleaning up shared state
- Ensuring a consistent end-state regardless of error

---

### File I/O with `finally`

Example:
```java
Scanner scanner = null;
try {
    scanner = new Scanner(new File("src/example.txt"));
    if (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println("First line: " + line);
    }
} catch (FileNotFoundException e) {
    System.out.println("File not found.");
} finally {
    if (scanner != null) {
        scanner.close();
        System.out.println("Scanner closed.");
    } else {
        System.out.println("Scanner was not opened. No need to close.");
    }
}
```

This approach avoids duplicated cleanup code and ensures files are properly closed even if an exception occurs.

---

### Relative vs Absolute File Paths

**Relative Path:**
- Depends on the current working directory of the program (e.g., `src/example.txt`)

**Absolute Path:**
- Full path from root (e.g., `C:/Users/Trevor/Documents/Project/src/example.txt`)

Dr. Tomesh likened this to giving directions:
- "Go one house east" (relative)
- vs. "123 Main St, Springfield" (absolute)

---

### Introducing the `File` Class

Java's `File` class allows you to:
- Check if a file or directory exists
- Check permissions
- Get last modified time, length, etc.

Coming up next: creating, deleting, and inspecting file properties using the `File` class.

---

### Closing Reminders
- Two quizzes left
- Final exam will be online
- Assignment due soon
- Exception handling is foundational to robust Java programming

Dr. Tomesh emphasized that the `finally` block acts like a cleanup crew: it always runs, whether an exception occurred or not.

---

*Next class: Working with the `File` class in Java—checking existence, permissions, and attributes.*

