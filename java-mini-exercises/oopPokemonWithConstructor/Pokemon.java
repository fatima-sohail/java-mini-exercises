//for basic concept about class, object, constructor watch: https://www.youtube.com/watch?v=IUqKuGNasdM

//to create xyz folder that contains multiple files:
//java-mini-exercises->java-mini-exercises->new->package & inside package create multiple files

//create a class called Pokemon, instantiate variables: name and level, create first constructor
//and give it level = 2, create second constructor and pass arguments: name and level and create
//variables, create a method attack()that prints "attack!" when called
//create objects in another folder and use this class!


package oopPokemonWithConstructor;
//blueprint for the pokemon objects
public class Pokemon {
    //blueprint class contains variables and methods
    //these are used to create objects of pokemon class

    String name;
    int level;

    //if you want preset value for your object, constructor is your friend
    //constructor's name should be same as class name
    //constructor's can be with parameters or without parameters
    public Pokemon(){
        level = 2;
    }

    //if you want user to give name and level, how do you do that?
    //create a constructor, its named after its class, so variable naming convention is
    //gonna the same as its class variables
    public Pokemon (String pName, int pLevel){
        //variable names are same as class variables
        name = pName;
        level = pLevel;
    }

    //create a method that prints "attack" when called.
    public void attack() {
        System.out.println(name + " attack!");
    }
}
