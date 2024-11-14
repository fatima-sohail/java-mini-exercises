package oopListPersons;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //create an empty list and start adding elements aka objects
        ArrayList<Person> persons = new ArrayList<>();
        //create objects and add them in the list
        Person nate = new Person("Nate");
        persons.add(nate);

        persons.add(new Person("Alex"));
        persons.add(new Person("Jude"));
        persons.add(new Person("Sam"));

        //print them one by one
        for(Person person: persons){
            System.out.println(person);
        }
        //for (dataType element : iterable) {
        //    // code to be executed for each element
        //}


    }
}
