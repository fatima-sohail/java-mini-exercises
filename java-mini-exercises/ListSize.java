import java.util.ArrayList;
import java.util.Scanner;

//In the exercise template is a program that reads input from the user. Modify its working so
//that when the program quits reading, the program prints the number of values on the list.
//
//Sample output
//Tom
//Emma
//Alex
//Mary
//
//In total: 4
public class ListSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<>();

        int count = 0;
        while(true){
            System.out.println("Give a string, empty string ends the program");
            String inputInString = scanner.nextLine();

            if(inputInString.equals("")){ //press the enter tab
                break;
            }
            //add user input and then determine the size, then increment the loop
            listOfStrings.add(inputInString);
            listOfStrings.size();
            count++;
        }
        //print the total size of the array
        System.out.println("Total elements in the arrayList: " + listOfStrings.size());
    }
}
