package oop_encapsulation_object_as_a_methods_return_value_counter;

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
        Counter clone = new Counter(value);
        return clone;
    }
}
