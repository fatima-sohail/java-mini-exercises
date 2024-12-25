package oop_Encapsulation_comparing_the_equality_of_objects_in_List_birds;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //create an empty arraylist
        ArrayList <Bird> birdList = new ArrayList<>();
        //create an object
        Bird mockingJay = new Bird("MokingJay");

        //see if the arraylist contains mokingJay object
        if(birdList.contains(mockingJay)){
            System.out.println("MockingJay is on the list");
        }else{
            System.out.println("Not on the list");
        }

        //add mockingJay in the list
        birdList.add(mockingJay);
        //see if the arrayList contains mockingJay object
        if(birdList.contains(mockingJay)){
            System.out.println("MockingJay is on the list");
        }else{
            System.out.println(" Not on the list");
        }

        System.out.println("Howeverrr!");

        //bird with exactly same contents but a different reference
        mockingJay = new Bird("MockinJay");
        //see if it is in the arrayList
        if(birdList.contains(mockingJay)){
            System.out.println("MockingJay is on the list");
        }else{
            System.out.println("Not on the list");
        }


    }
}
