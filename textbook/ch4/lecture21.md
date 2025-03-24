**CS 162 - Arrays, the Pokédex Assignment, and Reference Variables (March 25, 2025)**

---

### Midterm and Assignment Overview

**Midterm Exam Reminder:**
- Scheduled for next week, in class.
- Format: Paper and pencil (just like your quizzes, but larger).
- Bring a number two pencil (or a mechanical pencil with #2 lead).
- We’ll use Scantron sheets.
- Accommodations: If you require any, arrange them in advance.
- Review will take place Monday.

**Assignment 2: Pokédex Simulation**
- Now published on Canvas (sorry for the delay).
- Inspired by the Pokédex from the original Pokémon anime.
- Objective: Build a simplified digital Pokédex using Java arrays.

**Two Options for Handling Data:**
1. **Easy Mode**: Manually hard-code the first 20 Pokémon (up to Raticate) into arrays.
2. **Hard Mode (+1 bonus point)**: Write a CSV parser to read all Pokémon data from a CSV file (~800+ entries). This will require research, as we haven’t covered file I/O yet.

**Assignment Features:**
- Store the following data for each Pokémon:
    - Pokédex number
    - Name
    - Classification
    - Type 1
    - Type 2
- Each of the above should be stored in **separate arrays**.

**Core Functionality:**
- Ask user whether they want to search by name or number.
- If by name, prompt and return all matching Pokémon info.
- If by number, return info based on index (adjust by -1 if needed).
- Show appropriate error messages if no match is found.
- After each query, ask if they want to search again.

**Testing Requirements:**
- Demonstrate:
    - A successful name search
    - An unsuccessful name search
    - A successful number search
    - An unsuccessful number search

**Program Write-up Tool:**
- Use the online [Write-up Generator Tool](https://trevortomesh.github.io/pwudgen/162-a2-pwud.html)
- Paste in code snippets and output
- Fill in the reflection section
- Generate a PDF and submit it on Canvas
- If tool formatting breaks, you may submit a `.doc` file

**Note on AI-Assisted Grading:**
- AI will suggest feedback, but Dr. T will review and finalize grades.
- If you prefer no AI assistance, include "I do not consent to AI-assisted grading" at the top of your write-up.

---

### Arrays Review

**Properties of Arrays:**
- **Fixed-width**: Once created, the size cannot change.
- **Homogeneous**: All elements must be the same data type.
- **Contiguous**: Elements are stored next to each other in memory.
- **Reference Type**: Array variables store the address of the data, not the data itself.

**Example**:
```java
String[] pokemon = {"Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard", "Squirtle", "Wartortle", "Blastoise"};
String[] type = {"Grass/Poison", "Grass/Poison", "Grass/Poison", "Fire", "Fire", "Fire/Flying", "Water", "Water", "Water"};
```

**Accessing Elements:**
```java
System.out.println("Enter Pokédex number:");
int num = input.nextInt();
System.out.println("You picked: " + pokemon[num - 1] + ", Type: " + type[num - 1]);
```

**Common Mistake:** Accessing `pokemon[num]` instead of `pokemon[num - 1]` causes off-by-one errors.

**Arrays with User Input:**
```java
double[] myList = new double[10];
for (int i = 0; i < myList.length; i++) {
    myList[i] = input.nextDouble();
}
```

**Why not just print the array directly?**
```java
System.out.println(myList); // Prints memory address, not values
```
Use a loop to access and print each value instead.

**Default Values by Type:**
- `int[]` → `0`
- `double[]` → `0.0`
- `boolean[]` → `false`
- `String[]` → `null`

---

### Final Notes
- Arrays can’t be resized, which is inconvenient.
- They are powerful but require more care when handling bounds.
- The Pokédex assignment is a perfect hands-on experience to reinforce array concepts.
