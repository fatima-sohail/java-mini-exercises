package oop_obj_values_vs_obj_reference_equality_and_hashcode_in_hashmap_vehicle_registry;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        //create three license plate objs
        LicensePlate li1 = new LicensePlate("JPN", "ABC-123");
        LicensePlate li2 = new LicensePlate("JPN", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        //create a list of japanese license plates of type `LicensePlate`
        ArrayList<LicensePlate> japanesePltList = new ArrayList<>();

        //add two of the license plate objs to this list
        japanesePltList.add(li1);
        japanesePltList.add(li2);

        //create another license plate obj
        LicensePlate newLi = new LicensePlate("JPN", "ABC-123");

        //if the list doesn't contain newLicPlate, add it
        if(!japanesePltList.contains(newLi)){
            japanesePltList.add(newLi);
        }

        //print the list
        System.out.println("japanese license plate list: " + japanesePltList);

        //create a hashmap that stores licensePlateobj as keys and owners as string
        HashMap<LicensePlate, String> ownerMap = new HashMap<>();

        //store 2 key value pairs
        ownerMap.put(li1, "Takashi");
        ownerMap.put(li3, "Suki");

        //retreive values(owners) using keys and print them
        System.out.println("Owners:");
        System.out.println(ownerMap.get(new LicensePlate("JPN", "ABC-123")));
        System.out.println(ownerMap.get(new LicensePlate("D", "B WQ-431")));

        //__________________________________________________________________________//
        //for vehicle registry
        VehicleRegistry registry = new VehicleRegistry();
        System.out.println("Registry:");
        registry.add(li1, "Takashi");
        registry.add(li1, "Takashi"); //this owner is already on the list, their name isn't printed again.
        registry.add(li3, "Suki");

        registry.printOwners(); //prints: Takashi, suki
        registry.printLicensePlates();

        registry.remove(li1);
        System.out.println("Registry after removing li1 license plate:");
        registry.printOwners();
        registry.printLicensePlates();

        System.out.println(registry.get(li3)); //prints: suki //cz suki is value of key-license plate
        System.out.println(registry.get(new LicensePlate("US", "23A-TY")));
        //prints: null //this car isn't in the registry.



    }
}
