import java.util.Scanner;
//Write a program that prompts the user for two integers and prints
// the larger of the two. If the numbers are the same, then the program
// informs us about this as well.

public class LargerThanOrEqualTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int inputToInt1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        int inputToInt2 = Integer.valueOf(scanner.nextLine());

        if(inputToInt1 > inputToInt2){
            System.out.println("Greater number is: " + inputToInt1);
        }else if(inputToInt1 < inputToInt2){
            System.out.println("Greater number is: " + inputToInt2);
        }else if(inputToInt1 == inputToInt2){
            System.out.println("The numbers are equal!");
        }
    }
}
