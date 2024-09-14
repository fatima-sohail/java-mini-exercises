import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give three numbers: ");
        int inputInt1 = Integer.valueOf(scanner.nextLine());
        int inputInt2 = Integer.valueOf(scanner.nextLine());
        int inputInt3 = Integer.valueOf(scanner.nextLine());
        int sum = inputInt1 + inputInt2 + inputInt3;
        double avg = 1.0 * sum/3;
        System.out.println(avg);

    }
}
