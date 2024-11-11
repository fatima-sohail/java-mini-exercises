package oopAgentBond;

public class Agent {
    //create variables
    String firstName;
    String lastName;

    public Agent(String fName, String lName) {
        firstName = fName;
        lastName = lName;
    }

    //create methods
    public void print(){
        System.out.println("My name is " + lastName + ", " + firstName + " " + lastName);
    }

    public String toString(){
        return "My name is " + lastName + ", " + firstName + " " + lastName;
    }
}
