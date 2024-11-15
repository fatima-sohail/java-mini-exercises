
package oopListPersonInputFromUser;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //prepare terminal to receive user input
        Scanner scanner = new Scanner(System.in);
        //create an empty list
        ArrayList<Person> persons = new ArrayList<>();
        //read the names of persons from the user
        while(true){
            System.out.println("Enter a name. empty will terminate the program");
            String nameInput = scanner.nextLine();
            if(nameInput.isEmpty()){
                break;
            }
            //add this person to the list
            persons.add(new Person(nameInput));
        }

        //print the size of the list
        System.out.println("List size: " + persons.size());

        //go through each list element and print them
        for(Person person: persons){
            System.out.println(person); //this automatically calls (person.toString())
        }
    }
}
