package hash_map_vs_list_library;

import java.util.ArrayList;

public class Book {
    // create instance variables for book
    private String name;
    private String content;
    private int published;

    public Book(String namee, String contentt, int publishedd){
        this.name = namee;
        this.content = contentt;
        this.published = publishedd;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //to use in list
    public static Book get(ArrayList<Book> books, String name){
        for(Book book: books){
            if(book.getName().equals(name)){
                return book;
            }
        }
        return null;
    }

    public String toString() {
        return "Name: " + this.name + " (" + this.published + ")\n"
                + "Content: " + this.content;
    }
}
