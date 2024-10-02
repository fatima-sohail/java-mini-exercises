//In the exercise template there is a program that reads inputs from the user and adds
// them to a list. Reading is stopped once the user enters an empty string.
//
//Your task is to modify the method to print the last read value after it stops reading.
// Print the value that was read last from the list. Use the method that tells the size of
// a list to help you.
//
//Sample output
//Tom
//Emma
//Alex
//Mary
//
//Mary

import java.util.ArrayList;
import java.util.Scanner;

public class ListLastInList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //create an empty array to store the user inputs.
        ArrayList<String> listOfStrings = new ArrayList<>();

        int count = 0;
        while(true){
            System.out.println("Give a string, empty string ends the program");
            String inputInString = scanner.nextLine();

            if(inputInString.equals("")){ //press the enter tab
                break;
            }
            //add the input to the arrayList
            listOfStrings.add(inputInString);
            //get the size of the arrayList and increment
            listOfStrings.size();
            count++;

        }
        //go to the last index of the array
        // print the value at the last index
        int lastIndex = listOfStrings.size() - 1;
        System.out.println(listOfStrings.get(lastIndex));
    }
}
