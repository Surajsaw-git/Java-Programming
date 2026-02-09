//Write a program to demonstrate pre-increment and post-increment.

class pre_increment
{
    public static void main(String args[])
    {
        int num =7;
        System.out.println("value of num : "+ num);
        int num1 = ++num;
        System.out.println("value of num1 after pre increment of num :" + num1);

        num =7;
        System.out.println("value of num : "+ num);
        int num2 = num++;
        System.out.println("value of num1 after pre increment of num :" + num2);

        System.out.println("value of num : "+ num);

        // ++num: The ++ comes first, so the math happens first.
        //In this version, the value is increased before the assignment to the variable happens. 


        // num++: The num comes first, so the original value is used first. 
        //In this version, the current value is "saved" for the assignment before the variable itself is updated. 



    }
}