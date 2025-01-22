//create an item class that is used to create objects aka items and add them to
//the item list
//go through each item and print each item in this format with current date and time
//SAMPLE OUTPUT: mindy(created at: 2024-11-14 16:45:02)
//SAMPLE OUTPUT: massy(created at: 2024-11-14 16:45:04)

//In the Item class file:
//create a variable called createdAt that stores local time and date
//create a variable called name
//Create a constructor method:
    //This constructor accepts a String parameter initialName to initialize the name variable.
    //set the createdAt to the current date and time when the Item object is
    //instantiated.
//create a get name method that returns the instance name
//create a toString() method that returns items/objects in the array in this format:
//this.name + "(created at: " + formattedDate + ")";

//In the NickNames file:
//create an empty array to store objects(items) entered by the user
//read the userInput using a while loop:
    //ask the user to enter a name, empty string will terminate the program,
    //For each name entered, a new Item object is created with the given name,
    //and items.add(new Item(nameInput)); adds it to the items list
//use enhanced for loop to print each item in the list using the format mentioned in the toString()

package oopItemsUserInputTimeStamp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private final LocalDateTime createdAt; //stores time and date, final means value is set only once
    private String name;

    public Item(String initialName){
        this.name = initialName;
        this.createdAt = LocalDateTime.now(); //sets createdAt to current date and time when the object is instantiated
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = createdAt.format(formatter);
        return this.name + "(created at: " + formattedDate + ")";
    }
}
