// Write a program to check whether a year is a leap year.
import java.util.Scanner;
class leap_year
{
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter first number: ");
        // int a = sc.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year :");
        int year = sc.nextInt();

        if(year%4==0)
        {
            System.out.println(year + ", it is a leap year.");

        }
        else
        {
            System.out.println(year + ", It is not a leap year.");
        }

    }
}