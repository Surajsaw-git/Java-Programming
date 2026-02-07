// Write a program to take user input for name and age, then print a greeting.

import java.util.Scanner;

class name_user_input
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();  // Use nextInt for integer value 

         System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Use nextInt() for integers

        // Printing the greeting
        System.out.println("\nHello " + name + "! You are " + age + " years old.");

        sc.close();
    }
}