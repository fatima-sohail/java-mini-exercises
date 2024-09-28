package library;

public class Book {
    public String title; //ctrl+ D to duplicate, ctrl + z to undo
    public String author;
    public Integer isbn;

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}
