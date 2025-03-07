# CS 162 - March 7, 2025

## Midterm Date Change
The midterm date has been rescheduled from **March 22** to **April 2**. If this change conflicts with any prior commitments, please let me know so we can work out a solution. The scheduling mistake was mine, and I don't want to penalize anyone for it.

## Homework Summary
I have graded all your homework submissions. Here are some general observations:

### Strengths Across Submissions:
- **Variable Usage:** Everyone demonstrated a solid understanding of variables.
- **Formula Implementation:** Most students correctly used `Math.pow()`. However, some mistakenly used the `^` operator, which performs bitwise operations instead of exponentiation.
- **Output Formatting:** The majority of submissions had clear and readable output.
- **Write-ups:** The written explanations of the code were generally well done.

### Common Issues:
- **Odd Spacing & Wrapping Issues:** Some submissions had formatting problems due to careless copying and pasting.
- **Inconsistent Indentation:** This made the code harder to read.
- **Lack of Comments:** Many submissions did not include sufficient comments, making it difficult to follow the logic.
- **Tiny Screenshots:** Some screenshots were too small to be useful.
- **AI-Generated UML Diagrams:** While UML diagrams were not required, some students submitted AI-generated ones, which were often nonsensical. I did not deduct points for this, but I also did not award extra credit unless the diagram was meaningful.

### Areas for Improvement:
- **Code Formatting:** Use consistent indentation to improve readability.
- **Commenting & Documentation:** More comments would enhance clarity.
- **Input Validation:** Some students included input validation, which is great! This will be a topic we discuss in future assignments.

## AI-Assisted Grading & Commenting
I used AI to assist with grading and code comments. A notice was added at the bottom of each graded assignment stating that AI-generated comments were used. If you would prefer your assignments not be graded with AI assistance, you should explicitly state this at the top of your submission.

For those who used AI for code commenting or formatting, I'd like to hear your thoughts:
- **How did you use AI in your workflow?**
- **Did you find it useful?**
- **Any challenges or tips you’d like to share?**

### Discussion Points:
- AI is helpful for **formatting** and **documentation**.
- Learning a skill before automating it is crucial. AI-generated code comments can sometimes be incorrect, and if you don’t understand good commenting practices, you won’t recognize these errors.
- Automated tools (e.g., Wix for web development) often produce functional but unreadable code. This is why learning foundational skills first is essential before relying on automation.

## Office Hours Reminder
I will be available for office hours today from **3:00 PM - 5:00 PM** in the basement of South Hall, opposite the ROTC office. No need to sign up in advance unless you have a specific topic you want to discuss.

## Snow Day & Zoom Lectures
How was the snow day? I hadn't done a Zoom lecture in a while, so I hope it worked well for everyone.

## Review of the Palindrome Detector
We previously built a **palindrome detector**, which checks whether a word or phrase reads the same forward and backward.

### Recap:
1. **User Input:** Prompted the user to enter a string.
2. **Character Comparison:** Compared the first and last characters, moving inward.
3. **Break Statement:** Used a `break` statement to exit the loop early if a mismatch was found.

#### Example Runs:
```
Enter a string: taco cat
"taco cat" is a palindrome.

Enter a string: Bob is Bob
"Bob is Bob" is not a palindrome.
```

### Key Takeaways:
- **`break` vs. `continue`**:
    - `break` exits a loop entirely.
    - `continue` skips the current iteration and moves to the next one.
- **Understanding `charAt()`**: Retrieves a character from a string at a given index.

## Strings in Java
Strings in Java are **derived data types**, meaning they are composed of primitive data types (characters). Unlike primitive types like `int` or `double`, strings come with built-in methods.

### String Methods:
- **`charAt(index)`** – Retrieves a character at a specific index.
- **Concatenation (`+`)** – Combines strings together.
- **`toUpperCase()` / `toLowerCase()`** – Converts strings to upper or lower case.
- **`trim()`** – Removes leading and trailing whitespace.
- **`equals()`** – Compares two strings for equality (instead of `==`).
- **`equalsIgnoreCase()`** – Compares strings, ignoring case sensitivity.
- **`contains(substring)`** – Checks if a string contains a specific substring.
- **`startsWith(prefix)` / `endsWith(suffix)`** – Checks if a string starts or ends with a given substring.

#### Example:
```java
String phrase = "  Hello, World!  ";
System.out.println(phrase.trim()); // Output: "Hello, World!"
System.out.println(phrase.toUpperCase()); // Output: "  HELLO, WORLD!  "
```

## String Comparison
Since `==` does not work for comparing string contents, use:
```java
if (string1.equals(string2)) {
    System.out.println("Strings are equal");
}
```

To ignore case:
```java
if (string1.equalsIgnoreCase(string2)) {
    System.out.println("Strings are equal, ignoring case");
}
```

## Using `compareTo()` for Alphabetical Order
The `compareTo()` method is used to compare two strings lexicographically.
```java
String city1 = "Minneapolis";
String city2 = "Saint Paul";
if (city1.compareTo(city2) < 0) {
    System.out.println(city1 + " comes before " + city2);
} else {
    System.out.println(city2 + " comes before " + city1);
}
```
This compares Unicode values of characters and determines order.

### Example Runs:
```
Enter first city: New York
Enter second city: Los Angeles
The cities in alphabetical order: Los Angeles, New York
```

## Next Time
On Monday, we will finish discussing string methods, including substring extraction, and move on to another important derived data type: **arrays**. See you then!

