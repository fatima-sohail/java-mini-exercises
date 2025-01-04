package oop_encapsulation_retreive_height_order_shortest_to_tallest_obj_from_a_list_height_order;

public class Main {
    public static void main(String[] args) {
        Room room = new Room();
        System.out.println("empty room? " + room.isEmpty());
        System.out.println("Shortest: " + room.shortest());

        room.add(new Person("lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));

        System.out.println("empty room? " + room.isEmpty());

        //print each person in the list
        for(Person person: room.getPersons()){
            System.out.println(person);
        }

        System.out.println();
        System.out.println("Shortest: " + room.shortest());
        System.out.println();
        System.out.println("Take out the Shortest: " + room.take());
        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        //print the persons in height order from shortest to tallest
        while(!room.isEmpty()){
            System.out.println(room.take());
        }

    }
}
