package oopPokemonWithoutConstructor;
//here you create objects of pokemon class
public class Main {
    public static void main(String[] args) {
        //classname var = new classname();
        Pokemon object1 = new Pokemon();
        //set the name and level for this object
        object1.name = "Pikachu";
        object1.level = 10;

        object1.attack();

        //print the name and level of the object
        System.out.println(object1.name + " " + object1.level);

        Pokemon object2 = new Pokemon();
        object2.name = "Evee";
        object2.level = 5;

        object2.attack();
        System.out.println(object2.name + " " + object2.level);

    }

}
