//for basic concept about class, object, constructor watch: https://www.youtube.com/watch?v=IUqKuGNasdM

//create xyz folder that contains multiple files:
//java-mini-exercises->java-mini-exercises->new->package & inside package create multiple files

//Create a class Multiplier that has a:
//
//Constructor public Multiplier(int number).
//Method public int multiply(int number) which returns the value number passed to it multiplied by the number provided to the constructor.
//You also need to create an instance variable in this exercise.
//
//An example of the class in use:
//
//Multiplier multiplyByThree = new Multiplier(3);
//
//System.out.println("multiplyByThree.multiply(2): " + multiplyByThree.multiply(2));
//
//Multiplier multiplyByFour = new Multiplier(4);
//
//System.out.println("multiplyByFour.multiply(2): " + multiplyByFour.multiply(2));
//System.out.println("multiplyByThree.multiply(1): " + multiplyByThree.multiply(1));
//System.out.println("multiplyByFour.multiply(1): " + multiplyByFour.multiply(1));
//Output
//
//Sample output
//multiplyByThree.multiply(2): 6
//multiplyByFour.multiply(2): 8
//multiplyByThree.multiply(1): 3
//multiplyByFour.multiply(1): 4

package oopMultiplier;

public class Multiplier {
    int number;

    public Multiplier(int constructorNumber){
        number = constructorNumber;
    }

    public int multiply(int value){
        return number * value;

    }
}
