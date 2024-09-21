import java.util.Scanner;
//Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
//
//Sample output:
//Last number? 3
//The sum is 6

public class SumOfSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number? ");
        int inputInInt1 = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int currentNumber = 1;
        //for loop
//        for(currentNumber = 1; currentNumber <= inputInInt1; currentNumber++){
//            sum = sum + currentNumber;
//            System.out.print(currentNumber);
//        }
//        System.out.println("sum: " + sum);
        while (currentNumber <= inputInInt1) {
            sum = sum + currentNumber;
            System.out.print(currentNumber + " ");
            currentNumber++;

        }
        System.out.println("Sum: " + sum);
    }
    }

