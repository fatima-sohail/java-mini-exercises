package oopListBookSelectiveOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        System.out.println("Enter each book's title, pages and publication date below.\n" +
                "Keeping any of the boxes empty will terminate the program");


        while(true){
            System.out.print("Title: ");
            String inputTitle = scanner.nextLine();
            if(inputTitle.isEmpty()) {
                break;
            }
//The pages and publication year are read as strings first to allow for the empty check before
//converting them to integers cz .isEmpty() is used with String values.
            System.out.print("Total pages: ");
            String inputPages = scanner.nextLine();
            if(inputPages.isEmpty()){
                break;
            }
            int pagesss = Integer.parseInt(inputPages);

            System.out.print("Publication date: ");
            String inputPublicationDate = scanner.nextLine();
            if(inputPublicationDate.isEmpty()){
                break;
            }
            int publicationDateee = Integer.parseInt(inputPublicationDate);
//create an object and add it to the above list
            bookList.add(new Book(inputTitle, pagesss, publicationDateee));

        }
        System.out.println("Type 'title' to print the title or 'everything' to get the books details to be printed");
//print all if the user enters "everything" or "title" to print the title
        String printChoice = scanner.nextLine();
        for(Book obj: bookList){
            if(printChoice.equals("everything")){
                System.out.println(obj);
            } else if (printChoice.equals("title")){
                System.out.println(obj.getTitle());
            }else{
                System.out.println("Invalid entry, try typing title or everything" +
                        "");
            }
        }
    }
}
