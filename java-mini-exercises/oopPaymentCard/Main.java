package oopPaymentCard;

public class Main {
    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        System.out.println("paul" + paulsCard);

        mattsCard.eatAffordably();
        System.out.println("matt: " + mattsCard);

        paulsCard.addMoney(20);
        System.out.println("Paul: " + paulsCard);

        mattsCard.eatHeartily();
        System.out.println("Matt: " + mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        System.out.println("Paul: " + paulsCard);

        mattsCard.addMoney(50);
        System.out.println("matt: " + mattsCard);

    }
    }


