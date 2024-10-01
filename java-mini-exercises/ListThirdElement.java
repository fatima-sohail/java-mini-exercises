import java.util.ArrayList;
import java.util.Scanner;

//The exercise contains a base that asks the user for strings and adds them to a list.
// The program stops reading when the user enters an empty string. The program then prints
// the first element of the list.
//
//Your assignment is to modify the program so that instead of the first value, the third
// value on the list is printed. Remember that programmers start counting from zero!
// The program is allowed to malfunction if there are fewer than three entries on the list,
// so you don't need to prepare for such an event at all.
//
//Sample output
//Tom
//Emma
//Alex
//Mary
//
//Alex
public class ListThirdElement {
    public static void main(String[] args) {
        //ask for user input
        //create an empty array to store userInputs
        //keep on adding userInputs in the arrayList
        //if user inputs empty string, exit the program and print the first or third element of the array.
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ListOfStrings = new ArrayList<>();

        int count = 0;

        while(true){
            System.out.println("Give a string, empty string ends the program");
            String inputInString = scanner.nextLine();

            if(inputInString.equals("")){ //press the enter tab
                break;
            }
            //add userInput in the array and increment the counter
            ListOfStrings.add(inputInString);
            count++;

        }
        //print the first elemenet of the array(0)
        //print the 3rd element of the array(0,1,2)
        System.out.println(ListOfStrings.get(2));

    }
}
