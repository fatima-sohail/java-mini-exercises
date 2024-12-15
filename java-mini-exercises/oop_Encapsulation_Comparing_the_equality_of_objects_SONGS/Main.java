package oop_Encapsulation_Comparing_the_equality_of_objects_SONGS;

public class Main {
    public static void main(String[] args) {
        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

        if(jackSparrow.equals(anotherSparrow)){
            System.out.println("Songs are equal");
        }

        if(jackSparrow.equals("another object")){
            System.out.println("Songs are not equal");
        }
    }
}
