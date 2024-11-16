//for basic concept about class, object & constructor, watch: https://www.youtube.com/watch?v=IUqKuGNasdM

//create xyz folder that contains multiple files:
//java-mini-exercises->java-mini-exercises->new->package & inside package create multiple files

//Create a film class with the instance variables name (String) and ageRating (int). Write
//the constructor public Film(String filmName, int filmAgeRating) for the class, and also
//the methods public String name() and public int ageRating(). The first of these returns
//the film title and the second returns its ageRating.
//
//Below is an example use case of the class.
//
//Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);
//
//Scanner reader = new Scanner(System.in);
//
//System.out.println("How old are you?");
//int age = Integer.valueOf(reader.nextLine());
//
//System.out.println();
//if (age >= chipmunks.ageRating()) {
//    System.out.println("You may watch the film " + chipmunks.name());
//} else {
//    System.out.println("You may not watch the film " + chipmunks.name());
//}
//Sample output
//How old are you?
//7
//
//You may watch the film Alvin and the Chipmunks: The Squeakquel

package oopFilm;
//blueprint class to create objects
public class Film {
    //variables
    String name;
    int ageRating;

    //constructor
    //Why constructor is created? constructor's parameters are passed in to the object
    //as arguments, since object can't directly use blueprint class's variables as arguments.
    public Film(String filmName, int filmAgeRating){
        name = filmName;
        ageRating = filmAgeRating;
    }

    public String name(){
        return name;
    }

    public int ageRating(){
        return ageRating;
    }
}
