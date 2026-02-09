// Write a program to demonstrate logical AND, OR, NOT.

class and_or_not
{
    public static void main(String args[])
    {
        int age=45;
        

        if(age<60 && age>18)
        {
            System.out.println("He can work at night.");
        }
        else
        {
            System.out.println("He can't work at night");
        }

        int x=12;
        int y=15;
        boolean result;

        result= x>=y || x<=y;
        System.out.println(result);

        result= x>=y && x<=y;
        System.out.println(result);

        result= (x>=y);
        System.out.println(result);

        result= !(x>=y);
        System.out.println(result);

        
    }
}