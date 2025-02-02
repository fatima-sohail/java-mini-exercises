package hash_map_library_print_hashmap_of_type_string_type_object;

import java.util.HashMap;

import static hash_map_library_print_hashmap_of_type_string_type_object.Program.printValueIfNameContains;
import static hash_map_library_print_hashmap_of_type_string_type_object.Program.printValues;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Book> map = new HashMap<>();
        map.put("sense", new Book("Sense and Sensibility","..." , 1811));
        map.put("prejudice", new Book("Pride and prejudice","...." , 1813));

        printValues(map);
        System.out.println("------");
        printValueIfNameContains(map, "Prejudice");
    }

}
