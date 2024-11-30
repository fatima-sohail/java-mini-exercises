package oop2_OverloadedCounter;

public class Main {
    public static void main(String[] args) {
        Counter smile = new Counter(3);
        smile.decrease(1);
        System.out.println(smile);

        smile.increase(5);
        System.out.println(smile);

        smile.increase(-1);
        System.out.println(smile); //value remains same as prev one.

    }
}
