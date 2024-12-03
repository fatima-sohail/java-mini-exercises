package oop_Encapsulation_cardPayments;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) {
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        //update the current balance after withdrawal
        // returns true if successful and false otherwise
        if(balance >= amount){
            this.balance = this.balance - amount;
            return true;
        }
        return false;
    }
}
