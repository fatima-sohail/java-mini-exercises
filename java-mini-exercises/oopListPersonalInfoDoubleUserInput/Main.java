package oopListPersonalInfoDoubleUserInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner
        Scanner scanner = new Scanner(System.in);
        //empty list
        ArrayList<PersonalInfo> infoCollection = new ArrayList<>();
        //create objects aka emelents
        System.out.println("Enter the below asked info, empty will exit the program e.g: Alice");
        while(true) {
            System.out.print("First name: ");
            //receive input
            String firstNameInput = scanner.nextLine();
            if (firstNameInput.isEmpty()) {
                break;
            }
            System.out.print("Last name: ");
            String lastNameInput = scanner.nextLine();
            System.out.print("Identification Number: ");
            int identificationNumInput = Integer.valueOf(scanner.nextLine());

            PersonalInfo objectInfo = new PersonalInfo(firstNameInput, lastNameInput, identificationNumInput);
            infoCollection.add(objectInfo);
            //OR
            //infoCollection.add(PersonalInfo objectInfo = new PersonalInfo(firstNameInput, lastNameInput, identificationNumInput))
        }
            //print each element in the list
            for(PersonalInfo objectInfo: infoCollection){
                System.out.println(objectInfo);
            }




    }
}
