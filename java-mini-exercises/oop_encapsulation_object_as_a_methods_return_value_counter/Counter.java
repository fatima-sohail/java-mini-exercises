package oop_encapsulation_object_as_a_methods_return_value_counter;
//create a method that returns an object, the object that is of the same class as the method.
//call it clone so everytime, it is called on object makes a copy or clone of the object.
public class Counter {
    int value;

    public Counter(){
        this(0);
    }

    public Counter(int initialValue) {
        value = initialValue;
    }

    public void increaseValue(){
        value = value + 1;
    }

    @Override
    public String toString() {
        return "value: " + value;
    }

    public Counter clone(){
        Counter cloneMyObj = new Counter(value);
        return cloneMyObj;
        //same as
        //return new Counter(value);
    }
}
