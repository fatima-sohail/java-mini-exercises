package hash_map_library_going_through_hash_maps_keys;

//create a book class first, build library class using book class

//if you forget the key(book title) and only remember a part of it, you won't be able to
//retrieve the book in hashmap, so how will you retrieve the book but just remembering
//a part of the key(book title)? using a method that returns an arrayList and storing
//the output in that arraylist,
//e.g.
//keys are catastrophe and category, if we search `cat`
//both will show up, that's cz both are stored in the arrayList

import java.util.HashMap;

public class Library {
    //create a hashmap instance variable that stores books using key value pairs
    //and instantiate it
    HashMap<String, Book> directory;

    public Library(){
        directory = new HashMap<>();
    }

    
}
