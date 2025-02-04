package hash_map_updating_value_of_hashmap_as_counter_in_fruit_sales;

import java.util.HashMap;

public class FruitSaleCounter {
    // HashMap to store the fruit name and its corresponding sale count
    HashMap<String, Integer> salemap;

    // Constructor to initialize the fruitSales map
    public FruitSaleCounter(){
        salemap = new HashMap<>();
    }

    //Adds a sale for the specified fruit, in other words:
    //add value with the help of key
    public void addSale(String keyFruit) {
        // If the fruit is not in the map, initialize the sale count to 0
        if(!salemap.containsKey(keyFruit)){
            salemap.put(keyFruit, 0);
        }

        //otherwise
        //get the current value(sales), increment it and update the count in hashmap
        int valueSale = salemap.get(keyFruit);
        valueSale++;

        salemap.put(keyFruit, valueSale);
    }


    public int getSales(String keyFruit) {
        //Return the sales count or 0 if the fruit doesn't exist in the map
        return salemap.getOrDefault(keyFruit, 0);
    }
}
