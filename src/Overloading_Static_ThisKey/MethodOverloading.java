package Overloading_Static_ThisKey;

public class MethodOverloading {
    void  add(int a, int b)  // 1
    {
        System.out.println(a+b);
    }
    void  add(int a, double b) // 2
    {
        System.out.println(a+b);
    }

    void  add(double a, double b) // 3
    {
        System.out.println(a+b);
    }
    void  add(int a, int b, int c) // 4
    {
        System.out.println(a+b+c);
    }


    public static void main(String[] args) {
    MethodOverloading mo = new MethodOverloading();
    mo.add(10,20); // 1  // 30
        mo.add(10,20,30); //4 // 60
        mo.add(10,20.5); // 2 // 30.5
        mo.add(10.5,10.0); //3 // 20.5
    }
}
