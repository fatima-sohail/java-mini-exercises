import java.util.ArrayList;
import java.util.Scanner;

//The exercise template contains a base that reads numbers from the user and adds them to
// a list. Reading is stopped once the user enters the number -1.
//
//When reading ends, calculate the average of the numbers in it, and then print that value.
//
//Sample output
//72
//2
//8
//11
//-1
//
//Average: 23.25
public class ListAverage {
    public static void main(String[] args) {
        //prepare the terminal to receive user input
        Scanner scanner = new Scanner(System.in);
        //create an empty arrayList
        ArrayList<Integer> listOfIntegers = new ArrayList<>();
        int inputInInt;
        int count = 0;
        int sum = 0;
        double average = 0;
        while (true) {
            //print the question
            System.out.println("Give numbers, -1 exits the program");
            //ask for user input, keep on asking until the user enters -1
            inputInInt = Integer.valueOf(scanner.nextLine());
            if (inputInInt == -1) {
                break;
            }
            listOfIntegers.add(inputInInt);
            sum = sum + inputInInt;
            count++;
        }
        average = 1.0 * sum/count;
        System.out.println(average);

    }
}
