package inheritance_task3_abstract_class_different_kinds_of_boxes_3_parts;

public class Main {
    public static void main(String[] args){

        //Part 1: Box with a max weight
        //create boxwithmaxweight obj and add new items obj to it
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Columbian beans", 5));
        coffeeBox.add(new Item("Ethipian beans", 5));
        coffeeBox.add(new Item("Classis beans", 5));

        //see if all the items are in the coffeebox or not using isInTheBox()
        System.out.println(coffeeBox.isInBox(new Item("Columbian beans"))); //weight is not mentioned inside item obj
                                                                                  //equals() only checks for its name, not the weight

        System.out.println(coffeeBox.isInBox(new Item("Classis beans")));
        System.out.println(coffeeBox.isInBox(new Item("Ethipian beans")));

        //Part 3: One item box and the misplacing box
        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo"))); //prints: true
        System.out.println(box.isInBox(new Item("Pirkka")));//prints: false

    }
}
