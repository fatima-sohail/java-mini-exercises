//add user-inputted objects to a list

package oopListPersonInputFromUser;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}
