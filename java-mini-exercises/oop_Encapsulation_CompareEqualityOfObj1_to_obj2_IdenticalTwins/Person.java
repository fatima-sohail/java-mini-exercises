package oop_Encapsulation_CompareEqualityOfObj1_to_obj2_IdenticalTwins;

public class Person {
    private String name;
    private SimpleDate birthday;
     private int weight;
     private int height;


    public Person(String namee, SimpleDate birthdayy, int weightt, int heighttt){
        name = namee;
        birthday = birthdayy;
        weight = weightt;
        height = heighttt;
    }

    @Override
    public boolean equals(Object obj2) {
        //if both the objects are located in the same position, they are equal, return true
        if(this == obj2){
            return true;
        }

        //if the types of both are not same, they are not equal, return false,
        if(!(obj2 instanceof Person)){
            return false;
        }

        //make their types same by converting obj2 to current obj type
        Person obj2Person = (Person) obj2;

        //if the values of object variables are equal, then they both are equal
        if(birthday.equals(obj2Person.birthday)
            && weight == obj2Person.weight && height == obj2Person.height){
            return true;
        }else{
            return false;
        }

    }
}
