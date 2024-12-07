package oop_Encapsulation_ObjectAsInstanceVariable_BiggestPetShop;

public class Main {
    public static void main(String[] args) {
        Pet lucy = new Pet("Lucy", "golden retriever");
        Person leo = new Person("Leo", lucy); //`lucy` object (of type `Pet`) is passed as an argument to
        // the `Person` constructor.
        //print out in this format:
        //Leo, lucy, golden retriever
        System.out.println(leo);
        //print out in this format:
        //Leo, has a friend called Lucy (golden retriever)
        //for this format, tweak the toString() return statement
        System.out.println(leo);

    }
}
