package oop_encapsulation_retreive_heaviest_object_from_itemList_in_suitcase_from_suitcaseList_in_cargo_hold;

import java.util.ArrayList;

public class Suitcase {
    ArrayList<Item> itemList;
    int maxWeight;

    public Suitcase(int maxWeighttt){
        itemList = new ArrayList<>();
        maxWeight = maxWeighttt;
    }

    public int totalWeightSuitecase(){
        int sum = 0;
        for(Item item: itemList){
            sum = sum + item.getItemWeight();
        }
        return sum;
    }
    public void addItem(Item item){

        if(totalWeightSuitecase() + item.getItemWeight() <= this.maxWeight){
            itemList.add(item);
        }else{
            ;
        }
    }

    public String toString(){
        //if the list is empty, return null
        //output all the elements in the list
        //for proper english: if the list has one element, return: 1 item ( kg)
        //else, return 2 items ( total weight kg)
        if(itemList.isEmpty()){
            return "0 items (0 kg)";
        }

        if(itemList.size() == 1){
            return itemList.size() + " item ( " + totalWeightSuitecase() + " kg)";
        }else{
            return itemList.size() + " items ( " + totalWeightSuitecase() + " kg)";
        }

    }

    public void printItems(){
        for(Item item: itemList){
            System.out.println(item);
        }
    }

    public Item heaviestItem(){
        if(itemList.isEmpty()){
            return null;
        }
        // Create an object reference for the heaviest item
        // Its initial value is the first element of the list
        // Go through the list
        // Compare the current element's weight with the heiviest weight item
        // If a heivier obj is found, assign it to heaviest item
        Item heaviestItem = itemList.get(0);
        for(Item item: itemList){
            if(heaviestItem.getItemWeight() < item.getItemWeight()){
                heaviestItem = item;
            }
        }
        return heaviestItem;

    }
}
