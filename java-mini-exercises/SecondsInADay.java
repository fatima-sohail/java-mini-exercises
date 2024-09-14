import java.util.Scanner;
//implement a program that asks the user for the number of days.
// After that, the program prints the number of seconds in the given number of days.
public class SecondsInADay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int inputInInt = Integer.valueOf(scanner.nextLine());

        int numOfSecondsInADay = 24 * 60 * 60;
        System.out.println(inputInInt * numOfSecondsInADay);
    }
}
