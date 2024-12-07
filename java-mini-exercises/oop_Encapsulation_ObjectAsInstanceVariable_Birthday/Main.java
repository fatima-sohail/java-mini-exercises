// Demonstrate two ways of creating `Person` objects:
// create one object using first constructor, that accepts the object of SimpleDate class called date
// create another using second constructor.
// both Person objects accept SimpleDate object as argument, khwarzmi accepts it explicitly,
// while pascal accepts it internally.
// both objects are printed in this format:
//      Muhammad ibn Musa al-Khwarizmi, born on 1.1.780
//      Blaise Pascal, born on 19.6.1623

package oop_Encapsulation_ObjectAsInstanceVariable_Birthday;

public class Main {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(1,1,780);
        //`date` object (of type `SimpleDate`) is passed an argument to the `Person` constructor
        Person khwarzimi = new Person("Muhammad ibn Musa al-Khwarizmi", date);
        System.out.println(khwarzimi);

        Person pascal = new Person("Pascal", 19, 6, 1623);
        System.out.println(pascal);
    }
}
