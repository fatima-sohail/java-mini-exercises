//in NickNames class, create a Person object,
//create a TimeMachine object and pass in argument of type 'Person class'
//call travelToFuture() on machine object and specify how many years you want to go in future
//print the future year the object is in

package oop_Encapsulation_ObjectInAnObject;

public class Main {
    public static void main(String[] args) {
        //create an object from Person class
        Person lori = new Person();
        //create an object from TimeMachine class
        //parameter is the type 'Person class'
        TimeMachine machine = new TimeMachine(lori);
        //travel to 6 years to future using travelToFuture()
        machine.travelToFuture(6);
        //print the year lori is in
        System.out.println(lori.getYear()); //prints: 2002
    }
}
