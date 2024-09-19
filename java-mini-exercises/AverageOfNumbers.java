import java.util.Scanner;
//user can input as many numbers as they want, hit 0 to exit the program
//calculate the average of all the inputs and print it
public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double average = 0.0;
        while(true){
            System.out.println("Give a number: OR press 0 for exit");
            int inputInInt = Integer.valueOf(scanner.nextLine());

            if(inputInInt == 0){
                break;
            }
            //if input is positive or negative, calculate the average
            if(inputInInt != 0){
                sum = sum + inputInInt;
                count = count + 1;
                average = 1.0 * sum/count;
            }
            
            //if you want to calculate average of only positive numbers:
//            if(inputInInt > 0){
//                sum = sum + inputInInt;
//                count = count + 1;
//                average = 1.0 * sum/count;
//            }
//            if(inputInInt < 0){
//                continue;
//            }
        }
        System.out.println("Average of inputs is: " + average);
    }
}

