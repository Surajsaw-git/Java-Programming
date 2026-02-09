// Write a program to find the largest of three numbers.

import java.util.Scanner;
class three_greater
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = sc.nextInt();

        System.out.print("Enter the first number :");
        int num2 = sc.nextInt();

        System.out.print("Enter the first number :");
        int num3 = sc.nextInt();

    
        if(num2==num1 && num2>num3)
        {
            System.out.println("num1 and num2 are equal but num3 is smaller.");
        }
        else if(num2==num1 && num2<num3)
        {
            System.out.println("num1 and num2 are equal but num3 is greater.");
        }
        else if(num2==num3 && num1>num3)
        {
            System.out.println("num3 and num2 are equal but num1 is greater");
        }
        else if(num2==num3 && num1<num3)
        {
            System.out.println("num3 and num2 are equal but num1 is smaller.");
        }
        else if(num1==num3 && num1>num2)
        {
            System.out.println("num3 and num1 are equal but num2 is smaller.");
        }
        else if(num1==num3 && num1<num2)
        {
            System.out.println("num3 and num1 are equal but num2 is greater.");
        }
        else if(num1>num2 && num1>num3)
        {
            System.out.println(num1 + " is a greater than num2 and num3");
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println(num2 + " is a greater than num1 and num3");
        }
        else if(num3>num1 && num3>num2)
        {
            System.out.println(num3 + " is a greater than num1 and num2");
        }
        else
        {
            System.out.println("All three are equal.");
        }
    }
}