import java.util.Scanner;
//Implement a program which calculates the sum of a closed interval,
// and prints it. Expect the user to write the smaller number first
// and then the larger number.
public class SumOfTheSequenceTheSequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first number? ");
        int inputInInt1 = Integer.valueOf(scanner.nextLine());

        System.out.println("last number? ");
        int inputInInt2 = Integer.valueOf(scanner.nextLine());
        int sum = 0;


        while(inputInInt1<=inputInInt2){
            sum = sum + inputInInt1;
            System.out.print(inputInInt1 + " ");
            inputInInt1++;

        }
        System.out.println("sum: " + sum);
    }
}
