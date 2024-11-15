//In Person file:
//create a Person class, create variables name and age
//create a constructor that takes in two parameters-name and age-which are
//later asked as two separate questions from users.
//create a toString() method that returns: name, age in years

//in Main file:
//prepare the console to read the input
//create an empty array
//in the while loop:
    //ask the user to enter a name, empty will terminate the program
    //user enters a name, if the line is empty, break the loop
    //ask for the name input's age
    //user enters inputs the age
    //add this object to the list-this object takes in two values: name and age decided by the user
//outside the loop, print the size of the list
//print each element aka object in the list using enhanced for loop using toString()

package oopListPersonDoubleUserInput;

public class Person {
    private String name;
    private int age;


    public Person(String constructorName, int constructorAge) {
        this.name = constructorName;
        this.age = constructorAge;
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}
