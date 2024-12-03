package oop_Encapsulation_HealthStation;

public class Main {
    public static void main(String[] args) {
        //create object of HealthStation class
        HealthStation childrenHospital = new HealthStation();

        //create objects of Person class
        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        //print the objects
        //TASK2:
//        System.out.println(ethan.getName() + "'s weight: " + childrenHospital.weigh(ethan) + " kilos");
//        System.out.println(peter.getName() + "'s weight: " + childrenHospital.weigh(peter) + " kilos");
//
//        childrenHospital.feed(ethan);
//        childrenHospital.feed(ethan);
//        childrenHospital.feed(ethan);
//
//        System.out.println(" ");
//
//        System.out.println(ethan.getName() + "'s weight: " + childrenHospital.weigh(ethan) + " kilos");
//        System.out.println(peter.getName() + "'s weight: " + childrenHospital.weigh(peter) + " kilos");

        //TASK3:
        System.out.println("weighings performed: " + childrenHospital.weighings());

        childrenHospital.weigh(ethan);
        childrenHospital.weigh(peter);

        System.out.println("weighings performed: " + childrenHospital.weighings());

        childrenHospital.weigh(ethan);
        childrenHospital.weigh(ethan);
        childrenHospital.weigh(ethan);
        childrenHospital.weigh(ethan);

        System.out.println("weighings performed: " + childrenHospital.weighings());


    }
}
