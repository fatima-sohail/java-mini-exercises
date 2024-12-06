package oop_Encapsulation_ObjectAsInstanceVariable_Birthday;
// The `Person` class uses a `SimpleDate` object to store a person's date of birth.

//create SimpleDate class first
//create a Person class with instance variables `name` (person's name) and
//`birthday` (a `SimpleDate` object).
// Demonstrates composition by including a `SimpleDate` object as a field.
// Two constructors:
// 1. Accepts a `String` and a `SimpleDate` object.
// 2. Accepts a `String` and date values (day, month, year) to create a `SimpleDate` internally.
//`toString()` formats the output as:
//      Muhammad ibn Musa al-Khwarizmi, born on 1.1.780
//      Blaise Pascal, born on 19.6.1623
public class Person {
    String name;
    SimpleDate birthday;
    int weight = 0;

    public Person(String namee, SimpleDate date){
        name = namee;
        birthday = date;
    }

    public Person(String nameee, int day, int month, int year){
        name = nameee;
        birthday = new SimpleDate(day, month, year); //Creates a new `SimpleDate` object using the given day, month, and year.
    }

    public String toString() {
        return this.name + ", born on " + this.birthday;
    }
}
