# CS 162 Lecture Summary - February 24, 2025

## 📅 Announcements
- ✅ **Quiz:** Available now; due **February 28, 2025**. Content covers previously discussed material. If you've attended class, paid attention, or read the notes, you should do well.
- ✅ **Assignment 1:** Due **March 3, 2025**. Make sure to submit on time.
- ✅ **Class Chat Room:** Available for lecture questions. Feel free to use it if you need clarification.

---

## 📝 Code Readability & Documentation
### Why Document Your Code?
- Code should be **readable** and **maintainable**.
- Documentation helps explain:
    - **What** the code does
    - **Why** it does it
    - **How** it achieves the task
- Good comments save time for future developers (including your future self)!

> 🚨 **Pro Tip:** Even the best programmers (like Donald Knuth) comment their code. Clear code and helpful comments make maintenance and collaboration easier.

---

### Types of Comments in Java
#### 1. **Single-Line Comments** (`//`)
Used for brief explanations or notes.
```java
// Prints "Hello, World!" to the console
System.out.println("Hello, World!");
```

#### 2. **Multi-Line Comments** (`/* ... */`)
Used for longer explanations or to comment out sections of code.
```java
/*
 This program calculates the sum of two integers.
 It demonstrates basic input/output in Java.
*/
```

#### 3. **JavaDoc Comments** (`/** ... */`)
- Used to document **classes, methods, and fields**.
- Can be converted into HTML documentation using the `javadoc` tool.

```java
/**
 * Calculates the sum of two integers.
 * @param a the first integer
 * @param b the second integer
 * @return the sum of a and b
 */
public int add(int a, int b) {
    return a + b;
}
```

> 🛠️ **Using JavaDoc:**
> - Add `@author` with your name.
> - Use `@version` and `@since` to indicate program versions and creation dates.
> - **Example header for your assignments:**
> ```java
> /**
>  * Main program for CS 162 Assignment 1.
>  * @author John Doe
>  * @version 1.0
>  * @since 2025-02-24
>  */
> ```

---

## 🧹 Commenting Best Practices
✅ **Do:**
- Write concise comments explaining non-obvious code.
- Use comments to clarify **why** something is done, not just **what** is done.
- Update comments when code changes.
- Use JavaDoc for classes and methods.

🚫 **Avoid:**
- Over-commenting obvious code.
- Redundant comments (e.g., `// prints Hello World` above a `System.out.println("Hello World");`).
- Comments that restate the code without adding insight.

> 🔥 **Rule of Thumb:** Comments should **enhance understanding**, not waste time. Don't repeat yourself (**DRY principle**). Write comments that **add value** to your code.

---

## 💡 Tools & Shortcuts
- **ChatGPT for Code Comments:**
    - You may use AI tools to assist with commenting.
    - **Important:** If you use ChatGPT or similar tools:
        - Verify the accuracy of the comments.
        - **Remove unnecessary emojis** (AI likes to be a bit too friendly!).
        - **Cite your use** of AI in your write-up. Example citation:
          ```markdown
          Assistance for code comments provided by ChatGPT. Accessed on 2025-02-24. [ChatGPT Conversation Link](https://chat.openai.com/)
          ```

- **Generating JavaDoc HTML:**
    - Run `javadoc` on your source files to create professional documentation.
    - Example:
      ```bash
      javadoc -d doc MyProgram.java
      ```

> 🌟 **Fun Fact:** The official Oracle Java documentation is generated with JavaDoc!

---

## 🧪 Example: Zodiac Sign Calculator *(Preview)*
### Problem:
We want to determine a person’s Chinese zodiac sign based on their birth year.

### Key Insight:
The Chinese zodiac operates on a **12-year cycle**. We can use the **modulus operator `%`** to find the sign:
```java
int year = 1988;
int zodiac = year % 12;
System.out.println(zodiac); // Outputs 8 for 1988 (Dragon)
```

#### Zodiac Mapping (year % 12):
| Remainder | Sign     |
|-----------|----------|
| 0         | Monkey   |
| 1         | Rooster  |
| 2         | Dog      |
| 3         | Pig      |
| 4         | Rat      |
| 5         | Ox       |
| 6         | Tiger    |
| 7         | Rabbit   |
| 8         | Dragon   |
| 9         | Snake    |
| 10        | Horse    |
| 11        | Goat     |

> 🐉 **Example:**
> - `1988 % 12 = 8` → Dragon
> - `2005 % 12 = 1` → Rooster
> - `2004 % 12 = 0` → Monkey

💻 **We’ll implement this program next class (Feb 26, 2025)!**

---

## 📝 Practice Questions:
1. Write a Java program that uses comments to explain a simple calculation.
2. Use JavaDoc to document a method that multiplies two numbers.
3. Modify the Zodiac program to include user input.
4. What are the advantages of using JavaDoc over regular comments?
5. Refactor code you’ve written previously to include proper documentation.

---

## 🏆 Key Takeaways:
✅ Comment **why** and **how**, not just what.  
✅ Use **JavaDoc** for methods and classes.  
✅ **DRY principle:** Don’t repeat yourself!  
✅ AI tools are helpful, but **cite them** and verify output.  
✅ Maintain **clean, readable, and maintainable** code.

---

🔮 **Next Lecture (Feb 26, 2025):** Build the **Chinese Zodiac Calculator** using `switch` statements and modulus logic! 🎉

