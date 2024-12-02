package oop_Encapsulation_Object_as_a_method_parameter;

public class AmusementParkRide {
    //create variables called name and minimum height required to get on a ride
    private String name;
    private int minimumHeight;
    private int visitors;

    //constructor
    public AmusementParkRide(String name, int minimumHeight){
        this.name = name;
        this.minimumHeight = minimumHeight;
        this.visitors = 0;
    }

    //give this method an object as a parameter, this function only allows a person object
    //to ride if they are above the required minimum height
    public boolean allowedToRide(Person person){
        if(person.getHeight() < this.minimumHeight){
            return false;
        }

        //keep track of visitors who took the ride
        visitors++;
        return true;
    }

    @Override
    public String toString() {
        return this.name + ", minimum height: " + this.minimumHeight +
                ", visitors: " + this.visitors;
    }

}
