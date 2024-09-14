import java.util.Scanner;
//exercise 1: Write a program that asks the user for two numbers.
// After this, the program prints the sum of the numbers given by the user.

//Exercise 2: Create a program that can be used to add two integers together.
// In the beginning, the user is asked to give two integers that are to be summed.
// The program then prints the formula that describes the addition of the numbers.
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 2 numbers: ");
        int inputInt1 = Integer.valueOf(scanner.nextLine());
        int inputInt2 = Integer.valueOf(scanner.nextLine());

        int sum = inputInt1 + inputInt2;
        System.out.println(sum);
//        System.out.println(inputInt1 + " + " + inputInt2 + " = " + sum);

    }
}
