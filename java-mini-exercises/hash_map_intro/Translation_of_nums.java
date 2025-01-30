package hash_map_intro;

import java.util.HashMap;

public class Translation_of_nums {
    public static void main(String[] args) {
        //create hashmap obj(hashmap is a class/type of ata structure) called numbers
        //it stores value and key of type `String`
        //store the following number(key)s and their translation(value) using put()
        //one, uno
        //two, dos
        //retreive the values using get() of one, two and three and print them

        HashMap<String, String> numbers = new HashMap<>();
        numbers.put("one", "uno");
        numbers.put("two", "dos");
        numbers.put("one", "eni"); //hashmap stores the most recent one and discards the
                                    // old ones cz it only stores one value per key

        //store numbers.get("one") in a variable and print it's value
        //0R
        //directly print it
        String translation = numbers.get("one");
        System.out.println(translation);

        System.out.println(numbers.get("two"));
        System.out.println(numbers.get("three"));

    }
}
