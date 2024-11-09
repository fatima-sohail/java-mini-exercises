//for basic concept about class and object, watch: https://www.youtube.com/watch?v=IUqKuGNasdM

//create a person folder that contains multiple files
//java-mini-exercises->java-mini-exercises->new->package & inside package create multiple files

//create a person class, create variables name and age
//create constructor, the string variable called initialName is passed to it as a parameter
//create a method that prints the person's name and age, that will be used by objects
//create growOlder() method that when called, increases the age of the objects by 1

//create Main file
//create two objects Ada and Antii in this file and call the above methods on them

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
