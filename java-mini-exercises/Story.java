import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.\n " +
                "What is the main character called?");
       String first = scanner.nextLine();


        System.out.println("What is their job?");
        String second = scanner.nextLine();


        System.out.println("Here is the story:\n" +
        "Once upon a time there was " + first + ", who was a " + second + ".\n" +
                "On the way to work, " + first + " reflected on life.\n" +
                "Perhaps " + first + " will not be a " + second + " forever.");
    }
}
