# CS 162 Living Textbook — Arrays, Reference Variables, and Intro to String Arrays

### Lecture Summary: March 12 & 14, 2025

Welcome back to CS 162! In this section, we continue our exploration of one of the most foundational yet conceptually challenging topics in programming: **arrays**. Arrays form the core of many data structures, and learning how to work with them effectively will significantly improve your programming skills. We also began integrating more work with **strings** and **string arrays** — culminating in a fun example using the first nine Pokémon.

---

## Arrays: Declaring vs. Defining

In Java, arrays are **derived data types**, meaning they are composed of primitive data types (e.g., `int`, `double`, `char`) or other derived types like `String`.

There are **two steps** to working with arrays:
1. **Declaration**: Telling Java what kind of array you're planning to work with.
   ```java
   double[] myArray; // This is a reference variable
   ```
2. **Definition** (also called instantiation): Actually creating the array in memory.
   ```java
   myArray = new double[6]; // This creates a double array of 6 elements
   ```

You can also **declare and define simultaneously**:
```java
int[] myArray = {5, 3, 7, 9, 0, 1, 2};
```

### Key Concept:
> The array name (e.g., `myArray`) is a **reference variable**. It does not contain the actual array but instead stores the **address** of the array's first element (the **zeroth index**) in memory.

This distinction is crucial: if you try to print `myArray` directly, you'll see a memory reference, not the values inside it.

```java
System.out.println(myArray); // Prints memory address, not array contents
```

---

## Why Arrays Are Homogeneous and Contiguous

Java arrays must:
- Be **homogeneous** (all elements are of the same type)
- Be **contiguous in memory** (stored back-to-back)

This ensures efficient indexing:
```java
System.out.println(myArray[2]); // Accesses the third element
```

If elements were mixed types or scattered in memory, calculating where to find `myArray[2]` would be much more complicated.

---

## Default Values in Arrays
- `int[]` → Default values are `0`
- `double[]` → Default values are `0.0`
- `String[]` → Default values are `null`

You can assign values manually:
```java
myArray[2] = 7.2;
```

And print with a loop:
```java
for (int i = 0; i < myArray.length; i++) {
    System.out.println(myArray[i]);
}
```

> Reminder: Always use `i < array.length`, NOT `i <= array.length`. Otherwise, you'll get an **ArrayIndexOutOfBoundsException**.

---

## Introducing String Arrays: Pokédex Example

To demonstrate how arrays can store more complex data, we created a **String array** with the first nine Pokémon:

```java
String[] pokemon = {
  "Bulbasaur", "Ivysaur", "Venusaur",
  "Charmander", "Charmeleon", "Charizard",
  "Squirtle", "Wartortle", "Blastoise"
};
```

We also paired this with a **type array**:
```java
String[] type = {
  "Grass/Poison", "Grass/Poison", "Grass/Poison",
  "Fire", "Fire", "Fire/Flying",
  "Water", "Water", "Water"
};
```

Then, using a scanner and user input:
```java
Scanner input = new Scanner(System.in);
System.out.print("Enter a Pokédex number (1-9): ");
int num = input.nextInt();
System.out.println("You picked Pokémon #" + num + ": " + pokemon[num - 1]);
System.out.println("Type: " + type[num - 1]);
```

---

## Key Takeaways
- Arrays are reference types, storing memory addresses.
- Declaration alone does not create an array; use `new` to define it.
- Arrays must be homogeneous and contiguous.
- Indexing starts at **0**, not 1!
- Accessing out-of-bound indices leads to runtime exceptions.

---

## Practice Challenge
Try creating your own mini Pokédex that stores not only the name and type, but also a brief description. For example:
```java
String[] descriptions = {
  "A strange seed was planted on its back at birth.",
  "When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs.",
  ... // etc.
};
```
Then modify your program to print:
```
You picked Pokémon #3: Venusaur
Type: Grass/Poison
Description: The plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight.
```

---

### Next Up: We'll continue working with arrays and dive deeper into file input/output, multi-dimensional arrays, and more advanced data structure patterns.

Happy Spring Break, and catch you after the break!

