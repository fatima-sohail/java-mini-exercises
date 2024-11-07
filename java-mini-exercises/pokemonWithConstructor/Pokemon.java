package pokemonWithConstructor;
//blueprint for the pokemon objects
public class Pokemon {
    //blueprint class contains variables and methods
    //these are used to create objects of pokemon class

    String name;
    int level;

    //if you want preset value for your object, constructor is your friend
    //constructor's name should be same as class name
    //constructor's can be with parameters or without parameters
    Pokemon(){
        level = 2;
    }

    //if you want user to give name and level, how do you do that?
    Pokemon (String pName, int pLevel){
        //variable names are same as class variables
        name = pName;
        level = pLevel;
    }

    public void attack() {
        System.out.println(name + " attack!");
    }
}
