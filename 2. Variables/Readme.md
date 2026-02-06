**Variables – Interview Notes**

**🔹 6. What are Primitive Data Types in Java?**

Primitive data types store simple values and are not objects.

Type	Size
byte	1 byte
short	2 bytes
int	4 bytes
long	8 bytes
float	4 bytes
double	8 bytes
char	2 bytes
boolean	JVM dependent

Total = 8 primitive types

**🔹 7. Difference between int and Integer**
int	Integer
Primitive type	Wrapper class
Stores value directly	Stores object
Faster	Slower
Default value: 0	Default value: null

👉 Integer is used when objects are required (Collections, etc.)

**🔹 8. Why is boolean size not fixed in Java?**

Java specification does not define exact size

JVM decides internally

Boolean represents only true or false

No direct memory manipulation allowed

**🔹 9. What is Type Casting?**

Type casting is converting one data type into another.

Implicit Casting (Widening)

Automatic

Small → Large type

int a = 10;
double b = a;

Explicit Casting (Narrowing)

Manual

Large → Small type

double x = 10.5;
int y = (int) x;

**🔹 10. Default Values of Data Types**
Data Type	Default Value
int	0
float	0.0
char	'\u0000'
boolean	false

⚠ Applies only to instance & static variables, not local variables.