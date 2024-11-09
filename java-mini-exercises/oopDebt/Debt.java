//for basic concept about class and object, watch: https://www.youtube.com/watch?v=IUqKuGNasdM

//create debt folder that contains multiple files:
//java-mini-exercises->java-mini-exercises->new->package & inside package create multiple files

//Create the class Debt that has double-typed instance variables of balance and interestRate.
// The balance and the interest rate are passed to the constructor as parameters
// public Debt(double initialBalance, double initialInterestRate).
//
//In addition, create the methods public void printBalance() and public void waitOneYear()
// for the class. The method printBalance prints the current balance, and
// the waitOneYear method grows the debt amount.
//
//The debt is increased by multiplying the balance by the interest rate.
//
//The class should do the following:
//
//public class MainProgram {
//    public static void main(String[] args) {
//
//        Debt mortgage = new Debt(120000.0, 1.01);
//        mortgage.printBalance();
//
//        mortgage.waitOneYear();
//        mortgage.printBalance();
//
//        int years = 0;
//
//        while (years < 20) {
//            mortgage.waitOneYear();
//            years = years + 1;
//        }
//
//        mortgage.printBalance();
//    }
//}
//The example above illustrates the development of a mortgage with an interest rate of one percent.
//
//Prints:
//
//Sample output
//120000.0
//121200.0
//147887.0328416936
package oopDebt;
//create a blueprint class to create objects
public class Debt {
    //create variables
    double balance;
    double interestRate;

    //create a constructor
    public Debt(double initialBalance, double initialInterestRate){
        balance = initialBalance;
        interestRate = initialInterestRate;
    }

    //create a method that prints current balance
    public void printCurrentBalance(){
        System.out.println("current balance: " + balance);
    }

    //create a method that grows the debt amount
    public void waitOneYear(){
        balance = balance * interestRate;
    }

}
