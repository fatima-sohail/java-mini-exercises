//convert a stringInput  into boolean
//boolean true or false

import java.util.Scanner;

public class readingBoolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something");
        String userInputFirst = scanner.nextLine();

        System.out.print("True or false?");
        boolean booleanAnswer = Boolean.valueOf(scanner.nextLine());
        System.out.println(booleanAnswer);




    }
}
