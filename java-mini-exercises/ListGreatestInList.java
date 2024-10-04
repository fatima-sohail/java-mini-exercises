import java.util.ArrayList;
import java.util.Scanner;

//The exercise template contains a base that reads numbers from the user and adds them to
// a list. Reading is stopped once the user enters the number -1.
//
//Continue developing the program so that it finds the greatest number in the list and
// prints its value after reading all the numbers. The programming should work in the
// following manner.
//
//Sample output
//72
//2
//8
//93
//11
//-1
//
//The greatest number: 93
public class ListGreatestInList {
    public static void main(String[] args) {
        //prepare the terminal to receive user input
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
        //Ensure there are numbers in the list before finding greatest number
        if(!listOfIntegers.isEmpty()){
            //initialize max with the first number in the list
            int max = listOfIntegers.get(0);
            //loop through the list to find the greatest number
            for(int i = 0; i<listOfIntegers.size(); i++){
                int currentNumber = listOfIntegers.get(i);
                if(currentNumber > max){
                    max = currentNumber;
                }
            } //outside for loop

            System.out.println("The greatest number is: " + max);
        }else{
            System.out.println("No numbers are entered");
        }

    }
}
