import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number? ");
        int inputInInt1 = Integer.valueOf(scanner.nextLine());
        //start with 1, go on till the given num, multiply each as you go on.
        //and then print it
        //while loop
        //currentNumber<=input1
        //product = product * currentNumber
        //currentNum++
        int product= 1;
        int currentNumber = 1;
        while(currentNumber <= inputInInt1){
            product = product * currentNumber;
            System.out.print(currentNumber + " ");
            currentNumber++;
        }
        System.out.println("product: " + product);
    }
}
