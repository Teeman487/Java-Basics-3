package Inheritance;

public class Animal {

    String color="white";
    void eating()
    {
        System.out.println("Eating.....");
    }
    // Constructor
    Animal()
    {
        System.out.println("Animal is created");
    }
}
class Dog extends Animal
{
    String color="Black"; // overrided vairable with diff value

    Dog()
    {
        super(); //Invoked parent claass constructor
        System.out.println("Dog is created");

    }

    /*void displaycolor()
    {
        System.out.println(color);
        System.out.println(super.color);
    }*/
    void eating()
    {
        System.out.println("Eating Bread.....");
        super.eating();
    }

}
