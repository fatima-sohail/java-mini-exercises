package oop_Encapsulation_CompareObj1_to_obj2_IdenticalTwins;

public class Main {
    public static void main(String[] args) {
        //create 2 SimpleDate objects and 2 Person objects
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person lilly = new Person("Lily", date2, 65, 8);

        if(leo.equals(lilly)){
            System.out.println("are they twins? ");
        }

        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

        if(leo.equals(leoWithDifferentWeight)){
            System.out.println("are they twins?");
        }
    }
}
