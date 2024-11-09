package oopWhistle;
//create objects
public class Main {
    public static void main(String[] args) {
        //create objects based on the blueprint file
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        //print the values of the objects
        duckWhistle.printSound();
        roosterWhistle.printSound();
    }
}
