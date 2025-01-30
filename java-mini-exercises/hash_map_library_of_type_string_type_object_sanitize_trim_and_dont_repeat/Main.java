package hash_map_library_of_type_string_type_object_sanitize_trim_and_dont_repeat;

public class Main {
    public static void main(String[] args) {
        //create two book objs and one library obj
        //add, remove and get books from the library using these methods
        Book harryPotter = new Book("Harry Potter", "...", 1992);
        Book snowWhite = new Book("Snow White", "...", 1970);

        Library libraryObj = new Library();
        libraryObj.addBook(harryPotter);
        libraryObj.addBook(snowWhite);
        //print the hashmap
        System.out.println(libraryObj);
        System.out.println();

        //access the book and print it out, use small letters and also leave a space at the end
        libraryObj.getBook("harry potter ");
        System.out.println(libraryObj.getBook("harry potter"));
        System.out.println();

        //try to access a book that doesnt exist
        libraryObj.getBook("atomic habits");
        System.out.println(libraryObj.getBook("atomic habits"));
        System.out.println();

        //remove the book and print out the hashmap
        libraryObj.removeBook("harry potter");
        System.out.println("updated hashmap: " + libraryObj);

    }
}
