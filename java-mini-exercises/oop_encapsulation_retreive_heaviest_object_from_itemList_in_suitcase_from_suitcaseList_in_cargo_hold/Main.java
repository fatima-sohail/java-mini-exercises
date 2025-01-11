package oop_encapsulation_retreive_heaviest_object_from_itemList_in_suitcase_from_suitcaseList_in_cargo_hold;

public class Main {
    public static void main(String[] args) {
        Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        System.out.println("The book's name: " + book.getItemName());
        System.out.println("The book's weight: " + book.getItemWeight());

        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);

        //for a single suitcase, use suitcase class
        System.out.println();
        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(book);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        System.out.println(suitcase);

        System.out.println("The suitcase contains the following items:");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.totalWeightSuitecase() + " kg");

        System.out.println();
        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);

        //for multiple suitcases, use Hold class
        System.out.println();
        Suitcase fatisCase = new Suitcase(10);
        fatisCase.addItem(book);
        fatisCase.addItem(phone);

        Suitcase lolasCase = new Suitcase(10);
        lolasCase.addItem(brick);

        System.out.println();
        Hold cargo = new Hold(100);
        cargo.addSuitcase(fatisCase);
        cargo.addSuitcase(lolasCase);
        System.out.println("num of suitcases in cargo: " + cargo);
        cargo.printSuitcasesInHold();
    }
}
