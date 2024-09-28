package library;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to 516 Library");
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option");


        Integer option;
        do {
            System.out.println("Select an option");
            displayOptions();
            option = scanner.nextInt();
            performActionMethod(option, library);

        } while (option != -1);


    }

    public static void displayOptions() {
        System.out.println("[1] Add a new book");
        System.out.println("[2] Display all books");
    }

    public static void performActionMethod(int option, Library library) {
        if(option == 1){
            library.addBook();
        }else if(option == 2){
            library.printAllBooks();
        }else if(option != -1){
            System.out.println("Invalid option selected");
        }
    }
}
