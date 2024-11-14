package oopPersonGet_Set_toString;

public class Main {
    public static void main(String[] args) {
        //create 2 objects and calculate their bmi
        Person mindy = new Person("Mindy");
        Person alexa = new Person("Alexa");

        //set their height and weight respectively using setMethod
        mindy.setHeight(180);
        mindy.setWeight(86);

        alexa.setHeight(175);
        alexa.setWeight(64);

        //print their names, height and weight using toString(), two ways
        //one way
        System.out.println(mindy.toString());
        System.out.println(alexa.toString());

        //OR precise way
        System.out.println(mindy);
        System.out.println(alexa);

        //print out their names using getMethod and their bmi's
        System.out.println(mindy.getName() + " has BMI: " + mindy.bmi());
        System.out.println(alexa.getName() + " has BMI: " + alexa.bmi());
    }
}
