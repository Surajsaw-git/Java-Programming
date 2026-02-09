//Write a program to check whether a number is even or odd.

import java.util.Scanner;
class Even_or_odd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int a = sc.nextInt();

        if(a%2==0)
        {
            System.out.println(a + " is even.");
        }
        else
        {
            System.out.println(a + " is a odd number.");
        }
        
    }
}