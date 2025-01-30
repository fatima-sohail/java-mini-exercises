package hash_map_abbreviations_of_type_string_print_hashmap_instead_of_object_get_value_and_key_using_partial_key;

import java.util.HashMap;
import java.util.Set;

public class Abbreviations {
    HashMap<String, String> map;  //key: abbreviation, value: explanation

    public Abbreviations(){
        map = new HashMap<>();
    }

    //this method prints all the keys given in the hashmap
    public static void printKeys(HashMap<String,String> hashmap){
        //first access keys in a hashmap using .keyset()
        //only enhanced for loop is used in hashmap, cz hashmap lacks index
        // iterate over the hashmap and print out all the keys

        Set<String> allKeys = hashmap.keySet();

        //allKeys is a collection
        //key temporarily holds each element(key) from the key collection
        //key represents the current key and is printed in each iteration.
        for(String key: allKeys){
            System.out.println(key);
        }

    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        //`text` is treated as a portion of the key similar to how partTitle
        //is a portion of book title in getBookByPart(String titlePart) in Library
        //class file in folder:
        // hash_map_library_go_through_hash_map_key_vs_hash_map_value_using_a_
        // part_of_key_to_retreive_a_book

        //access only the keys-allKeys
        Set<String> allKeys = hashmap.keySet();

        //create a boolean Variable to track if any key matches the given text
        boolean matchFound = false;

        //go through each key using for(String key: allKeys)
        //if key contains text
        //print that key and mark as found
        //outside the loop(to avoid printing repition in case no matching key is found):
        //If no matching key was found, print a message
        for(String key: allKeys){
            if(key.contains(text)){
                System.out.println(key);
                matchFound = true;
            }

        }//loop ends

        if(!matchFound){
            System.out.println("No keys found containing the given text.");
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        //access the keyset
        //inside the loop, go over each key and retreive the value of the
        //given key and print it
        Set<String> allKeys = hashmap.keySet();

        boolean matchFound = false;
        //if key contains text, print value //but how will you access the value?
        //using hashmap.get(key)
        for(String key: allKeys){
            if(key.contains(text)){
                String value = hashmap.get(key);
                System.out.println(value);
                matchFound = true;
            }
        }//loop ends

        if(!matchFound){
            System.out.println("No keys found containing the given text. So no value exists.");
        }
    }
}
