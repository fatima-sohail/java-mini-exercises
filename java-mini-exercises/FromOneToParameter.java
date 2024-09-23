import java.util.Scanner;
//Create the following method in the exercise template: public static void
// printUntilNumber(int number). It should print the numbers from one to the
// number passed as a parameter. Two examples of the method's usage are given
// below.
//
//public static void main(String[] args) {
//    printUntilNumber(5);
//}
//Sample output
//1
//2
//3
//4
//5
public class FromOneToParameter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times? ");
        int inputInInt1 = Integer.valueOf(scanner.nextLine());

        printUntilNumber(inputInInt1);
    }

    public static void printUntilNumber(int number) {
        int currentNumber = 1;
        while(currentNumber <= number){
            System.out.print(currentNumber + " ");
            currentNumber++;
        }
    }
}
