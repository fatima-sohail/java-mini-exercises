import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give input 1:");
//
        int inputInInt1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give input 2:");
//
        int inputInInt2 = Integer.valueOf(scanner.nextLine());
        int sum = inputInInt1 + inputInInt2;
        double squareRootOfInput = Math.sqrt(sum);
        System.out.println(squareRootOfInput);
    }
}
