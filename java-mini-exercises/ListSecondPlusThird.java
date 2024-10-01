
//In the exercise template there is a program that reads integers from the user and
// adds them to a list. This ends when the user enters 0. The program then prints the
// first value on the list.
//
//Modify the program so that instead of the first value, the program prints the sum
// of the second and third numbers. The program is allowed to malfunction if there
// are fewer than three entries on the list, so you don't need to prepare for such
// an event at all.
//
//Sample output
//1
//3
//5
//7
//0

import java.util.ArrayList;
import java.util.Scanner;

//8
public class ListSecondPlusThird {
    public static void main(String[] args) {
        //make the terminal receive user inputs
        //create an empty arrayList to store the user inputs
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listOfIntegers = new ArrayList<>();
        //loop through each input and add it to the arrayList

        int count = 0;

        while(true){
            //ask for user input
            System.out.println("Provide a value, 0 ends the program");
            int inputInInt = scanner.nextInt();
            if(inputInInt <= 0){
                break;
            }
            //add input to the arrayList
            listOfIntegers.add(inputInInt);
            count++;
        }

        //add second and third element and print their sum
        int sum = listOfIntegers.get(1) + listOfIntegers.get(2);
        System.out.println(sum);



    }



}
