//The exercise template already has an array containing numbers. Complete the program
//so that it asks the user for a number to search in the array. If the array contains the given number,
//the program tells the index containing the number. If the array doesn't contain the given number, the
//program will advise that the number wasn't found.
//
//Sample output
//Search for? 3
//3 is at index 4.
//
//Sample output
//Search for? 7
//7 is at index 7.
//
//Sample output
//Search for? 22
//22 was not found.

import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        //prepare console to receive the userinput
        Scanner scanner = new Scanner(System.in);
        //create an empty array and add in elements
        int[] numbers = new int[10];
        numbers[0] = 6;
        numbers[1] = 2;
        numbers[2] = 8;
        numbers[3] = 1;
        numbers[4] = 3;
        numbers[5] = 0;
        numbers[6] = 9;
        numbers[7] = 7;

        //ask for userInput
        System.out.println("search for?");
        int searchForANumber = Integer.valueOf(scanner.nextLine());

        //implement search functionality here
        //go through each index to find the number
        //if the number is found
        //print the number with the index
        //if the number is not found, tell the user that it is not in there

        boolean found = false;
        int i = 0;
        while(i< numbers.length){
            if(searchForANumber == numbers[i]){
                System.out.println(searchForANumber + " is at index " + i);
                found = true;
                break;
            }
            i++;
        }
        if(found == false) {
            System.out.println("The number is not found");
        }

    }
}
