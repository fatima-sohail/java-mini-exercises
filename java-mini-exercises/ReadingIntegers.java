//get the userinput in integer instead of string and print it out

import java.util.Scanner;

public class ReadingIntegers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        String valueAsString = "42";
        System.out.println("Write a value: ");


//        String value = scanner.nextLine();
        int valueAsInt = Integer.valueOf(scanner.nextLine());
        System.out.println("You wrote: " + valueAsInt);





    }
}
