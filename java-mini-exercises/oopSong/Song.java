//for basic concept about class and object, watch: https://www.youtube.com/watch?v=IUqKuGNasdM

//create xyz folder that contains multiple files:
//java-mini-exercises->java-mini-exercises->new->package & inside package create multiple files

//Create a class called Song. The song has the instance variables name (string) and
// length in seconds (integer). Both are set in the public Song(String name, int length)
// constructor. Also, add to the object the methods public String name(), which returns
// the name of the song, and public int length(), which returns the length of the song.
//
//The class should work as follows.
//
//Song garden = new Song("In The Garden", 10910);
//System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");
//Sample output
//The song In The Garden has a length of 10910 seconds.

package oopSong;
// it's a blueprint class
public class Song {
    //create variables
    String name;
    int lengthInSeconds;

    //constructor
    public Song(String constrName, int constrLength){
        name = constrName;
        lengthInSeconds = constrLength;
    }

    //add methods that return name and length of the song
    public String name(){
        return name;
    }

    public int length(){
        return lengthInSeconds;
    }
}
