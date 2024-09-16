import java.util.Scanner;
//Write a program that prompts the user for two strings. If the strings are
// the same, then the program prints "Same". Otherwise, it prints "Different".
public class Same {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String inputInString1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String inputInString2 = scanner.nextLine();

        if(inputInString1.equals(inputInString2)){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
    }
}
