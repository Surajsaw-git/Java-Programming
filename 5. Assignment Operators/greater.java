// Write a program to compare two numbers and print the greater number.

import java.util.Scanner;
class greater
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number :");
        int num2 = sc.nextInt();

        if(num1>num2)
        {
            System.out.println(num1 + " is greater than num1.");
        }
        else if(num1<num2)
        {
            System.out.println(num1 + " is greater than num1.");
        }
        else
        {
            System.out.println("num1 and num2 are equal.");
        }

    }
}