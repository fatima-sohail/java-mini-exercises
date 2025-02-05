package hash_map_updating_value_of_hashmap_as_counter_in_i_owe_you;

import java.util.HashMap;

public class IOU {
    HashMap<String, Double> map;    //key: person you owe money to, value: amount owed

    public IOU(){
        map = new HashMap<>();
    }

    //This is a setter method that allows you to set(store/update) the value (amount owed)
    //for a specific key (person you owe money to).
    public void setSum(String toWhom, double amount){
        map.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        //return value
        //using key
        return map.getOrDefault(toWhom, 0.0);
    }
}
