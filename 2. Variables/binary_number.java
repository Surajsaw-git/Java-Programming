// we can use binary number in int and the decimal value.

// It is a conersion of number system.

class binary_number
{
    public static void main(String[] args)
    {
        //Literals

        int num = 0b1010;
        System.out.println(num);

        int num1 = 0x7E;
        System.out.println(num1);

        // In Java we can count the zeros 
        // for example we can use underscore in between the zeros.

        int num2 = 100000000;
        System.out.println(num2);

        int num3 = 10_00_00_000;
        System.out.println(num3);

        //OUTPUT

        // PS D:\Programming\Java\2. Variables> cd "d:\Programming\Java\2. Variables\" ; if ($?) { javac binary_number.java } ; if ($?) { java binary_number }
        // 10
        // 126
        // 100000000
        // 100000000
        // PS D:\Programming\Java\2. Variables>
    }
}