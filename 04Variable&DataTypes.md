# Java Variables and Data Types - Notes

## Variables in Java

A **variable** is a container (storage area) used to hold data. Each variable should be given a unique name (identifier).

### Example:
```java
package com.apnacollege;

public class Main {
   public static void main(String[] args) {
      // Variables
      String name = "Aman"; // Variable to hold name
      int age = 30;         // Variable to hold age

      String neighbour = "Akku"; // Another String variable
      String friend = neighbour; // Assigning one variable to another
   }
}
```

---

## Data Types in Java

Data types are declarations for variables, which determine the type and size of data associated with the variables. Knowing the data type is essential because different data types occupy different amounts of memory.

There are two types of data types:

1. **Primitive Data Types**: To store simple values.
2. **Non-Primitive Data Types**: To store complex values.

### 1. Primitive Data Types

These are data types of fixed size and are used to store simple values.

| Data Type | Meaning               | Size (in Bytes) | Range |
|-----------|-----------------------|-----------------|-------|
| `byte`    | 2's complement integer | 1               | -128 to 127 |
| `short`   | 2's complement integer | 2               | -32,768 to 32,767 |
| `int`     | Integer numbers        | 4               | -2,147,483,648 to 2,147,483,647 |
| `long`    | 2's complement integer (larger values) | 8 | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| `float`   | Floating-point number  | 4               | Up to 7 decimal digits |
| `double`  | Double precision floating-point number | 8 | Up to 16 decimal digits |
| `char`    | Character              | 2               | 'a', 'b', 'c', ..., '@', '#', '$' |
| `boolean` | Boolean (true/false)   | 1               | `true`, `false` |

### 2. Non-Primitive Data Types

These are of variable size and are usually declared with the `new` keyword.

Examples include:
- **String**: A sequence of characters.
- **Arrays**: A collection of data items of the same type.

```java
String name = new String("Aman"); // Using the 'new' keyword
int[] marks = new int[3];        // Declaring an array of integers
marks[0] = 97;                   // Assigning values to the array
marks[1] = 98;
marks[2] = 95;
```

---

## Constants in Java

A **constant** is a variable whose value cannot be changed once assigned. Constants are declared using the `final` keyword.

### Example:

```java
package com.apnacollege;

public class Main {
   public static void main(String[] args) {
      // Constants
      final float PI = 3.14F; // PI value cannot be changed
   }
}
```

The `final` keyword ensures that the value of `PI` remains constant throughout the program.
