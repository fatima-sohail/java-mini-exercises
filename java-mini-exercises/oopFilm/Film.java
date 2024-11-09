//for basic concept about class and object, watch: https://www.youtube.com/watch?v=IUqKuGNasdM


package oopFilm;

public class Film {
    //variables
    String name;
    int ageRating;

    //constructor
    //Why constructor is created? constructor's paramenters are passed in to the object
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
