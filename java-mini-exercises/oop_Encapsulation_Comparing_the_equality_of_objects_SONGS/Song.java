//n the exercise base there is a class called Song that can be used to create
//new objects that represent songs. Add to that class the equals method so that the
//similarity of songs can be examined.
//
//Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
//Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
//
//if (jackSparrow.equals(anotherSparrow)) {
//    System.out.println("Songs are equal.");
//}
//
//if (jackSparrow.equals("Another object")) {
//    System.out.println("Strange things are afoot.");
//}
//Sample output: Songs are equal
package oop_Encapsulation_Comparing_the_equality_of_objects_SONGS;

public class Song {
    private String songName;
    private String album;
    private int releaseYear;

    public Song(String name, String albumm, int releaseYearr){
        this.songName = name;
        this.album = albumm;
        this.releaseYear = releaseYearr;
    }

    public boolean equals(Song obj2){
        //if variables are located in the same position, they are equal
        if(this == obj2){
            return true;
        }

        //if the obj2 type is not same as current object type, they are not equal
        if(!(obj2 instanceof Song)){
            return false;
        }

        //convert the obj2 type to current obj type-Song
        Song obj2song = (Song) obj2;

        //if the values of the object variables are equal, the objects are equal
        if(this.songName.equals(obj2song.songName) && this.album.equals(obj2song.album)
        && this.releaseYear == (obj2song.releaseYear)){

            return true;
        } else {
            return false;
        }
    }

}
