# CS 162 - April 11, 2025

## Arrays and Pass-by-Value vs. Pass-by-Reference

### Recap: The Cliffhanger
In our last session, we ran into a curious situation with arrays that seemed to challenge what we knew about how Java passes values to methods. We wrote a method that took an array and an integer multiplier, modified the array, and printed the result. Surprisingly, the original array was permanently changed even after the method completed.

Today, we resolve that mystery by diving into one of the most conceptually challenging parts of CS 162: the difference between **pass-by-value** and **pass-by-reference**, and how arrays fit into this model in Java.

---

## 🔁 Pass-by-Value in Java
Java is strictly a **pass-by-value** language.

- When we pass a **primitive** variable (like an `int`) to a method, Java passes a **copy of its value**.
- If we change that value in the method, the change does **not** affect the original value in the calling method.

```java
int x = 10;
changeX(x);
System.out.println(x); // Outputs 10

public static void changeX(int x) {
    x = x + 99;
    System.out.println(x); // Outputs 109
}
```

Explanation:
- Inside `changeX`, a new local variable `x` is created.
- It lives and dies in that method.
- The original `x` in `main()` remains untouched.

---

## 📦 Arrays Are Different (But Still Pass-by-Value!)
So what’s the deal with arrays?

```java
int[] numbers = {1, 2, 3};
modifyArray(numbers);
System.out.println(numbers[0]); // Outputs changed value!

public static void modifyArray(int[] arr) {
    arr[0] = 999;
}
```

**Key idea:**
> Java is still passing **by value**, but the value of an array **is its address** in memory.

So when we pass an array to a method, we’re passing a copy of its reference (a map to its memory location). Both the caller and the callee end up referring to the same array in memory.

**Analogy:**
If you and a friend both have copies of a map to your house, either one of you can use it to find the house and rearrange the furniture inside.

---

## 🧠 Summary: Pass-by-Value vs. Arrays
- Java always passes **by value**.
- Primitives: value is a number, boolean, etc. — a direct copy.
- Arrays and objects: value is a **reference**, i.e., memory address.
- Changing **elements** of the array inside a method affects the original array.
- Reassigning the array inside the method points the local copy to a new array, leaving the original untouched.

```java
public static void reassignArray(int[] arr) {
    arr = new int[] {999};
    System.out.println(arr[0]); // Outputs 999
}
```

```java
int[] myArray = {1, 2, 3};
reassignArray(myArray);
System.out.println(myArray[0]); // Still outputs 1
```

Because `arr` now points to a new array, and `myArray` still points to the original.

---

## 🧪 Practice Questions

### ✅ True / False
1. Java is a pass-by-reference language. → **False**
2. Arrays are passed by reference in Java. → **False** (they're passed by value, but the value is a reference)
3. Changes made to an array inside a method are visible outside that method. → **True**

### 📤 What’s the output?
```java
int[] nums = {10, 20};
change(nums);
System.out.println(nums[0]);

public static void change(int[] arr) {
    arr[0] = 99;
}
```
**Output:** 99

```java
int x = 5;
modify(x);
System.out.println(x);

public static void modify(int num) {
    num = 42;
}
```
**Output:** 5

### ✏️ Short Answer
1. Why do arrays appear to behave like pass-by-reference values in Java?
   > Because Java passes the reference (i.e., memory address) to the method. The array itself is still in the same memory location, so both the caller and callee can access and modify it.

2. How can you prevent a method from modifying the original array?
   > You can pass a **copy** of the array using `Arrays.copyOf()` or clone it using `.clone()` before passing.

---

Next up: We’ll explore **2D arrays** and begin combining methods and arrays for more powerful programs. If you’ve made it through this, you’re ready for object-oriented programming in CS 235!


