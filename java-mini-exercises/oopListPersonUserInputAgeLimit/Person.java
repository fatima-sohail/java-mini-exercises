//create a program that asks user for the age limit to play lottery, and prints
//only those objects that are above that age limit.

//create a person class file
//create instance variables name and age
//create a constructor that takes two parameters contructorName and contructorAge
//create toString() method that returns object values in this format:
//Mindy, age: 3 years
//Sylvie, age: 10 years

package oopListPersonUserInputAgeLimit;

public class Person {
    private String name;
    private int age;


    public Person(String constructorName, int constructorAge) {
        this.name = constructorName;
        this.age = constructorAge;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + ", age: " + this.age + " years";
    }
}
