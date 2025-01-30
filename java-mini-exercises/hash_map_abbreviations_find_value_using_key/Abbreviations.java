package hash_map_abbreviations_find_value_using_key;

import java.util.HashMap;

public class Abbreviations {

    HashMap<String, String> map;

    public Abbreviations(){
        map = new HashMap<>();
    }

    public void addKeyAndValue(String abbreviation, String explanation){

        //see if hashmap already contains the searched string
            //if it does,print "the string already exists"
        //else, store key value pair in the hashmap using put()
        if(map.containsKey(abbreviation)){
            System.out.println("This key(abbreviation) already exists");
        }else{
            map.put(abbreviation, explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviation){
        if(map.containsKey(abbreviation)){
            return true;
        }

        return false;
    }

    public String findExplanationFor(String abbreviation) {
        //get the value using key from hashmap
        //if the abbreviation is empty, return null
        //else, retreive the value using the key and get()
        if(abbreviation == null){
            return null;
        }

        return map.get(abbreviation);
    }





}
