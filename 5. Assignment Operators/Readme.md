**1. Prefix Increment (++num)**

"Change first, then use."
In this version, the value is increased before the assignment to the variable happens. 

Step 1: num is incremented from 7 to 8.
Step 2: The new value (8) is assigned to result.
Final Values: num = 8, result = 8. 


**2. Postfix Increment (num++)**
"Use first, then change."
In this version, the current value is "saved" for the assignment before the variable itself is updated. 
Step 1: The current value of num (7) is assigned to result.
Step 2: num is then incremented from 7 to 8.
Final Values: num = 8, result = 7. 

**Pro-Tip for Remembering**
Think of the position of the plus signs as a timeline:
++num: The ++ comes first, so the math happens first.
num++: The num comes first, so the original value is used first. 


**Relational Operators**
In Java, there are six relational operators used to compare values. These operators always return a boolean value (true or false).

**List of Relational Operators**
* == (Equal to): Checks if two values are exactly equal.
* != (Not equal to): Checks if two values are different.
* > (Greater than): Checks if the left value is higher than the right.
* < (Less than): Checks if the left value is lower than the right.
* >= (Greater than or equal to): Checks if the left value is higher than or exactly equal to the right.
* <= (Less than or equal to): Checks if the left value is lower than or exactly equal to the right.

**Important Rules to Remember**
* Assignment vs. Equality: Never confuse = (assigning a value) with == (comparing values).
* Data Types: While these work for numbers (int, double) and characters (char), you cannot use <, >, <=, or >= on boolean values or objects like Strings.
* Operator Precedence: Arithmetic operators (like + or *) are solved before relational operators.
* No Chaining: You cannot write a < b < c. Instead, you must use logical operators: (a < b) && (b < c). 


**Logical operators**

Logical operators are used to combine multiple boolean expressions and return a single true or false result. In Java, they are essential for making complex decisions in if statements and loops. 

**Main Logical Operators**
* Logical AND (&&): Returns true only if both operands are true.
* Logical OR (||): Returns true if at least one operand is true.
* Logical NOT (!): A unary operator that reverses the boolean value (true becomes false, and vice versa).
* Logical XOR (^): Returns true only if the operands are different. 

**Key Concept: Short-Circuit Evaluation**
Java uses "short-circuiting" for && and || to improve performance and prevent errors: 

* && (AND): If the first operand is false, the second is not evaluated because the result must be false.
* || (OR): If the first operand is true, the second is not evaluated because the result must be true.