//create a Person class, with variable int year, a constructor, get() and set() method

package oop_Encapsulation_ObjectInAnObject;

public class Person {
    private int year;

    public Person(){
        this.year = 1996;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
