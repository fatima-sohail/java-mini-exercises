package oop_Encapsulation_cardPayments;

public class Main {
    public static void main(String[] args) {
        //PART1:
        //create petesCard object with balance of 10$
        //print his current balance
        //withdraw money from his card and print balance after withdrawal
        //do it twice
//        PaymentCard petesCard = new PaymentCard(10);
//        System.out.println("Initial balance: " + petesCard.balance());
//
//        petesCard.takeMoney(3);
//        System.out.println("balance after withdrawal: " + petesCard.balance());
//        System.out.println("Successfully withdrew? " + petesCard.takeMoney(3));
//
//        petesCard.takeMoney(11); //amount trying to withdraw is more than the current bank balance.
//        System.out.println("balance after withdrawal: " + petesCard.balance());
//        System.out.println("Successfully withdrew? " + petesCard.takeMoney(11));

        //TASK2:
//        PaymentTerminal unicafeExactum = new PaymentTerminal();
//
//        double change = unicafeExactum.eatAffordably(10);
//        System.out.println("remaining change " + change);
//
//        change = unicafeExactum.eatAffordably(5);
//        System.out.println("remaining change " + change);
//
//        change = unicafeExactum.eatHeartily(4.3);
//        System.out.println("remaining change " + change);
//
//        System.out.println(unicafeExactum);

        //TASK3:
        //create PaymentTerminal object
        PaymentTerminal schoolCafe = new PaymentTerminal();
        //print the change remaining-amount left after paying for meals in cash
        double change = schoolCafe.eatAffordably(10);
        System.out.println("remaining change: " + change);
        //create an object called anesCard from PaymentCard class
        PaymentCard annesCard = new PaymentCard(7);
        //call eatHeartily and eatAffordably on schoolCafe,and put it in a boolean variable wasSuccessful
        boolean wasSuccessful = schoolCafe.eatHeartily(annesCard);
        //print in this format: there was enough money: true
        //                      there was enough money: false
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = schoolCafe.eatAffordably(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println(schoolCafe);

    }
}
