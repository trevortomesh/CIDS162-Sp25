**CS 162 - March 12, 2025 - Arrays Continued**

Welcome back to CS 162! It's Wednesday, March 12, 2025. We’re continuing our exploration of arrays today, which are one of the major topics in this course following our transition from Python to Java. You already know the basics of Java, so now we’re moving into higher-order data structures.

---

### Review of Derived Data Types

Remember how we talked about derived data types last time? Derived data types are types that are made up of other data types. For instance:
- `int a = 5;`
- `double b = 5.3;`
- `char c = 'A';`

These are simple data types, or primitive types. But then we get to more complex types like `String`. A `String` is a derived data type because it is made up of multiple characters (`char`).

### Arrays: Another Derived Data Type
We also introduced arrays. Technically, a `String` is a type of array—it's a character array. But when we say "array" more broadly in programming, we’re usually talking about a collection of individual primitive values, all of the same type, stored in contiguous memory.

For example, if you have:
```java
int[] intArray = {5, 3, 7, 9, 0, 1, 2};
```
You are creating a collection of integers, stored in memory. Each element has an index, starting from 0. So:
- `intArray[0]` is 5
- `intArray[1]` is 3
- `intArray[6]` is 2

Each of these values lives in a specific memory location. Arrays help us store large amounts of similar data in an efficient way. Imagine if you had 1,000 values. You wouldn’t want to name them all separately (like `a`, `b`, `c`, `d`, etc.). Arrays solve that.

### Declaring vs Defining Arrays
Here’s something students often mix up: declaring vs defining.

When we do:
```java
int[] intArray;
```
We are declaring that an array will exist, but not defining what is in it or how big it is yet. No memory is actually allocated for the array at this point—just a place to store the memory address of the future array.

But when we do:
```java
int[] intArray = {5, 3, 7, 9, 0, 1, 2};
```
We’re declaring AND defining the array at the same time. This allocates memory and fills it with values.

Java allows you to do these steps separately. For example:
```java
double[] myArray;
```
This declares the array. It’s like saying, "Hey computer, I’m going to store an array of doubles soon, get ready for it." But nothing is created in memory yet except a placeholder for an address.

If you try to print this out now:
```java
System.out.println(myArray);
```
You’ll get an error. There’s no actual array yet.

### Reference Variables and Memory
Arrays in Java are reference variables. This means the array variable stores the memory address of the array, not the array itself. When you define the array using `new`, Java allocates space in memory for the array and gives you back the address of where it starts.

```java
myArray = new double[6];
```
This allocates space for six doubles (each defaulting to `0.0`) and stores the address of the first element in `myArray`. When you print:
```java
System.out.println(myArray);
```
You’ll see something like `[D@1a2b3c`, which is Java's way of saying, “Hey, this is a double array located at this memory address.”

To access the values, you need to use indexing:
```java
System.out.println(myArray[0]); // prints 0.0
```

You can assign values like this:
```java
myArray[2] = 7.2;
System.out.println(myArray[2]); // prints 7.2
```

### Mailbox Analogy
Think of an array like a shared mailbox structure (like in an apartment complex). `myArray` tells you where the mailboxes are. Each mailbox is an index. You need both the address (`myArray`) and the mailbox number (`[index]`) to get or put something in.

If you wanted to put a Christmas card in mailbox #2:
```java
myArray[2] = 7.2;
```
That’s like slipping the card into that mailbox. To retrieve it:
```java
System.out.println(myArray[2]);
```

### Common Mistakes
One of the most common mistakes is trying to access an index outside the bounds of the array. For example:
```java
System.out.println(myArray[6]); // ArrayIndexOutOfBoundsException!
```
Even though `myArray.length == 6`, the highest index is `5` (because we start counting from zero).

If you want to access the last element of the array:
```java
System.out.println(myArray[myArray.length - 1]);
```

### Looping Through an Array
Don’t manually write out each index if you want to print all elements. Use a loop:
```java
for (int i = 0; i < myArray.length; i++) {
    System.out.println(myArray[i]);
}
```
This will print all six elements in the array.

If you accidentally do:
```java
for (int i = 0; i <= myArray.length; i++) {
    System.out.println(myArray[i]); // BOOM, index out of bounds
}
```
You’ll hit an error on the last loop iteration because `myArray[6]` doesn’t exist.

---

### Summary
- Arrays are derived data types, like `String`
- Arrays are collections of one type of data (homogeneous)
- Arrays store values in indexed positions, starting at 0
- Arrays are reference types that store memory addresses
- You can declare an array without defining it
- Use `new` to allocate memory for an array
- Access values with `[index]`
- Don’t go out of bounds!

We’ll continue this on Friday and go even deeper into how arrays work and how to manipulate them more efficiently.

Questions? Office hours 3-5pm today—come on by!

