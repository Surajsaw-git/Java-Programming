// Write a program to convert:

// int → double

// double → int

class Conversion
{
    public static void main(String a[])
    {
        int num=10;
        double num1=num;   // int to double 

        System.out.println("Int value : "+ num);
        System.out.println("Double value : "+ num1);


        double x=15.85;
        int y = (int) x;

        System.out.println("Double value : "+ x);
        System.out.println("Int value : "+ y);
    }
}