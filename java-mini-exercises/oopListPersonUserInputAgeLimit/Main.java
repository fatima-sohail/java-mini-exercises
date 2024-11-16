//create a scanner object
//create an empty list to store future user inputted objects
//in the while loop, ask the user to "Enter person's name, press enter to terminate
//the program: "
//ask the user for person's age
//create an object and add it to that empty list
//outside the while loop:
//ask user for the age limit to play lottery
//only print those objects whose age is equal or above the inputted age limit

package oopListPersonUserInputAgeLimit;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner
        Scanner scanner = new Scanner(System.in);
        //create an arrayList
        ArrayList<Person> personList = new ArrayList<>();

        while(true){
            System.out.print("Enter person's name, press enter to terminate the program: ");
            String nameInput = scanner.nextLine();
            if(nameInput.isEmpty()){
                break;
            }
            //ask the user for person's age
            System.out.print("Enter their age: ");
            int ageInput = Integer.valueOf(scanner.nextLine());

            //create an object
            Person person = new Person(nameInput, ageInput);
            //add it to the list
            personList.add(person);

        } //while loop finished

        //ask user for the age limit to play lottery
        System.out.println("What's the age limit to play lottery?");
        int ageLimit = Integer.valueOf(scanner.nextLine());

        //only print those objects from the array that are above the inputted agelimit
        for(Person person: personList){
            if(person.getAge() >= ageLimit){
                System.out.println(person);
            }
        }

    }

}
