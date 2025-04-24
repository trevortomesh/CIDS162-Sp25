# CS 162 - April 23 Lecture: Exception Handling in Java

## Summary
In this lecture, we explored how Java handles **runtime errors** (exceptions) and how to gracefully manage them using `try`, `catch`, and `throw` statements. We reviewed reading from and writing to files with exception handling, discussed best practices for method design, and emphasized the importance of not terminating programs from within a method. We also explored the `InputMismatchException` and how to give users another chance after entering invalid data.

This lecture reinforces Java's safety-first design and the critical principle that **methods should never terminate the program themselves** but should instead report problems for the calling method to handle.

---

## Key Concepts

### 1. **Reading from Files with Exception Handling**

```java
try {
    File file = new File("src/example.txt");
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
    }
    scanner.close();

} catch (FileNotFoundException e) {
    System.out.println("File not found.");
    System.out.println("Thanks for programming with us today.");
}
```

- **FileNotFoundException** is handled explicitly.
- Reading stops cleanly with no crash.
- Always close the scanner after reading a file.

---

### 2. **Writing to Files with FileWriter**

```java
try {
    FileWriter writer = new FileWriter("src/output.txt", true); // Append mode
    writer.write("Hello world or some crap like that.\n");
    writer.close();
} catch (IOException e) {
    System.out.println("An error occurred: " + e.getMessage());
}
```

- The `true` flag in `FileWriter` appends instead of overwriting.
- `IOException` must be caught.

---

### 3. **Runtime Errors and the `throw` Statement**

We explored the difference between **compile-time** and **runtime** errors:
- Compile-time: Syntax issues (e.g., missing semicolon)
- Runtime: Errors during execution (e.g., divide by zero, array out of bounds)

```java
public static int quotient(int num1, int num2) {
    if (num2 == 0) {
        throw new ArithmeticException("Divisor cannot be zero");
    }
    return num1 / num2;
}
```

Handled in `main()`:

```java
try {
    int result = quotient(num1, num2);
    System.out.println(num1 + " / " + num2 + " = " + result);
} catch (ArithmeticException ex) {
    System.out.println("Exception: " + ex.getMessage());
}
System.out.println("Execution continues...");
```

- Never use `System.exit()` inside a method.
- Let the calling method (`main`) handle exceptions.

---

### 4. **Handling Invalid Input with `InputMismatchException`**

```java
Scanner input = new Scanner(System.in);
boolean continueInput = true;

do {
    try {
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("The number entered is: " + number);
        continueInput = false;
    } catch (InputMismatchException ex) {
        System.out.println("Try again. Incorrect input.");
        input.nextLine(); // Discard bad input
    }
} while (continueInput);
```

- Gracefully handles bad input (e.g., letters instead of numbers).
- Prompts the user again until valid input is given.

---

## Best Practices
- Methods should not **terminate** a program.
- Always **handle exceptions** at the highest appropriate level.
- Use `try/catch` to **prevent crashes** and maintain user experience.
- Use `throw` in methods to delegate error-handling to callers.

---

## Practice Problems

1. Write a method `readFile(String filename)` that reads from a file and returns all lines in a list. Handle the file not found error gracefully.

2. Create a program that:
    - Asks the user for two integers.
    - Divides the first by the second.
    - Uses `try/catch` to handle divide-by-zero.

3. Create a calculator that takes 3 command-line arguments: `int`, `operator`, `int`. Handle bad input (non-integer) and invalid operator using exceptions.

4. Modify the Tic Tac Toe project so that if a user types something invalid (e.g., "tacos") instead of a number, the program asks again instead of crashing.

5. Use a `FileWriter` to create a logging utility. Every time an exception is caught, write it to a log file with a timestamp.

---

> Remember: Java enforces exception handling for a reason. Programs should fail gracefully, not dramatically.

We'll continue practicing on Monday with more structured exception handling patterns. Have a great weekend, and happy coding!