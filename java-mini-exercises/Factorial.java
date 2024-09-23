import java.util.Scanner;
//Implement a program which calculates the factorial of a number given by the user.
//
//Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n. For example
//the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24. Additionally, it has
// been specified that the factorial of 0 is 1, so 0! = 1.
//
//Sample output
//Give a number: 3
//Factorial: 6
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
//            System.out.print(currentNumber + " ");
            currentNumber++;
        }
        System.out.println("product: " + product);
    }
}

