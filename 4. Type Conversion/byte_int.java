//Conversion between byte into int and int into byte

class byte_int
{
    public static void main(String[] args)
    {
        byte b=127;
        int a;
        a=b;  // this is posible, we can convert byte into int data type.

        System.out.println(a);
        System.out.println(b);

        // PS D:\Programming\Java\3. Data Types> cd "d:\Programming\Java\4. Type Conversion\" ; if ($?) { javac byte_int.java } ; if ($?) { java byte_int }      
        // 127
        // 127
        // PS D:\Programming\Java\4. Type Conversion>


        // byte c;
        // int d=256;
        // c=d;  // this is not posible, we can convert int into byte data type.

        // System.out.println(c);
        // System.out.println(d);

        // PS D:\Programming\Java\4. Type Conversion> cd "d:\Programming\Java\4. Type Conversion\" ; if ($?) { javac byte_int.java } ; if ($?) { java byte_int } 
        // byte_int.java:22: error: incompatible types: possible lossy conversion from int to byte
        //         c=d;  // this is posible, we can convert byte into int data type.
        //           ^
        // 1 error
        // PS D:\Programming\Java\4. Type Conversion>


        // byte c;
        // int d=56;
        // c=d;  // this is not posible, we can convert int into byte data type.

        // System.out.println(c);
        // System.out.println(d);




        byte c;
        int d=25;
        c=(byte)d;  // this is posible, we can convert int into byte data type.

        // here we do casting

        //To convert an int to a byte in Java, you must use explicit casting (also known as narrowing conversion). 
        //This is required because an int (32 bits) is larger than a byte (8 bits), which means data loss is possible.
        System.out.println(c);
        System.out.println(d);

        // PS D:\Programming\Java\4. Type Conversion> cd "d:\Programming\Java\4. Type Conversion\" ; if ($?) { javac byte_int.java } ; if ($?) { java byte_int } 
        // 127
        // 127
        // 25
        // 25


        byte x;
        int y=257;
        x=(byte)y;  
        System.out.println(x);
        System.out.println(y);

    }
}