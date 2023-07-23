package Inheritance;

public class FinalVariable {
    final int speed=40; // final variable, so we cannot change this value

    public static void main(String[] args) {
        FinalVariable fm = new FinalVariable();
      //  fm.speed=100; // compile time error
        System.out.println(fm.speed);
    }
}
