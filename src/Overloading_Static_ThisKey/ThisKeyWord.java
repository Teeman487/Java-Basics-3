package Overloading_Static_ThisKey;

public class ThisKeyWord {
    int a, b; // instance variables or class variables

    void getValues(int a, int b) { // method variables/external variables
       this.a = a; // this rep class variable above
       this.b = b;
    }

    void printValues() {
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        ThisKeyWord th = new ThisKeyWord();

        th.getValues(10, 20);
        th.printValues(); // 10 20
    }
}