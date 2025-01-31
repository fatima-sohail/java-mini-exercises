package hash_map_library_of_type_string_type_object_print_object_sanitize_trim_and_dont_repeat;

//we will standardize the book title before storing it in the hashmap by:
//converting all letters to lowercase(toLowerCase()) and remove any extra space
//at the beginning or at the end(trim()) of the book title.

//we will add, remove and get a book from the hashmap by using its title,
//create above-mentioned methods.
//only enhanced for loop is used in hashmap, cz hashmap lacks index

import java.util.HashMap;

public class Library {
    //create an instance variable of type hashmap
    private HashMap<String, Book> directory;

    //create a constructor and initialize the hashmap
    public Library(){
        this.directory = new HashMap<>();
    }

    //create a sanitize method to sanitize book title
    public static String sanitize(String title) {
        //if string is null, return empty
        if(title == null){
            return "";
        }

        //if it is not empty, first convert the string to lower case and then trim it
        //and return the updated string
        String lowerCase = title.toLowerCase();
        String trimmed = lowerCase.trim();

        return trimmed;
    }

    //create get, add and remove method and use sanitize method in them.
    public Book getBook(String bookTitle){
        //sanitize the title first
        //access the book title in the directory using get()
        //return it
        String sanitizedTitle = sanitize(bookTitle);
        return this.directory.get(sanitizedTitle);
    }


    public void removeBook(String bookTitle){
        String sanitizeTitle = sanitize(bookTitle);

        if(this.directory.containsKey(sanitizeTitle)){
            this.directory.remove(sanitizeTitle);
        }else{
            System.out.println("Book was not found, can't be removed");
        }
    }

    public void addBook(Book bookObj){
        //sanitize the name first
        //if this name already exists in the directory, print "this book already exists"
        //else store in the directory using put()
        String sanitizeTitle = sanitize(bookObj.getName());

        if(this.directory.containsKey(sanitizeTitle)){
            System.out.println("The book is already in the library");
        }else{
            this.directory.put(sanitizeTitle, bookObj);
        }
    }

    //format for the print of the library obj:
    @Override
    public String toString(){
        return directory.toString();
    }
}
