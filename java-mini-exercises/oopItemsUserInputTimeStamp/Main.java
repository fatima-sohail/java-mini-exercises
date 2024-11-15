package oopItemsUserInputTimeStamp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //create an empty list
        ArrayList<Item> items = new ArrayList<>();
        //read the name from the user
        while(true){
            System.out.println("Enter a name, empty will terminate the program");
            String nameInput = scanner.nextLine();
            if(nameInput.isEmpty()){
                break;
            }
            //add this item to the list
            items.add(new Item(nameInput));
        }

        //go through each item in the list and print them with date and time each was
        // created using toString()
        for (Item item: items){
            System.out.println(item);
        }
    }
}
