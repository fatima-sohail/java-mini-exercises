package oopGauge;

public class Main {
    public static void main(String[] args) {
        Gauge g = new Gauge();

        //object's initial value is set to 0 in constructor, so no need to write here.
        //loop continues to execute as long as the guage is not full
        //once the loop exits(meaning the guage is full now), it prints
        //the message indicating that it is full, showing its current value
        while(!g.full()){
            System.out.println("Not full value: " + g.value());
            g.increase(); //similar to i++
        }

        System.out.println("Full value: " + g.value());
        g.decrease();

        System.out.println("Not full value: " + g.value());

    }
}
