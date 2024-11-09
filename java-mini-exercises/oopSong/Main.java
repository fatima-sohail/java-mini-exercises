package oopSong;
//create an object using the blueprint class
public class Main {
    public static void main(String[] args) {
        Song garden = new Song("In the Garden", 10910);
        //print: The song In The Garden has a length of 10910 seconds.
        System.out.println("The song " + garden.name + " has a length of " + garden.lengthInSeconds + " seconds.");
    }
}
