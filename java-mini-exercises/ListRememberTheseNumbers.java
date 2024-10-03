import java.util.ArrayList;
import java.util.Scanner;

//The exercise template contains a base that reads numbers from the user and adds them to a list.
// Reading is stopped once the user enters the number -1.
//
//Expand the functionality of the program so that after reading the numbers, it prints all the
// numbers received from the user. The number used to indicate stopping should not be printed.
//
//Sample output
//72
//2
//8
//11
//-1
//
//72
//2
//8
//11
public class ListRememberTheseNumbers {
    public static void main(String[] args) {
        //make the terminal ready to receive user input
        Scanner scanner = new Scanner(System.in);
        //create an empty arrayList to store the user inputs
        ArrayList<Integer> listOfIntegers = new ArrayList<>();
        int inputInInt;
        int count = 0;
        while(true){
            //print the question
            System.out.println("Give numbers, -1 exits the program");
            //ask for user input, keep on asking until the user enters -1
            inputInInt = Integer.valueOf(scanner.nextLine());
            if(inputInInt ==-1){
                break;
            }
            //add these numbers to the list
            listOfIntegers.add(inputInInt);
            count++;
        }
        //print all the numbers
        //go through the array and print all the numbers in it
        System.out.println("\n\n");

        for (int i = 0; i < listOfIntegers.size(); i++) {
            System.out.println(listOfIntegers.get(i));
        }

    }
}
