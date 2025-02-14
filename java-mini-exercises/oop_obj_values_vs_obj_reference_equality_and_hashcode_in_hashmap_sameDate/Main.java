package oop_obj_values_vs_obj_reference_equality_and_hashcode_in_hashmap_sameDate;
//create a hashmap in which you will store birthdays of individuals.
//play with it and see what happens when you put identical keys for different individuals,
//different keys for same individuals
//and what happens if you try to retrieve them
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        //create a hashmap
        HashMap<SimpleDate, String> map = new HashMap<>();
         SimpleDate date1 = new SimpleDate(01, 02, 2000);
         SimpleDate date2 = new SimpleDate(02, 02, 2000);
         SimpleDate date3 = new SimpleDate(25, 02, 2000);

         map.put(date1, "alice"); // Add alice with date1
         map.put(date1, "jose");  // Replaces alice with jose (same date1 key)
         map.put( date2, "jose"); //date1 and date2 both are `jose`
         map.put( date2, "jose");
         map.put(date3, "jose"); //map size: 1 // `date1, date2, date3 are jose
         map.put( date3, "dan");  //map size: 2 //`jose` for date3 is replaced by `dan`
         map.put(new SimpleDate(01, 02, 2000), "sam"); //map size: 3
                                                                        // Replaces jose with sam for date1

        System.out.println(map.size());
        System.out.println(map.toString());

        System.out.println(map.get(date1)); //prints: sam //cz in case of multiple similar values,
                                                          // the lateset one wins,
                                                          //rest go to dumpster
        System.out.println(map.get(new SimpleDate(01, 02, 2000))); //prints: sam
        System.out.println(map.get(date3)); //prints: dan


    }
}
