package oop_Encapsulation_ObjectAsInstanceVariable_BiggestPetShop;
//create a pet class first
// Person class contains instance variables `name` (person's name) and `dog` (a `Pet` object).
// Demonstrates composition by including a `Pet` object as a field.
// Constructor initializes these fields,
// `toString()` formats the output in 2 types: owner, dog, dog breed
//leo, lucy, golden retreiver
//Leo, has a friend lucy(golden retreiver)

public class Person {
    String name;
    Pet dog;

    public Person(String personName, Pet doggg){
        name = personName;
        dog = doggg;
    }

    @Override
    public String toString() {
       // return name + ", " + dog;
        return name + ", has a friend called " + dog;
    }
}
