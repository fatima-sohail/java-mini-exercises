//create a program that takes user input in this format: Randall,2 and prints
//all the objects in the array based on user input

//create a person class file
//create instance variables name and age
//create a constructor that takes two parameters contructorName and contructorAge
//create toString() method that returns object values in this format:
    //Mindy, age: 3 years
    //Sylvie, age: 10 years

//In the NickNames file, create arrayList that stores objects based on user input
//create scanner object to make the console ready to receive user input
//create an empty arrayList
//show the user format for inputting data: "Enter the person's details separated by a comma, e.g.: Randall,2"
//keep on creating objects using while loop
//in the while loop,
    //ask the user to "Enter the details, empty will stop: "
    //receive input in type String
    //add "," between the inputs e.g. Randall,2
    //to add comma, use .split() method on the above input, store it in variable pieces
    //this splits name and age into array of strings
    //assign them their respective indices e.g. pieces[0], pieces[1]
    //the name remains a string, while the age is converted to an integer for further use.
    //create objects based on the info above and add them to the arrayList
//outside the loop, print all the objects found in the arrayList
package oopListPersonUserInputSplitString;

public class Person {

    private String name;
    private int age;


    public Person(String constructorName, int constructorAge) {
        this.name = constructorName;
        this.age = constructorAge;
    }

    @Override
    public String toString() {
        return this.name + ", age: " + this.age + " years";
    }
}
