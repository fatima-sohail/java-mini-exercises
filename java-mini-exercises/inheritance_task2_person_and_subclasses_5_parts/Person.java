package inheritance_task2_person_and_subclasses_5_parts;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address){
        this.name = name;
        this.address= address;
    }

    public String toString(){
        return this.name + "\n" + " " + this.address;
    }
}
