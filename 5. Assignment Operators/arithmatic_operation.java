// Arithmatic Operations like Addition, Subtraction , multiplication etc
class arithmatic_operation
{
    public static void main(String args[])
    {
        int num1=56;
        int num2=41;
        int sum=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        double module=num1%5;
        double div=num2/5;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(module);

        num1=num1+6;
        System.out.println(num1);

        num1 += 3;
        System.out.println(num1);

        num1 -= 8;
        System.out.println(num1);

        num1 *= 3;
        System.out.println(num1);

        num1++;    //post increment the value of num1 by 1
        System.out.println(num1);


        num1--;    //decrement the value of num1 by 1
        System.out.println(num1);

        ++num1;    //pre increment the value of num1 by 1
        System.out.println(num1);

        // i.e for pre increment and post increment 

        int num=7;

        int result=++num;
        System.out.println(result);

        num=7;
        result=num++;
        System.out.println(result);
    }
}