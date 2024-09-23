import java.util.Scanner;

//Create the following method in the exercise template: public static
// void printFromNumberToOne(int number). It should print the numbers from
// the number passed as a parameter down to one.
public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times? ");
        int inputInInt1 = Integer.valueOf(scanner.nextLine());
        //call the method
        printFromNumberToOne(inputInInt1);
    }

    //create a function, pass a number
    //go through each number in descending order from the given number till you reach 1.
    //
    //in the loop, initial counter will be set to the given number that is
    //passed to print method()
    //as long as i is greater or equal to 1, continue the interation
    // and print it
    public static void printFromNumberToOne(int number) {
        int currentNumber = number;
        while(currentNumber >= 1){
            System.out.println(currentNumber);
            currentNumber--;
        }
    }
}
