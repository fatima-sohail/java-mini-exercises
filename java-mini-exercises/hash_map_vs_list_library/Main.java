package hash_map_vs_list_library;
//add 10 thousand books to the list and hashmap to compare which data structure
//finds the book in search faster
//hashmap is faster and is recommended for longer lists if you know the key already

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> booklist = new ArrayList<>();
        HashMap<String, Book> bookMap = new HashMap<>();

        //Start timing the addition of books to the list and hashmap
        long start = System.nanoTime();

        //add 10,000 books to this list including `harry potter`
        //create a Book obj for `harry potter`
        //add it to the list and hashmap
        //for the rest of the books, create a for loop and add them to the list and hashmap

        Book harryPotter = new Book("Harry Potter", "...", 1997);
        booklist.add(harryPotter);
        bookMap.put("Harry Potter", harryPotter);

        for(int i = 0; i < 10000; i++){
            //create a random book
            String bookName = "Book" + i;
            String bookContent = "content of book" + i;
            int bookYear = 1800 + new Random().nextInt(200); //random year btw 1800 & 2000
            Book book = new Book(bookName, bookContent, bookYear);
            booklist.add(book);
            bookMap.put(bookName, book);
        }

        //end timing the addition process
        long end = System.nanoTime();
        //find out the millisec it took to add the above books
        double durationInMilliSeconds = 1.0 * (end - start)/ 1000000;
        System.out.println("Time took to add 10,000 books in list and hashmap in milli seconds: " + durationInMilliSeconds);

        //in the list, search for `harry potter`, and millisec it will take to find it
        long startSearchList = System.nanoTime();
        System.out.println(Book.get(booklist, "Harry Potter"));

        System.out.println();
        System.out.println(Book.get(booklist, "Persuation")); //null cz no book like this exists
        long endSearchList = System.nanoTime();
        double searchDuration = 1.0 * (endSearchList - startSearchList) / 1000000;
        System.out.println("Time took to search Harry Potter in the list in milli seconds: " + searchDuration);

        //search harry potter in the hashmap, and how many miliseconds will it take
        long startSearchMap = System.nanoTime();
        //search in the hashmap using get()
        System.out.println(bookMap.get("Harry Potter"));
        long endSearchMap = System.nanoTime();
        double searchDurationMap = 1.0 * (endSearchMap - startSearchMap) / 1000000;
        System.out.println("Time took to search Harry Potter in the hashmap in milli sec: " + searchDurationMap);

    }
}
