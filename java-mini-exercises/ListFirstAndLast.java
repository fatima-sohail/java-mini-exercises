//In the exercise template there is a program that reads inputs from the user and adds them
// to a list. Reading is stopped once the user enters an empty string.
//
//Modify the program to print both the first and the last values after the reading ends. You
// may suppose that at least two values are read into the list.
//
//Sample output
//Tom
//Emma
//Alex
//Mary
//
//Tom
//Mary

import java.util.ArrayList;
import java.util.Scanner;

public class ListFirstAndLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //create an empty arrayList to store user input
        ArrayList<String> listOfStrings = new ArrayList<>();
        //user shall give multiple inputs and keep adding them in the array.
        int count = 0;
        while(true){
            //ask for userinput
            System.out.println("Add multiple strings, enter empty string(press ENTER) to exit the program");
            //enable the user to type his input
            String inputInString = scanner.nextLine();

            //break the loop if the user enters empty string
            if(inputInString.equals("")){
                break;
            }
            //add each input to the arrayList
            listOfStrings.add(inputInString);
            //know the size of your arrayList
            listOfStrings.size();
            count++;

        }
        //go to the last index
        int lastIndex = listOfStrings.size() -1;
        //get the value at last index
        String ValueAtLastIndex = listOfStrings.get(lastIndex);
        //get to value at firstIndex
        String ValueAtFirstIndex = listOfStrings.get(0);
        //print both the values
        System.out.println("value at last index is: " + ValueAtLastIndex + "\n" +
        "value at first index is: " + ValueAtFirstIndex);
    }
}
