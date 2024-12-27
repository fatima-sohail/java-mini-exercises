package oop_encapsulation_object_as_a_methods_return_value_counter;

public class Main {
    public static void main(String[] args) {
        //create a counter object and call increase method on it
        //create another counter object, but this time it will be a clone of the first object
        //and print both the objects
        //clone's value will be similar to cObj's
        Counter cObj = new Counter();
        cObj.increaseValue();
        System.out.println(cObj);

        Counter clone = cObj.clone();
        System.out.println("");
        System.out.println(clone);
        System.out.println(cObj);

        cObj.increaseValue();
        System.out.println("");
        System.out.println(cObj);
        System.out.println(clone);

        Counter counter2 = cObj.clone();
        System.out.println(counter2); // prints: 2
        //same as
        System.out.println(cObj.clone()); //print: 2
    }
}
