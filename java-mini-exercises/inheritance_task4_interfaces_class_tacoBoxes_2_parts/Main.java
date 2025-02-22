package inheritance_task4_interfaces_class_tacoBoxes_2_parts;

public class Main {
    public static void main(String[] args){

        //PART 1:
        TripleTacoBox box = new TripleTacoBox();
        System.out.println(box.tacosRemaining()); //prints: 3

        box.eat();
        System.out.println(box.tacosRemaining()); //prints: 2

        box.eat();
        box.eat();
        System.out.println(box.tacosRemaining()); //prints: 0

        box.eat();
        System.out.println(box.tacosRemaining());//prints:0
        System.out.println("*****************");

        //PART 2:
        CustomTacoBox customBox = new CustomTacoBox(8);
        System.out.println(customBox.tacosRemaining());

        customBox.eat();
        customBox.eat();
        customBox.eat();
        customBox.eat();
        System.out.println(customBox.tacosRemaining());

    }
}
