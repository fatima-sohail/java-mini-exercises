package oopDebt;
//create objects and call methods on it here
public class Main {
    public static void main(String[] args) {
        //create an object and print its current balance using print method
        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printCurrentBalance();

        //call waitOneYear method and print the updated current balance
        mortgage.waitOneYear();
        mortgage.printCurrentBalance();

        //Simulate how this object's balance updaates over 20 years by adding
        // interest each year, and then print the final amount.
        int year = 0;
        while(year < 20){
            mortgage.waitOneYear(); //objecy's debt grows by one year
            year++;
        }
        mortgage.printCurrentBalance();

    }
}
