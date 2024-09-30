import java.util.Scanner;

public class FindingErrorInTheCode {
    public static void main(String[] args) {
        //letting user write input
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double average = 0.0;

        while (true) {
            //asking for userinput
            System.out.println("Provide a value, a negative value ends the program");
            int inputInInt = scanner.nextInt();
            //if value is less than zero, exit the program
            if (inputInInt < 0) {
                break;
            }

            //add sum to the value
            //increase the counter by 1

            sum = sum + inputInInt;
            count = count + 1;
        }

        if (sum == 0) {
            System.out.println("The average of the values could not be calculated.");
        } else {
            average =  1.0 * sum / count;
            System.out.println("Average of values: " + average);
        }
    }
}
