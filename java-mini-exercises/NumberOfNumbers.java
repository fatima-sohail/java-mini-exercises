import java.util.Scanner;

public class NumberOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalNumOfInputs = 0;
        while(true){
            //ask user for input
            System.out.println("Give a number: OR press 0 for exit");
            int inputInInt = Integer.valueOf(scanner.nextLine());
            
            //terminate the program when user enters 0
            if(inputInInt == 0){
                System.out.println("Program terminated");
                break;
            }
            if(inputInInt > 0){
                totalNumOfInputs = totalNumOfInputs + 1;
                
            }
            
        }
        //print out the total number of inputted values
        System.out.println("Number of inputs: " + totalNumOfInputs);
    }
}
