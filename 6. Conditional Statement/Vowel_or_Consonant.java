//


import java.util.Scanner;

public class Vowel_or_Consonant 
{
    public static void main(String args[]) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
        {

            System.out.println("Vowel");
        }
        else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) 
        {
            System.out.println("Consonant");
        }
        else 
        {
            System.out.println("Please enter a valid character");
        }
    }
}
