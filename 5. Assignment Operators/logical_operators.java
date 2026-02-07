// Logical Operators in java 

// Logical AND (&&): Returns true only if both operands are true.
// Logical OR (||): Returns true if at least one operand is true.
// Logical NOT (!): A unary operator that reverses the boolean value (true becomes false, and vice versa).
// Logical XOR (^): Returns true only if the operands are different.

class logical_operators
{
    public static void main(String args[])
    {
        int age=42;
        boolean result = (age >= 18) && (age <= 60);
        System.out.println(result);

        result = (age >= 18) && (age <= 30);
        System.out.println(result);

        int x=12;
        int y=15;

        result= x>=y || x<=y;
        System.out.println(result);

        result= x>=y && x<=y;
        System.out.println(result);

        result= (x>=y);
        System.out.println(result);

        result= !(x>=y);
        System.out.println(result);

    }
}