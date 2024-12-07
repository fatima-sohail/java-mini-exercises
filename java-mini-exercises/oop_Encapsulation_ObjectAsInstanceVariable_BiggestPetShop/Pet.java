package oop_Encapsulation_ObjectAsInstanceVariable_BiggestPetShop;

//create a Pet class with instance variables `dogName` and `dogBreed`.
// Constructor initializes the fields with given values.
// The `toString()` method formats the output in 2 ways:
//lucy, golden retreiver
// "Lucy (golden retriever)"



public class Pet {
    String dogName;
    String dogBreed;

    public Pet(String dogNamee, String dogBreedd){
        dogName = dogNamee;
        dogBreed = dogBreedd;
    }

    @Override
    public String toString() {
        //formats pet's details as "Lucy, golden retreiver"
        //return dogName + ", " + dogBreed;

        //formats the pet's details as "Lucy (golden retriever)"
        return dogName + "(" + dogBreed + ")";
    }
}
