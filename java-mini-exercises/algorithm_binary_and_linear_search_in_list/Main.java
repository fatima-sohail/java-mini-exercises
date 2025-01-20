package algorithm_binary_and_linear_search_in_list;

import java.util.ArrayList;

import static algorithm_binary_and_linear_search_in_list.Searching.linearSearch;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Great Gatsby"));
        books.add(new Book(4, "Harry Potter"));
        books.add(new Book(2, "Moby Dick"));
        books.add(new Book(3, "1984"));


        //perform linear search to find a book by its id
        int idToBeSearched = 2;
        //linear() returns the index of the book if it finds a match
        int linearIndex = linearSearch(books, 2);
        //OR
        int resultLinear = Searching.linearSearch(books, 2);

        if(linearIndex != -1){
            System.out.println("Linear Search: Found book with ID " + idToBeSearched + " at index " + linearIndex);
        }else {
            System.out.println("Unable to find the book with id " + idToBeSearched);
        }

        //always sort before binary search
        //create a sort method in `searching` class and use it
        Searching.sort(books);
        Searching.printList(books);
        //OR
        // Sort books using a custom comparator to compare by book ID
//        Collections.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book searchBook, Book currentBook) {
//                return Integer.compare(searchBook.getId(), currentBook.getId()); // Compare by ID
//
//            }
//        });
//
//        //print the sorted array
//        System.out.println("sorted book list: ");
//        for(Book bookobj: books){
//            System.out.println(bookobj);
//        }

        //binary search
        int idYouWantToSearch = 2;
        int binaryIndex = Searching.binarySearch(books, 2   );
        if(binaryIndex != -1){
            System.out.println("Binary search: Found book with Id: " + idYouWantToSearch + " at index: " + binaryIndex);
        }else {
            System.out.println("Binary search for book with id: " + idYouWantToSearch + " not found");
        }

    }

}
