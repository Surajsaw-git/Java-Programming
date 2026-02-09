//Write a program to check whether a number is divisible by 5 and 11.

import java.util.Scanner;
class divisible_by_5
{
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the first number :");
        // int num1 = sc.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();

        if(num%5==0 || num%11==0)
        {
            System.out.println(num + " is a divisible by 5 or 11.");
        }
        else
        {
            System.out.println(num +" is not divisible by any of them.")
        }
    }
}