import java.util.ArrayList;
import java.util.Scanner;

//The exercise template contains a base that reads numbers from the user and adds them
// to a list. Reading is stopped once the user enters the number -1.
//
//Expand the program by adding a functionality that asks the user for a number, and reports
// that number's index in the list. If the number is not found, the program should not print
// anything.
//
//Sample output
//72
//2
//8
//8
//11
//-1
//
//Search for? 2
//2 is at index 1
public class ListIndexOf {
    public static void main(String[] args) {
        //prepare the terminal to receive user input
        Scanner scanner = new Scanner(System.in);
        //create an empty arrayList
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
        //ask the user for a number to search for
        System.out.println("Search for? ");
        int numberToSearch = Integer.valueOf(scanner.nextLine());

        //to find the index of a number that exists once in the array
//        int indexOfSearchedNum = listOfIntegers.indexOf(numberToSearch);
//          if the number is found, print it
//        if(indexOfSearchedNum != -1){
//            System.out.println(numberToSearch + " is at the index: " + indexOfSearchedNum);
//        }

        //if a number exists twice or more in the array
        for(int i = 0; i < listOfIntegers.size(); i++){
            //if number at current i matches the searched number, print that index.
            if(listOfIntegers.get(i).equals(numberToSearch)){
                System.out.println(" searched num: " + numberToSearch + "Index: " + i);
            }
        }

    }
}
