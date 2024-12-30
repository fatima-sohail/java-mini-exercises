package oop_encapsulation_object_as_a_methods_return_value_money;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money additionObj){
        int totalCents = this.cents + additionObj.cents;
        int totalEuros = this.euros + additionObj.euros;
        Money newMoney = new Money(totalEuros, totalCents);
        return newMoney;
    }

    public boolean lessThan(Money comparedObj){
        if(this.euros < comparedObj.euros){
            return true;
        }
        if(this.euros == comparedObj.euros) {
            if (this.cents < comparedObj.cents) {
                return true;
            }
        }

        return false;
    }

    public Money minus(Money decreaserObj){
        int totalCents = this.cents - decreaserObj.cents;
        int totalEuros = this.euros - decreaserObj.euros;
        Money newMoneyyh = new Money(totalEuros, totalCents);
        return newMoneyyh;
    }

}
