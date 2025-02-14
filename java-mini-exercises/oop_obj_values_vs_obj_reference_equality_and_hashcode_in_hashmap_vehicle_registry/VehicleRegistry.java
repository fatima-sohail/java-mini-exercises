package oop_obj_values_vs_obj_reference_equality_and_hashcode_in_hashmap_vehicle_registry;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry{
    HashMap<LicensePlate, String> map;

    public VehicleRegistry(){
        map = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        //Check if the licensePlate already exists in the registryMap.
        //If it does not exist, add the licensePlate with the given owner and return true.
        //If it exists, return false without adding anything.
        if (!map.containsKey(licensePlate)) {
            map.put(licensePlate, owner);
            return true;  // Return true after adding the owner.
        }

        return false;  // If the license plate already exists, return false.

    }

    public String get(LicensePlate licensePlate){
        //If the car isn't in the registry, the method returns null.
        return map.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate){
        //check if the map contains licensePlate, if it does, remove it and return true
        //otherwise return false
        if(map.containsKey(licensePlate)){
            map.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates(){
        //since license plate is key, use keySet() to retreive only keys
        for(LicensePlate key_licensePlt: map.keySet()){
            System.out.println(key_licensePlt);
        }
    }

    public void printOwners(){
        //since owners are values, values can be retreived using values()
        //you can create a list used for remembering the owners that were already printed.
        //If an owner is not on the list, their name is printed and they are added to
        //the list; conversely, if an owner is on the list, their name isn't printed.
        ArrayList<String> ownerList = new ArrayList<>();
        for(String value_owner: map.values()){
            if(!ownerList.contains(value_owner)){
                ownerList.add(value_owner);
            }
        }

        for(String value_owner: ownerList){
            System.out.println(value_owner);
        }
    }


}



