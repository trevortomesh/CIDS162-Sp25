# Arrays and Randomization (March 26, 2025)

In this lecture, we continued our deep dive into arrays. While arrays are useful, they come with limitations: they’re fixed-width, homogeneous, and a bit tedious to manipulate. Still, we explored several common array-processing operations in Java.

---

## Key Topics Covered

### 🔢 Array Initialization & Null Values
- Arrays automatically initialize with type-specific default values:
    - `double[]` → 0.0
    - `int[]` → 0
    - `boolean[]` → false
    - `char[]` → '\0' (null character)
    - `String[]` → null

### 🔄 Initializing Arrays with Random Values
- You can use a `for` loop and `Math.random()` to fill an array with random numbers.
```java
for (int i = 0; i < myList.length; i++) {
    myList[i] = Math.random() * 100;
}
```

### 🧵 Declaring and Defining Arrays
- Declare and define at once:
```java
double[] myList = {1, 2, 3, 4, 5};
```
- Declare then initialize manually:
```java
double[] myList = new double[10];
for (int i = 0; i < myList.length; i++) {
    myList[i] = 7; // Or any logic
}
```

### 💬 Character Arrays vs Other Arrays
- Character arrays print like strings:
```java
char[] city = {'R','I','V','E','R',' ','F','A','L','L','S'};
System.out.println(city); // prints "RIVER FALLS"
```
- All other arrays need loops to print each element.

### ➕ Summing Array Elements
```java
int total = 0;
for (int i = 0; i < arr.length; i++) {
    total += arr[i];
}
```

### 📈 Finding Max/Min
```java
int max = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) max = arr[i];
}

int min = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] < min) min = arr[i];
}
```

### 🎲 Shuffling an Array
- Use a loop and random swapping:
```java
for (int i = 0; i < arr.length; i++) {
    int j = (int)(Math.random() * arr.length);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
```
- Avoid overwriting values without saving them with a `temp` variable!

---

## 💡 Takeaways
- Arrays must be initialized before use and require loops for most manipulations.
- Java arrays are fixed in size and contain only one data type (homogeneous).
- Strings are essentially character arrays under the hood.
- Shuffling, summing, finding max/min—all require loops!

---

## 🧠 Practice Problems: Arrays and Randomization

### 1. Fill with Random Doubles
Write a method `double[] fillRandom(int size)` that returns a new array of the specified size filled with random double values between 0 and 100.

### 2. Initialize with a Specific Value
Write a method `int[] fillWithValue(int size, int value)` that returns an integer array of the given size, filled entirely with the given value.

### 3. Sum of an Array
Write a method `int sum(int[] array)` that calculates and returns the sum of all elements in an integer array.

### 4. Maximum Value
Write a method `int max(int[] array)` that returns the largest value found in the array.

### 5. Minimum Value
Write a method `int min(int[] array)` that returns the smallest value found in the array.

### 6. Random Shuffle
Write a method `void shuffle(int[] array)` that shuffles an integer array using the random swap technique covered in class.

### 7. Character Array to String
Given a character array, write a method `String charArrayToString(char[] array)` that returns the array as a `String`.

### 8. Detect Duplicate Values
Write a method `boolean hasDuplicates(int[] array)` that returns `true` if the array contains any duplicate values.

### 9. Find Index of Maximum
Write a method `int indexOfMax(int[] array)` that returns the index of the largest element in the array.

### 10. Build and Shuffle a Deck
Build a simple “deck” of 10 cards represented by integers 1 through 10 and shuffle it using your own `shuffle` method.