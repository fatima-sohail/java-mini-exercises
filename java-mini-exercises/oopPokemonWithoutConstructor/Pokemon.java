//for basic concept about class and object, watch: https://www.youtube.com/watch?v=IUqKuGNasdM

//create xyz folder that contains multiple files:
//java-mini-exercises->java-mini-exercises->new->package & inside package create multiple files

//create a class called Pokemon, instantiate variables: name and level,
//create a method attack()that prints ?attack!" when called
//create objects in another folder and use this class!


package oopPokemonWithoutConstructor;
//blueprint to create objects
public class Pokemon {
    //blueprint class has variables and methods
    //these are used to create objects

    String name;
    int level;

    void attack(/*parameters*/){
        System.out.println(name + " attack!");

    }
    int method(/*parameters*/){
        return 0;
    }
}
