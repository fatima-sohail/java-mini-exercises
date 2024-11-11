package oopAgentBond;
//create objects using the blueprint class
public class Main {
    public static void main(String[] args) {
        Agent bond = new Agent("James", "Bond");
        //print the name using toString() method
        System.out.println(bond.toString());
        //OR
        System.out.println(bond);//java adds toString() automatically

        //create another object and print using toString() method
        Agent ionic = new Agent("Ionic", "Dam");
        System.out.println(ionic);
    }
}
