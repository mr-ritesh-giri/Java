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
|---------------|-----------------|------------------------------------------------|-----------------------------------|
| **byte**      | 8               | -128 to 127                                    | 8-bit signed integer              |
| **short**     | 16              | -32,768 to 32,767                              | 16-bit signed integer             |
| **int**       | 32              | -2^31 to 2^31 - 1                              | 32-bit signed integer             |
| **long**      | 64              | -2^63 to 2^63 - 1                              | 64-bit signed integer             |
| **float**     | 32              | ±3.40282347E+38F (7 digits precision)          | 32-bit single precision float     |
| **double**    | 64              | ±1.7976931348623157E+308 (15–17 digits)        | 64-bit double precision float     |
| **char**      | 16              | 0 to 65,535 (unsigned)                         | 16-bit Unicode character          |
| **boolean**   | 1               | `true` or `false`                              | Represents a boolean value        |

