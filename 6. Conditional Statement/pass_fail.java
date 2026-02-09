// Write a program to check whether a student is pass or fail (pass ≥ 40).
import java.util.Scanner;
class pass_fail
{
    public static void main(String args[])
    {
        //import java.util.Scanner;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the first number :");
        // int num1 = sc.nextInt();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade 1 to 10 : ");
        int grade = sc.nextInt();

        if(grade<=10 && grade>9)
        {
            System.out.println("O grade. Pass with First Division.");
        }
        else if(grade<=9 && grade>8)
        {
            System.out.println("A+ grade. Pass with First Division.");
        }
        else if(grade<=8 && grade>7)
        {
            System.out.println("A grade. Pass with First Division.");
        }
        else if(grade<=7 && grade>6)
        {
            System.out.println("B+ grade. Pass with Second Division.");
        }
        else if(grade<=6 && grade>5)
        {
            System.out.println("B grade. Pass");
        }
        else if(grade<=5 && grade>4)
        {
            System.out.println("C+ grade. Pass");
        }
        else if(grade<=4 && grade>0)
        {
            System.out.println("Fail...........");
        }
        else
        {
            System.out.println("Please Enter valid grade .......");
        }
    }
}