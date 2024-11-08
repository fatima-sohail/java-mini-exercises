//The exercise template comes with a ready-made class named Account. The Account object represents
//a bank account that has balance (i.e. one that has some amount of money in it). The accounts
//are used as follows:
//
//Account artosAccount = new Account("Arto's account", 100.00);
//Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);
//
//System.out.println("Initial state");
//System.out.println(artosAccount);
//System.out.println(artosSwissAccount);
//
//artosAccount.withdraw(20);
//System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
//artosSwissAccount.deposit(200);
//System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance());
//
//System.out.println("End state");
//System.out.println(artosAccount);
//System.out.println(artosSwissAccount);

public class OOPYourFirstBankAccount {
    public static void main(String[] args) {
        Account artosAccount = new Account("Arto's account", 100.00);
        Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);

System.out.println("Initial state");
System.out.println(artosAccount);
System.out.println(artosSwissAccount);

artosAccount.withdraw(20);
System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
artosSwissAccount.deposit(200);
System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance());

System.out.println("End state");
System.out.println(artosAccount);
System.out.println(artosSwissAccount);
    }
}
