package oopDecreasingCounter;
//create objects using the blueprint class
public class Main {
    public static void main(String[] args) {
        //create object
        DecreasingCounter counter = new DecreasingCounter(2); //anything that goes as argument is first defined by constructor
        //print object's value
        counter.printValue();

        //update the value by calling decrement method 2 times
        //print the updated value
        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();

        //give a gap
        System.out.println("");

        //create another object and print its value
        DecreasingCounter anotherCounter = new DecreasingCounter(100);
        anotherCounter.printValue();

        //update the value by calling reset counter method, print it
        //call decrement counter method and print the updated value
        anotherCounter.resetCounterToZero();
        anotherCounter.printValue();

        anotherCounter.decrement();
        anotherCounter.printValue();

    }
}
