package hash_map_library_print_hashmap_of_type_string_type_object;

import java.util.HashMap;

public class Program {
    HashMap<String, Book> map;

    public Program(){
        map = new HashMap<>();
    }

    public static void printValues(HashMap<String,Book> hashmap){
        //Iterate over the values in the hashmap
        for(Book value: hashmap.values()){
            System.out.println(value);
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){

        //sanitize the text first, remove extra spaces from the beginning and end
        //and make it case-insensitive(convert to lower case)
        String sanitizeText = text.trim().toLowerCase();

        boolean matchFound = false;

        //iterate over hashmap's values
        for(Book value: hashmap.values()){
            // Sanitize the book name (trim and convert to lowercase) once
            String sanitizeName = value.getName().trim().toLowerCase();

            // If the sanitized book name contains the sanitized search text
            if(sanitizeName.contains(sanitizeText)){
                System.out.println(value);
                matchFound = true;
            }
        }

        if(!matchFound){
            System.out.println("No books found containing this part text in their name.");
        }

    }
}
