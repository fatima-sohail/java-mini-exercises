package hash_map_updating_value_of_hashmap_as_counter_in_fruit_sales;

public class Main {
    public static void main(String[] args) {
        FruitSaleCounter saleCounter = new FruitSaleCounter();

        saleCounter.addSale("apple");
        saleCounter.addSale("orange");
        saleCounter.addSale("apple");
        saleCounter.addSale("banana");

        System.out.println(saleCounter.getSales("apple"));
        System.out.println(saleCounter.getSales("kiwi"));
    }
}
