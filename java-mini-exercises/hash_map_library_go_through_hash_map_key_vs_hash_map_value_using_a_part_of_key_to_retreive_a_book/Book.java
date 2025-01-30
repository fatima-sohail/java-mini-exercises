package hash_map_library_go_through_hash_map_key_vs_hash_map_value_using_a_part_of_key_to_retreive_a_book;

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

    public String toString() {
        return "Name: " + this.name + " (" + this.published + ")\n"
                + "Content: " + this.content;
    }
}
