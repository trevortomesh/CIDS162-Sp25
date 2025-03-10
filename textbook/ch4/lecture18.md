# CS 162 – Strings and Arrays Review (March 10, 2025)

## Lecture Recap

### Projector Troubles and Review Setup
We started today's class with some minor technical issues—remember to check if the projector is blanked out! Once everything was ready, we jumped back into our string discussions from last time.

---

## String Methods Recap

We continued exploring Java strings and methods available to them:

### `.compareTo()`
- Compares two strings lexicographically.
- Returns:
    - `0` → Strings are equal.
    - `< 0` → First string comes before the second alphabetically.
    - `> 0` → First string comes after the second alphabetically.
- Useful for sorting or checking ordering between strings.

### `.charAt(index)`
- Retrieves a character at a specific position.
- Indexing starts at `0`.

```java
String s = "pikachu";
System.out.println(s.charAt(3)); // prints 'a'
```

### `.substring(start, end)`
- Extracts a portion of a string from `start` (inclusive) to `end` (exclusive).

```java
String s2 = "I like to eat cake";
System.out.println(s2.substring(0, 1)); // prints "I"
System.out.println(s2.substring(2, 6)); // prints "like"
```

### `.indexOf()` and `.lastIndexOf()`
- Finds the position of a character or substring.
- `.indexOf()` gives the first occurrence.
- `.lastIndexOf()` gives the last occurrence.

```java
System.out.println(s2.lastIndexOf('a')); // returns index of last 'a'
```

---

## Introduction to Arrays

### Why Arrays?
Arrays help us manage multiple values efficiently instead of creating many separate variables.

```java
int a = 7, b = 3, c = 12; // Inefficient if we have many values!
```

### Array Syntax
```java
int[] myArray = {5, 7, 9, 12, 13, 15};
System.out.println(myArray[3]); // prints 12
```

### Arrays can be of any type:
```java
double[] doubleArray = {1.2, 3.5, 0.1, 2.1};
System.out.println(doubleArray[2]); // prints 0.1
```

### Arrays Are:
- **Homogeneous** – All elements must be the same type.
- **Fixed-Size** – Cannot change length after declaration.
- **Contiguously Stored** – Stored in memory side by side.

---

## Indexing and Array Length
- Arrays start at index `0`.
- Length of array accessed via `.length` property.

```java
System.out.println(myArray.length); // 6
System.out.println(myArray[myArray.length - 1]); // last element
```

### Common Error:
```java
System.out.println(myArray[myArray.length]); // IndexOutOfBoundsException
```
- Remember: valid indices go from `0` to `length - 1`.

---

## Looping Through Arrays
Instead of printing each element manually:
```java
for (int i = 0; i < myArray.length; i++) {
    System.out.println(myArray[i]);
}
```
- This is the standard way to iterate through an array in Java.

---

## Arrays as Reference Types
- Printing an array directly gives you a memory reference, not the contents:
```java
System.out.println(myArray); // something like [I@3e25a5
```
- To see values, you must loop or use `Arrays.toString()` from `java.util.Arrays`.

---

## Summary
- Strings are derived types (built from characters).
- Arrays are also derived types (built from primitives or objects).
- Arrays help manage large data collections efficiently.
- Understanding indices and memory layout is critical.

---

## Coming Next: More on Arrays
- Multidimensional arrays
- Array initialization and manipulation
- Practical examples: sorting, searching, and array-based algorithms

---

## Reminder
- Office hours today from 3–5pm in South Hall (basement, opposite ROTC).
- You do NOT need an appointment—walk-ins welcome.

---

> "If you're confused, that's okay. Arrays are one of the trickiest topics, even for experienced programmers. Keep practicing and don't hesitate to ask questions!" – Dr. T

