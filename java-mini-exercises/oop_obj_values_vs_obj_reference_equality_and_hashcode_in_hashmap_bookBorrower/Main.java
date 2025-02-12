package oop_obj_values_vs_obj_reference_equality_and_hashcode_in_hashmap_bookBorrower;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        //create a hashmap, put books as key and value as borrower in it and retreive books
        HashMap<Book, String>  borrowerMap = new HashMap<>();

        Book mystryBook = new Book("Java", 1999);
        Book java = new Book("Java", 1999);
        Book python = new Book("Python", 2000);

        //add or put them in the hashmap and retreive them
        borrowerMap.put(mystryBook,"Alice");
        borrowerMap.put(java, "Brad");
        borrowerMap.put(python, "Charles");

        System.out.println(borrowerMap.size()); //prints:2 //cz mysteryBook and java have identical
                                                        //fields, so both are equal(refer to the
                                                        //same hashcode integer, same key), so latest(java)
                                                        //will replace mystryBook

        System.out.println(borrowerMap.get(mystryBook));
        //prints: Brad //cz prev. entry goes to trash

        //below is a new obj with fields identical to mystryBook, prints: Brad
        //cz if fields are identical, objs are equal
        System.out.println(borrowerMap.get(new Book("Java", 1999)));

        //both print: Charles
        System.out.println(borrowerMap.get(python));
        System.out.println(borrowerMap.get(new Book("Python", 2000)));

        //prints: null //cz it doesn't exist
        System.out.println(borrowerMap.get(new Book("Pyth..", 2000)));
    }

}
