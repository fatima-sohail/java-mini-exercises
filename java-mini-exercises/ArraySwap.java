import java.util.Scanner;

//The exercise template already contains a program, that creates an array and prints the values
// of the array twice. Modify the program to do following: After the first printing, the program
// should ask for two indices from the user. The values in these two indices should be swapped,
// and in the end the values of the array should be printed once again.
//
//Sample output
//1
//3
//5
//7
//9
//
//Give two indices to swap:
//2
//4
//
//1
//3
//9
//7
//5
public class ArraySwap {
    public static void main(String[] args) {
        //create an empty array
        int[] numbers = new int[5];
        //add elements in the array
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        //print the array for the first time
        int i = 0;
        while(i < numbers.length){
            System.out.println(numbers[i]);
            i++;
        }
        //add an empty line for gap
        System.out.println("");


        //ask for 2 indices from the user for swaping
        //prepare the terminal to receive user input
        Scanner scanner = new Scanner(System.in);
        //print the question
        System.out.println("Pick two indices to swap");
        //here goes first and second userinput.
        int firstUserInputIndex = Integer.valueOf(scanner.nextLine());
        int secondUserInputIndex = Integer.valueOf(scanner.nextLine());

        //swap them
        //store one element in a temperory variable
        int temporary = numbers[firstUserInputIndex];
        numbers[firstUserInputIndex] = numbers[secondUserInputIndex];
        numbers[secondUserInputIndex] = temporary;

        //add an empty line for gap
        System.out.println("");

        //print the array for the second time, now with swapped values
         i = 0;
         while(i< numbers.length){
             System.out.println(numbers[i]);
             i++;
         }
    }
}
