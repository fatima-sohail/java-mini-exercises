package hash_map_library_of_type_string_type_obj_use_obj_as_hashmap_value;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //create a hashmap obj with key type `String` and value type `Book`
        HashMap<String, Book> directory = new HashMap<>();

        //create objs of value--> Book first to put it in the hashmap
        Book harryPotter = new Book("Harry Potter", ".....", 2000);
        Book cinderella = new Book("Cinderella", "...", 1980);

        //store the key-value pair using `put()` and retreive them using `get()`
        //store the book by its key and value --> `key` type is the String name,
        // and `value` type is Book
        directory.put(harryPotter.getName(), harryPotter);
        directory.put(cinderella.getName(), cinderella);

        //retrieve by: hashmapObj.get(key) --> key is String name--> "Harry Potter"
        System.out.println(directory.get("Harry Potter"));
        System.out.println();
        System.out.println(directory.get("Cinderella"));
        System.out.println();

        //retrieve just the field 'content' from cinderella
        System.out.println("Retrieve just the field `content` from Cinderella: ");
        System.out.println(directory.get("Cinderella").getContent());


        //OR first store it in a variable and print that variable
        //Book hp2 = directory.get("Harry Potter");
        //System.out.println(hp2);

        Book sw = directory.get("Snow White");
        System.out.println(sw); //returns null cz it doesn't exist in the above hashmap

        //print the directory
        System.out.println();
        System.out.println(directory);

        //change the name of harry Potter to something else using set() and print the haspmap
        Book hpReference = directory.get("Harry Potter");
        hpReference.setName("SomeOtherBook");


        System.out.println();
        System.out.println("Reprinting the updated directory:");
        System.out.println(directory);

    }
}
