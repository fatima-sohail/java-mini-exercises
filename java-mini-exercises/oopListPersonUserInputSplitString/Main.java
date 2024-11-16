package oopListPersonUserInputSplitString;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner
        Scanner scanner = new Scanner(System.in);
        //empty array
        ArrayList<Person> personList = new ArrayList<>();
        //create objects/elements and add them in the empty array
        System.out.println("Enter the person's details separated by a comma, e.g.: Randall,2");
        while(true){
            System.out.print("Enter the details, empty will stop: ");
            //receive input
            String detailsInput = scanner.nextLine();
            if(detailsInput.isEmpty()){
                break;
            }

            //add " , " between the inputs e.g. Randall,2
            String[] parts = detailsInput.split(",");
            String nameInput = parts[0];
            int ageInput = Integer.valueOf(parts[1]);
            //create an object and add it to the list
            personList.add(new Person(nameInput, ageInput));
        }

        //print all the objects in the arrayList
        //use any name inplace of object, use person, doesn't matter
        for(Person object: personList){
            System.out.println(object);
        }
    }

}
