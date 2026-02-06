//Declare variables of all primitive data types and print their default values.
class Variables_declare
{
    public static void main(String a[])
    {
        int num;
        double avg_marks;
        float marks;  // in java float will not work so we have to specifie that it is a float value.
        float mark_math;   // i.e marks = 50.65f
        char symball;
        String name;

        num=45;
        avg_marks=95.65;
        // mark_math=85.95;   // this will show an error while exicutation the program. I have attached the error massage.
        marks=50.65f;   // this is correct 
        symball='%';
        name="Suraj Saw";

        System.out.println(name);
        System.out.println(num);
        System.out.println(marks);
        //System.out.println(mark_math);
        System.out.print(avg_marks);
        System.out.println(symball);





        int num1= 78548;
        byte by=127;
        short sh=23;
        long l=637845673472l;

        System.out.println(num1);
        System.out.println(by);
        System.out.println(sh);
        System.out.println(l);


    }
}




// PS D:\Programming\Java> cd "d:\Programming\Java\2. Variables\" ; if ($?) { javac Variables_declare.java } ; if ($?) { java Variables_declare }
// Variables_declare.java:15: error: incompatible types: possible lossy conversion from double to float
//         mark_math=85.95;   // this will show an error while exicutation the program
//                   ^
// 1 error
// PS D:\Programming\Java\2. Variables> 