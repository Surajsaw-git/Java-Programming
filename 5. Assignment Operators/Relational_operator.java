//Relational Operators 
//Write a program to demonstrate all relational operators.
class Relational_operator
{
    public static void main(String args[])
    {
        int x=74;
        int y=41;

        System.out.println(x>y);     //Output : Trure
        System.out.println(x<y);     //Output : False
        System.out.println(x>=y);    //Output : Trure
        System.out.println(x<=y);    //Output : False
        System.out.println(x!=y);    //Output : Trure
        System.out.println(x==y);    //Output : False

        boolean result = x!=y;
        System.out.println(result);
    }
}