# CS 162 Lecture Summary - February 26, 2025

## 📅 Announcements
- ✅ **Quiz 1:** Due **February 28, 2025** (Friday) by 11:59 PM. Avoid last-minute submissions!
- ✅ **Assignment 1:** Due **March 3, 2025**. Includes a **required write-up**.
- ✅ **Submission Format:** PDF only.
- ✅ **Class Chat Room:** Available for lecture questions.

---

## 🐉 Chinese Zodiac Program (Continued)

### 🔢 Understanding the Chinese Zodiac Cycle
- The Chinese zodiac operates on a **12-year cycle**.
- Each year is assigned a specific animal sign.
- We use the **modulus operator (%)** to determine the zodiac sign.

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

### 🖥️ Implementing the Zodiac Program

#### Steps:
1. **Ask user for their birth year.**
2. **Calculate `birthYear % 12`** to determine their zodiac sign.
3. **Output the corresponding zodiac sign.**

#### Java Implementation (Using `switch`)
```java
import java.util.Scanner;

public class ZodiacCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int year = input.nextInt();
        
        switch (year % 12) {
            case 0: System.out.println("You are a Monkey!"); break;
            case 1: System.out.println("You are a Rooster!"); break;
            case 2: System.out.println("You are a Dog!"); break;
            case 3: System.out.println("You are a Pig!"); break;
            case 4: System.out.println("You are a Rat!"); break;
            case 5: System.out.println("You are an Ox!"); break;
            case 6: System.out.println("You are a Tiger!"); break;
            case 7: System.out.println("You are a Rabbit!"); break;
            case 8: System.out.println("You are a Dragon!"); break;
            case 9: System.out.println("You are a Snake!"); break;
            case 10: System.out.println("You are a Horse!"); break;
            case 11: System.out.println("You are a Goat!"); break;
            default: System.out.println("Invalid input. Please enter a valid year.");
        }
    }
}
```

🔍 **Why `switch` instead of `if-else`?**
- More **readable** and **efficient**.
- Avoids long chains of `if-else` conditions.

---

## 📝 Practice Questions:
1. Modify the Zodiac program to allow **multiple** queries without restarting.
2Convert the Zodiac program from `switch` to `if-else` statements.
