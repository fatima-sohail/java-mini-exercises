package file_StoringRecords;

public class Person {
    private String name;
    private int age;

    public Person(String constrName, int constrAge){
        name = constrName;
        age = constrAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + ", age: " + this.age;
    }
}
