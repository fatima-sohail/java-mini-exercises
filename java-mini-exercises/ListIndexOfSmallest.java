import java.util.ArrayList;
import java.util.Scanner;

//Write a program that reads numbers from the user. When number 9999 is entered, the reading
// process stops. After this the program will print the smallest number in the list, and also
// the indices where that number is found. Notice: the smallest number can appear multiple
// times in the list.
//
//Sample output
//72
//2
//8
//8
//11
//9999
//
//Smallest number: 2
//Found at index: 1
public class ListIndexOfSmallest {
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
            //ask for user input, keep on asking until the user enters 999
            inputInInt = Integer.valueOf(scanner.nextLine());
            if (inputInInt == 999) {
                break;
            }
            listOfIntegers.add(inputInInt);
            count++;
        }
        //find the smallest number
        if (!listOfIntegers.isEmpty()) {
            //initialize the smallest number with the first number in the list
            int smallest = listOfIntegers.get(0);
            for (int i = 0; i < listOfIntegers.size(); i++) {

                int currentNumber = listOfIntegers.get(i);
                if (currentNumber < smallest) {
                    smallest = currentNumber;
                }
            }//for loop ends
            System.out.println("smallest number: " + smallest);

            //find the index of the smallest number
            for (int i = 0; i < listOfIntegers.size(); i++) {

                if(listOfIntegers.get(i).equals(smallest)){
                    System.out.println("smallest number found at index: " + i);
                }
            }//for loop ends

        }//if statement ends
    }//main method ends
}
