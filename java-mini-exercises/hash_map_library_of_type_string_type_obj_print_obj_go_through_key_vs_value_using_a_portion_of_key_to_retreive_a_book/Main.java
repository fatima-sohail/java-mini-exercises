package hash_map_library_of_type_string_type_obj_print_obj_go_through_key_vs_value_using_a_portion_of_key_to_retreive_a_book;

public class Main {
    public static void main(String[] args) {
        //create a lib obj
        //create book obj to use it in library obj
        Book harryPotter = new Book("Harry Potter", "...", 1997);
        Book harryPotter2 = new Book("Harry Potter and his team", "...", 1998);
        Book harryPotter3 = new Book("Harry Potter and philosophers stone", "...", 1999);
        Book persuasion = new Book("Persuasion", "...", 2000);

        Library bookLibrary = new Library();
        bookLibrary.addBook(harryPotter);
        bookLibrary.addBook(harryPotter2);
        bookLibrary.addBook(harryPotter3);
        bookLibrary.addBook(persuasion);

        System.out.println(bookLibrary);
        System.out.println();

        //get book by its part title first by using hashmap's `key` and then by using `value`
        bookLibrary.getBookByPart("harry");
        System.out.println(bookLibrary.getBookByPart("harry"));

        System.out.println();

        bookLibrary.getBookByPart("harry");
        System.out.println(bookLibrary.getBookByPart("harry"));

        System.out.println();

        //remove a book that doesn't exist
        bookLibrary.removeBook("stone");
        System.out.println(bookLibrary);

        System.out.println();

        //remove a book that exists
        bookLibrary.removeBook("Harry Potter and philosophers stone");
        System.out.println(bookLibrary);


    }
}
