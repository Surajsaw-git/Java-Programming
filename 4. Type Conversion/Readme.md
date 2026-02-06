# 🔥 Java Type Casting (int → byte) Overflow Explanation

In Java, when we convert a bigger data type like `int` into a smaller data type like `byte`, **overflow happens** if the value is outside the range of `byte`.

This README explains why outputs like `(byte)257 = 1` or `(byte)259 = 3` occur.

---

# 📌 What is Narrowing Type Casting?

Narrowing type casting means converting a **larger** data type into a **smaller** one.

Example:
```java
byte x;
int y = 257;
x = (byte) y;


Here:

int is 32-bit

byte is 8-bit

So Java tries to fit a large value into a smaller container.

📏 Data Type Size and Range
Data Type	Size	Range
int	32-bit	-2,147,483,648 to 2,147,483,647
byte	8-bit	-128 to 127

So a byte can store only 256 values total (2⁸ = 256).

🧪 Example 1: (byte)257
✅ Code
byte x;
int y = 257;

x = (byte) y;

System.out.println(x);
System.out.println(y);

🖥️ Output
1
257

🔍 Why Output is 1?
1️⃣ Binary Representation of 257 (32-bit int)
00000000 00000000 00000001 00000001

2️⃣ Java keeps only last 8 bits (byte is 8-bit)
00000001

3️⃣ Decimal of 00000001 is:
1


So:

(byte)257 = 1

🧪 Example 2: (byte)259
✅ Code
byte x;
int y = 259;

x = (byte) y;

System.out.println(x);
System.out.println(y);

🖥️ Output
3
259

🔍 Why Output is 3?
1️⃣ Binary Representation of 259
00000000 00000000 00000001 00000011

2️⃣ Keep only last 8 bits
00000011

3️⃣ Decimal of 00000011
3


So:

(byte)259 = 3

🔄 Easy Shortcut (Modulo Method)

Since a byte stores only 256 values, casting works like:

✅ Formula:
result = value % 256

Example:
257 % 256 = 1
259 % 256 = 3


So the output matches.

🧪 Example 3: (byte)130
✅ Code
byte x;
int y = 130;

x = (byte) y;

System.out.println(x);
System.out.println(y);

🖥️ Output
-126
130

🔍 Why Output is -126?
Using modulo:
130 % 256 = 130


But byte range is:

-128 to 127


Since 130 is greater than 127, it wraps around:

130 - 256 = -126


So:

(byte)130 = -126

🧪 Example 4: (byte)-129
✅ Code
byte x;
int y = -129;

x = (byte) y;

System.out.println(x);
System.out.println(y);

🖥️ Output
127
-129

🔍 Why Output is 127?

Byte range starts from -128.

So if we go below it:

-129 is 1 step below -128


So it wraps around to the maximum value:

127


So:

(byte)-129 = 127

📌 Summary Table of Examples
int Value	byte Output	Reason
257	1	257 % 256 = 1
259	3	259 % 256 = 3
130	-126	130 - 256 = -126
-129	127	wraps around from -128
🎯 Final Conclusion

✔ Java keeps only the last 8 bits when converting int to byte.
✔ Overflow occurs when the value is outside the range -128 to 127.
✔ Casting behaves like modulo 256.

So:

(byte)value = value % 256


(With wrap-around for negative values)

🚀 Output Explanation in One Line

Java byte type stores only 8 bits, so any larger integer value gets reduced to fit into 8 bits, which causes overflow and wrap-around.

✅ That’s why:

(byte)257 = 1
(byte)259 = 3
(byte)130 = -126
(byte)-129 = 127
