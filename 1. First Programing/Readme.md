**Java Basics – Interview Notes**


Java Basics, Variables & Data Types – Interview Notes

**🔹 1. What is Java? Why is it called Platform Independent?**

Java is a high-level, object-oriented, class-based programming language developed by Sun Microsystems (now Oracle).

Java is called platform independent because:

Java code is compiled into bytecode

Bytecode runs on JVM (Java Virtual Machine)

JVM is available for different operating systems (Windows, Linux, macOS)

👉 Meaning:

Write Once, Run Anywhere (WORA)

Unlike C/C++, Java programs do not depend on the operating system directly.

**🔹 2. Difference between JDK, JRE, and JVM**
JVM (Java Virtual Machine)

Executes Java bytecode

Converts bytecode into machine code

Platform dependent

Responsible for memory management, garbage collection, security

JRE (Java Runtime Environment)

Provides environment to run Java programs

Contains:

JVM

Core libraries

JDK (Java Development Kit)

Used to develop Java applications

Contains:

JRE

Compiler (javac)

Debugger

Development tools

👉 Relationship:

JDK ⊃ JRE ⊃ JVM

**🔹 3. What is the role of the main() method in Java?**

The main() method is the entry point of a Java program.

Syntax:

public static void main(String[] args)


Explanation:

public → accessible by JVM

static → no object required

void → no return value

String[] args → command-line arguments

Without main(), the program will not start.

**🔹 4. Why is Java called Object-Oriented?**

Java is object-oriented because it supports:

Class

Object

Encapsulation

Inheritance

Polymorphism

Abstraction

Everything in Java revolves around objects, except primitive data types.

**🔹 5. What happens if the main() method is not static?**

If main() is not static:

JVM cannot call it

Because JVM calls main() without creating an object

Result:

Runtime Error: Main method not found


So static is mandatory.