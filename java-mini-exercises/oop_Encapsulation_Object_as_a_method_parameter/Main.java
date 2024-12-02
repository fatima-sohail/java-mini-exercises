//with the help of 2 class files, create person objects and see who is eligible
//to go on a ride object

package oop_Encapsulation_Object_as_a_method_parameter;

public class Main {
    public static void main(String[] args) {
        //create 2 objects from person class
        Person matt = new Person("Matt");
        matt.setHeight(180);

        Person jasper = new Person("Jasper");
        jasper.setHeight(132);

        //create an object from AmusementParkRide
        AmusementParkRide waterTrack = new AmusementParkRide("Water track", 140);

        //see which person object is eligible to go on waterTrack ride
        if(waterTrack.allowedToRide(matt)){
            System.out.println(matt.getName() + " can enter the ride");
        }else{
            System.out.println("Matt can't enter the ride");
        }

        if(waterTrack.allowedToRide(jasper)){
            System.out.println(jasper.getName() + " can enter the ride");
        }else{
            System.out.println("Jasper can't enter the ride because he is short");
        }

        //print the watertrack object
        System.out.println(waterTrack);
    }



}
