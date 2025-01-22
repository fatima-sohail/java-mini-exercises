//In the exercise template there is a ready-made class TelevisionProgram,
//representing a television program. The class has object variables name and
//duration, a constructor, and a few methods.
//
//NickNames file:
//Implement a program that begins by reading television programs from the user. When
//the user inputs an empty string as the name of the program, the program stops reading
//programs.
//
//After this the user is queried for a maximum duration. Once the maximum is given,
//the program proceeds to list all the programs whose duration is smaller or equal to
//the specified maximum duration.
//
//Sample output
//Name: Rick and Morty
//Duration: 25
//Name: Two and a Half Men
//Duration: 30
//Name: Love it or list it
//Duration: 60
//Name: House
//Duration: 60
//
//Program's maximum duration? 30
//Rick and Morty, 25 minutes
//Two and a Half Men, 30 minutes


package oopListTVprogramMaxDuration;

public class TvProgram {
    private String name;
    private int duration;

    public TvProgram(String constrtrName, int constrtrDuration){
        name = constrtrName;
        duration = constrtrDuration;
    }

    public boolean isAwesome(){
        return name.contains("MasterChef");
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return name + ", " + duration + " minutes";
    }
}
