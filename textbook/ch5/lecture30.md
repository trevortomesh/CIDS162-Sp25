# CS 162 – April 16, 2025: Multidimensional Arrays (Continued)

## Overview
Today we continued our exploration of arrays, focusing on multidimensional arrays (2D and beyond), how they're stored, and how to manipulate them in Java.

## Arrays as Collections
- Arrays are **collections**.
- A **2D array** is a collection of collections.
- A **3D array** is a collection of collections of collections, and so on.
- Java includes many collection types, but `ArrayList` (which you'll cover in CS 235) is a key one for object-oriented data structures.

## Collections Example
We revisited the example of collections:
```java
String[] books = {"Lord of the Rings", "Hitchhiker's Guide", "The Art of Computer Programming", "The Bible"};
String[] games = {"Legend of Zelda", "Pokemon", "Minecraft", "Call of Duty", "Balatro"};
String[] movies = {"Lord of the Rings", "Hitchhiker's Guide", "The Matrix"};
String[] guns = {"Walther PPK", "12 Gauge", "AR-15", "Taurus Revolver"};
String[] pens = {"Lamy 2000", "TWSBI Eco", "Lamy Safari"};
```

You can then group these:
```java
String[][] electronics = {games, movies};
String[][] other = {books, guns, pens};
String[][][] collections = {electronics, other};
```
Accessing `Balatro`:
```java
System.out.println(collections[0][0][4]); // electronics > games > index 4
```

## Maximum Dimensions in Java
- Java can theoretically support up to **255 dimensions** in an array.
- Practically, memory and JVM constraints will limit this.
- Overly dimensional arrays are not typically useful and can hurt readability.

## Regular vs. Ragged Arrays
- A **regular array** (e.g., matrix) has subarrays of equal length:
```java
int[][] matrix = {
  {1, 2, 3},
  {4, 5, 6},
  {7, 8, 9}
};
```

- A **ragged array** (aka jagged array) has subarrays of different lengths:
```java
int[][] triangleArray = {
  {1, 2, 3, 4, 5},
  {2, 3, 4, 5},
  {3, 4, 5},
  {4, 5},
  {5}
};
```

## Accessing Ragged Arrays
Accessing each row length safely:
```java
for (int i = 0; i < triangleArray.length; i++) {
    System.out.println("Length of row " + i + ": " + triangleArray[i].length);
}
```

## Defining Ragged Arrays Dynamically
```java
int[][] triangleArray = new int[5][];
triangleArray[0] = new int[5];
triangleArray[1] = new int[4];
triangleArray[2] = new int[3];
triangleArray[3] = new int[2];
triangleArray[4] = new int[1];
```

## Memory Layout Insights
- **Addresses within the array** (i.e., reference variables) are contiguous.
- **The arrays they point to** are **not guaranteed** to be contiguous in memory.
- Java's garbage collector handles memory cleanup for unreferenced arrays.

## Printing 2D Arrays
```java
public static void print2DArray(int[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
        for (int col = 0; col < matrix[row].length; col++) {
            System.out.print(matrix[row][col] + " ");
        }
        System.out.println();
    }
}
```
You can call:
```java
print2DArray(matrix);
```

## Matrix Initialization with Random Numbers
```java
Random rand = new Random();
int[][] matrix = new int[10][10];

for (int row = 0; row < matrix.length; row++) {
    for (int col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = rand.nextInt(100); // 0–99
    }
}
```

## Notes on Scope and Method Passing
- Java is a **pass-by-value** language.
- But **arrays are reference variables**, so the value passed is the **address**.
- Passing an array to a method gives the method access to the original data.

```java
System.out.println("Address in main: " + matrix);
print2DArray(matrix); // same address seen inside
```

## Next Time
We'll continue with multidimensional arrays, then move on to:
- Using the **command line**
- **File I/O** (reading and writing to files)

These are foundational for object-oriented programming in CS 235.
