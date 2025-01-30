package hash_map_library_go_through_hash_map_key_vs_hash_map_value_using_a_part_of_key_to_retreive_a_book;

//TASK:
// search the part title with the help of `key` in hashmap vs with the help
//of `value` in hashmap:

//create a book class first, build library class using book class

//public ArrayList<Book> getBookByPart(String titlePart){}:
//if you forget the key(book title/name) and only remember a part of it, you won't be able to
//retrieve the book in hashmap, so how will you retrieve the book but just remembering
//a part of the key(book title)? using a method that returns an arrayList and storing
//the output in that arraylist,
//e.g.
//keys are catastrophe and category, if we search `cat`
//both will show up, that's cz both are stored in the arrayList

//if you want to retrieve a book using the value instead of the key:
//everything will remain same as how you would retrieve using a part of the key except
//key will be replaced by `value`, since value is a book object, for each loop will
//be adjusted according to that:
//public ArrayList<Book> getBookByPart(String titlePart){}


import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    //create a hashmap instance variable that stores books using key value pairs
    //and instantiate it
    HashMap<String, Book> directory;

    public Library(){
        directory = new HashMap<>();
    }

    public static String sanitize(String title){
        if(title == null){
            return " ";
        }

        String lowerCase = title.toLowerCase();
        String trimmed = lowerCase.trim();

        return trimmed;
    }

    public Book getBook(String bookTitle){
        String sanitizeTitle = sanitize(bookTitle);
        return this.directory.get(sanitizeTitle);
    }

    public void removeBook(String bookTitle){
        String sanitizTitle = sanitize(bookTitle);

        if(directory.containsKey(sanitizTitle)){
            this.directory.remove(sanitizTitle);
        }else{
            System.out.println("This book does not exist, can't be removed.");
        }
    }

    public void addBook(Book obj){
        //sanitize the name first
        //if this name already exists in the directory, print "this book already exists"
        //else store in the directory using put()
        String sanitizeTitle = sanitize(obj.getName());

        if(directory.containsKey(sanitizeTitle)){
            System.out.println("This book already exists in the directory");
        }else{
            this.directory.put(sanitizeTitle, obj);
        }
    }

    //if we only know a part of the title but want to retrieve it with that info:
    public ArrayList<Book> getBookByPart(String titlePart){
        //sanitize the title part
        //create an empty arrayList to store the matching books
        //go through the hashmap's keys in the directory using for each loop and setKey()
            //if the key does not contain the given string, we skip that book and
            //continue to the next book
            //
            //if the key contains the given string
            //we retrieve it
            //and add it to the book list to be returned

        String sanitizeTitlePart = sanitize(titlePart);
        ArrayList<Book> bookList = new ArrayList<>();

        for(String bookTitle: this.directory.keySet()){
            if(!bookTitle.contains(titlePart)){
                continue;
            }

            bookList.add(this.directory.get(bookTitle));
        }

        return bookList;
    }

    public ArrayList<Book> getBookByPart2(String titlePart){
        //sanitize the part title
        //create an empty arrayList to store the matching books
        //since we are retreiving the book using `value` in directory, value is book obj
        //go through the value(obj) one by one in the directory with .values()
            //see if the value's name contain the title part
            //if it doesn't, we skip that book and go to the next one
            //if we find the matching book, we add that book to the book list
        //and return the list
        String sanitizePartTitle = sanitize(titlePart);
        ArrayList<Book> bookList = new ArrayList<>();

        for(Book obj: directory.values()){
            if(!obj.getName().contains(sanitizePartTitle)){
                continue;
            }
            bookList.add(obj);
        }

        return bookList;

    }

    @Override
    public String toString() {
        return directory.toString();
    }
}
