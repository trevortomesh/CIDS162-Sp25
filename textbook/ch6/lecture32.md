# CS 162 Lecture Summary - April 21, 2025

## 📅 Announcements
- **No class this Friday** — you will be given an assignment or video instead.
- **Starting next Monday**, all remaining CS 162 classes will be **online only**.
- **Final assignment is posted** and you are **strongly encouraged to start early** due to possible debugging challenges.

---

## 🎮 Final Assignment: Tic-Tac-Toe Simulator

### 📝 Overview
You will implement a **console-based two-player Tic-Tac-Toe game** using clean, modular Java code. This assignment emphasizes:
- Two-dimensional arrays
- Method decomposition
- Input validation
- Error handling (both logic-based and exceptions)
- Clear user interaction and no side-effects in methods

### ✅ Requirements
- **Board Management**
    - `initializeBoard()` → returns a new 3x3 char[][] board
    - `displayBoard(char[][] board)` → prints the current state of the board
- **Player Input**
    - `getPlayerMove(char playerSymbol)` → prompts for and validates input
    - `isValidMove(int row, int col, char[][] board)` → checks bounds and emptiness
- **Game Logic**
    - `checkForWin(char[][] board)`
    - `checkForDraw(char[][] board)`
- **Error Handling**
    - Invalid input should be gracefully handled with messages
    - Use of exception handling where appropriate
- **Method Design**
    - Each method must do **only one thing** (no side effects)
    - No global variables

### 🧾 Submission Requirements
- Complete your **Program Write-Up Document (PWUD)** using the provided tool
    - Includes: Name, overview, key implementation details, screenshot, conclusion, and complete code
    - Checkbox to consent or refuse AI-assisted grading

---

## 📚 New Topic: File I/O & Exception Handling

### 🧠 Why Exception Handling Matters
- Prevents programs from **crashing unexpectedly**
- Makes user experience **graceful and recoverable**
- Required in Java for working with **external files**

### 📁 Reading From a File (Old-School Java I/O)

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

try {
    File file = new File("src/example.txt");
    Scanner scanner = new Scanner(file);
    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
    }
    scanner.close();
} catch (FileNotFoundException e) {
    System.out.println("File not found: " + e.getMessage());
}
```

- **Always use try-catch** when reading from files
- `FileNotFoundException` must be **handled or declared**

### 📥 Reading All Lines (New I/O - NIO)
```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

List<String> lines = Files.readAllLines(Paths.get("src/example.txt"));
for (String line : lines) {
    System.out.println(line);
}
```

- Requires: `throws IOException` in method signature or use of try/catch
- Uses newer `java.nio.file` package

### 📝 Writing to a File
```java
import java.io.FileWriter;
import java.io.IOException;

try (FileWriter writer = new FileWriter("src/output.txt")) {
    writer.write("Hello, world!\n");
} catch (IOException e) {
    System.out.println("An error occurred: " + e.getMessage());
}
```

- To **append** instead of overwrite:
```java
FileWriter writer = new FileWriter("src/output.txt", true);
```

---

## 💡 Common File I/O Issues
- File **paths must be accurate** relative to where the program is run
- Use `System.getProperty("user.dir")` to find current working directory
- Java enforces safety by **requiring exception handling** for all file operations

---

## 🔧 Useful Terminal Commands (UNIX-style)
| Command       | Description                       |
|---------------|-----------------------------------|
| `ls`          | List directory contents           |
| `cd [dir]`    | Change directory                  |
| `pwd`         | Print working directory           |
| `mkdir [dir]` | Make a new directory              |
| `rm -r [dir]` | Remove directory and contents     |
| `touch [file]`| Create a new empty file           |

Use IntelliJ's terminal (or PowerShell on Windows) to experiment.

---

## 🧪 Practice Problems
1. Write a method `initializeBoard()` that returns a fresh 3x3 array filled with `'-'`.
2. Write `isValidMove(row, col, board)` that returns `true` if the move is in bounds and the cell is empty.
3. Use `FileWriter` to write the game result to a file named `game_result.txt`.
4. Use `Files.readAllLines` to read and print the contents of a `.txt` file line by line.
5. Rewrite a method that reads a file using a `try-catch` block and prints a custom error message if the file isn’t found.

---

## 📌 Next Time
- More on **exception handling**
- More advanced **file reading/writing**
- Wrapping up arrays and preparing for the final weeks

Thanks for programming with us today!

