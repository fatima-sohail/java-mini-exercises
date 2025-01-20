package algorithm_binary_and_linear_search_in_list;

public class Book {
    //variables id `int` and name `string`
    private int id;
    private String name;

    //constructor with above params
    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //get methods for both
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //toString
    @Override
    public String toString() {
        return "(id: " + id + "; name: " + name + ")";
    }
}
