package inheritance_task_5_interface_in_a_box_4_parts;

public class CD implements Packable {
    String artist;
    String cdName;
    int publicationYear;
    double cdWeight;

    public CD(String artist, String cdName, int publicationYear){
        this.artist = artist;
        this.cdName = cdName;
        this.publicationYear = publicationYear;
        this.cdWeight = 0.1;
    }


    @Override
    public double weight(){
        return 0.1;
    }

    public String toString(){
        return artist + ": " + cdName + " (" + publicationYear + ")";
    }

}
