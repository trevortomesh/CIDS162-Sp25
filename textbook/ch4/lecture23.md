# CS 162 — March 28, 2025

## Summary
Today we continued our work on arrays, culminating in the creation and shuffling of a virtual 52-card deck. Along the way, we revisited array operations including summing, finding minimum and maximum values, and using a `for-each` loop. We also introduced and practiced array initialization and learned how to traverse arrays without index values. The session ended with a fun example of simulating card draws from a shuffled deck.

We also briefly discussed the midterm logistics and introduced the `String.repeat()` method as a Java alternative to Python-style string multiplication.

---

## Key Concepts

### 1. **Array Processing Recap**
- Sum, max, and min of an integer array:
  ```java
  int total = 0;
  int max = addArray[0];
  int min = addArray[0];
  for (int i = 0; i < addArray.length; i++) {
      total += addArray[i];
      if (addArray[i] > max) max = addArray[i];
      if (addArray[i] < min) min = addArray[i];
  }
  ```

### 2. **Shuffling an Array**
Use a temp variable and random index to perform an in-place shuffle:
```java
for (int i = 0; i < deck.length; i++) {
    int index = (int)(Math.random() * deck.length);
    int temp = deck[i];
    deck[i] = deck[index];
    deck[index] = temp;
}
```

### 3. **The `for-each` Loop**
Simplified syntax for traversing arrays:
```java
for (int element : addArray) {
    System.out.println(element);
}
```
- This avoids using index values directly.
- The loop variable (`element`) must match the array's data type.

### 4. **String.repeat() in Java**
Instead of Python's `'=' * 10`, use:
```java
System.out.println("=".repeat(10));
```

### 5. **Creating and Using a Virtual Deck of Cards**
- Represent cards as integers from 0 to 51.
- Use integer division and modulus to map to suits and ranks.

```java
String[] suits = {"♠", "♥", "♦", "♣"}; // Spades, Hearts, Diamonds, Clubs
String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

int[] deck = new int[52];
for (int i = 0; i < deck.length; i++) deck[i] = i;

// Shuffle
for (int i = 0; i < deck.length; i++) {
    int index = (int)(Math.random() * deck.length);
    int temp = deck[i];
    deck[i] = deck[index];
    deck[index] = temp;
}

// Draw 5 cards
for (int i = 0; i < 5; i++) {
    String suit = suits[deck[i] / 13];
    String rank = ranks[deck[i] % 13];
    System.out.println("Card " + i + ": " + rank + " of " + suit);
}
```

---

## Practice Problems

1. **Basic Array Traversal**
    - Write a loop to print all even values in an array of integers.

2. **For-each Conversion**
    - Rewrite a `for` loop using a `for-each` loop:
      ```java
      for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i]);
      }
      ```

3. **Card Logic Extension**
    - Modify the deck program to draw and display a full 5-card poker hand and determine if it contains a pair.

4. **Deck Rebuilder**
    - Create a method to rebuild the deck in original order after shuffling.

5. **Emoji Enhancement (Stretch Goal)**
    - Replace string names for suits with emoji equivalents in the output.
        - ♠ Spades
        - ♥ Hearts
        - ♦ Diamonds
        - ♣ Clubs

---

## Reminders
- **Quiz due tonight** (March 28)
- **Midterm on Wednesday (April 2)** — in person, scantron format
- **Review session on Monday (March 31)** — we'll go over quizzes 1 and 2
- Office hours available this afternoon if you want help getting started on the assignment.

---

Keep practicing with arrays — the more you use them, the more natural they become!

Happy coding! ✨

