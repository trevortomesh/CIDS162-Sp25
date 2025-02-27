## 🔄 Loops in Java

### **1. `while` Loop**
A `while` loop executes a block of code **as long as a condition remains true**.
```java
int count = 0;
while (count < 5) {
    System.out.println("Count is: " + count);
    count++;
}
```
💡 **Example:** Automating "99 Bottles of Beer on the Wall"
```java
int bottles = 99;
while (bottles > 0) {
    System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
    bottles--;
    System.out.println("Take one down, pass it around, " + bottles + " bottles of beer on the wall.\n");
}
```

### **2. `do-while` Loop (Preview for Next Class)**
A `do-while` loop guarantees the loop **executes at least once**.
```java
do {
    System.out.println("This will print at least once.");
} while (false);
```
📌 **Use Case:** Ensuring user enters valid input before proceeding.

---

## 📝 Practice Questions:
1. Write a loop that counts down from 10 to 1, printing each number.
2. Implement a `do-while` loop that keeps asking for input until the user enters a valid year.

---

🔮 **Next Lecture (Feb 28, 2025):**
- **`do-while` Loops** and their practical applications.
- **Refactoring** the Zodiac program to improve efficiency.
- **More on program structure and efficiency!** 🚀
