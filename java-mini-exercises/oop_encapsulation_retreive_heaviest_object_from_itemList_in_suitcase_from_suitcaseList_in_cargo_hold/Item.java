package oop_encapsulation_retreive_heaviest_object_from_itemList_in_suitcase_from_suitcaseList_in_cargo_hold;

public class Item {
    String itemName;
    int itemWeight;

    public Item(String name, int weight){
        itemName = name;
        itemWeight = weight;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemWeight() {
        return itemWeight;
    }

    public String toString(){
        return itemName + " (" + itemWeight +  " kg)";
    }
}
