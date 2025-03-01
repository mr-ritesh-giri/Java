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

# Java Primitive Data Types Breakdown

Java provides various primitive data types for working with different kinds of data. These types are fixed in size and range, and each type is suited to specific use cases.

## 1. byte (8-bit)
- **Size**: 8 bits
- **Range**: -128 to 127
- **Description**: A signed 8-bit integer.

### Breakdown:
- **1 bit**: Sign
- **7 bits**: Value (in two's complement)

---

## 2. short (16-bit)
- **Size**: 16 bits
- **Range**: -32,768 to 32,767
- **Description**: A signed 16-bit integer.

### Breakdown:
- **1 bit**: Sign
- **15 bits**: Value (in two's complement)

---

## 3. int (32-bit)
- **Size**: 32 bits
- **Range**: -2^31 to 2^31 - 1
- **Description**: A signed 32-bit integer.

### Breakdown:
- **1 bit**: Sign
- **31 bits**: Value (in two's complement)

---

## 4. long (64-bit)
- **Size**: 64 bits
- **Range**: -2^63 to 2^63 - 1
- **Description**: A signed 64-bit integer.

### Breakdown:
- **1 bit**: Sign
- **63 bits**: Value (in two's complement)

---

## 5. float (32-bit, IEEE 754 single precision)
- **Size**: 32 bits
- **Range**: ±3.40282347E+38F (7 digits precision)
- **Description**: A 32-bit floating-point number.

### Breakdown (IEEE 754):
- **1 bit**: Sign
- **8 bits**: Exponent (bias = 127)
- **23 bits**: Mantissa (precision part)

---

## 6. double (64-bit, IEEE 754 double precision)
- **Size**: 64 bits
- **Range**: ±1.7976931348623157E+308 (15–17 digits precision)
- **Description**: A 64-bit floating-point number.

### Breakdown (IEEE 754):
- **1 bit**: Sign
- **11 bits**: Exponent (bias = 1023)
- **52 bits**: Mantissa (precision part)

---

## 7. char (16-bit)
- **Size**: 16 bits
- **Range**: 0 to 65,535 (unsigned)
- **Description**: A 16-bit Unicode character.

### Breakdown:
- **16 bits**: Character (UTF-16)

---

## 8. boolean
- **Size**: 1 bit (implementation dependent)
- **Range**: `true` or `false`
- **Description**: A logical value.

---

## Summary Table of Java Primitive Data Types:

|| **Data Type** | **Size (bits)** | **Range**                                      | **Description**                   |
|----------------|-----------------|------------------------------------------------|-----------------------------------|
| **byte**       | 8               | -128 to 127                                    | 8-bit signed integer              |
| **short**      | 16              | -32,768 to 32,767                              | 16-bit signed integer             |
| **int**        | 32              | -2^31 to 2^31 - 1                              | 32-bit signed integer             |
| **long**       | 64              | -2^63 to 2^63 - 1                              | 64-bit signed integer             |
| **float**      | 32              | ±3.40282347E+38F (7 digits precision)          | 32-bit single precision float     |
| **double**     | 64              | ±1.7976931348623157E+308 (15–17 digits)        | 64-bit double precision float     |
| **char**       | 16              | 0 to 65,535 (unsigned)                         | 16-bit Unicode character          |
| **boolean**    | 1               | `true` or `false`                              | Represents a boolean value        |

