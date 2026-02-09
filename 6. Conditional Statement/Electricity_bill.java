// 3. Electricity Bill Calculation (Using else-if)
// Slab Logic:

// Up to 100 units → ₹1/unit

// 101–200 units → ₹2/unit

// Above 200 units → ₹3/unit

import java.util.Scanner;

class Electricity_bill 
{
    public static void main(String args[]) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill=0;

        if (units <= 100 && units>=0) 
        {
            bill = units * 1;
        }
        else if (units <= 200 && units>100) 
        {
            bill = (100 * 1) + (units - 100) * 2;
        }
        else if(units>200)
        {
            bill = (100 * 1) + (100 * 2) + (units - 200) * 3;
        }
        else
        {
            System.out.println("Please Enter valid units.....");
        }

        System.out.println("Electricity Bill = ₹" + bill);
    }
}
