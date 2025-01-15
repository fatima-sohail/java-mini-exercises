package oop_encapsulation_retreive_height_order_shortest_to_tallest_obj_from_a_list_height_order;

import java.util.ArrayList;

public class Room {
    ArrayList<Person> personList;

    public Room(){
        personList = new ArrayList<>();
    }

    public void add(Person person){
        personList.add(person);
    }

    public boolean isEmpty(){
        if(personList.isEmpty()){
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons(){
        return this.personList;
    }

    public Person shortest(){
        //return a null reference if the collection is empty
        if(personList.isEmpty()){
            return null;
        }
        //create an object reference whose initial value is first element of the list
        // Start by assuming the first person in the list is the shortest
        Person shortestPerson = personList.get(0);
        //compare the shortest height with the current height,
        //if shortest person is found, assign it to the shortestPerson
        for(Person person: personList){
            if(shortestPerson.getHeight() > person.getHeight()){
                shortestPerson = person;
            }
        }

        return shortestPerson;
    }

    public Person take(){
        if(personList.isEmpty()){
            return null;
        }
        //find the shortest person
        //remove it from the list and return it
        Person shortestPerson = shortest();
        personList.remove(shortestPerson);

        return shortestPerson;
    }
}
