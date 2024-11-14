//go to instructions.java to read the instructions

package oopPaymentCard;

public class PaymentCard {
    //create instance variable
    double balance;
    //constructor
    public PaymentCard(double constructorBalance){
        balance = constructorBalance;
    }

    public void eatAffordably(){
        if(balance >= 2.60) {
            balance = balance - 2.60;
        }
    }

    public void eatHeartily(){
        if(balance >= 4.60) {
            balance = balance - 4.60;
        }
    }

    public void addMoney(double value){
        if(value > 0){
            if(balance + value > 150){
                balance = 150;
            }else{
                balance = balance + value;
            }
        }
    }

    public String toString(){
        return "This card has a balance of euros: " + balance;
    }
}
