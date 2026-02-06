//Write a program that swaps two numbers without using a third variable.

class swap_without_third_variable
{
    
        public static void main(String ab[])
        {
            int a = 140;
            int b=76;

            System.out.println("Before swaping :");
            System.out.println("a = "+ a);
            System.out.println("b = "+ b);

            a=a+b;
            b=a-b;
            a=a-b;

            System.out.println("After swaping :");
            System.out.println("a = "+ a);
            System.out.println("b = "+ b);
        }
}