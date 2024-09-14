//convert a stringInput  into boolean
//boolean true or false

//Write a program that asks the user for a boolean value.
// The program should then print the value provided by the user.
//Sample output 1:
// Write something:
//santa does not exist
//True or false? false

//Sample output 2:
//Write something:
//TRUE
//True or false? true

import java.util.Scanner;

public class ReadingAllPrimitiveTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string");
        String inputInString = scanner.nextLine();

        System.out.println("Give a boolean");
        boolean inputInBoolean = Boolean.valueOf(scanner.nextLine());

        System.out.println("Give an Integer");
//        System.out.println(booleanAnswer);
        int inputInInt = Integer.valueOf(scanner.nextLine());

        System.out.println("Give a double");
        double inputInDouble = Double.valueOf(scanner.nextLine());

        System.out.println("You gave the string: " + inputInString);
        System.out.println("You gave the boolean: " + inputInBoolean);
        System.out.println("You gave the integer: " + inputInInt);
        System.out.println("You gave the double: " + inputInDouble);
    }

}
