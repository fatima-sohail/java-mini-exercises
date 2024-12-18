package oop_Encapsulation_comparingTheEqualityOfObjects_in_List_birds;

public class Bird {
    String name;

    public Bird(String namee){
        name = namee;
    }

    @Override
    public boolean equals(Object obj2) {
        //if the instance variables are located in the same postotion, they are equal,
        //return true
        if(this == obj2){
            return true;
        }

        //if the both the current and obj2 are not of same type, the objects are not equal,
        //return false
        if(!(obj2 instanceof Bird)){
            return false;
        }

        //make them similar by making obj2 type same as current object
        Bird obj2IsBird = (Bird) obj2;

        //if the values of both the objects' variables are same, they are equal
        return name.equals(obj2IsBird.name);
        /*
        //the comparison of names above is equal to the following code

        if (this.name.equals(comparedBird.name)) {
            return true;
        }

        //otherwise the objects are not equal return false;
        */

    }
}
