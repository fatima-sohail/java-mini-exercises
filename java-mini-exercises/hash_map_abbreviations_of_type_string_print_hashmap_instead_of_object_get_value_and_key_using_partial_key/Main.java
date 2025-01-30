package hash_map_abbreviations_of_type_string_print_hashmap_instead_of_object_get_value_and_key_using_partial_key;

import java.util.HashMap;

import static hash_map_abbreviations_of_type_string_print_hashmap_instead_of_object_get_value_and_key_using_partial_key.Abbreviations.*;

public class Main {
    public static void main(String[] args) {
        //create a hashmap instead of Program obj,
        //to see obj driven in main-->go to the main file in the folder:
        //hash_map_abbreviations_find_value_using_key
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---------");

        printKeysWhere(hashmap, "i");
        System.out.println("----------");
        printValuesOfKeysWhere(hashmap, "i");

        System.out.println();

        printKeysWhere(hashmap, "s");
        printValuesOfKeysWhere(hashmap, "s");


    }


}
