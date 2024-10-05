import java.util.ArrayList;
import java.util.Scanner;

//In the exercise template there is a program that reads inputs from the user until an
//empty string is entered. Add the following functionality to it: after reading the
// inputs one more string is requested from the user. The program then tell whether that
// string was found in the list or not.
//
//Sample output
//Tom
//Emma
//Alex
//Mary
//
//Search for? Mary
//Mary was found!
public class ListStringOnTheList {
    public static void main(String[] args) {
        //prepare the terminal to receive user input
        //ask for user input
        //create an empty array to store userInputs
        //keep on adding userInputs in the arrayList
        //if user inputs empty string, exit the program and print the first or third element of the array.
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<>();

        int count = 0;

        while(true){
            System.out.println("Give a string, empty string ends the program");
            String inputInString = scanner.nextLine();

            if(inputInString.equals("")){ //press the enter tab
                break;
            }
            //add userInput in the array and increment the counter
            listOfStrings.add(inputInString);
            count++;

        }
        //ask the user this qs: Search for?
        //go through the list and search for the string user has asked to search
        System.out.println("Search for?");
        for(String inputInString2: listOfStrings){
            inputInString2 = scanner.nextLine();
            if(listOfStrings.contains(inputInString2)){
                System.out.println("This list constain: " + inputInString2);
            }else{
                System.out.println(inputInString2 + " was not found!");
            }
        }
    }
}
