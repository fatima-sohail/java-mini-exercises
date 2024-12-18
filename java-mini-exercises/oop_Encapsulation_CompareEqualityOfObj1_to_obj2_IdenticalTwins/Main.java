package oop_Encapsulation_CompareEqualityOfObj1_to_obj2_IdenticalTwins;

public class Main {
    public static void main(String[] args) {
        //create 2 SimpleDate objects and 2 Person objects
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(24, 3, 2017);
        SimpleDate date3 = new SimpleDate(23, 7, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person lala = new Person("Lala", date, 62, 9);
        Person Zor = new Person("Zor", date2, 62, 9);
        Person lilly = new Person("Lily", date3, 65, 8);

        if(leo.equals(lala)){
            System.out.println("Twins ");
        }else{
            System.out.println("They are not twins");
        }

        if(leo.equals(Zor)){
            System.out.println("Twins");
        }else{
            System.out.println("Not twins");
        } //prints: Not twins, why?
                    // leo and zor don't reference to the same date object,
                    //leo references to date while zor references to date2

        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

        if(leo.equals(leoWithDifferentWeight)){
            System.out.println("Twins");
        }else{
            System.out.println("Not twins");
        }
    }
}
