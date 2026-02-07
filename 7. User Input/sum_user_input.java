// Write a program to take two numbers and print:

// Sum

// Difference

// Product

// Quotient

import java.util.Scanner;

class sum_user_input
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int module = a%b;

        System.out.println("Sum = " + sum);
        System.out.println("Sub = " + sub);
        System.out.println("Mul = " + mul);
        System.out.println("div = " + div);
        System.out.println("Module = " + module);

        sc.close();
    }
}