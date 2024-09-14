import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want in average? ");
        int n = Integer.valueOf(scanner.nextLine());
        // int inputInt1 = Integer.valueOf(scanner.nextLine());
//        int inputInt2 = Integer.valueOf(scanner.nextLine());
//        int inputInt3 = Integer.valueOf(scanner.nextLine());
//        int sum = inputInt1 + inputInt2 + inputInt3;
//        double avg = 1.0 * sum/3;
//        System.out.println(avg);
         int count = 0;
         int sum = 0;
         while(count < n){
             int inputInt = Integer.valueOf(scanner.nextLine());
            sum = sum + inputInt;
            count++;
         }
        double avg = 1.0 * sum/n;
        System.out.println(avg);

    }
}
