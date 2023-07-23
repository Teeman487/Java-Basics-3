package Inheritance;
class Bike
{
    final void run()// final method, so we cannot overrid thise method in chil class
    {
        System.out.println("Running.........");
    }


}

class Honda extends  Bike
{
//    @Override
//    void run() // compile time error
//    {
//        super.run();
//        System.out.println("Started......");
//    }
}



public class FinalMethodDemo {

    public static void main(String[] args) {

    }
}
