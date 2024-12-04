package oop_Encapsulation_cardPayments;

public class PaymentTerminal {
    private double money;  // amount of cash received from customers when they purchase a meal
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        double mealCost = 2.50;
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment >= mealCost){
           this.money = this.money + mealCost;
           affordableMeals++;
           return payment = payment - mealCost;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {//payment
        // a hearty meal costs 4.30 euros
        double mealCost = 4.30;
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment >= 4.30){
             this.money = this.money + 4.30;
             heartyMeals++;
             return payment = payment - mealCost;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price,
        // and the method returns true
        if(card.takeMoney(2.50)){
            affordableMeals++;
            return true;
        }
        // otherwise false is returned
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        if(card.takeMoney(4.30)){
            heartyMeals++;
            return true;
        }
        // otherwise false is returned
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        // add money to the payment card
        if(sum>0){
            card.addMoney(sum);
            this.money = this.money + sum;
        }
        //else the method does nothing
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
