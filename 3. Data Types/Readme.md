**Data Types – Interview Notes**

**🔹 11. Difference between Local, Instance, and Static** Variables
Local Variable

Declared inside method

No default value

Stored in stack

Instance Variable

Declared inside class

Belongs to object

Stored in heap

Static Variable

Shared among all objects

One copy per class

Stored in method area

**🔹 12. Where are variables stored in memory?**
Variable Type	Memory
Local	Stack
Instance	Heap
Static	Method Area
**🔹 13. Why is Java Strongly Typed?**

Java enforces:

Variable type declaration

Type checking at compile time

Example:

int x = "hello"; // Compile-time error


This improves:

Code safety

Readability

Fewer runtime errors

**🔹 14. What is a Literal in Java?**

A literal is a fixed value assigned to a variable.

Examples:

int a = 10;
char c = 'A';
String s = "Java";
boolean b = true;

**🔹 15. Can we change the value of a final variable?**

❌ No

Once a variable is declared final, its value cannot be changed.

final int x = 10;
x = 20; // Error


Used to create constants.