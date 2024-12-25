package oop_Encapsulation_comparing_the_equality_of_objects_in_List_Archive;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Archive> archiveList = new ArrayList<>();

        while(true){
            System.out.println("Identifier? (empty will stop)");
            String inputIdentifier = scanner.nextLine();

            if(inputIdentifier.isEmpty()){
                break;
            }

            System.out.println("Name? (empty will stop)");
            String inputName = scanner.nextLine();

            if(inputName.isEmpty()){
                break;
            }

            Archive archiveObj = new Archive(inputIdentifier, inputName);

            //avoid repetition in the list, identifier should not be repeated
            if(archiveList.contains(archiveObj)){
                System.out.println("This identifier already exists");
            }else{
                archiveList.add(archiveObj);
            }

        }//loop ends

        for(Archive archiveObj: archiveList){
            System.out.println(archiveObj);
        }

        System.out.println("Archive list size/total elements: " + archiveList.size());
    }

    public Car produceCar(){
        Car car = new Car("Toyota");
        return car;
    }
}
