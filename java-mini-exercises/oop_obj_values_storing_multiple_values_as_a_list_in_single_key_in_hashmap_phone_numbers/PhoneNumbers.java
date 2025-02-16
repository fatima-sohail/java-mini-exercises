package oop_obj_values_storing_multiple_values_as_a_list_in_single_key_in_hashmap_phone_numbers;
//TASK:
// you have a person`Ron` and you want to store multiple phone numbers under his name.
//store multiple phone numbers(values) under a single key using a list.
// i.e Ron's number: [040-12348765, 09-111333]

//NOTE:
//hashmap key: String, value: list

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneNumbers {

    public static void main(String[] args){
        HashMap<String, ArrayList<String>> phoneNumbers = new HashMap<>();

        //initialize a key value pair
        phoneNumbers.put("Ron", new ArrayList<>());

        //add a phone number to the ron's list
        phoneNumbers.get("Ron").add("020-1234567");
        //add another phone numner to Ron's list
        phoneNumbers.get("Ron").add("098-4234569");

        //create another key value pair
        phoneNumbers.put("Alex", new ArrayList<>());

        //add multiple phone numbers to Alex's name
        phoneNumbers.get("Alex").add("051-2190865");
        phoneNumbers.get("Alex").add("098-7890864");


        //print Ron's phone numbers
        System.out.println("Ron's numbers: " + phoneNumbers.get("Ron"));

        //print Alex's numbers
        System.out.println("Alex's numbers: " + phoneNumbers.get("Alex"));

        //***********************************************
        //use customized add and print method to perform the above tasks
        //create a phoneNumbers obj and call methods on it
        PhoneNumbers registry = new PhoneNumbers();

        //add phone numbers to users
        registry.addPhoneNumber("Zeb", "222-678954");
        registry.addPhoneNumber("Zeb", "222-678954");//same number
        registry.addPhoneNumber("Zeb", "333-978957");

        registry.addPhoneNumber("Kamala", "444-978957");

        registry.addPhoneNumber("Alice", "555-978957");
        registry.addPhoneNumber("Alice", "777-978957");

        //print the users with their multiple numbers
        registry.printPhoneNumAssociatedWithAUser();
    }

    private HashMap<String, ArrayList<String>> phoneRegistry;

    public PhoneNumbers(){
        phoneRegistry = new HashMap<>();
    }

    public void addPhoneNumber(String user, String phoneNum) {
        //declare the key value pairs first
        this.phoneRegistry.putIfAbsent(user,new ArrayList<>());

        //check for duplicate phone numbers
        if(!this.phoneRegistry.get(user).contains(phoneNum)){
            //get access to the list(value) and add number in the list
            this.phoneRegistry.get(user).add(phoneNum);
        }else{
            //otherwise print a message saying this num already exists
            System.out.println("phone num: " + phoneNum + " for " + user + " already exists in the system." );
        }

    }

    public void printPhoneNumAssociatedWithAUser(){
        //go through each key and print their values
        for(String user_key: phoneRegistry.keySet()){
            System.out.println( user_key + " has following phone numbers: ");
            System.out.println(phoneRegistry.get(user_key));
        }
    }
}
