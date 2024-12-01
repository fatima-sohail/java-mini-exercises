//creating an object and assigning it the same value as of the previous object
//e.g object1 = Lucy;
//    object2 = object1;
//assigning null to an object
//null exception error

package oop_NullValue_of_a_ReferenceVariable;

public class Main {
    public static void main(String[] args) {
        Person jonas = new Person("Jonas");
        System.out.println(jonas);

        //create another object and assign the same reference as jonas
        Person peter = jonas;
        peter.growOlder();//peter became 1 year old
        peter.growOlder();//peter became 2 years old
        System.out.println("peter object: " + peter); //prints ....Jonas, 2 years

        //print jonas object
        System.out.println(jonas);//prints: Jonas, 2 years
        //jonas became 2, since peter and jonas refer to the same object in the memory

        peter = null;
        //try:
        //peter.growOlder(); //terminal throws NullPointerException error
        System.out.println(peter); //prints null, cz null refers to nothing in the memory
        System.out.println(jonas);//prints Jonas, 2 years
        //value is same as prev. jonas cz object in the memory still exists and is
        //still being referenced by jonas.

        //reassigning joan to a new object
        jonas = new Person("Joan B.");
        System.out.println(jonas);//prints Joan B., 0 years

        //now that jonas is reassigned, does peter still refers to the old jonas?
        System.out.println(peter); //prints: null
        //comment out line: peter = null and then it prints: Jonas, 2 years
    }
}
