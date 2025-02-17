# CIS 162 - February 17, 2025

## Overview
Welcome back to CIS 162! Today, we discussed the first graded assignment, the importance of practice problems, and an introduction to the program write-up document. We also briefly reviewed Markdown as a documentation tool.

## **Practice Problems**
- Practice problems are available at the bottom of each lecture in the **Living Textbook**.
- These are **not graded** but are recommended for additional practice.
- If you need help, you can discuss them during office hours or via email.

## **Assignment 1 - Brute Force Password Cracking**
**Due Date:** March 3, 2025 (Two weeks from today)

### **Objective:**
Write a Java program to calculate the time required to crack a password using brute force.

### **Key Components:**
1. **Understanding Brute Force Attacks:**
    - The method tries every possible character combination until the password is found.
    - Example: In *Portal 2*, Wheatley humorously attempts to brute-force a password.

2. **Crack Time Formula:**

   Crack Time = Math.pow(Character Set Size,Password Length) / Attempts per Second

    - **Character Set Size:** Number of possible characters in the password (e.g., 26 lowercase, 52 for upper and lowercase, more if including numbers/symbols).
    - **Password Length:** Number of characters in the password.
    - **Attempts per Second:** Speed at which guesses are made (research reasonable values!).

3. **Program Requirements:**
    - Declare variables for:
        - `passwordLength` (int)
        - `charSetSize` (int)
        - `attemptsPerSecond` (double)
        - `timeToCrack` (double, computed value)
    - Ask the user for password length, character set size, and attempts per second.
    - Compute the time required using **Math.pow()** (avoid using `^`, which is a bitwise XOR operator!).
    - Convert `timeToCrack` from a double to an integer.
    - Display the result using formatted output.

4. **Extra Credit (+5 points):**
    - Going beyond expectations (e.g., providing results in seconds, days, years, analyzing computational complexity, etc.).

## **Program Write-Up Document**
- A required part of the assignment, submitted as a **PDF**.
- Explains your program, design, key components, and challenges.
- Includes:
    - **Explanation of the Program**
    - **Program Design and Implementation**
    - **Screenshots of Program Execution**
    - **Conclusion and Reflection**
    - **Appendix with Complete Java Code**
    - **References (if applicable)**

## **Markdown & Documentation**
- Markdown is recommended for writing the program write-up.
- Tools like **Notable**, **Typora**, and **Sublime Text** can be used.
- Example syntax:
    - Headings: `# Title` (for different levels of headers)
    - Lists: `- item 1` or `1. item 1`
    - Code blocks: \`\`\`java
      System.out.println("Hello, World!");
      \`\`\`
    - Images: `![Alt Text](path/to/image.png)`

## **Grading Breakdown (100 Points)**
| Category | Points |
|----------|--------|
| Declaring Variables | 5 |
| User Input | 15 |
| Time Calculation | 25 |
| Type Conversion | 10 |
| Output Formatting | 30 |
| Code Readability & Documentation | 10 |
| Extra Credit | 5 |

- **Maximum without extra credit: 95/100**
- **95-100 is still an A (No A+ grading at the university level).**

## **Final Notes**
- **No code submission!** Only the PDF write-up with embedded code.
- If your program doesn’t work, explain why in the write-up for partial credit.
- Markdown is encouraged, but **DOCX (Google Docs/Word) is also acceptable**.
- If you need help formatting Markdown or finding a Markdown editor, ask for guidance.

## **Next Class**
- We'll continue discussing **logical operators and control structures**.
- Get started on your assignment early!

See you all on Wednesday!