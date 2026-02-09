//Write a program to check whether a number is positive, negative, or zero.

import java.util.Scanner;
class number_check
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();

        if(num>0)
        {
            System.out.println(num + " is a positive number.");
        }

        else if(num<0)
        {
            System.out.println(num + " is a negative number.");
        }
        else
        {
            System.out.println(num + " is a zero.");
        }
    }
}