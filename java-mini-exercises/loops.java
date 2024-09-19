import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ones = 0;
        while(true){
            System.out.println("Insert a number(0 exits the program):");
            int inputInInt = Integer.valueOf(scanner.nextLine());

            //if user inputs 0, terminate the program
            if(inputInInt == 0){
                System.out.println("Program terminated.");
                break;
            }
            //if user inputs ones, increase the amount of ones
            if(inputInInt == 1){
                ones = ones + 1;
            }
        }
        //print out total number of ones after the program is terminated
        System.out.println("The total of ones: " + ones);
    }
}
