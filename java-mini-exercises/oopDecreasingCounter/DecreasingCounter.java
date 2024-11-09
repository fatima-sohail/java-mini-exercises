package oopDecreasingCounter;
//blueprint to create objects
public class DecreasingCounter {
    //create variables
    private int value;
    //create constructor
    public DecreasingCounter(int initialValue){
        this.value = initialValue;
    }
    //print method
    public void printValue(){
        System.out.println("Value: " + this.value);
    }
    //decrement method
    // the aim is to decrement the value of the counter by one
    public void decrement(){
        value = value - 1;
    }
}
