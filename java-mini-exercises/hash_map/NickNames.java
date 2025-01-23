package hash_map;

import java.util.HashMap;

public class NickNames {
    public static void main(String[] args) {
        //create a hash map<String, String> obj

        //using put()store the following names(key) and their nicknames(value) in hashmap
        //and use only lower case letters:
        //matthew's nickname is matt
        //michael's nickname is mix
        //arthur's nickname is artie

        //retreive mathew's nickname from the hashmap using get() and print it

        HashMap<String, String> nickNames = new HashMap<>();
        nickNames.put("mathew", "matt");
        nickNames.put("micheal", "mix");
        nickNames.put("arthur", "artie");

        //nickNames.get("mathew");
        System.out.println(nickNames.get("mathew"));

        //if the hash map doesn't contain the key used for the search, its get method returns
        //a null reference
        System.out.println(nickNames.get("artuu"));

    }
}
