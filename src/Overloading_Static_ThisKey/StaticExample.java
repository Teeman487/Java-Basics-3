package Overloading_Static_ThisKey;

public class StaticExample {

    static  int  a=10; // static variable
    int b=20;  // Non-variable

    static void m1() // static method
    {
        /*
        StaticExample se = new StaticExample();
        System.out.println(se.b);*/
        System.out.println("this is m1 - static method");

    }

    void m2() // Non-static method
    {
        //System.out.println(b);
        System.out.println("this is m2 - Non-static method");
    }

    void m3()
    {
        System.out.println("This is m3 m3thod ---Non-static ");
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }
    public static void main(String[] args) {
     // static methods can access only static stuff directly.
        System.out.println(StaticExample.a);
       StaticExample.m1();

        //System.out.println(b); //incorrect, bcus b is non-static variable
         //m2(); //incorrect, bcus m2() is non-static method

        //static methods can also access non static stuff but through object
        StaticExample se = new StaticExample();
        System.out.println(se.b); // non static variable through objec

        se.m3();


    }
}
