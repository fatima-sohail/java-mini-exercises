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

        //create multiple SimpleDate objects and use isEarlierThan() to compare
        //eachother and see whose birthday comes earlier
        SimpleDate d1 = new SimpleDate(14, 2, 2011);
        SimpleDate d2 = new SimpleDate(21, 2, 2011);
        SimpleDate d3 = new SimpleDate(1, 3, 2011);

        //print true or false depending on the statment asked
        System.out.println("d1's birthday is earlier than d2: " + d1.isEarlierThan(d2));
        System.out.println("d2's birthday is earlier than d1: " + d2.isEarlierThan(d1));

        System.out.println("d2's birthday is earlier than d3: " + d2.isEarlierThan(d3));
        System.out.println("d3's birthday is earlier than d2: " + d3.isEarlierThan(d2));

    }
}
