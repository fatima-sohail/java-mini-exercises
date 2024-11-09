package oopPokemonWithConstructor;
//create objects
public class Main {
    public static void main(String[] args) {
        Pokemon object1 = new Pokemon();
        System.out.println(object1.level); //print level 2 because its value is set in the constructor

        //give a gap
        System.out.println(" ");

        //if we want user to give a name and level, how do we do that?
        Pokemon object2 = new Pokemon("Evee", 50);
        //print out the values
        System.out.println(object2.level);
        object2.attack();
    }
}
