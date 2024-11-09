package oopAgeGrowOlder;

public class Person {
    private String name;
    private int age;

    //constructor
    public Person(String initialName){
        age = 29;
        name = initialName;
    }

    //method
    public void printPerson(){
        System.out.println(name + ", age: " + age + " years");
    }

    //method grow older
    public void growOlder(){
        age = age + 1;
    }

    //no one exceeds the age 30 method
//    public void ageLimit(){
//        if(age < 30){
//            age = age + 2;
//        }
//    }
}
