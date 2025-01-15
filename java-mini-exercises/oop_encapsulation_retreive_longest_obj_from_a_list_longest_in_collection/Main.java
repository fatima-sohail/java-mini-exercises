package oop_encapsulation_retreive_longest_obj_from_a_list_longest_in_collection;

import oop_encapsulation_retreiving_longest_string_and_printing_an_obj_from_a_list_printingACollection.SimpleCollection;

public class Main {
    public static void main(String[] args) {
        SimpleCollection j = new SimpleCollection("characters");
        System.out.println("Longest: " + j.longest());

        j.addElement("magneto");
        j.addElement("mystique");
        j.addElement("phoenix");

        System.out.println("Longest: " + j.longest());
    }
}
