package oop_encapsulation_object_as_a_methods_return_value_money;

public class Main {
    public static void main(String[] args) {
        //create 2 objects of type Money
        //3rd object is gonna be created differently
        Money a = new Money(10,0);
        Money b = new Money(5,0);

        Money c = a.minus(b); //prints: 15.00e
        //Money c = a.plus(b); //prints: 5.00e

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a = a.minus(c);
        //a = a.plus(c);
        System.out.println("");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("");
        System.out.println(a.lessThan(c));  //false
        System.out.println(b.lessThan(c));  //true

    }
}
