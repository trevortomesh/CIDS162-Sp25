# CS 162 - File I/O and File Utilities in Java (May 2, 2025)

## Summary

In this session, we continued our exploration of Java's file handling capabilities, focusing on how to read from and write to files using the `File`, `Scanner`, and `PrintWriter` classes. We discussed how to check properties of files (e.g., existence, permissions), differences between absolute and relative paths, and best practices like using try-with-resources for managing file I/O safely.

---

## File Reading with `Scanner`

### Steps to Read from a File:

1. Declare a `Scanner` object initialized to `null`.
2. Use a `try-catch-finally` block to handle `FileNotFoundException` and safely close the file.

```java
Scanner scanner = null;
try {
    scanner = new Scanner(new File("src/example.txt"));
    if (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
    }
} catch (FileNotFoundException e) {
    System.out.println("File not found.");
} finally {
    if (scanner != null) {
        scanner.close();
        System.out.println("Scanner closed.");
    } else {
        System.out.println("Scanner was not opened.");
    }
}
```

---

## File Properties with the `File` Class

The `File` class provides several utility methods to retrieve information about a file:

```java
File file = new File("src/example.txt");
System.out.println("Exists? " + file.exists());
System.out.println("Length: " + file.length() + " bytes");
System.out.println("Can read? " + file.canRead());
System.out.println("Can write? " + file.canWrite());
System.out.println("Can execute? " + file.canExecute());
System.out.println("Is directory? " + file.isDirectory());
System.out.println("Is file? " + file.isFile());
System.out.println("Is absolute path? " + file.isAbsolute());
System.out.println("Absolute path: " + file.getAbsolutePath());
System.out.println("Last modified: " + new java.util.Date(file.lastModified()));
```

**Note**: `lastModified()` returns milliseconds since the Unix epoch (Jan 1, 1970).

---

## Writing to Files with `PrintWriter`

### Basic Example:

```java
PrintWriter output = new PrintWriter("scores.txt");
output.print("John T. Smith ");
output.println(90);
output.print("Eric K. Jones ");
output.println(85);
output.close();
```

> ⚠️ Always close your `PrintWriter` object to prevent resource leaks!

---

## Preventing Overwrites

```java
File file = new File("scores.txt");
if (file.exists()) {
    System.out.println("File already exists.");
    System.exit(1);
}
```

---

## Try-With-Resources

Introduced in Java 7, this ensures files are automatically closed:

```java
try (PrintWriter output = new PrintWriter("scores.txt")) {
    output.print("John T. Smith ");
    output.println(90);
}
// No need to call output.close(); it happens automatically.
```

Same works with `Scanner`:

```java
try (Scanner input = new Scanner(file)) {
    while (input.hasNext()) {
        String first = input.next();
        String middle = input.next();
        String last = input.next();
        int score = input.nextInt();
        System.out.println(first + " " + last + " " + score);
    }
}
```

---

## Absolute vs Relative Paths

* **Relative Path**: Relative to the working directory.

    * Example: `src/example.txt`
* **Absolute Path**: Full file system path.

    * Example: `/Users/trevor/Documents/project/src/example.txt`

To get absolute path:

```java
System.out.println("Absolute path: " + file.getAbsolutePath());
```

---

## Practice Questions

### Multiple Choice

1. What does `file.exists()` return?

    * a) File name
    * b) Boolean
    * c) Last modified timestamp
    * d) File size
    * **Answer**: b

2. What Java class is used to write to a file?

    * a) Scanner
    * b) FileWriter
    * c) PrintWriter
    * d) FileOutput
    * **Answer**: c

### True/False

3. `PrintWriter` requires a `catch` block to handle exceptions. (**False** – optional if using `throws` or try-with-resources)
4. `File.isDirectory()` returns true if the file path is a directory. (**True**)

### Output-Based Questions

**Q: What is the output?**

```java
File f = new File("src/example.txt");
System.out.println(f.isAbsolute());
```

**A**: `false` (unless the path is explicitly absolute)

**Q: What is the output?**

```java
PrintWriter pw = new PrintWriter("test.txt");
pw.print("Hello");
pw.println(" World");
pw.close();
```

**A**: A file named `test.txt` is created with contents:

```
Hello World
```

---

## Reminder for Assignments

* Comment your code using the JavaDoc standard
* Use `try-with-resources` when possible
* Handle file existence checks before writing
* Ask if unsure about `throws` and file path setup!

---

**End of Section**

Next topic: `try-with-resources` for multiple resources, and reading/writing binary files.
