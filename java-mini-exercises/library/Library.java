package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> books = new ArrayList<>();
    //add a book
    //view all books
    public void addBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a book name: ");
        String newBookName = scanner.nextLine();

        System.out.println("Author name: ");
        String newAuthorName = scanner.nextLine();

        System.out.println("Enter ISBN: ");
        Integer newIsbn = scanner.nextInt();

        Book bookToAdd = new Book();
        bookToAdd.title = newBookName;
        bookToAdd.author = newAuthorName;
        bookToAdd.isbn = newIsbn;

        books.add(bookToAdd);
        System.out.println("Book added\n");

    }

     public void printAllBooks(){
        for(Book book: books){
            System.out.println(book.toString());
        }
         System.out.println();
     }


}
