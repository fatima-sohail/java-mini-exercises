package oop_encapsulation_object_joke_Manager;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner;
    JokeManager jokeManager;


    public UserInterface(Scanner scannerr, JokeManager jokeManagerr) {
        scanner = scannerr;
        jokeManager = jokeManagerr;
    }

    public void start() {
        while (true) {
            //display commands
            System.out.println("Commands:");
            System.out.println("1 - Add a joke");
            System.out.println("2 - Draw a joke");
            System.out.println("3 - List jokes");
            System.out.println("X - Stop");
            System.out.print("Enter your choice: ");

            // Get user input, convert input to upperCase for consistency
            String input = scanner.nextLine().toUpperCase();
            // Check if user wants to exit
            if (input.equals("X")) {
                System.out.println("exiting the program");
                break;
            }

            if (input.equals("1")) {
                System.out.println("Write a joke to be added");
                String inputAddJoke = scanner.nextLine();
                jokeManager.addJoke(inputAddJoke);
            }

            if (input.equals("2")) {
                System.out.println(jokeManager.drawJoke());
            }

            if (input.equals("3")) {
                System.out.println("Printing the jokes");
                jokeManager.printJokes();
            }
            // If input doesn't match any command
            if (!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("X")) {
                System.out.println("Invalid command. Please try again.");
            }


        }
    }
}
