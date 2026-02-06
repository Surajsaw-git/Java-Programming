//Write a program that swaps two numbers using a temporary variable.
class swaps
{
    public static void main(String a[])
    {
        int num1=4;
        int num2=5;
        System.out.print(num1);
        System.out.println(num2);
        int num;
        num=num1;
        num1=num2;
        num2=num;
        System.out.print(num1);
        System.out.println(num2);
    }
}