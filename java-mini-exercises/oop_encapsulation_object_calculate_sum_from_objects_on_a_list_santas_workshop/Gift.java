package oop_encapsulation_object_calculate_sum_from_objects_on_a_list_santas_workshop;

public class Gift {
    String name;
    int weight;

    public Gift(String namee, int weightt){
        name = namee;
        weight = weightt;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " (" + weight + " kg)";
    }
}
