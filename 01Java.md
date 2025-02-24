# **Types of Programming Languages in the Software Industry**

Programming languages are grouped into three main types:

---

## 1. **Structured Programming Languages**

Structured programming languages organize code using logical constructs like loops, conditions, and functions. However, they do not support Object-Oriented Programming (OOP) features such as classes, objects, or inheritance.

### Examples:

- C
- Pascal

---

## 2. **Object-Oriented Programming (OOP) Languages**

OOP languages revolve around "objects" that combine data and actions. They include features such as:

- **Classes and Objects**: Fundamental units of OOP.
- **Inheritance**: Sharing properties and methods from one class to another.
- **Polymorphism**: Allowing one action to behave differently depending on the context.
- **Data Abstraction**: Displaying only the necessary details while hiding the implementation.
- **Encapsulation**: Bundling data and methods together and restricting direct access.

### Examples:

- Java
- C++
- Python

---

## 3. **Object-Based Programming Languages**

Object-based programming languages use objects but lack full OOP features like inheritance or polymorphism. They provide simpler ways to manipulate data and objects.

### Examples:

- JavaScript (before ES6)
- VBScript

## **What is Java**

Ever wondered why Java's logo is a steaming cup of coffee? The creators of Java, while brainstorming a name for their new language, chose 'Java', a slang term for 'coffee'. Just as coffee fuels our day, Java powers the tech world with its robust and versatile features.

In this topic, we will explore why Java has been a popular choice among developers for over two decades and how it has brewed success in various domains. We will also introduce you to your very first Java program. So, grab your cup of coffee and join us on this exciting journey into the world of Java!

Java is a high-level, class-based, object-oriented programming language. **James Gosling** at **Sun Microsystems** (now part of Oracle Corporation) designed it, and it was released in **1995**. The language was developed with the "Write Once, Run Anywhere" (WORA) philosophy. This principle underscores Java's key feature - platform independence, allowing the same Java program to run on multiple platforms without modifications.

Java is designed to be both simple and powerful. It borrows its syntax from C and C++, but eliminates certain low-level programming complexities, such as explicit memory management and multiple inheritance found in C++. Unlike these two languages, Java does not require you to manually clean the application memory, as it has a garbage collector that performs this task automatically. Known for its robustness, security, and simplicity, Java has become a popular choice among developers worldwide. It supports different programming techniques, including generic programming, multithreaded and concurrent programming, and functional programming.

---

## **Where is Java Applied**

Let's go through a typical day and see how Java impacts our lives without us even realizing it.

Imagine waking up to your Android alarm. As you reach out to snooze it, you're interacting with an application built using Java. You decide to work on a project using a development tool like IntelliJ IDEA or Eclipse. As you write and compile your code, Java is there, forming the backbone of these development tools. During lunch, you enjoy a Netflix show or Spotify music, both services powered by Java. Later, you finish the project and receive payment. Behind the scenes, Java is working diligently, processing your request. In the evening, you unwind with a game of Minecraft, yet another Java-based application.

Java is like a silent friend, aiding us and making our lives easier in numerous ways, from the moment we wake up till we call it a day.


# Java and Memory Management

Java eliminates low-level programming complexities like memory management primarily through **automatic memory management (Garbage Collection)** and **abstraction from direct memory manipulation**. Here’s how:

## 1. Automatic Memory Management (Garbage Collection)
- In languages like C and C++, you must manually allocate (`malloc`) and deallocate (`free`) memory, which can lead to **memory leaks** (forgetting to free memory) or **dangling pointers** (accessing freed memory).
- Java, on the other hand, uses **Garbage Collection (GC)**, which automatically identifies and removes objects that are no longer in use, freeing memory without requiring manual intervention.

## 2. No Direct Pointers
- C and C++ allow direct memory access via pointers, which can lead to **buffer overflows, pointer arithmetic errors, and security vulnerabilities**.
- Java replaces pointers with **references**, preventing direct access to memory locations, thus improving security and reducing complexity.

## 3. No Manual Stack and Heap Management
- In C/C++, developers must manage stack and heap memory manually, which can cause **stack overflows or heap corruption**.
- Java abstracts this by **automatically handling memory allocation** for objects and variables.

## 4. Memory Safety Features
- Java has built-in mechanisms like **array bounds checking**, ensuring you don’t access memory outside the array’s limits (which can happen in C/C++).
- It also prevents **null pointer dereferencing** issues with runtime checks.

## 5. Object-Oriented Memory Allocation
- Java enforces an **object-oriented approach**, meaning most memory allocation happens dynamically (on the heap), and objects are referenced safely using references.

## Summary
Java reduces low-level complexities by handling memory automatically through Garbage Collection, restricting direct memory access, and preventing common pitfalls like memory leaks, buffer overflows, and pointer mismanagement. This allows developers to focus more on logic rather than worrying about memory management errors.

# Java and Garbage Collector

### Serial GC (`-XX:+UseSerialGC`)
- Simple, single-threaded GC
- Best for single-core machines or small applications

### Parallel GC (Throughput GC) (`-XX:+UseParallelGC`)
- Multi-threaded GC
- Focuses on maximizing application throughput
- Default in Java 8

### G1 (Garbage-First) GC (`-XX:+UseG1GC`)
- Balances performance between latency and throughput
- Default in Java 9+

### ZGC (Z Garbage Collector) (`-XX:+UseZGC`)
- Low-latency, scalable GC
- Suitable for large heaps (multi-terabyte memory)

### Shenandoah GC (`-XX:+UseShenandoahGC`)
- Low-pause-time GC
- Designed for real-time applications

## Summary
Java reduces low-level complexities by handling memory automatically through Garbage Collection, restricting direct memory access, and preventing common pitfalls like memory leaks, buffer overflows, and pointer mismanagement. This allows developers to focus more on logic rather than worrying about memory management errors.
