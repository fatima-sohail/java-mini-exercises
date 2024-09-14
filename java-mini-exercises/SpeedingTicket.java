import java.util.Scanner;
//Write a program that asks the user for an integer and
// prints the string "Speeding ticket!" if the input is greater than 120.

//Write a program that prompts the user for an integer and
// prints the string "Orwell" if the number is exactly 1984.


public class SpeedingTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Give speed: ");
//        int inputInt = Integer.valueOf(scanner.nextLine());
//
//        if(inputInt > 120){
//            System.out.println("Speeding ticket!");
//        }
        System.out.println("Give a number: ");
        int inputInt = Integer.valueOf(scanner.nextLine());

            if(inputInt == 1984){
            System.out.println("Orwell");
       }
    }
}
