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