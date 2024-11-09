//for basic concept about class and object, watch: https://www.youtube.com/watch?v=IUqKuGNasdM

//create xyz folder that contains multiple files:
//java-mini-exercises->java-mini-exercises->new->package & inside package create multiple files

//Create a class named Whistle. Add the variable private String sound to the class.
//After that, create the constructor public Whistle(String whistleSound), which
//is used to create a new whistle that's given a sound.
//
//Then create the method public void sound() that prints the whistle's sound.
//
//Whistle duckWhistle = new Whistle("Kvaak");
//Whistle roosterWhistle = new Whistle("Peef");
//
//duckWhistle.sound();
//roosterWhistle.sound();
//
//Sample output
//Kvaak
//Peef


package oopWhistle;
//blueprint to create objects
public class Whistle {
    //variable
    private String sound;

    //constructor
   public Whistle(String whistleSound){
        sound = whistleSound;
    }

    //method to print whistle's sound
    public void printSound(){
        System.out.println(sound);
    }
}
