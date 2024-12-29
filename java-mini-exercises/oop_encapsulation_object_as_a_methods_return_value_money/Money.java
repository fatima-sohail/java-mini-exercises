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
    public Money plus(Money addition){
        int totalCents = this.cents + addition.cents;
        int totalEuros = this.euros + addition.euros;
        Money newMoney = new Money(totalEuros, totalCents);
        return newMoney;
    }

}
