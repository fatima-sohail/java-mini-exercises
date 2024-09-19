import java.util.Scanner;

//create a calculator that does basic operations.
//ask the user which operation do they want, output should be accordingly.
//keep running the program till the user enters 'quit'. Then terminate the program.
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //define the string input
        String inputInString = "";

        //store results in variables
        int sum = 0;
        int subtraction = 0;
        int multiplication;
        int division;

        while(!inputInString.equals("quit")){
            System.out.println("Do you want addition, subtraction, multiplication" +
                    " or division?To terminate the program, enter 'quit'. ");

             inputInString = (scanner.nextLine());
             //if the input is 'quit', break the loop
            if (inputInString.equals("quit")) {
                System.out.println("Program terminated.");
                break;
            }
            //if the input is any of the above operations, based on the input, continue the operation.
            //ask the user for 2 int inputs.
            System.out.println("Give input1");
            int inputInInt1 = Integer.valueOf(scanner.nextLine());

            System.out.println("Give input2");
            int inputInInt2 = Integer.valueOf(scanner.nextLine());

            if(inputInString.equals("addition")){
                sum = inputInInt1 + inputInInt2;
                System.out.println("sum: " + sum);
            }else if(inputInString.equals("subtraction")){
                subtraction = inputInInt1 - inputInInt2;
                System.out.println("subtraction result: " + subtraction);
            }else if(inputInString.equals("multiplication")){
                multiplication = inputInInt1 * inputInInt2;
                System.out.println("product: " + multiplication);
            }else if(inputInString.equals("division")){

                if(inputInInt2 != 0){
                    division = inputInInt1/inputInInt2;
                    System.out.println("division result: " + division);
                }else{
                    System.out.println("Error: division by 0 is not allowed, it leads to undefined result.");
                }

            }else{
                System.out.println("Invalid operation, please enter a valid operation.");
            }

        }

        //close the scanner to prevent input leaks
        scanner.close();

    }
}
