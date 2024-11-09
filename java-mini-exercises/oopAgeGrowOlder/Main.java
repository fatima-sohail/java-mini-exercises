package oopAgeGrowOlder;
//create objects
public class Main {
    public static void main(String[] args) {
        Person ada = new Person("Ada");
        Person antii = new Person("Antii");

        //print the object values by calling print method
        ada.printPerson();
        antii.printPerson();

        //give a gap
        System.out.println("");

        //call growOlder method on ada to update her age and print it
        ada.growOlder();
        ada.printPerson();

        //give a gap
        System.out.println("");

        //call agelimit on ada
//        ada.ageLimit();
//        ada.printPerson();

    }
}
