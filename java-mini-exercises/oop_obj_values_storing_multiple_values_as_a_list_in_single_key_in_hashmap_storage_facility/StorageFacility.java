package oop_obj_values_storing_multiple_values_as_a_list_in_single_key_in_hashmap_storage_facility;

//TASK:
// create a hashmap`garage`, inside the garage, there are storage units,
//inside each storage unit, there are a list of single type of items e.g
//Aile A: [ski shoes, skies, ski poles]
//Aile B: [ice skates, skating helmets]
//Aile C: [tennis rackets, tennis balls]
//create add() method, adds items to a storage unit
//create content() method, returns list of items in a storage unit

//HashMap key: String `storage unit`
//HAshMap value: list of items

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    HashMap<String, ArrayList<String>> garageHashmap;

    public StorageFacility(){
        garageHashmap = new HashMap<>();
    }

    public void add(String unit, String item){
        //declare key value pairs
        garageHashmap.putIfAbsent(unit, new ArrayList<>());

        //check if the hashmap contains the item in array(value) already, if it doesn't
        //we can add items to the array
//        if(!garageHashmap.get(unit).contains(item)){
            garageHashmap.get(unit).add(item);
//        }else{
//            System.out.println("Item: " + item + ", already exists in the array.");
//        }
    }

    public void remove(String storageUnit, String item){
        garageHashmap.get(storageUnit).remove(item);
    }

    public ArrayList<String> contents(String storageUnit){
        return garageHashmap.getOrDefault(storageUnit, new ArrayList<>());
    }

    //returns the names of the storage units as a list. NB! Only the units that
    //contain items are listed.
    public ArrayList<String> storageUnits(){
        //only if you are not taking into account empty storage units
        return new ArrayList<>(garageHashmap.keySet());
    }

    public ArrayList<String> storageUnitsThatAreNotEmpty(){
        ArrayList<String> keyList = new ArrayList<>();

        for(String key: garageHashmap.keySet()){
            if(!garageHashmap.get(key).isEmpty()){
                keyList.add(key);
            }
        }

        //otherwise ignore an empty key
        return keyList;
    }

    public static void main(String[] args){
        //create storageFacility obj
        //call methods on this obj
        StorageFacility facility = new StorageFacility();
        facility.add("Unit A", "ski shoes");
        facility.add("Unit A", "skies");
        facility.add("Unit A", "ski poles");
        facility.add("Unit A", "ski poles");

        facility.add("Unit B", "ice skates");
        facility.add("Unit B", "skating helmets");

        facility.add("Unit C", "tennis rackets");
        facility.add("Unit C", "tennis balls");

        //print the items of unit A and C
        System.out.println(facility.contents("Unit A"));
        System.out.println(facility.contents("Unit C"));

        //remove item: ski poles and print storage unit A
        facility.remove("Unit A", "ski poles");
        System.out.println(facility.contents("Unit A"));

        //remove all the items from Unit b and print out the remaining
        facility.remove("Unit B", "ice skates");
        facility.remove("Unit B", "skating helmets");
        System.out.println(facility.contents("Unit B"));

        //print units that are not empty in the form of a list
        System.out.println(facility.storageUnitsThatAreNotEmpty());

    }
}
