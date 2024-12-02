//create a TimeMachine class,
//create an instance variable of type 'Person class'
//create a constructor and pass param of type Person
//create a method called travelToFuture, pass pram int years
//this method is used to elaborate how many years an object wants to travel to future, from
//current year(1996)

package oop_Encapsulation_ObjectInAnObject;

public class TimeMachine {
    private Person traveler;

    public TimeMachine(Person someone){
        this.traveler = someone;
    }

    public void travelToFuture(int years){
        this.traveler.setYear(this.traveler.getYear() + years);
    }

}
