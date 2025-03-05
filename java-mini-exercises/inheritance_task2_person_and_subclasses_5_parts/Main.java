package inheritance_task2_person_and_subclasses_5_parts;

import java.util.ArrayList;

public class Main {
    //The method prints all the persons on the list given as the parameter. Method must act
    // as follows when invoked from the main method:
    public static void printPersons(ArrayList<Person> persons){
        for(Person personObj: persons){
            System.out.println(personObj);
        }
    }

    public static void main(String[] args){
        //PART 1: try person class
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);
        System.out.println();

        //PART 2: try student class and its methods
        Student olie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(olie);
        System.out.println("Olie study credits: " + olie.getCredits());
        olie.study();
        System.out.println("Olie study credits: " + olie.getCredits());
        System.out.println();

        //PART 3: try Student toString()
        Student harry = new Student("Harry Potter", "7480 Hollywood Blvd. Los Angeles 90028");
        System.out.println(harry);
        harry.study();
        System.out.println(harry);
        harry.study();
        System.out.println(harry);
        System.out.println();

        //PART 4: try teacher class
        Teacher ada_L = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko_M = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada_L);
        System.out.println(esko_M);

        Student harry_p = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
            harry_p.study();
            i = i + 1;
        }
        System.out.println(harry_p);
        System.out.println();

        //PART 5: List all persons
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);

    }
}
