package oopDecreasingCounter;
//create objects using the blueprint class
public class Main {
    public static void main(String[] args) {
        //create object
        DecreasingCounter counter = new DecreasingCounter(10); //anything that goes as argument is first defined by constructor
        //print object's value
        counter.printValue();

        //update the value by calling decrement method 2 times
        //print the updated value
        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();


    }
}
