## CIDS 162 - Conditional Logic: If and Else Statements

### Introduction
Welcome back to **CIDS 162** on **February 10, 2025**. Today, we are diving into **if and else statements**, which are fundamental to controlling the flow of a program.

### If-Else Statements

An **if statement** allows us to specify **alternative execution paths** based on a given condition. Rather than executing commands linearly like a recipe, we can make **decisions** within our program.

#### Example: Determining Picnic Suitability

```java
int lowTemp = 55;
int highTemp = 80;
int temp = 60;

if (temp >= highTemp) {
    System.out.println("Too hot to go on a picnic.");
} else {
    System.out.println("Not too hot.");
}

if (temp <= lowTemp) {
    System.out.println("Too cold to go on a picnic.");
} else {
    System.out.println("Not too cold.");
}
```

#### Flow Control Diagram Representation

A **flowchart** can help visualize how the decision-making process works in an **if-else** structure. We use **diamond-shaped** decision nodes:

1. **Check if too hot** → If true, print *"Too hot."*, otherwise print *"Not too hot."*
2. **Check if too cold** → If true, print *"Too cold."*, otherwise print *"Not too cold."*
3. If neither condition is met, it means **picnic conditions are suitable**.

#### Debugging and Testing
- Always **test boundary conditions** (e.g., 55°F, 80°F, extremes like 100°F and 10°F).
- Use **print statements** to verify logic.
- **Modify conditions carefully** to ensure correctness.

### Improving Logic with Compound Conditions

A **better approach** combines the two separate checks into a single **compound if statement**:

```java
if (temp >= lowTemp && temp <= highTemp) {
    System.out.println("It's picnic time!");
} else {
    System.out.println("No picnic for you.");
}
```

- `&&` ensures both conditions must be **true** for the picnic to proceed.
- If the temperature is **too high** or **too low**, we print *"No picnic for you."*

### Introducing User Input

To make the program dynamic, we can allow the user to enter a temperature:

```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.println("Give me a temp in Fahrenheit:");
int temp = input.nextInt();

if (temp >= lowTemp && temp <= highTemp) {
    System.out.println("It's picnic time!");
} else {
    System.out.println("No picnic for you.");
}
```

- The **scanner** takes user input and **stores it** in `temp`.
- The **conditional logic remains the same**, but now responds dynamically.

### Nested If Statements

A **nested if statement** is an **if statement inside another if statement**. We can think of these as **gates** in a medieval city:

```java
boolean gate1 = true;
boolean gate2 = true;
boolean gate3 = false;

if (gate1) {
    System.out.println("Gate 1 breached!");
    if (gate2) {
        System.out.println("Gate 2 breached!");
        if (gate3) {
            System.out.println("The King is dead!");
        }
    }
}
```

- If `gate1` is **false**, nothing happens.
- If `gate1` is **true**, then **gate2** is checked, and so on.
- The **King is only vulnerable** if all three gates are breached.

### Flattening Nested Ifs with Compound Conditions

Instead of **nested** if statements, we can **combine conditions** into a single statement:

```java
if (gate1 && gate2 && gate3) {
    System.out.println("The King is dead!");
} else {
    System.out.println("The King is safe.");
}
```

This approach is **more readable** and eliminates unnecessary nesting.

### Conclusion

- **If-else statements** control program execution based on conditions.
- **Flowcharts** can help visualize decision-making.
- **Compound conditions** (`&&` and `||`) improve logic.
- **Nested if statements** act like gates, restricting access.
- **Flattening conditions** makes code cleaner and easier to read.

We'll continue on **Wednesday** by introducing **else-if** chains and combining nesting with compound conditions. See you then!