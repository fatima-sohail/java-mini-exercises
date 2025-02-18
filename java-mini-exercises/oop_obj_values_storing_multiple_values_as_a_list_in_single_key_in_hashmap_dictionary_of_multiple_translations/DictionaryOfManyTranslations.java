package oop_obj_values_storing_multiple_values_as_a_list_in_single_key_in_hashmap_dictionary_of_multiple_translations;
//TASK:
//Store multiple translations of a word in hashmap.
//hashmap key: Word, value: multiple translations stored in a list

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    HashMap<String, ArrayList<String>> dictionaryHashMap;

    public DictionaryOfManyTranslations(){
        dictionaryHashMap = new HashMap<>();
    }

    //adds the translation for the word and preserves the old translations.
    public void add(String word, String translation){
        //first declare the key value pair, access the value(list) via key and
        // check if that key already contains this value, if it doesn't, add new
        //translation to the list
        dictionaryHashMap.putIfAbsent(word, new ArrayList<>());
        if(!dictionaryHashMap.get(word).contains(translation)){
            dictionaryHashMap.get(word).add(translation);
        } else {
            System.out.println("translation: " + translation + ", of the word: " + word + " already exists in the list.");
        }

    }

    //returns a list of the translations(value) added for the word(key). If the word has no
    // translations(no value), the method should return an empty list.
    public ArrayList<String> translate(String word){
        return dictionaryHashMap.getOrDefault(word, new ArrayList<>());
    }

    // removes the word and all its translations from the dictionary
    public void remove(String word){
        dictionaryHashMap.remove(word);
    }

    public static void main(String[] args ){
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("serendipitous", "by chance");
        dictionary.add("serendipitous", "by chance");
        dictionary.add("serendipitous", "unexpected in a beneficial way");

        dictionary.add("bow", "ribbon");
        dictionary.add("bow", "lace");


        System.out.println("serendipitous: ");
        System.out.println(dictionary.translate("serendipitous")); //prints: [by chance, unexpected in a beneficial way]

        dictionary.remove("bow");
        System.out.println("bow:");
        System.out.println(dictionary.translate("bow")); //prints: [] //cz bow is removed from the list
    }
}
