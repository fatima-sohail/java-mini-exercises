//for basic concept about class and object, watch: https://www.youtube.com/watch?v=IUqKuGNasdM

//create xyz folder that contains multiple files:
//java-mini-exercises->java-mini-exercises->new->package & inside package create multiple files

//TASK1: Implementation of the decrement() method
//Implement the decrement() method in the class body in such a way that it decrements the
// value variable of the object it's being called on by one. Once you're done with the
// decrement() method, the main program of the previous example should work to produce the
// example output.
//
//The following is an example of how the main program uses the decreasing counter:
//
//public class MainProgram {
//    public static void main(String[] args) {
//        DecreasingCounter counter = new DecreasingCounter(10);
//
//        counter.printValue();
//
//        counter.decrement();
//        counter.printValue();
//
//        counter.decrement();
//        counter.printValue();
//    }
//}
//The program above should have the following print output.
//
//Sample output
//value: 10
//value: 9
//value: 8

//TASK2: The counter's value cannot be negative
//Implement the decrement() in such a way that the counter's value never becomes negative.
// This means that if the value of the counter is 0, it cannot be decremented. A conditional
// statement is useful here.
//public class MainProgram {
//    public static void main(String[] args) {
//        DecreasingCounter counter = new DecreasingCounter(2);
//
//        counter.printValue();
//
//        counter.decrement();
//        counter.printValue();
//
//        counter.decrement();
//        counter.printValue();
//
//        counter.decrement();
//        counter.printValue();
//    }
//}
//Prints:
//
//Sample output
//value: 2
//value: 1
//value: 0
//value: 0

//TASK3: Resetting the counter value
//Create the method public void reset() for the counter that resets the value of the counter
// to 0. For example:
//
//public class MainProgram {
//    public static void main(String[] args) {
//        DecreasingCounter counter = new DecreasingCounter(100);
//
//        counter.printValue();
//
//        counter.reset();
//        counter.printValue();
//
//        counter.decrement();
//        counter.printValue();
//    }
//}
//Prints:
//
//Sample output
//value: 100
//value: 0
//value: 0

package oopDecreasingCounter;
//blueprint to create objects
public class DecreasingCounter {
    //create variables
    private int value;
    //create constructor
    public DecreasingCounter(int initialValue){
        value = initialValue;
    }
    //print method
    public void printValue(){
        System.out.println("Value: " + value);
    }
    //decrement method
    // the aim is to decrement the value of the counter by one
    public void decrement(){
       //TASK1: value = value - 1;
        //TASK2:
        if(value>=1){
            value = value - 1;
        }
    }

    //TASK3
    public void resetCounterToZero(){
        if(value>=1){
            value = 0;
        }
    }
}
