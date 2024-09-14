import java.util.Scanner;
//Write a program that prompts the user for their age and tells
// them whether or not they are an adult (18 years old or older).

public class Adulthood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you? ");
        int inputToInt = Integer.valueOf(scanner.nextLine());

        if(inputToInt >= 18){
            System.out.println("You are an adult");
        }else{
            System.out.println("You are not an adult");
        }

    }
}
