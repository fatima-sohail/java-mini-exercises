import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;



        while (true) {
            //ask user for input
            System.out.println("Give a number: OR press 0 for exit");
            int inputInInt = Integer.valueOf(scanner.nextLine());
            //input 0, exit the program
            if(inputInInt ==0){
                System.out.println("Program terminated.");
                break;
            }
            //if inputs are positive numbers, print the sum of them
            if(inputInInt > 0){
                count = count + 1;
                sum = sum + inputInInt;
            }

        }
        System.out.println("total number of inputs: " + count);
        System.out.println("sum of inputs: " + sum);

    }
}
