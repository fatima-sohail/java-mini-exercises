import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            //ask user for input
            System.out.println("Give a number: OR press 0 for exit");
            int inputInInt = Integer.valueOf(scanner.nextLine());

            //if the number is negative, print 'Unsuitable number' and ask user
            //for another number
            if(inputInInt<0){
                System.out.println("Unsuitable number, please enter amother number");
                inputInInt = Integer.valueOf(scanner.nextLine());
            }
            //if the number is zero, program exits
            if(inputInInt == 0){
                System.out.println("Program terminated.");
                break;
            }
            //if the number is positive, print number to the power of two
            if(inputInInt > 0){
                int square = inputInInt * inputInInt;
                System.out.println("input to the power of 2 is: " + square);
            }
        }
        //avoid input leakage
        scanner.close();
    }
}
