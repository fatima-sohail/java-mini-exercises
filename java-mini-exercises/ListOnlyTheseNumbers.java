import java.util.ArrayList;
import java.util.Scanner;

//The exercise template contains a base that reads numbers from the user and adds them to
// a list. Reading is stopped once the user enters the number -1.
//
//Expand the program to ask for a start and end indices once it has finished asking for
// numbers. After this the program shall prints all the numbers in the list that fall in
// the specified range (between the indices given by the user, inclusive). You may assume
// that the user gives indices that match some numbers in the list.
//
//Sample output
//72
//2
//8
//11
//-1
//
//From where? 1
//To where? 2
//2
//8
public class ListOnlyTheseNumbers {
    public static void main(String[] args) {
        //make the terminal ready to receive user input
        Scanner scanner = new Scanner(System.in);
        //create an empty arrayList to store the user inputs
        ArrayList<Integer> listOfIntegers = new ArrayList<>();
        int inputInInt;
        int count = 0;
        while (true) {
            //print the question
            System.out.println("Give numbers, -1 exits the program");
            //ask for user input, keep on asking until the user enters -1
            inputInInt = Integer.valueOf(scanner.nextLine());
            if (inputInInt == -1) {
                break;
            }
            listOfIntegers.add(inputInInt);
            count++;
        }
        //ask user for the range
        System.out.println("From where?");
        int fromWhere = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?");
        int toWhere = Integer.valueOf(scanner.nextLine());
        //ensure indices are valid
        if(fromWhere <= toWhere && fromWhere >= 0 && toWhere < listOfIntegers.size()){
            //print the numbers within the specified range
            for(int i = fromWhere; i <= toWhere; i++){
                System.out.println(listOfIntegers.get(i));
            }
        } else {
            System.out.println("Invalid input, try valid range");
        }

    }

}
