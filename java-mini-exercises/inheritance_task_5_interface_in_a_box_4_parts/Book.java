package inheritance_task_5_interface_in_a_box_4_parts;

public class Book implements Packable {
    private String author;
    private String bookName;
    private double bookWeight;

    public Book(String author, String bookName, double bookWeight){
        this.author = author;
        this.bookName = bookName;
        this.bookWeight = bookWeight;
    }

    public double weight(){
        return this.bookWeight;
    }

    public String toString(){
        return author + ": " + bookName;
    }


}
