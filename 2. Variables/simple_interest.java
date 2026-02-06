// Write a program to calculate simple interest using float or double.
class simple_interest
{
    public static void main(String a[])
    {
        double Amount,rate,si;
        int time;
        Amount=15000;
        rate=5;
        time=10;
        si=(Amount*rate*time)/100;
        System.out.print("The simple intrest of given amount is ");
        System.out.println(si);

    }
}