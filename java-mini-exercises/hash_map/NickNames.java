package hash_map;

import java.util.HashMap;

public class NickNames {
    public static void main(String[] args) {
        //create a hash map<String, String> obj
        
        //store the following names(key) and their nicknames(value) in the above hashmap
        //and use only lower case letters:
        //matthew's nickname is matt
        //michael's nickname is mix
        //arthur's nickname is artie

        //get mathew's nick name from the hasmap and print it

        HashMap<String, String> nickNames = new HashMap<>();
        nickNames.put("mathew", "matt");
        nickNames.put("micheal", "mix");
        nickNames.put("arthur", "artie");

        nickNames.get("mathew");
        System.out.println(nickNames.get("mathew"));

    }
}
