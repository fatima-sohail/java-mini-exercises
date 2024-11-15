package oopListPersonDoubleUserInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

// Read person information from the user, ask to enter a name
        while (true) {
            System.out.print("Enter a name, empty will end: ");
            String userInputName = scanner.nextLine();
            if (userInputName.isEmpty()) {
                break;
            }

            //ask for the userName's age
            System.out.print("Enter the age of " + userInputName + ": ");
            int age = Integer.valueOf(scanner.nextLine());

            // We add a new person to the list.
            // The person's name and age were decided by the user
            persons.add(new Person(userInputName, age));
        }

        //number of inputted values
        System.out.println("Number of inputted values: " + persons.size());

        //print each element in the list
        for(Person person: persons){
            System.out.println(person);
        }

    }
}
