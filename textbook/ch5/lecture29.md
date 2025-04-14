# CS 162 Lecture Summary (April 14, 2025)

## Topic: Returning Arrays and Multidimensional Arrays

Today we transitioned from discussing passing arrays to methods, to **returning arrays from methods**, and then moved on to **multidimensional arrays**.

---

### Returning Arrays from Methods

You can return arrays from methods in Java, just like you can pass them in. Remember:
- Java is **pass-by-value**, but the value of an array is its **address** (reference).
- So when returning an array, you're returning its reference.

#### Example: Reversing an Array
```java
public static int[] reverse(int[] list) {
    int[] result = new int[list.length];
    for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
        result[j] = list[i];
    }
    return result;
}
```
You can then call this as:
```java
int[] list1 = {1, 2, 3, 4, 5, 6};
int[] list2 = reverse(list1);
```

### Notes:
- You can also return newly constructed arrays, such as those filled with specific values.
- The reference (address) to the new array is what's returned, not the array data itself.

#### Fun Extra:
```java
public static int[] numberArray(int length, int value) {
    int[] result = new int[length];
    for (int i = 0; i < length; i++) {
        result[i] = value;
    }
    return result;
}
```

---

### Multidimensional Arrays

A **two-dimensional array** is an array of arrays:
```java
int[][] my2DArray = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```
Accessing elements:
```java
System.out.println(my2DArray[1][2]); // prints 6
```

#### Key Concepts:
- Think of a 2D array as a **collection of collections**.
- Rows = outer array, Columns = inner arrays.
- Java allows **jagged arrays**: inner arrays can have different lengths.

#### Jagged Array Example:
```java
int[][] jagged = {
    {1},
    {2, 3},
    {4, 5, 6}
};
System.out.println(jagged[2][1]); // prints 5
```

---

### Three-Dimensional Arrays and Beyond
- A 3D array is a collection of 2D arrays.
- In Java: `int[][][]` is a three-dimensional array.

Trevor's example:
```java
String[] books = {"LOTR", "Hitchhiker's Guide", "Art of Programming", "Bible"};
String[] games = {"Zelda", "Pokemon", "Minecraft", "Call of Duty", "Balatro"};
String[] movies = {"LOTR", "Hitchhiker's Guide", "Matrix"};
String[] guns = {"Walther PDP", "12 gauge", "AR-15", "Revolver"};

String[][] collections = { books, games, movies, guns };
System.out.println(collections[2][2]); // Matrix

String[][] electronics = { games, movies };
String[][] other = { books, guns };
String[][][] collectionGroups = { electronics, other };
System.out.println(collectionGroups[0][0][4]); // Balatro
```

---

### Summary
- You can return arrays from methods by returning the array reference.
- Multidimensional arrays are **arrays of arrays**, and the concept extends naturally.
- Think of them as **collections of collections** for clarity.
- The rules of arrays (homogeneous, fixed-size, indexed) do not change across dimensions.

---

### Practice Questions
1. Write a method that returns an array of squares of the numbers from 1 to `n`.
2. Write a method that accepts a 2D array and returns the sum of all its elements.
3. Given a 3D array representing temperature readings across time and location, how would you access the temperature at time 2, location row 3, column 1?
4. What is the difference between a matrix and a jagged array?
5. What will this print?
```java
int[] original = {10, 20, 30};
int[] reversed = reverse(original);
original[0] = 99;
System.out.println(reversed[2]);
```

