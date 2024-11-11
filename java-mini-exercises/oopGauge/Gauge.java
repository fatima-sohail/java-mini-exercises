//for basic concept about class, object & constructor, watch: https://www.youtube.com/watch?v=IUqKuGNasdM

//create xyz folder that contains multiple files:
//java-mini-exercises->java-mini-exercises->new->package & inside package create multiple files

//Create the class Gauge. The gauge has the instance variable private int value,
// a constructor without parameters (sets the initial value of the meter variable to 0),
// and also the following four methods:
//
//Method public void increase() grows the value instance variable's value by one. It does
// not grow the value beyond five.
//Method public void decrease() decreases the value instance variable's value by one. It
// does not decrease the value to negative numbers.
//Method public int value() returns the value variable's value.
//Method public boolean full() returns true if the instance variable value has the value five.
//Otherwise, it returns false.

//Create a gauge object in a separate file.
// The code repeatedly increases the gauge's value until it is full.
//It prints the value during this process.
//After reaching full capacity, it decreases the gauge's value and prints the new value.
//sample output
//Not full! Value: 0
//Not full! Value: 1
//Not full! Value: 2
//Not full! Value: 3
//Not full! Value: 4
//Full! Value: 5
//Not full! Value: 4

package oopGauge;
//blueprint class
public class Gauge {
    //create variable
    private int value;
    //contructor without parameters
    public Gauge(){
        value = 0;
    }

    public void increase(){
        if(value <= 5){
            value = value + 1;
        }
    }

    public void decrease(){
        if(value > 0){
            value = value - 1;
        }
    }

    public int value(){
        return value;
    }

    public boolean full(){
        if(value == 5){
            return true;
        }else{
            return false;
        }
    }
}
