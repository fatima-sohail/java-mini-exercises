package oop_Encapsulation_HealthStation;

public class HealthStation {
    //instance variable
    private int weighings;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        weighings++;
        return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings(){
        return weighings;
    }
}
