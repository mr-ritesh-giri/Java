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

**Important Notes:**
- In other programming languages, the `char` data type usually takes 1 byte, but in Java, it takes **2 bytes** because Java uses Unicode. This allows it to support characters from all languages, not just English.
- For the `boolean` data type, the values are strictly `true` and `false`, not `0` and `1` as in some other languages.

---

## Data Types in Java

Data types are declarations for variables that determine the type and size of data associated with the variables. Knowing the data type is essential because different data types occupy different amounts of memory.

### Types of Data Types:

1. **Primitive Data Types**: To store simple values.
2. **Non-Primitive Data Types**: To store complex values.

---

### 1. Primitive Data Types

Primitive data types are predefined by Java and are of fixed size.

| Data Type | Meaning               | Size (in Bytes) | Range |
|-----------|-----------------------|-----------------|-------|
| `byte`    | 2's complement integer | 1               | -128 to 127 |
| `short`   | 2's complement integer | 2               | -32,768 to 32,767 |
| `int`     | Integer numbers        | 4               | -2,147,483,648 to 2,147,483,647 |
| `long`    | 2's complement integer (larger values) | 8 | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| `float`   | Floating-point number  | 4               | Up to 7 decimal digits |
| `double`  | Double precision floating-point number | 8 | Up to 16 decimal digits |
| `char`    | Character              | 2               | Unicode character ('a', 'b', 'c', ..., '@', '#', '$') |
| `boolean` | Boolean (true/false)   | 1               | `true`, `false` |

#### Examples:
```java
package com.apnacollege;

public class Main {
   public static void main(String[] args) {
      // Primitive Data Types
      byte smallNumber = 100;  // 1 byte
      short shortNumber = 32000;  // 2 bytes
      int intNumber = 123456;  // 4 bytes
      long longNumber = 123456789L;  // 8 bytes
      float floatNumber = 3.14F;  // 4 bytes
      double doubleNumber = 3.141592653589793;  // 8 bytes
      char letter = 'A';  // 2 bytes (Unicode support)
      boolean isJavaFun = true;  // 1 byte (true or false)

      // Printing variables
      System.out.println("Byte value: " + smallNumber);
      System.out.println("Short value: " + shortNumber);
      System.out.println("Int value: " + intNumber);
      System.out.println("Long value: " + longNumber);
      System.out.println("Float value: " + floatNumber);
      System.out.println("Double value: " + doubleNumber);
      System.out.println("Char value: " + letter);
      System.out.println("Boolean value: " + isJavaFun);
   }
}
```

---

### 2. Non-Primitive Data Types

Non-primitive data types are user-defined or provided by Java for complex data. They are not of fixed size.

Examples include:
- **String**: A sequence of characters.
- **Arrays**: A collection of data items of the same type.

#### Examples:
```java
package com.apnacollege;

public class Main {
   public static void main(String[] args) {
      // String Example
      String name = "Aman"; // Without 'new' keyword
      String greeting = new String("Hello!"); // Using 'new' keyword

      // Array Example
      int[] marks = new int[3]; // Declaring an array of integers
      marks[0] = 97;            // Assigning values to the array
      marks[1] = 98;
      marks[2] = 95;

      // Printing examples
      System.out.println("Name: " + name);
      System.out.println("Greeting: " + greeting);
      System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
   }
}
```

---

## Constants in Java

A **constant** is a variable whose value cannot be changed once assigned. Constants are declared using the `final` keyword.

#### Example:
```java
package com.apnacollege;

public class Main {
    public static void main(String[] args) {
        // Constants
        final float PI = 3.14F; // PI value cannot be changed

        // Uncommenting the below line will throw an error
        // PI = 3.14159;
        System.out.println("The value of PI is: " + PI);
    }
}
```

The `final` keyword ensures that the value of `PI` remains constant throughout the program.
